/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian
 */
public class VentanaHistorico extends javax.swing.JFrame {

    /**
     * Creates new form VentanaHistorico
     */
    private String text, nombreJugador;
    private Historico hist;
    public VentanaHistorico(Historico h) throws IOException {        
        initComponents();      
        hist = h;
        setVisible(true);
        //nombreJug.setVisible(true);
        //text = texto;
        //jTextArea1.setText(texto);
        resultadosJug.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buscarJug = new javax.swing.JButton();
        nombreJug = new javax.swing.JTextField();
        mostrarJugs = new javax.swing.JButton();
        mostrarClas = new javax.swing.JButton();
        mostrarPart = new javax.swing.JButton();
        resultadosJug = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Histórico");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        buscarJug.setLabel("Buscar Jug.");
        buscarJug.setPreferredSize(new java.awt.Dimension(137, 29));
        buscarJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJugActionPerformed(evt);
            }
        });

        nombreJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJugActionPerformed(evt);
            }
        });

        mostrarJugs.setText("Mostrar jugadores.");
        mostrarJugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarJugsActionPerformed(evt);
            }
        });

        mostrarClas.setText("Mostrar clasificación.");
        mostrarClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarClasActionPerformed(evt);
            }
        });

        mostrarPart.setText("Mostrar partidas.");

        resultadosJug.setLabel("Resultados");
        resultadosJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosJugActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduce el nombre de un jugador.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreJug)
                            .addComponent(mostrarJugs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrarClas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrarPart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscarJug, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultadosJug, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombreJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resultadosJug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
                        .addGap(53, 53, 53)
                        .addComponent(mostrarJugs)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarClas)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarPart)
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJugActionPerformed
        nombreJugador = nombreJug.getText();
        if(hist.buscarJugador(nombreJugador).getNombre()!=null)
        {
            jTextArea1.setText("Jugador encontrado.");
            resultadosJug.setEnabled(true);
        }
        else //if(hist.buscarJugador(nombreJugador)==1)
        {
            jTextArea1.setText("Jugador no encontrado.");
            resultadosJug.setEnabled(false);
        }
    }//GEN-LAST:event_buscarJugActionPerformed

    private void nombreJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJugActionPerformed
        
    }//GEN-LAST:event_nombreJugActionPerformed

    private void mostrarJugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarJugsActionPerformed
        //String prueba = hist.imprimeArrayJugadores();
        jTextArea1.setText(hist.imprimeArrayJugadores());
    }//GEN-LAST:event_mostrarJugsActionPerformed

    private void resultadosJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosJugActionPerformed
        resultadosJug.setEnabled(false);
         
        try {
            jTextArea1.setText(hist.resultados(hist.buscarJugador(nombreJugador)));
        } catch (IOException ex) {
            Logger.getLogger(VentanaHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resultadosJugActionPerformed

    private void mostrarClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarClasActionPerformed
        jTextArea1.setText(hist.clasificacion());
    }//GEN-LAST:event_mostrarClasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Historico h = null;
                try {
                    h = new Historico();
                } catch (IOException ex) {
                    Logger.getLogger(VentanaHistorico.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    Historico hist = new Historico();
                } catch (IOException ex) {
                    Logger.getLogger(VentanaHistorico.class.getName()).log(Level.SEVERE, null, ex);
                }
        Jugador Jose = new Jugador("Jose");
        Jose.setJugadasEmpatadas(2);
        System.out.println(Jose.getJugadasEmpatadas());
        Jose.setJugadasGanadas7(45);
        System.out.println(Jose.getJugadasGanadas7());
        Jose.setJugadasGanadasBJ(62);
        System.out.println(Jose.getJugadasGanadasBJ());
        Jose.setJugadasPerdidas7(24);
        System.out.println(Jose.getJugadasPerdidas7());
        Jose.setJugadasPerdidasBJ(13);
        System.out.println(Jose.getJugadasPerdidasBJ());
        Jose.setFichasTotales(12000);
        System.out.println(Jose.getFichasTotales());
        h.anadirJugador(Jose);
        Jugador Pepe = new Jugador("Pepe");
        Pepe.setJugadasEmpatadas(2);
        System.out.println(Pepe.getJugadasEmpatadas());
        Pepe.setJugadasGanadas7(45);
        System.out.println(Pepe.getJugadasGanadas7());
        Pepe.setJugadasGanadasBJ(62);
        System.out.println(Pepe.getJugadasGanadasBJ());
        Pepe.setJugadasPerdidas7(24);
        System.out.println(Pepe.getJugadasPerdidas7());
        Pepe.setJugadasPerdidasBJ(13);
        System.out.println(Pepe.getJugadasPerdidasBJ());
        Pepe.setFichasTotales(12000);
        System.out.println(Pepe.getFichasTotales());
        h.anadirJugador(Pepe);
                //new VentanaHistorico(h).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarJug;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mostrarClas;
    private javax.swing.JButton mostrarJugs;
    private javax.swing.JButton mostrarPart;
    private javax.swing.JTextField nombreJug;
    private javax.swing.JButton resultadosJug;
    // End of variables declaration//GEN-END:variables
}
