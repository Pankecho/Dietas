
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pankecho
 */
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Juan Pablo", 21, 60, 'M', 170, "Moderada", "achis", "pankecho");
        int id = Database.getInstance().saveUsuario(u); 
        u.setId(id);
        ArrayList<Alimento> al = (ArrayList<Alimento>) Database.getInstance().getAlimentos();
        ArrayList<Ejercicio> ej = (ArrayList<Ejercicio>) Database.getInstance().getEjercicios();
        CreadorDieta cd = new CreadorDieta(al,ej);
        Dieta d = cd.creaDieta(u);
        id = Database.getInstance().saveDieta(d,u.getId());
        d.setId(id);
        u.setDieta(d);
        
        ArrayList<Component> aa = u.getDieta().getComponentes();
        ArrayList<AlimentoCompuesto> ali = new ArrayList<AlimentoCompuesto>();
        
        for(int i = 0; i < aa.size(); i++){
            switch(aa.get(i).getClass().getName()){
                case "Ejercicio":
                    System.out.println(((Ejercicio)aa.get(i)).getNombre());
                    break;
                case "AlimentoCompuesto":
                    System.out.println(((AlimentoCompuesto)aa.get(i)).getTipoComidaAlimento());
                    ali.add((AlimentoCompuesto)aa.get(i));
                    break;
                default:
                    System.out.println(aa.get(i).getClass().getName());
                    break;
            }
        }
        System.out.println(aa.size());
        Database.getInstance().guardarAlimento(u.getDieta().getId(), ali);
    }
}
