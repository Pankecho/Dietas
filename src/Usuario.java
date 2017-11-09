
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
    private ArrayList observers;
    private String nombre;
    private int edad, peso;
    private char sexo;
    private float altura;
    private String tipoVida;
    private String password;

    public Usuario(String n, int e, int p, char s, float a, String t,String pp) {
        this.nombre = n;
        this.edad = e;
        this.peso = p;
        this.sexo = s;
        this.altura = a;
        this.tipoVida = t;
        this.password = pp;
        this.observers = new ArrayList();
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
    public void notifyObservers() {
        
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
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
}
