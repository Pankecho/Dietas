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
public interface Component {
    public Iterator getIterator(String i);
    public void agregarComponente(Component c);
    public void eliminarComponente(Component c);
    public Component getComponent(int i);
    public String getTipo();
}
