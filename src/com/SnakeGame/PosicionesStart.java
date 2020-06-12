/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SnakeGame;

import com.Player.GameUser;
import com.Player.Tablero;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class PosicionesStart extends javax.swing.JFrame {
    private int playersCant = 0;
    static JLabel label;
    static int hora = 0;
    static int min = 0;
    static int seg = 0;
    static boolean iniciarHilo = true;
    boolean corriendo = false;
    static JFrame obj;
    static int contador = 1;
    public PosicionesStart() {
        initComponents();
        ImageIcon fondo = new ImageIcon("fondogamescore.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(fondolbl.getWidth(), fondolbl.getHeight(), Image.SCALE_DEFAULT));
        fondolbl.setIcon(icono);
        this.repaint();
        butB.setEnabled(false);
        butC.setEnabled(false);
        butD.setEnabled(false);
        continuar.setEnabled(false);
        jugA.setText(GameUser.getName1());
        jugB.setText(GameUser.getName2());
        jugC.setText(GameUser.getName3());
        jugD.setText(GameUser.getName4());
        setLocationRelativeTo(this);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jugC = new javax.swing.JLabel();
        jugD = new javax.swing.JLabel();
        jugA = new javax.swing.JLabel();
        butB = new javax.swing.JButton();
        butC = new javax.swing.JButton();
        butD = new javax.swing.JButton();
        butA = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        puntB = new javax.swing.JLabel();
        puntC = new javax.swing.JLabel();
        puntD = new javax.swing.JLabel();
        puntA = new javax.swing.JLabel();
        fondolbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugB.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        getContentPane().add(jugB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 330, 60));

        jLabel5.setFont(new java.awt.Font("Orbitron", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TABLA DE POSICIONES SNAKEGAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 890, 80));

        jugC.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        getContentPane().add(jugC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 330, 60));

        jugD.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        getContentPane().add(jugD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 330, 60));

        jugA.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        getContentPane().add(jugA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 330, 60));

        butB.setText("Turno B");
        butB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBActionPerformed(evt);
            }
        });
        getContentPane().add(butB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 130, 30));

        butC.setText("Turno C");
        butC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCActionPerformed(evt);
            }
        });
        getContentPane().add(butC, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 130, 30));

        butD.setText("Turno D");
        butD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDActionPerformed(evt);
            }
        });
        getContentPane().add(butD, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 130, 30));

        butA.setText("Turno A");
        butA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAActionPerformed(evt);
            }
        });
        getContentPane().add(butA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 30));

        continuar.setText("CONTINUAR");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        getContentPane().add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        puntB.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        puntB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntB.setText("0");
        getContentPane().add(puntB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 60, 40));

        puntC.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        puntC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntC.setText("0");
        getContentPane().add(puntC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 60, 40));

        puntD.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        puntD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntD.setText("0");
        getContentPane().add(puntD, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 60, 40));

        puntA.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        puntA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntA.setText("0");
        getContentPane().add(puntA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 60, 40));
        getContentPane().add(fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void newGame(){
        SnakeGame gameplay = new SnakeGame();
        obj = new JFrame();
        label = new JLabel("00:00:00");
        label.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
        label.setBounds(0,0,137,45);
        obj.setBounds(10,10,905,700);
        obj.setBackground(Color.BLACK);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(label);
        obj.add(gameplay);
        obj.setLocationRelativeTo(this);
        iniciarCrono();
    
    }
    public static void setPuntaje(){
        switch (contador){
            case 1:
                puntA.setText(""+SnakeGame.puntaje);
                contador++;
                
                SnakeGame.puntaje = 0;
                
                break;
            case 2:
                puntB.setText(""+SnakeGame.puntaje);
                contador++;
                
                SnakeGame.puntaje = 0;
                break;
            case 3:
                puntC.setText(""+SnakeGame.puntaje);
                contador++;
                SnakeGame.puntaje = 0;
                break;
            case 4:
                puntD.setText(""+SnakeGame.puntaje);
                contador++;
                SnakeGame.puntaje = 0;
                break;
            default:
                break;
        }
    }
    private static void iniciarCrono() {
        if (iniciarHilo == true){
            Crono crono = new Crono(label);
            crono.start();
            
        }
    }
    private void verificacion(){
        if (playersCant == GameUser.getCantidad()){
            continuar.setEnabled(true);
            butA.setEnabled(false);
            butB.setEnabled(false);
            butC.setEnabled(false);
            butD.setEnabled(false);
        }
    
    
    }
    private void butAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAActionPerformed
        newGame();
        butB.setEnabled(true);
        butA.setEnabled(false);
        iniciarHilo = true;
        playersCant++;
        verificacion();
    }//GEN-LAST:event_butAActionPerformed

    private void butBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBActionPerformed
        iniciarHilo = true;
        newGame();
        butC.setEnabled(true);
        butB.setEnabled(false);
        playersCant++;
        verificacion();
    }//GEN-LAST:event_butBActionPerformed

    private void butCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCActionPerformed
        iniciarHilo = true;
        newGame();
        butD.setEnabled(true);
        butC.setEnabled(false);
        playersCant++;
        verificacion();
    }//GEN-LAST:event_butCActionPerformed

    private void butDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDActionPerformed
        iniciarHilo = true;
        newGame();
        continuar.setEnabled(true);
        butD.setEnabled(false);
        playersCant++;
        verificacion();
    }//GEN-LAST:event_butDActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        int valor1 = Integer.parseInt(puntA.getText());
        int valor2 = Integer.parseInt(puntB.getText());
        int valor3 = Integer.parseInt(puntC.getText());
        int valor4 = Integer.parseInt(puntD.getText());
        switch (GameUser.getCantidad()) {
            case 2:
                if (valor1>valor2){
                    JOptionPane.showMessageDialog(null,GameUser.getName1()+" GANA!!!");
                    Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())+3));
                    
                }else{
                    JOptionPane.showMessageDialog(null,GameUser.getName2()+" GANA!!!");
                    Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())+3));
                    
                }   break;
            case 3:
                if (valor1 > valor2 && valor1 > valor3){
                    JOptionPane.showMessageDialog(null,GameUser.getName1()+" GANA!!!");
                    Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())+3));
                }else if(valor2 > valor1 && valor2 > valor3){
                    JOptionPane.showMessageDialog(null,GameUser.getName2()+" GANA!!!");
                    Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())+3));
                }else if(valor3 > valor2 && valor3 > valor1){
                    JOptionPane.showMessageDialog(null,GameUser.getName3()+" GANA!!!");
                    Tablero.getEstrella3().setText(""+(Integer.parseInt(Tablero.getEstrella3().getText())+3));
                }   break;
            case 4:
                if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4){
                    JOptionPane.showMessageDialog(null,GameUser.getName1()+" GANA!!!");
                    Tablero.getEstrella1().setText(""+(Integer.parseInt(Tablero.getEstrella1().getText())+3));
                }else if(valor2 > valor1 && valor2 > valor3 && valor2 > valor4){
                    JOptionPane.showMessageDialog(null,GameUser.getName2()+" GANA!!!");
                    Tablero.getEstrella2().setText(""+(Integer.parseInt(Tablero.getEstrella2().getText())+3));
                }else if(valor3 > valor2 && valor3 > valor1 && valor3 > valor4){
                    JOptionPane.showMessageDialog(null,GameUser.getName3()+" GANA!!!");
                    Tablero.getEstrella3().setText(""+(Integer.parseInt(Tablero.getEstrella3().getText())+3));
                }else if(valor4 > valor2 && valor4 > valor1 && valor4 > valor3){
                    JOptionPane.showMessageDialog(null,GameUser.getName4()+" GANA!!!");
                    Tablero.getEstrella4().setText(""+(Integer.parseInt(Tablero.getEstrella4().getText())+3));
                }   break;
            default:
                break;
        }
        this.setVisible(false);
    }//GEN-LAST:event_continuarActionPerformed
    
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
            java.util.logging.Logger.getLogger(PosicionesStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosicionesStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosicionesStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosicionesStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosicionesStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butA;
    private javax.swing.JButton butB;
    private javax.swing.JButton butC;
    private javax.swing.JButton butD;
    private javax.swing.JButton continuar;
    private javax.swing.JLabel fondolbl;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jugA;
    private javax.swing.JLabel jugB;
    private javax.swing.JLabel jugC;
    private javax.swing.JLabel jugD;
    private static javax.swing.JLabel puntA;
    private static javax.swing.JLabel puntB;
    private static javax.swing.JLabel puntC;
    private static javax.swing.JLabel puntD;
    // End of variables declaration//GEN-END:variables
}
