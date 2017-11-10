
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class FiltroEjercicio extends Iterator{
    
    public FiltroEjercicio (ArrayList<Alimento> o,int calorias){
        alimento = o;
        alimento.removeIf(i -> (i.getCalorias() < calorias));
    }
    @Override
    public Object next() {
        indice++;
        return ejercicio.get(indice);
    }

}
