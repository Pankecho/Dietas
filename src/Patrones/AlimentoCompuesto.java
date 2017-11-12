package Patrones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fredy
 */
public class AlimentoCompuesto extends Alimento{
    private Alimento al;
    private String tipoAlimentoComida;

    public AlimentoCompuesto(Alimento al, String tipoAlimento) {
        this.al = al;
        this.tipoAlimentoComida = tipoAlimento;
    }
    
    public String getTipoComidaAlimento(){
        return tipoAlimentoComida;
    }    
    
     public String getDescripcion() {
        return al.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        this.al.setDescripcion(descripcion);
    }
    
    public int getId() {
        return al.getId();
    }

    
    
    public String getNombre() {
        return al.getNombre();
    }

    public void setNombre(String nombre) {
        this.al.setNombre(nombre);
    }

    public String getTipoAlimento() {
        return al.getTipoAlimento();
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.al.setTipoAlimento(tipoAlimento);
    }

    public int getCalorias() {
        return al.getCalorias();
    }

    public void setCalorias(int calorias) {
        this.al.setCalorias(calorias);
    }
    
    @Override
    public String getTipo() {
        return this.al.getTipo();
    }
    
}
