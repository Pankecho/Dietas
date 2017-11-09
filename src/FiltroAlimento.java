
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
public class FiltroAlimento extends Iterator{
    public FiltroAlimento (ArrayList<Alimento> o,String tipoAlimento){
        alimento = o;
        alimento.removeIf(i -> (!i.getTipoAlimento().equals(tipoAlimento) ));
    }
    
    @Override
    public Object next() {
        indice++;
        return alimento.get(indice);
    }


    
    
}
