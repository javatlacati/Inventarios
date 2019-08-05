/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class BillingManagement extends javax.swing.JFrame {

    public static LinkedList contenedor = new LinkedList();

    /**
     * Creates new form FacturaciónVentana
     */
    public BillingManagement() {
        initComponents();
        cerrar();
        this.getContentPane().setBackground(Color.cyan);
        this.setIconImage(new ImageIcon(getClass().getResource("/src/main/resources/ImgFondos/Icono.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRfc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblPOBox = new javax.swing.JLabel();
        lblEMail = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtPOBox = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("BillingManagement.title")); // NOI18N
        setResizable(false);

        lblRfc.setText(bundle.getString("BillingManagement.lblRfc.text")); // NOI18N

        jLabel2.setText(bundle.getString("BillingManagement.jLabel2.text")); // NOI18N

        lblStreet.setText(bundle.getString("BillingManagement.lblStreet.text")); // NOI18N

        jLabel4.setText(bundle.getString("BillingManagement.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("BillingManagement.jLabel5.text")); // NOI18N

        jLabel6.setText(bundle.getString("BillingManagement.jLabel6.text")); // NOI18N

        jLabel7.setText(bundle.getString("BillingManagement.jLabel7.text")); // NOI18N

        jLabel8.setText(bundle.getString("BillingManagement.jLabel8.text")); // NOI18N

        lblState.setText(bundle.getString("BillingManagement.lblState.text")); // NOI18N

        lblCountry.setText(bundle.getString("BillingManagement.lblCountry.text")); // NOI18N

        lblPOBox.setText(bundle.getString("BillingManagement.lblPOBox.text")); // NOI18N

        lblEMail.setText(bundle.getString("BillingManagement.lblEMail.text")); // NOI18N

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/main/resources/ImgLetras/Limpiar_1.png"))); // NOI18N
        btnClean.setBorder(null);
        btnClean.setContentAreaFilled(false);
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/main/resources/ImgLetras/consulta.png"))); // NOI18N
        btnView.setBorder(null);
        btnView.setContentAreaFilled(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/main/resources/ImgLetras/cerrar.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 0, 255));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenu.setText(bundle.getString("BillingManagement.btnMenu.text")); // NOI18N
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRfc)
                    .addComponent(jLabel2)
                    .addComponent(lblStreet)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(lblState)
                    .addComponent(lblCountry)
                    .addComponent(lblPOBox)
                    .addComponent(lblEMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRfc, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(txtStreet)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8)
                    .addComponent(txtState)
                    .addComponent(txtCountry)
                    .addComponent(txtPOBox)
                    .addComponent(txtEmail))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRfc)
                            .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStreet)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnClean)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblState)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCountry)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPOBox)
                    .addComponent(txtPOBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEMail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
//Código para limpiar el contenido de todos los TextField//      
        txtRfc.setText("");
        jTextField2.setText("");
        txtStreet.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        txtState.setText("");
        txtCountry.setText("");
        txtPOBox.setText("");
        txtEmail.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        BillingList Lf = new BillingList();
        Lf.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        //Código para cerrar la vetana//
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Menu M = new Menu();
        M.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(BillingManagement.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }

            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea cerrar todas las ventanas abiertas?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEMail;
    private javax.swing.JLabel lblPOBox;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPOBox;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
