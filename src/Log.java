
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
public class Log implements Observer{
    
    private Database database;
    private Sujeto usuario;

    public Log(Sujeto u) {
        this.database = Database.getInstance();
        this.usuario = u;
        this.usuario.agregaObservador(this);
    }
    
    @Override
    public void update(Component c) {
        if(c.getClass().getName().equals("Alimento")){
            registrarAlimento(c, "comió");
        }else if (c.getClass().getName().equals("Ejercicio")){
            registrarEjercicio(c, "realizó");
        }
    }
    
    public void registrarEjercicio(Component c, String a){
        this.database.registrarLog(((Usuario)usuario).getId(),a + " " + ((Ejercicio)c).getDescripcion());
    }
    
    public void registrarAlimento(Component c, String a){
        this.database.registrarLog(((Usuario)usuario).getId(),a + " " + ((Alimento)c).getDescripcion());
    }
    
}