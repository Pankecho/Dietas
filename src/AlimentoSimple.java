/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fredy
 */
public class AlimentoSimple extends Alimento{
    public AlimentoSimple(){
        this.nombre = "";
        this.tipoAlimento = "";
        this.descripcion = "";
        this.calorias = 0;
        this.id = 0;
        this.tipoComida = "";
    }
    
    public AlimentoSimple(int id, String n, String tA, int c, String d,String tc){
        this.id = id;
        this.nombre = n;
        this.tipoAlimento = tA;
        this.descripcion = d;
        this.calorias = c;
        this.tipoComida = tc;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        cadena += id + " - " + nombre + " - ";
        return cadena;
    }
}
