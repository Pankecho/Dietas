
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
public class CreadorDieta {
    private Iterator iterador;
    private ArrayList<Alimento> alimentos;
    private ArrayList<Ejercicio> ejercicios;

    public CreadorDieta(ArrayList<Alimento> a, ArrayList<Ejercicio> e) {
        this.alimentos = a;
        this.ejercicios = e;
    }
    
    public Dieta creaDieta(Usuario u){
        ArrayList<Component> array = new ArrayList<Component>();
        ArrayList<Alimento> e = (ArrayList<Alimento>) this.alimentos.clone();
        Dieta d = new Dieta("Dieta de " + u.getNombre(), "Dieta de " + u.getNombre() + " - " + u.getTipoVida());
        float calculo = 0;
        float caloriasPorComida = 0;
        switch(u.getSexo()){
            case 'M':
                calculo = (float) (66.473 + (13.751 * u.getPeso()) + (5.0033 * u.getAltura()) - (6.7550 * u.getEdad()));
                break;
            case 'F':
                calculo = (float) (65.51 + (9.463 * u.getPeso()) + (1.8 * u.getAltura()) - (4.6756 * u.getEdad()));
                break;
        }
        switch(u.getTipoVida()){
            case "Sedentario":
                calculo *= 1.2;
                array = getOpcionesEjercicios(3);
                break;
            case "Leve":
                calculo *= 1.375;
                array = getOpcionesEjercicios(2);
                break;
            case "Moderada":
                calculo *= 1.55;
                array = getOpcionesEjercicios(1);
                break;
            case "Fuerte":
                calculo *= 1.72;
                break;
            case "Muy Fuerte":
                calculo *= 1.9;
                break;
        }
        caloriasPorComida = calculo / 4;
        array.addAll(getOpcionesAlimentos("desayuno", caloriasPorComida, e,1));
        array.addAll(getOpcionesAlimentos("comida", caloriasPorComida, e,1));
        array.addAll(getOpcionesAlimentos("cena", caloriasPorComida, e,1));
        array.addAll(getOpcionesAlimentos("entremes", caloriasPorComida, e,2));
        
        for(int i = 0; i < array.size(); i++)
            d.agregarComponente(array.get(i));
        
        return d;
    }
    
    public ArrayList<Component> getOpcionesAlimentos(String tipo, float c,ArrayList<Alimento> e, int max){
        ArrayList<Component> array = new ArrayList<Component>();
        int index = 0;
        for(int i = 0; i < e.size(); i++){
            if(index < max){
                if(contains(e.get(i).getTipoAlimento(), tipo)){
                    if(e.get(i).getCalorias() <= c){
                        array.add(e.get(i));
                        e.remove(i);
                        index++;
                    }
                }
            }
        }
        return array;
    }
    
    public ArrayList<Component> getOpcionesEjercicios(int cantidad){
        ArrayList<Component> array = new ArrayList<Component>();
        for(int i = 0; i < cantidad; i++){
            array.add(ejercicios.get((int)(Math.random() * ejercicios.size())));
        }
        return array;
    }
    
    public boolean contains(String a, String b){
        String[] array = a.split(",");
        for(int i = 0; i < array.length; i++){
            if(b.equals(array[i])){
                return true;
            }
        }
        return false;
    }
    
}
