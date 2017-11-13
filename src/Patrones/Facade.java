package Patrones;


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
    
    public Facade(){
        
    }
    
    public void login(String user, String pass) {
        this.instancia = Database.getInstance();
        this.usuario = this.instancia.autenticar(user, pass);
        this.cd = new CreadorDieta((ArrayList<Alimento>)this.instancia.getAlimentos(), (ArrayList<Ejercicio>)this.instancia.getEjercicios());
        System.out.println("Accedio");
    }
    
    public void registro(String nombre, int edad, float peso, char sexo, float altura, String tipo_vida,String password, String usua){
        System.out.println(nombre+edad+peso+sexo+altura+tipo_vida+password+usua);
        this.instancia = Database.getInstance();
        ArrayList<Alimento> aaa = (ArrayList<Alimento>)this.instancia.getAlimentos();
        ArrayList<Ejercicio> eee = (ArrayList<Ejercicio>)this.instancia.getEjercicios();
        this.cd = new CreadorDieta(aaa,eee);
        this.usuario = new Usuario(nombre, edad, peso, sexo, altura, tipo_vida, password, usua);
        int id = this.instancia.saveUsuario(this.usuario);
        this.usuario.setId(id);
        Dieta d = cd.creaDieta(this.usuario);
        id = this.instancia.saveDieta(d, this.usuario.getId());
        d.setId(id);
        this.usuario.setDieta(d);
        Log l = new Log(usuario);
        ArrayList<Component> aa = usuario.getDieta().getComponentes();
        ArrayList<AlimentoCompuesto> ali = new ArrayList<AlimentoCompuesto>();
        ArrayList<Ejercicio> ej = new ArrayList<Ejercicio>();
        
        for(int i = 0; i < aa.size(); i++){
            System.out.println(aa.get(i).getClass());
            switch(aa.get(i).getClass().getName()){
                case "Patrones.Ejercicio":
                    ej.add((Ejercicio)aa.get(i));
                    break;
                case "Patrones.AlimentoCompuesto":
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
