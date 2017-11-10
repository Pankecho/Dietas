
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
public class IteradorNomal extends Iterator{
    
    private int index;

    public IteradorNomal(ArrayList<Component> lista) {
        this.index = 0;
        this.elements = lista;
    }
    
    @Override
    public boolean hasNext() {
        return index < this.elements.size();
    }

    @Override
    public Component next() {
        if(index < this.elements.size())
            return this.elements.get(index++);
        else
            return null;
    }
    
}
