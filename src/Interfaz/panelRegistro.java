/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JScrollPane;

/**
 *
 * @author Eduardo
 */
public class panelRegistro extends javax.swing.JPanel {

    /**
     * Creates new form panelRegistro
     */
    public panelRegistro() {
        initComponents();
        this.setSize(520,440);
        //areaAlimento.append("hola");
        //JScrollPane pane =  new JScrollPane(areaAlimento,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //areaAlimento.setEnabled(true);
        //areaAlimento.setEditable(true);
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
        labelNombre1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        botonAlimento = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        campoAlimento = new javax.swing.JTextField();
        botonEjercicio = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        campoEjercicio = new javax.swing.JTextField();

        setBackground(new java.awt.Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("Alimento:");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 20));

        labelNombre1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre1.setText("Registra tu Dieta");
        add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 250, 50));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 240, 10));

        botonAlimento.setBackground(new java.awt.Color(97, 212, 195));
        botonAlimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAlimentoMouseClicked(evt);
            }
        });
        botonAlimento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Añadir");
        botonAlimento.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        add(botonAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 30));

        labelNombre2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelNombre2.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre2.setText("Ejercicio");
        add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 240, 10));

        campoAlimento.setBackground(new java.awt.Color(36, 47, 65));
        campoAlimento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        campoAlimento.setText("Registra tu alimentacion");
        campoAlimento.setBorder(null);
        campoAlimento.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoAlimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoAlimentoMouseClicked(evt);
            }
        });
        campoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAlimentoActionPerformed(evt);
            }
        });
        add(campoAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 240, 20));

        botonEjercicio.setBackground(new java.awt.Color(97, 212, 195));
        botonEjercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEjercicioMouseClicked(evt);
            }
        });
        botonEjercicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Añadir");
        botonEjercicio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        add(botonEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 30));

        campoEjercicio.setBackground(new java.awt.Color(36, 47, 65));
        campoEjercicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoEjercicio.setForeground(new java.awt.Color(255, 255, 255));
        campoEjercicio.setText("Registra tu ejercicio");
        campoEjercicio.setBorder(null);
        campoEjercicio.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoEjercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoEjercicioMouseClicked(evt);
            }
        });
        campoEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEjercicioActionPerformed(evt);
            }
        });
        add(campoEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 240, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAlimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAlimentoMouseClicked
        System.out.println("diste click en añadir alimento");
    }//GEN-LAST:event_botonAlimentoMouseClicked

    private void campoAlimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoAlimentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAlimentoMouseClicked

    private void campoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAlimentoActionPerformed

    private void botonEjercicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEjercicioMouseClicked
        System.out.println("diste click en añadir ejercicio");
    }//GEN-LAST:event_botonEjercicioMouseClicked

    private void campoEjercicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoEjercicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEjercicioMouseClicked

    private void campoEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEjercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEjercicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAlimento;
    private javax.swing.JPanel botonEjercicio;
    private javax.swing.JTextField campoAlimento;
    private javax.swing.JTextField campoEjercicio;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    // End of variables declaration//GEN-END:variables
}
