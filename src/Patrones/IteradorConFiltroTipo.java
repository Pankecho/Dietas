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
public class IteradorConFiltroTipo extends Iterator{
    
    private String filtro;
    
    private int index;

    public IteradorConFiltroTipo(String f,ArrayList<Component> e) {
        this.elements = new ArrayList<Component>();
        this.filtro = f;
        this.index = 0;
        for(int i = 0; i < e.size(); i++){
            if(e.get(i).getTipo().equals(f)){
                   this.elements.add(e.get(i));
            }
        }
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
