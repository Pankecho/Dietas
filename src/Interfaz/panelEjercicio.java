/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Patrones.Ejercicio;
import Patrones.Usuario;
import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo
 */
public class panelEjercicio extends javax.swing.JPanel {

    /**
     * Creates new form panelAlimento
     */
    Ejercicio e;
    Usuario u;
    public panelEjercicio() {
        initComponents();
        this.setSize(520,440);
    }
    public void setDatos(Ejercicio e,Usuario u){
        this.u=u;
        this.e=e;
        labelNombre.setText(e.getNombre());
        labelDescripcion.setText(e.getDescripcion());
        ImageIcon ii = new ImageIcon(e.getImagen());
        labelImagen.setIcon(ii);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("Nombre del Ejercicio");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 50));

        labelDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Esta es la descripcion del alimento");
        add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 270, 60));

        botonAceptar.setBackground(new java.awt.Color(97, 212, 195));
        botonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarMouseClicked(evt);
            }
        });
        botonAceptar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registrar");
        botonAceptar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 100, 30));

        labelImagen.setForeground(new java.awt.Color(255, 255, 255));
        labelImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelImagenMousePressed(evt);
            }
        });
        add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 280, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void labelImagenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagenMousePressed
        // TODO add your handling code here:
        u.ejercitar(e);
    }//GEN-LAST:event_labelImagenMousePressed

    private void botonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseClicked
        u.ejercitar(e);
    }//GEN-LAST:event_botonAceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAceptar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
