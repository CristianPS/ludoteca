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
    private int iAux=0;
    private int[] valores = new int[2];
    /**
     * Creates new form ventanaJuego2
     * @param jugador
     * @param i
     */
    public ventanaJuego2(Jugador jugador, int i) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setVisible(true); 
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
        imagenes = new ImageIcon[53];
        /*imagenes[0]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_0.png"));
        imagenes[1]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_0.png"));
        imagenes[2]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_0.png"));
        imagenes[3]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_0.png"));
        imagenes[4]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_0.png"));
        imagenes[5]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_0.png"));
        imagenes[6]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_0.png"));
        imagenes[7]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_0.png"));
        imagenes[8]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_0.png"));
        imagenes[9]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_0.png"));
        imagenes[10]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_0.png"));
        imagenes[11]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_0.png"));
        imagenes[12]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_0.png"));
        imagenes[13]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_1.png"));
        imagenes[14]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_1.png"));
        imagenes[15]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_1.png"));
        imagenes[16]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_1.png"));
        imagenes[17]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_1.png"));
        imagenes[18]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_1.png"));
        imagenes[19]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_1.png"));
        imagenes[20]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_1.png"));
        imagenes[21]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_1.png"));
        imagenes[22]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_1.png"));
        imagenes[23]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_1.png"));
        imagenes[24]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_1.png"));
        imagenes[25]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_1.png"));
        imagenes[26]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_2.png"));
        imagenes[27]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_2.png"));
        imagenes[28]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_2.png"));
        imagenes[29]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_2.png"));
        imagenes[30]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_2.png"));
        imagenes[31]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_2.png"));
        imagenes[32]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_2.png"));
        imagenes[33]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_2.png"));
        imagenes[34]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_2.png"));
        imagenes[35]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_2.png"));
        imagenes[36]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_2.png"));
        imagenes[37]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_2.png"));
        imagenes[38]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_2.png"));
        imagenes[39]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_3.png"));
        imagenes[40]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_3.png"));
        imagenes[41]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_3.png"));
        imagenes[42]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_3.png"));
        imagenes[43]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_3.png"));
        imagenes[44]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_3.png"));
        imagenes[45]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_3.png"));
        imagenes[46]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_3.png"));
        imagenes[47]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_3.png"));
        imagenes[48]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_3.png"));
        imagenes[49]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_3.png"));
        imagenes[50]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_3.png"));
        imagenes[51]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_3.png"));
        imagenes[52]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorsoOpt.png"));*/
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
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
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

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorso_opt.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(865, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4))
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(32, Short.MAX_VALUE))))
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

        jButton11.setText("Cambiar de juego");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

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
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jButton1))
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton11)))
                                .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto = jTextField1.getText();
        apuesta = Integer.parseInt(texto);
        
            if(botones==0)
            {
                /*imagenes[0]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/asOros_opt.png"));
                imagenes[1]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/dosoros_opt.png"));
                imagenes[2]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/tresoros_opt.png"));
                imagenes[3]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/cuatrooros_opt.png"));
                imagenes[4]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/cincooros_opt.png"));
                imagenes[5]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/seisoros_png.png"));
                imagenes[6]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/sieteoros_opt.png"));
                imagenes[7]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10oros_opt.png"));
                imagenes[8]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11oros_opt.png"));
                imagenes[9]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12oros_opt.png"));
                imagenes[10]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/asbastos_opt.png"));
                imagenes[11]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/dosbastos_opt.png"));
                imagenes[12]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/tresbastos_opt.png"));
                imagenes[13]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/cuatrobastos_opt.png"));
                imagenes[14]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/cincobastos_opt.png"));
                imagenes[15]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/seisbastos_opt.png"));
                imagenes[16]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/sietebastos_opt.png"));
                imagenes[17]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/sotabastos.png"));
                imagenes[18]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11bastos_opt.png"));
                imagenes[19]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/reybastos_opt.png"));
                imagenes[20]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/asespadas_opt.png"));
                imagenes[21]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/dosespadas_opt.png"));
                imagenes[22]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/tresespadas_opt.png"));
                imagenes[23]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4-de-espadas_opt.png"));
                imagenes[24]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/cinco-de-espadas_opt.png"));
                imagenes[25]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/seisespadas_opt.png"));
                imagenes[26]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7-de-espadas_opt.png"));
                imagenes[27]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10espadas.png"));
                imagenes[28]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/caballo de espadas_opt.png"));
                imagenes[29]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/reyespadas_opt.png"));
                imagenes[30]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/ascopas_opt.png"));
                imagenes[31]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/doscopas_opt.png"));
                imagenes[32]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3copas_opt.png"));
                imagenes[33]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/copas4_opt.png"));
                imagenes[34]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/cinco-de-copas_opt.png"));
                imagenes[35]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/copas_6_opt.png"));
                imagenes[36]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7decopas_opt.png"));
                imagenes[37]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10c_opt.png"));
                imagenes[38]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/caballocopas_opt.png"));
                imagenes[39]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/rey-de-copas_opt.png"));*/
                imagenes[52]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorsoOpt.png"));
                
                baraja = new BarajaEspanola();
                J = new Jugada7ymedia(baraja, Jug) {};
                    if(apuesta<25)
                    {
                        jLabel3.setText("Has apostado " + apuesta + " fichas. Al ser menor de 25 y ser esta la apuesta minima, tu apuesta ha sido modificada a 25 fichas");
                        apuesta=25;
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
                imagenes[0]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_0.png"));
                imagenes[1]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_0.png"));
                imagenes[2]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_0.png"));
                imagenes[3]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_0.png"));
                imagenes[4]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_0.png"));
                imagenes[5]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_0.png"));
                imagenes[6]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_0.png"));
                imagenes[7]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_0.png"));
                imagenes[8]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_0.png"));
                imagenes[9]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_0.png"));
                imagenes[10]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_0.png"));
                imagenes[11]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_0.png"));
                imagenes[12]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_0.png"));
                imagenes[13]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_1.png"));
                imagenes[14]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_1.png"));
                imagenes[15]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_1.png"));
                imagenes[16]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_1.png"));
                imagenes[17]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_1.png"));
                imagenes[18]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_1.png"));
                imagenes[19]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_1.png"));
                imagenes[20]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_1.png"));
                imagenes[21]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_1.png"));
                imagenes[22]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_1.png"));
                imagenes[23]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_1.png"));
                imagenes[24]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_1.png"));
                imagenes[25]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_1.png"));
                imagenes[26]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_2.png"));
                imagenes[27]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_2.png"));
                imagenes[28]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_2.png"));
                imagenes[29]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_2.png"));
                imagenes[30]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_2.png"));
                imagenes[31]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_2.png"));
                imagenes[32]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_2.png"));
                imagenes[33]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_2.png"));
                imagenes[34]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_2.png"));
                imagenes[35]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_2.png"));
                imagenes[36]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_2.png"));
                imagenes[37]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_2.png"));
                imagenes[38]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_2.png"));
                imagenes[39]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/1_3.png"));
                imagenes[40]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/2_3.png"));
                imagenes[41]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/3_3.png"));
                imagenes[42]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/4_3.png"));
                imagenes[43]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/5_3.png"));
                imagenes[44]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/6_3.png"));
                imagenes[45]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/7_3.png"));
                imagenes[46]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/8_3.png"));
                imagenes[47]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/9_3.png"));
                imagenes[48]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/10_3.png"));
                imagenes[49]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/11_3.png"));
                imagenes[50]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/12_3.png"));
                imagenes[51]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/13_3.png"));
                imagenes[52]=new javax.swing.ImageIcon(getClass().getResource("/Ludoteca/Imagenes/naipeDorsoOpt.png"));
                
                baraja = new BarajaFrancesa();
                J = new JugadaBJ(baraja, Jug){};
                    if(apuesta<10)
                    {
                        jLabel3.setText("Has apostado " + apuesta + " fichas. Al ser menor de 10 y ser esta la apuesta minima, tu apuesta ha sido modificada a 10 fichas");
                        apuesta=10;
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
        jButton11.setEnabled(false);
        jButton14.setIcon(imagenes[52]);
        jButton15.setIcon(imagenes[52]);
        jButton19.setIcon(imagenes[52]);
        jButton21.setIcon(imagenes[52]);
        jButton13.setIcon(imagenes[52]);
        jButton12.setIcon(imagenes[52]);
        
        jButton5.setIcon(imagenes[52]);
        jButton6.setIcon(imagenes[52]);
        jButton7.setIcon(imagenes[52]);
        jButton8.setIcon(imagenes[52]);
        jButton9.setIcon(imagenes[52]);
        jButton10.setIcon(imagenes[52]);
        iAux=0;

        
        //this.apuesta=apuesta; //??¿¿
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton3.setEnabled(true);
        jButton2.setEnabled(false);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int valJugar[] = new int[2];
        
        if(botones==0)
        {
            valJugar=J.jugarJugador(this);
            if(iAux==0)
            {
                jButton5.setIcon(imagenes[valJugar[0]]);
            }
            else if (iAux==1)
            {
                jButton6.setIcon(imagenes[valJugar[0]]);
            }
            else if (iAux==2)
            {
                jButton7.setIcon(imagenes[valJugar[0]]);
            }
            else if (iAux==3)
            {
                jButton8.setIcon(imagenes[valJugar[0]]);
            }
        }
        if(botones==1)
        {
            if(iAux==0)
            {
                valores=J.repartirJugador(this);
                jButton5.setIcon(imagenes[valores[0]]);
                jButton6.setIcon(imagenes[valores[1]]);
            }
            System.out.println("-------------------------------"); 
            if (iAux==0)
            {
                valores=J.repartirBanca();
                jButton14.setIcon(imagenes[valores[0]]);
            }
            System.out.println("-------------------------------");
            valJugar=J.jugarJugador(this);
            if (valJugar[1]==0)
            {
                if(iAux==0)
                {
                    jButton7.setIcon(imagenes[valJugar[0]]);
                }
                else if (iAux==1)
                {
                    jButton8.setIcon(imagenes[valJugar[0]]);
                }
                else if (iAux==2)
                {
                    jButton9.setIcon(imagenes[valJugar[0]]);
                }
                else if (iAux==3)
                {
                    jButton10.setIcon(imagenes[valJugar[0]]);
                }
                iAux++;
                System.out.println("-------------------------------");
            }
        }
        // J.jugarBanca(); CREO QUE ESTO MEJOR EN EL BOTON DE ABAJO UNA VEZ HAYA ACABADO EL JUGADOR
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Cuando se pulse el meno se hace esto.
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int[] valoresJugada = {-1, -1, -1, -1, -1, -1, -1};
        int aux=0;
        valoresJugada=J.jugarBanca();
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
            if((valorManoJ>valorManoB && valorManoJ<=21)|| (valorManoB>21 && valorManoJ<21))
            {
                JOptionPane.showMessageDialog(this, "Has ganado. Enhorabuena!\n Recibes " +2*apuesta +"fichas.");
                Jug.setFichasTotales(Jug.getFichasTotales()+apuesta);
            }
            else if (valorManoJ==valorManoB && valorManoJ<=21)
            {
                JOptionPane.showMessageDialog(this, "Ha sido un empate.\nLas " +apuesta + "fichas apostadas son devueltas a tu saldo.");
            }
            else 
            {
               JOptionPane.showMessageDialog(this, "Ha ganado la banca. Buena suerte la proxima vez"); 
               Jug.setFichasTotales(Jug.getFichasTotales()-apuesta);            
            }
        }
        jButton12.setIcon(imagenes[valores[1]]);
        

        if(valoresJugada[aux]!=-1)
        {
            jButton13.setIcon(imagenes[valoresJugada[aux]]);
        }
        aux++;
        if(valoresJugada[aux]!=-1)
        {
            jButton15.setIcon(imagenes[valoresJugada[aux]]);
        }
        aux++;
        if(valoresJugada[aux]!=-1)
        {
            jButton19.setIcon(imagenes[valoresJugada[aux]]);
        }
        aux++;
        if(valoresJugada[aux]!=-1)
        {
            jButton21.setIcon(imagenes[valoresJugada[aux]]);
        }
        
        jButton1.setEnabled(true);
        jTextField1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton11.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(botones==0)
        {
            botones=1;
        } else if(botones==1)
        {
            botones=0;
        }
        
        jButton11.setEnabled(false);
        jButton14.setIcon(imagenes[52]);
        jButton15.setIcon(imagenes[52]);
        jButton19.setIcon(imagenes[52]);
        jButton21.setIcon(imagenes[52]);
        jButton13.setIcon(imagenes[52]);
        jButton12.setIcon(imagenes[52]);
        
        jButton5.setIcon(imagenes[52]);
        jButton6.setIcon(imagenes[52]);
        jButton7.setIcon(imagenes[52]);
        jButton8.setIcon(imagenes[52]);
        jButton9.setIcon(imagenes[52]);
        jButton10.setIcon(imagenes[52]);
        iAux=0;
    }//GEN-LAST:event_jButton11ActionPerformed

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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
