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
public class Dieta implements Component{
    
    private ArrayList<Component> componentes;
    private String nombre, descripcion;
    private int id;

    public Dieta(String nombre, String d) {
        this.nombre = nombre;
        this.descripcion = d;
        this.componentes = new ArrayList<Component>();
    }

    public ArrayList<Component> getComponentes() {
        return componentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dieta() {
        this.componentes = new ArrayList<Component>();
        this.descripcion = "";
        this.nombre = "";
    }

    @Override
    public Iterator getIterator(String i) {
        if(i.isEmpty()){
            return new IteradorNomal(componentes);
        }else{
            return new IteradorConFiltroTipo(i, componentes);
        }
    }

    @Override
    public void agregarComponente(Component c) {
        this.componentes.add(c);
    }

    @Override
    public void eliminarComponente(Component c) {
        int index = this.componentes.indexOf(c);
        if(index >= 0)
            this.componentes.remove(index);
    }

    @Override
    public Component getComponent(int i) {
        return this.componentes.get(i);
    }

    @Override
    public String getTipo() {
        return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
