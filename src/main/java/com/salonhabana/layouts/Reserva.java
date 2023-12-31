/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.salonhabana.layouts;

import javax.swing.SpinnerNumberModel;

/**
 *
 * @author sersu
 */
public class Reserva extends javax.swing.JDialog {

    private  String TIPO_COCINA[] = new String[] {"Bufé","Bufé vegetariano","Carta","Pedir cita con chef","No precisa"};
    private static final String TIPO_HABITACION[] = new String[] {"Individual", "Doble dos camas", "Doble cama matrimonio"};
    private int frameWidth = 455; //421
    private int frameHeigh = 355; //455
    //private static final String 
    
    /**
     * Creates new form Reserva
     */
    public Reserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.TIPO_COCINA.clone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton14 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        btgTipoEvento = new javax.swing.ButtonGroup();
        lblNombre = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txfDireccion = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        spiFechaEvento = new javax.swing.JSpinner();
        spiNumPerso = new javax.swing.JSpinner();
        cmbTipCocina = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txfTelefono = new javax.swing.JTextField();
        lblNumPerso = new javax.swing.JLabel();
        lblTipCocina = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtCongreso = new javax.swing.JRadioButton();
        rbtBanquete = new javax.swing.JRadioButton();
        lblTipEvento = new javax.swing.JLabel();
        rbtJornada = new javax.swing.JRadioButton();
        panOpEvento = new javax.swing.JPanel();
        lblNumJorn = new javax.swing.JLabel();
        spiNumJorn = new javax.swing.JSpinner();
        chbReqHabitacio = new javax.swing.JCheckBox();
        lblTipHabitacion = new javax.swing.JLabel();
        cmbTipHabitacion = new javax.swing.JComboBox<>();

        jButton14.setText("jButton14");

        jButton38.setText("jButton38");

        jButton54.setText("jButton54");

        btgTipoEvento.add(this.rbtBanquete);
        btgTipoEvento.add(this.rbtJornada);
        btgTipoEvento.add(this.rbtCongreso);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva");

        lblNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        txfNombre.setToolTipText("Escriba su nombre");

        lblTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTelefono.setText("Teléfono:");

        lblDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDireccion.setText("Dirección:");

        txfDireccion.setToolTipText("Indique su calle con número, puerta, pis, etc");

        lblFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblFecha.setText("Fecha Evento:");

