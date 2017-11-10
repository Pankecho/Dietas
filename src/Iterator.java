
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
<<<<<<< HEAD
 * @author pankecho
 */
public abstract class Iterator {
    protected ArrayList<Component> elements;
    
    public abstract boolean hasNext();
    public abstract Component next();
=======
 * @author Eduardo
 */
public abstract class Iterator {
    	ArrayList<Alimento> alimento;
	ArrayList<Ejercicio> ejercicio;
        int indice = -1;
	
	public abstract Object next();
	
	public boolean hasNext() {
            return false;
	}
>>>>>>> fce0d9e7a812c73c644e9ea4148e96f86bc6af8d
}
