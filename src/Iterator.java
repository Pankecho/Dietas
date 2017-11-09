
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
public abstract class Iterator {
    	ArrayList<Alimento> alimento;
	ArrayList<Ejercicio> ejercicio;
        int indice = -1;
	
	public abstract Object next();
	
	public boolean hasNext() {
            return false;
	}
}
