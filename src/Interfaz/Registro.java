/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Patrones.*;

/**
 *
 * @author Eduardo
 */
public class Registro extends javax.swing.JFrame {
    Facade f;
    /**
     * Creates new form Registro
     */
    Menu m= new Menu();
    MensajeCerrar mensaje= new MensajeCerrar();
    public Registro() {
        initComponents();
        this.setSize(587, 505);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        campoNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        campoApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        campoUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        campoContraseña = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        campoEdad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        campoPeso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        campoAltura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoVida = new javax.swing.JComboBox<>();
        campoSexo = new javax.swing.JComboBox<>();
        botonAceptar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(587, 475));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 10));

        campoNombre.setBackground(new java.awt.Color(36, 47, 65));
        campoNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(255, 255, 255));
        campoNombre.setText("nombre");
        campoNombre.setBorder(null);
        campoNombre.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoNombreMouseClicked(evt);
            }
        });
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 200, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("NOMBRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 200, 10));

        campoApellido.setBackground(new java.awt.Color(36, 47, 65));
        campoApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(255, 255, 255));
        campoApellido.setText("apellido");
        campoApellido.setBorder(null);
        campoApellido.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoApellidoMouseClicked(evt);
            }
        });
        campoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 200, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("APELLIDOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 200, 10));

        campoUsuario.setBackground(new java.awt.Color(36, 47, 65));
        campoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario.setText("user");
        campoUsuario.setBorder(null);
        campoUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoUsuarioMouseClicked(evt);
            }
        });
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 200, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("USUARIO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 200, 10));

        campoContraseña.setBackground(new java.awt.Color(36, 47, 65));
        campoContraseña.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        campoContraseña.setText("pass");
        campoContraseña.setBorder(null);
        campoContraseña.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoContraseñaMouseClicked(evt);
            }
        });
        campoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(campoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 200, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("CONTRASEÑA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, 10));

        campoEdad.setBackground(new java.awt.Color(36, 47, 65));
        campoEdad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoEdad.setForeground(new java.awt.Color(255, 255, 255));
        campoEdad.setText("23");
        campoEdad.setBorder(null);
        campoEdad.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoEdadMouseClicked(evt);
            }
        });
        campoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEdadActionPerformed(evt);
            }
        });
        jPanel1.add(campoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 200, 20));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("EDAD");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 200, 10));

        campoPeso.setBackground(new java.awt.Color(36, 47, 65));
        campoPeso.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoPeso.setForeground(new java.awt.Color(255, 255, 255));
        campoPeso.setText("60");
        campoPeso.setBorder(null);
        campoPeso.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoPesoMouseClicked(evt);
            }
        });
        campoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesoActionPerformed(evt);
            }
        });
        jPanel1.add(campoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 200, 20));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("PESO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 200, 10));

        campoAltura.setBackground(new java.awt.Color(36, 47, 65));
        campoAltura.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoAltura.setForeground(new java.awt.Color(255, 255, 255));
        campoAltura.setText("60");
        campoAltura.setBorder(null);
        campoAltura.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoAltura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoAlturaMouseClicked(evt);
            }
        });
        campoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAlturaActionPerformed(evt);
            }
        });
        jPanel1.add(campoAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 200, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("ESTILO DE VIDA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("ALTURA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("SEXO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        campoVida.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoVida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentario", "Leve", "Moderada", "Fuerte", "Muy Fuerte" }));
        campoVida.setBorder(null);
        jPanel1.add(campoVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 350, 90, -1));

        campoSexo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        campoSexo.setBorder(null);
        jPanel1.add(campoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 310, 90, -1));

        botonAceptar.setBackground(new java.awt.Color(97, 212, 195));
        botonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarMouseClicked(evt);
            }
        });
        botonAceptar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Aceptar");
        botonAceptar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 130, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Registra tu datos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoNombreMouseClicked
        campoNombre.setText("");
    }//GEN-LAST:event_campoNombreMouseClicked

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoApellidoMouseClicked
        campoApellido.setText("");
    }//GEN-LAST:event_campoApellidoMouseClicked

    private void campoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidoActionPerformed

    private void campoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMouseClicked
        campoUsuario.setText("");
    }//GEN-LAST:event_campoUsuarioMouseClicked

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void campoEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoEdadMouseClicked
        campoEdad.setText("");
    }//GEN-LAST:event_campoEdadMouseClicked

    private void campoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEdadActionPerformed

    private void campoPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoPesoMouseClicked
        campoPeso.setText("");
    }//GEN-LAST:event_campoPesoMouseClicked

    private void campoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesoActionPerformed

    private void campoAlturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoAlturaMouseClicked
        campoAltura.setText("");
    }//GEN-LAST:event_campoAlturaMouseClicked

    private void campoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAlturaActionPerformed

    private void campoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContraseñaActionPerformed

    private void campoContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContraseñaMouseClicked
        campoContraseña.setText("");
    }//GEN-LAST:event_campoContraseñaMouseClicked

    private void botonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseClicked
        char sexo;
        if(campoSexo.getSelectedItem().equals("Hombre")){
            sexo='M';
        }else{
            sexo='F';
        }
        System.out.println("Vida: "+campoVida.getSelectedItem().toString()+" sexo:"+sexo);
        f= new Facade((campoNombre.getText()+" "+campoApellido.getText()),Integer.parseInt(campoEdad.getText()),
                Float.parseFloat(campoPeso.getText()),sexo,Float.parseFloat(campoAltura.getText()),
                campoVida.getSelectedItem().toString(),
                campoContraseña.getText(),campoUsuario.getText());
        if (f.getUsuario() == null){
            System.out.println("No se creo");
        }else{
            System.out.println("Se creo el usuario");
            m.setUsuario(f.getUsuario());
            m.añadirDatos();
            m.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_botonAceptarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setEnabled(false);
        mensaje.setVentana(this);
        mensaje.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAceptar;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JComboBox<String> campoVida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