        spiFechaEvento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spiFechaEvento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_YEAR));
        spiFechaEvento.setToolTipText("Establezca cuándo se realizará el evento");

        spiNumPerso.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spiNumPerso.setModel(new javax.swing.SpinnerNumberModel(Short.valueOf((short)1), Short.valueOf((short)1), Short.valueOf((short)50), Short.valueOf((short)1)));
        spiNumPerso.setToolTipText("Escriba cuántas personas assistirán al evento");

        cmbTipCocina.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbTipCocina.setModel(new javax.swing.DefaultComboBoxModel<>(this.TIPO_COCINA.clone()));
        cmbTipCocina.setToolTipText("Indique qué tipo de cocina se empleará");

        btnAceptar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halrOnClickAceptar(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halrOnClickCancelar(evt);
            }
        });

        txfTelefono.setToolTipText("Escriba su teléfono");

        lblNumPerso.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNumPerso.setText("NºPersonas:");

        lblTipCocina.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTipCocina.setText("Tipo de Cocina:");

        rbtCongreso.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rbtCongreso.setText("Congreso");
        rbtCongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlrRbtCongreso(evt);
            }
        });

        rbtBanquete.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rbtBanquete.setText("Banquete");
        rbtBanquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlrRbtBanquete(evt);
            }
        });

        lblTipEvento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTipEvento.setText("Tipo evento:");

        rbtJornada.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rbtJornada.setText("Jornada");
        rbtJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlrRbtJornada(evt);
            }
        });

        panOpEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panOpEvento.setVisible(false);

        lblNumJorn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNumJorn.setText("NºJornadas:");
        panOpEvento.add(lblNumJorn);

        spiNumJorn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spiNumJorn.setToolTipText("La duración del evento en jornadas");
        spiNumJorn.setPreferredSize(new java.awt.Dimension(64, 29));
        panOpEvento.add(spiNumJorn);

        chbReqHabitacio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chbReqHabitacio.setText("¿Requiere de habitación?");
        chbReqHabitacio.setToolTipText("Deséa incluir habitaciones");
        chbReqHabitacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlrChbReqHabitacio(evt);
            }
        });
        panOpEvento.add(chbReqHabitacio);

        lblTipHabitacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTipHabitacion.setText("Tipo Habitación:");
        panOpEvento.add(lblTipHabitacion);

        cmbTipHabitacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbTipHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(Reserva.TIPO_HABITACION));
        cmbTipHabitacion.setToolTipText("Escoja cómo será la habitación");
        cmbTipHabitacion.setEnabled(false);
        panOpEvento.add(cmbTipHabitacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lblTipEvento)
                .addGap(18, 18, 18)
                .addComponent(rbtBanquete)
                .addGap(18, 18, 18)
                .addComponent(rbtJornada)
                .addGap(18, 18, 18)
                .addComponent(rbtCongreso)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(panOpEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipEvento)
                    .addComponent(rbtBanquete)
                    .addComponent(rbtJornada)
                    .addComponent(rbtCongreso))
                .addGap(18, 18, 18)
                .addComponent(panOpEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblDireccion)
                                        .addComponent(lblNombre))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblTelefono)
                                            .addGap(18, 18, 18)
                                            .addComponent(txfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                        .addComponent(txfDireccion)))
                                .addComponent(spiFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumPerso)
                                .addGap(18, 18, 18)
                                .addComponent(spiNumPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lblTipCocina)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono)
                    .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumPerso)
                        .addComponent(spiNumPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipCocina)
                        .addComponent(cmbTipCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(spiFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void customInitComponents() {
        
    }
    
    private void halrOnClickAceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halrOnClickAceptar
        // TODO: Go to main title
    }//GEN-LAST:event_halrOnClickAceptar

    private void halrOnClickCancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halrOnClickCancelar
        this.dispose();
    }//GEN-LAST:event_halrOnClickCancelar

    private void hlrChbReqHabitacio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlrChbReqHabitacio
        this.cmbTipHabitacion.setEnabled(this.chbReqHabitacio.isSelected());
    }//GEN-LAST:event_hlrChbReqHabitacio

    private void hlrRbtCongreso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlrRbtCongreso
        this.setSize(this.getSize().width + 20, this.getSize().height + 110);
        this.panOpEvento.setVisible(true);
        this.spiNumPerso.setModel(new SpinnerNumberModel(Short.valueOf((short)1), Short.valueOf((short)1), Short.valueOf((short)50), Short.valueOf((short)1)));
    }//GEN-LAST:event_hlrRbtCongreso

    private void hlrRbtJornada(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlrRbtJornada
        this.panOpEvento.setVisible(false);
        //this.setSize(465, 370);
        this.setSize(this.frameWidth, this.frameHeigh);
        this.spiNumPerso.setModel(new SpinnerNumberModel(Short.valueOf((short)1), Short.valueOf((short)1), Short.valueOf((short)50), Short.valueOf((short)1)));
    }//GEN-LAST:event_hlrRbtJornada

    private void hlrRbtBanquete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlrRbtBanquete
        this.panOpEvento.setVisible(false);
        //this.setSize(465, 370);
        this.setSize(this.frameWidth, this.frameHeigh);
        this.spiNumPerso.setModel(new SpinnerNumberModel(Short.valueOf((short)1), Short.valueOf((short)1), Short.valueOf((short)100), Short.valueOf((short)1)));
    }//GEN-LAST:event_hlrRbtBanquete

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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reserva dialog = new Reserva(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTipoEvento;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chbReqHabitacio;
    private javax.swing.JComboBox<String> cmbTipCocina;
    private javax.swing.JComboBox<String> cmbTipHabitacion;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton54;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumJorn;
    private javax.swing.JLabel lblNumPerso;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipCocina;
    private javax.swing.JLabel lblTipEvento;
    private javax.swing.JLabel lblTipHabitacion;
    private javax.swing.JPanel panOpEvento;
    private javax.swing.JRadioButton rbtBanquete;
    private javax.swing.JRadioButton rbtCongreso;
    private javax.swing.JRadioButton rbtJornada;
    private javax.swing.JSpinner spiFechaEvento;
    private javax.swing.JSpinner spiNumJorn;
    private javax.swing.JSpinner spiNumPerso;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
