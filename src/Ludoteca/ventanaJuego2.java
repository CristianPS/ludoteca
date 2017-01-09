/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludoteca;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class ventanaJuego2 extends javax.swing.JFrame {
    private Jugador Jug;
    private int botones;
    private Jugada J;
    private int apuesta;
    private Baraja baraja;
    ImageIcon[] imagenes;
    /**
     * Creates new form ventanaJuego2
     * @param jugador
     * @param i
     */
    public ventanaJuego2(Jugador jugador, int i) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        imagenes = new ImageIcon[52];
        imagenes[0]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/1_0.png"));
        imagenes[1]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/2_0.png"));
        imagenes[2]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/3_0.png"));
        imagenes[3]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/4_0.png"));
        imagenes[4]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/5_0.png"));
        imagenes[5]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/6_0.png"));
        imagenes[6]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/7_0.png"));
        imagenes[7]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/8_0.png"));
        imagenes[8]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/9_0.png"));
        imagenes[9]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/10_0.png"));
        imagenes[10]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/11_0.png"));
        imagenes[11]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/12_0.png"));
        imagenes[12]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/13_0.png"));
        imagenes[13]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/1_1.png"));
        imagenes[14]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/2_1.png"));
        imagenes[15]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/3_1.png"));
        imagenes[16]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/4_1.png"));
        imagenes[17]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/5_1.png"));
        imagenes[18]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/6_1.png"));
        imagenes[19]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/7_1.png"));
        imagenes[20]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/8_1.png"));
        imagenes[21]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/9_1.png"));
        imagenes[22]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/10_1.png"));
        imagenes[23]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/11_1.png"));
        imagenes[24]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/12_1.png"));
        imagenes[25]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/13_1.png"));
        imagenes[26]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/1_2.png"));
        imagenes[27]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/2_2.png"));
        imagenes[28]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/3_2.png"));
        imagenes[29]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/4_2.png"));
        imagenes[30]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/5_2.png"));
        imagenes[31]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/6_2.png"));
        imagenes[32]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/7_2.png"));
        imagenes[33]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/8_2.png"));
        imagenes[34]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/9_2.png"));
        imagenes[35]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/10_2.png"));
        imagenes[36]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/11_2.png"));
        imagenes[37]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/12_2.png"));
        imagenes[38]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/13_2.png"));
        imagenes[39]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/1_3.png"));
        imagenes[40]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/2_3.png"));
        imagenes[41]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/3_3.png"));
        imagenes[42]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/4_3.png"));
        imagenes[43]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/5_3.png"));
        imagenes[44]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/6_3.png"));
        imagenes[45]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/7_3.png"));
        imagenes[46]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/8_3.png"));
        imagenes[47]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/9_3.png"));
        imagenes[48]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/10_3.png"));
        imagenes[49]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/11_3.png"));
        imagenes[50]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/12_3.png"));
        imagenes[51]=new javax.swing.ImageIcon(getClass().getResource("/blackjack/13_3.png")); 
        Jug = jugador;
        botones = i;
        if(botones == 1)
        {
            jPanel1.setBackground(Color.GREEN);//Esto cambia el fondo de la mesa dependiendo del juego.
            //JugadaBJ J = new JugadaBJ() {};//AÑadido esto al if y al else, las clases de jugadas son diferentes dependiendo
        }
        else
        {
            jPanel1.setBackground(Color.RED);
            //Jugada7ymedia J = new Jugada7ymedia() {};
        }
        jLabel1.setText("Bienvenido, " +Jug.getNombre());
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }
    public void recogerJugada(Jugada jugada)
    {
        J=jugada;
    }
    
    public void deshabilitarJugar()
    {
        jButton3.setEnabled(false);
    }
    public Jugador getJugador()
    {
        return Jug;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre, habría que pasrlo desde la otra ventana.");
        jLabel1.setToolTipText("");

        jLabel2.setText("¿Cúantas fichas quieres apostar?");

        jButton1.setText("Apostar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Banca");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Jugador");

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(95, 95, 95)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Comenzar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pedir Carta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Comprobar ganador");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);

        jMenu1.setText("File");

        jMenuItem1.setText("Historico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jButton1))
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 437, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1643, Short.MAX_VALUE)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto = jTextField1.getText();
        apuesta = Integer.parseInt(texto);
        
            if(botones==0)
            {
                baraja = new BarajaEspanola();
                J = new Jugada7ymedia(baraja, Jug) {};
                    if(apuesta<25)
                    {
                        jLabel3.setText("Has apostado " + apuesta + " fichas. Al ser menor de 25 y ser esta la apuesta minima, tu apuesta ha sido modificada a 25 fichas");
                    }
                    else
                    {
                        jLabel3.setText("¡Has apostado " + apuesta + " fichas!");                       
                    }
                    J.apostar(apuesta);                    
                    recogerJugada(J); 
            }
            if(botones==1)
            {
                baraja = new BarajaFrancesa();
                J = new JugadaBJ(baraja, Jug) {};
                    if(apuesta<10)
                    {
                        jLabel3.setText("Has apostado " + apuesta + " fichas. Al ser menor de 10 y ser esta la apuesta minima, tu apuesta ha sido modificada a 10 fichas");
                    }
                    else
                    {
                        jLabel3.setText("¡Has apostado " + apuesta + " fichas!");                       
                    }
                    J.apostar(apuesta);
                    recogerJugada(J); 
                    //JOptionPane.showInternalMessageDialog(this, Jug.getFichasTotales());
            }
        if(evt.getSource()==jButton1 && (botones!=2) && (botones!=-1))
        {
            jButton1.setEnabled(false);
            jTextField1.setEnabled(false);//A lo mejor no funciona.
            if(!(botones==0 || botones==1))
            {
                jLabel3.setText("Has apostado " + apuesta + " fichas.");
            }
        }
        jButton2.setEnabled(true);
        //this.apuesta=apuesta; //??¿¿
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton3.setEnabled(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(botones==0)
        {
            J.jugarJugador(this);
        }
        if(botones==1)
        {
            J.repartirJugador(this);
            
            System.out.println("-------------------------------");
            J.repartirBanca();
            System.out.println("-------------------------------");
            J.jugarJugador(this);   
            System.out.println("-------------------------------");
        }
        // J.jugarBanca(); CREO QUE ESTO MEJOR EN EL BOTON DE ABAJO UNA VEZ HAYA ACABADO EL JUGADOR
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Cuando se pulse el meno se hace esto.
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        J.jugarBanca();
        float valorManoJ = J.getPuntJug();
        float valorManoB = J.getPuntBan();
        System.out.println("Valor mano jugador: "+valorManoJ+"\n Valor mano banca: "+valorManoB);
        if(botones==0)
        {
            if((valorManoJ>valorManoB && valorManoJ<=7.5)|| valorManoB>7.5)
            {
                JOptionPane.showMessageDialog(this, "Has ganado. Enhorabuena!\n Recibes " +2*apuesta +"fichas.");
                Jug.setFichasTotales(Jug.getFichasTotales()+apuesta);
            }
            else if (valorManoJ==valorManoB)
            {
                JOptionPane.showMessageDialog(this, "Ha sido un empate.\nLas " +apuesta + "fichas apostadas son devueltas a tu saldo.");
            }
            else 
            {
               JOptionPane.showMessageDialog(this, "Ha ganado la banca. Buena suerte la proxima vez"); 
               Jug.setFichasTotales(Jug.getFichasTotales()-apuesta);
            }
        }
        if(botones==1)
        {
            if((valorManoJ>valorManoB && valorManoJ<=21)|| valorManoB>21)
            {
                JOptionPane.showMessageDialog(this, "Has ganado. Enhorabuena!\n Recibes " +2*apuesta +"fichas.");
                Jug.setFichasTotales(Jug.getFichasTotales()+apuesta);
            }
            else if (valorManoJ==valorManoB)
            {
                JOptionPane.showMessageDialog(this, "Ha sido un empate.\nLas " +apuesta + "fichas apostadas son devueltas a tu saldo.");
            }
            else 
            {
               JOptionPane.showMessageDialog(this, "Ha ganado la banca. Buena suerte la proxima vez"); 
               Jug.setFichasTotales(Jug.getFichasTotales()-apuesta);            
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Jugador j=new Jugador("Federico");
                int i=1;
                new ventanaJuego2(j, i).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
