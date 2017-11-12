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
public class Usuario implements Sujeto{
    private ArrayList<Observer> observers;
    private String nombre,usuario;
    private int edad, id;
    private char sexo;
    private float altura,peso;
    private String tipoVida;
    private String password;
    private Dieta dieta;

    public Usuario() {
        this.id = 0;
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.sexo = 'M';
        this.altura = 0;
        this.tipoVida = "";
        this.password = "";
        this.usuario = "";
        this.observers = new ArrayList<Observer>();
        this.dieta = null;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Usuario(String n, int e, float p, char s, float a, String t,String pp, String u) {
        this.id = 0;
        this.nombre = n;
        this.edad = e;
        this.peso = p;
        this.sexo = s;
        this.altura = a;
        this.tipoVida = t;
        this.password = pp;
        this.usuario = u;
        this.observers = new ArrayList();
        this.dieta = null;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void agregaObservador(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void eliminaObservador(Observer o) {
       int index = this.observers.indexOf(o);
       if(index >= 0)
           this.observers.remove(index);
    }

    @Override
    public void notifyObservers(Component c) {
        for(int i = 0; i < this.observers.size(); i++){
            observers.get(i).update(c);
        }
    }

    public int getId() {
        return id;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTipoVida() {
        return tipoVida;
    }

    public void setTipoVida(String tipoVida) {
        this.tipoVida = tipoVida;
    }   
    
    public void comer(AlimentoCompuesto a){
        System.out.println("Comer");
        notifyObservers(a);
        
    }
    
    public void ejercitar(Ejercicio a ){
        notifyObservers(a);
    }
}
