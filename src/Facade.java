
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pankecho
 */
public class Facade {
    
    private Usuario usuario;
    private Database instancia;
    private CreadorDieta cd;

    public Facade(String user, String pass) {
        this.instancia = Database.getInstance();
        this.usuario = this.instancia.autenticar(user, pass);
        this.cd = new CreadorDieta((ArrayList<Alimento>)this.instancia.getAlimentos(), (ArrayList<Ejercicio>)this.instancia.getEjercicios());
    }
    
    public Facade(String n, int e, float p, char s, float a, String t,String pp, String u){
        this.instancia = Database.getInstance();
        ArrayList<Alimento> aaa = (ArrayList<Alimento>)this.instancia.getAlimentos();
        ArrayList<Ejercicio> eee = (ArrayList<Ejercicio>)this.instancia.getEjercicios();
        this.cd = new CreadorDieta(aaa,eee);
        this.usuario = new Usuario(n, e, p, s, a, t, pp, u);
        int id = this.instancia.saveUsuario(this.usuario);
        this.usuario.setId(id);
        Dieta d = cd.creaDieta(this.usuario);
        id = this.instancia.saveDieta(d, this.usuario.getId());
        d.setId(id);
        this.usuario.setDieta(d);
        
        ArrayList<Component> aa = usuario.getDieta().getComponentes();
        ArrayList<AlimentoCompuesto> ali = new ArrayList<AlimentoCompuesto>();
        ArrayList<Ejercicio> ej = new ArrayList<Ejercicio>();
        
        for(int i = 0; i < aa.size(); i++){
            switch(aa.get(i).getClass().getName()){
                case "Ejercicio":
                    ej.add((Ejercicio)aa.get(i));
                    break;
                case "AlimentoCompuesto":
                    ali.add((AlimentoCompuesto)aa.get(i));
                    break;
                default:
                   
                    break;
            }
        }
        this.instancia.guardarAlimento(usuario.getDieta().getId(), ali); 
        this.instancia.guardarEjercicio(usuario.getDieta().getId(), ej);
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
}
