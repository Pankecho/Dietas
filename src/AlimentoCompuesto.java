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
    private String tipoAlimento;

    public AlimentoCompuesto(Alimento al, String tipoAlimento) {
        this.al = al;
        this.tipoAlimento = tipoAlimento;
    }
    
    public String getTipoAlimento(){
        return tipoAlimento;
    }    
}
