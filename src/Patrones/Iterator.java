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
public abstract class Iterator {
    protected ArrayList<Component> elements;
    
    public abstract boolean hasNext();
    public abstract Component next();
}
