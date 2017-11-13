/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import javax.swing.JPanel;
import Patrones.*;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    Usuario u;
    CambiaPanel cambiaPanel;
    MensajeCerrar mensaje= new MensajeCerrar();
    panelAlimento panelAlimento= new panelAlimento();
    panelRegistro panelRegistro= new panelRegistro();
    panelEjercicio panelEjercicio= new panelEjercicio();
    ArrayList <Component> com;
    ArrayList <AlimentoCompuesto> ali=new ArrayList<AlimentoCompuesto>();;
    ArrayList <Ejercicio> ejer=new ArrayList<Ejercicio>();
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setUsuario(Usuario u){
        this.u=u;
    }
    
    public void añadirDatos(){
        labelUsuario.setText(u.getNombre());
        com=u.getDieta().getComponentes();
        for(int i = 0; i < com.size(); i++){
            System.out.println(com.get(i).getClass());
            switch(com.get(i).getClass().getName()){
                case "Patrones.Ejercicio":
                    ejer.add((Ejercicio)com.get(i));
                    break;
                case "Patrones.AlimentoCompuesto":
                    ali.add((AlimentoCompuesto)com.get(i));
                    break;
                default:
                   
                    break;
            }
        }
         switch(ejer.size()){
            case 0:
                textoEjercicio.setVisible(false);
                botonEjercicio1.setVisible(false);
                botonEjercicio2.setVisible(false);
                botonEjercicio3.setVisible(false);
            break;
            case 1:
                botonEjercicio2.setVisible(false);
                botonEjercicio3.setVisible(false);
            break;
            case 2:
                botonEjercicio3.setVisible(false);
        }
        if(ali.size()==4){
            botonEntremes2.setVisible(false);
        }       
        //System.out.println("Tamaño de Alimentos"+ali.size());
        //System.out.println("Tamaño de Ejercicios"+ejer.size());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        botonRegistro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonDesayuno = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonEntremes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonComida = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonEntremes2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        botonEjercicio1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        botonEjercicio2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        botonEjercicio3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        botonCena = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        textoEjercicio = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(51, 51, 51));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(0, 204, 204));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegistro.setBackground(new java.awt.Color(97, 212, 195));
        botonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistroMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRegistroMousePressed(evt);
            }
        });
        botonRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/historial-medico.png"))); // NOI18N
        botonRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro");
        botonRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 30));

        botonDesayuno.setBackground(new java.awt.Color(97, 212, 195));
        botonDesayuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDesayunoMousePressed(evt);
            }
        });
        botonDesayuno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cereales.png"))); // NOI18N
        botonDesayuno.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Desayuno");
        botonDesayuno.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 230, 30));

        botonEntremes.setBackground(new java.awt.Color(97, 212, 195));
        botonEntremes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEntremesMousePressed(evt);
            }
        });
        botonEntremes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sandwich.png"))); // NOI18N
        botonEntremes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Entremés");
        botonEntremes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonEntremes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 30));

        botonComida.setBackground(new java.awt.Color(97, 212, 195));
        botonComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonComidaMousePressed(evt);
            }
        });
        botonComida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comestibles.png"))); // NOI18N
        botonComida.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Comida");
        botonComida.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 30));

        botonEntremes2.setBackground(new java.awt.Color(97, 212, 195));
        botonEntremes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEntremes2MousePressed(evt);
            }
        });
        botonEntremes2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/palomitas-de-maiz.png"))); // NOI18N
        botonEntremes2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Entremés");
        botonEntremes2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonEntremes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 30));

        jPanel7.setBackground(new java.awt.Color(97, 212, 195));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(97, 212, 195));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ALIMENTOS");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -4, 120, 30));

        panelMenu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 30));

        botonEjercicio1.setBackground(new java.awt.Color(97, 212, 195));
        botonEjercicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEjercicio1MousePressed(evt);
            }
        });
        botonEjercicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fuerte.png"))); // NOI18N
        botonEjercicio1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ejercicio 1");
        botonEjercicio1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonEjercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 230, 30));

        botonEjercicio2.setBackground(new java.awt.Color(97, 212, 195));
        botonEjercicio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEjercicio2MousePressed(evt);
            }
        });
        botonEjercicio2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ropa-de-deporte.png"))); // NOI18N
        botonEjercicio2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ejercicio 2");
        botonEjercicio2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonEjercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 30));

        botonEjercicio3.setBackground(new java.awt.Color(97, 212, 195));
        botonEjercicio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEjercicio3MousePressed(evt);
            }
        });
        botonEjercicio3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fuerza.png"))); // NOI18N
        botonEjercicio3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ejercicio 3");
        botonEjercicio3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonEjercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 30));

        labelUsuario.setBackground(new java.awt.Color(153, 153, 153));
        labelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(51, 51, 51));
        labelUsuario.setText("Nombre del usuario");
        panelMenu.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        botonCena.setBackground(new java.awt.Color(97, 212, 195));
        botonCena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCenaMousePressed(evt);
            }
        });
        botonCena.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/taza-de-te.png"))); // NOI18N
        botonCena.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cena");
        botonCena.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 67, -1));

        panelMenu.add(botonCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, 30));

        textoEjercicio.setBackground(new java.awt.Color(97, 212, 195));
        textoEjercicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("EJERCICIOS");
        textoEjercicio.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 10, 120, -1));

        panelMenu.add(textoEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 30));

        bg.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 440));

        panelPrincipal.setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Bienvenido!");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        bg.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 520, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseClicked

    }//GEN-LAST:event_botonRegistroMouseClicked

    private void botonRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMousePressed
        new CambiaPanel(panelPrincipal,panelRegistro);
        setColor(botonRegistro);
        resetColor(botonDesayuno);
        resetColor(botonEntremes);
        resetColor(botonComida);
        resetColor(botonEntremes2);
        resetColor(botonCena);
        resetColor(botonEjercicio1);
        resetColor(botonEjercicio2);
        resetColor(botonEjercicio3);
        panelRegistro.setUser(u);
        panelRegistro.setData();
    }//GEN-LAST:event_botonRegistroMousePressed

    private void botonEntremesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntremesMousePressed
        panelAlimento.setDatos(ali.get(3),u);
        new CambiaPanel(panelPrincipal,panelAlimento);
        setColor(botonEntremes);
        resetColor(botonDesayuno);
        resetColor(botonRegistro);
        resetColor(botonComida);
        resetColor(botonEntremes2);
        resetColor(botonCena);
        resetColor(botonEjercicio1);
        resetColor(botonEjercicio2);
        resetColor(botonEjercicio3);
    }//GEN-LAST:event_botonEntremesMousePressed

    private void botonComidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComidaMousePressed
        panelAlimento.setDatos(ali.get(1),u);
        new CambiaPanel(panelPrincipal,panelAlimento);
        setColor(botonComida);
        resetColor(botonDesayuno);
        resetColor(botonRegistro);
        resetColor(botonEntremes);
        resetColor(botonEntremes2);
        resetColor(botonCena);
        resetColor(botonEjercicio1);
        resetColor(botonEjercicio2);
        resetColor(botonEjercicio3);
    }//GEN-LAST:event_botonComidaMousePressed

    private void botonDesayunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDesayunoMousePressed
        panelAlimento.setDatos(ali.get(0),u);
        new CambiaPanel(panelPrincipal,panelAlimento);
        setColor(botonDesayuno);
        resetColor(botonEntremes);
        resetColor(botonRegistro);
        resetColor(botonComida);
        resetColor(botonEntremes2);
        resetColor(botonCena);
        resetColor(botonEjercicio1);
        resetColor(botonEjercicio2);
        resetColor(botonEjercicio3);
    }//GEN-LAST:event_botonDesayunoMousePressed

    private void botonEntremes2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntremes2MousePressed
        panelAlimento.setDatos(ali.get(4),u);
        new CambiaPanel(panelPrincipal,panelAlimento);
        setColor(botonEntremes2);
        resetColor(botonDesayuno);
        resetColor(botonRegistro);
        resetColor(botonComida);
        resetColor(botonEntremes);
        resetColor(botonCena);
        resetColor(botonEjercicio1);
        resetColor(botonEjercicio2);
        resetColor(botonEjercicio3);
    }//GEN-LAST:event_botonEntremes2MousePressed

    private void botonEjercicio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEjercicio1MousePressed
        panelEjercicio.setDatos(ejer.get(0),u);
        new CambiaPanel(panelPrincipal,panelEjercicio);
        setColor(botonEjercicio1);
        resetColor(botonDesayuno);
        resetColor(botonRegistro);
        resetColor(botonComida);
        resetColor(botonEntremes2);
        resetColor(botonCena);
        resetColor(botonEntremes);
        resetColor(botonEjercicio2);
        resetColor(botonEjercicio3);
    }//GEN-LAST:event_botonEjercicio1MousePressed

    private void botonEjercicio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEjercicio2MousePressed
        panelEjercicio.setDatos(ejer.get(1),u);
        new CambiaPanel(panelPrincipal,panelEjercicio);
        setColor(botonEjercicio2);
        resetColor(botonDesayuno);
        resetColor(botonRegistro);
        resetColor(botonComida);
        resetColor(botonEntremes2);
        resetColor(botonCena);
        resetColor(botonEjercicio1);
        resetColor(botonEntremes);
        resetColor(botonEjercicio3);
    }//GEN-LAST:event_botonEjercicio2MousePressed

    private void botonEjercicio3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEjercicio3MousePressed
        panelEjercicio.setDatos(ejer.get(2),u);
        new CambiaPanel(panelPrincipal,panelEjercicio);
        setColor(botonEjercicio3);
        resetColor(botonDesayuno);
        resetColor(botonRegistro);
        resetColor(botonComida);
        resetColor(botonEntremes2);
        resetColor(botonCena);
        resetColor(botonEjercicio1);
        resetColor(botonEjercicio2);
        resetColor(botonEntremes);
    }//GEN-LAST:event_botonEjercicio3MousePressed

    private void botonCenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCenaMousePressed
        panelAlimento.setDatos(ali.get(2),u);
        new CambiaPanel(panelPrincipal,panelAlimento);
        setColor(botonCena);
        resetColor(botonDesayuno);
        resetColor(botonRegistro);
        resetColor(botonComida);
        resetColor(botonEntremes2);
        resetColor(botonEntremes);
        resetColor(botonEjercicio1);
        resetColor(botonEjercicio2);
        resetColor(botonEjercicio3);
    }//GEN-LAST:event_botonCenaMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setEnabled(false);
        mensaje.setVentana(this);
        mensaje.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    
    public void setColor(JPanel panel){
        panel.setBackground(new Color(0,102,102));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(97,212,195));        
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel botonCena;
    private javax.swing.JPanel botonComida;
    private javax.swing.JPanel botonDesayuno;
    private javax.swing.JPanel botonEjercicio1;
    private javax.swing.JPanel botonEjercicio2;
    private javax.swing.JPanel botonEjercicio3;
    private javax.swing.JPanel botonEntremes;
    private javax.swing.JPanel botonEntremes2;
    private javax.swing.JPanel botonRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel textoEjercicio;
    // End of variables declaration//GEN-END:variables
}
