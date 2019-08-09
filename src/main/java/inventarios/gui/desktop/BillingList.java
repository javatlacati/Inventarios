/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop;

import inventarios.to.BillingDetails;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Personal
 */
@Component
public class BillingList extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    int con = 0;

    @Autowired
    Menu menu;

    @Autowired
    BillingManagement billingManagement;

    /**
     * Creates new form ListaFacturación
     */
    public BillingList() {
        initComponents();
        MostrarInterfaz();
        MostrarLosDatos();
        this.setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        cerrar();
        this.getContentPane().setBackground(Color.GRAY);

    }

    public void MostrarInterfaz() {
        //para agregar los datos en un arreglo vacio//
        String data[][] = {};

        String col[] = {"RFC", "Razón Social", "Calle", "No. Ext.", "No. Int.", "Colonia", "Localidad", "Delegación/Municipio", "Estado", "País", "Código Postal", "E-Mail"};
        modelo = new DefaultTableModel(data, col);
        jTable1.setModel(modelo);

    }

    public void MostrarLosDatos() {
        BillingDetails f;
        for (int i = 0; i < BillingManagement.contenedor.size(); i++) {
            f = (BillingDetails) BillingManagement.contenedor.get(i);
            modelo.insertRow(con, new Object[]{});
            modelo.setValueAt(f.getRFC(), con, 0);
            modelo.setValueAt(f.getRS(), con, 1);
            modelo.setValueAt(f.getStreetName(), con, 2);
            modelo.setValueAt(f.getNE(), con, 3);
            modelo.setValueAt(f.getNI(), con, 4);
            modelo.setValueAt(f.getColonia(), con, 5);
            modelo.setValueAt(f.getLocalidad(), con, 6);
            modelo.setValueAt(f.getDM(), con, 7);
            modelo.setValueAt(f.getState(), con, 8);
            modelo.setValueAt(f.getCountry(), con, 9);
            modelo.setValueAt(f.getCP(), con, 10);
            modelo.setValueAt(f.getEM(), con, 11);

        }
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(BillingList.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Confirmar salida//
    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea cerrar todas las ventanas abiertas?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDeleteRow = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnGetBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Facturas Agregadas");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnDeleteRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar fila.png"))); // NOI18N
        btnDeleteRow.setBorder(null);
        btnDeleteRow.setContentAreaFilled(false);
        btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });

        btnDeleteAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar todo.png"))); // NOI18N
        btnDeleteAll.setBorder(null);
        btnDeleteAll.setContentAreaFilled(false);
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 0, 51));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnGetBack.setText("REGRESAR");
        btnGetBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnDeleteRow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnDeleteAll)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGetBack))
                        .addComponent(btnDeleteRow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDeleteAll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        try {
            modelo = (DefaultTableModel) jTable1.getModel();
            modelo.removeRow(jTable1.getSelectedRow());
            jTable1.addRowSelectionInterval(0, 0);
            modelo = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            int filas = jTable1.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnGetBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBackActionPerformed
        billingManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGetBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnGetBack;
    private javax.swing.JButton btnMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
