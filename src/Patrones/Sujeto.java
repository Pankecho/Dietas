package Patrones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pankecho
 */
public interface Sujeto {
    public void agregaObservador(Observer o);
    public void eliminaObservador(Observer o);
    public void notifyObservers(Component c);
}
