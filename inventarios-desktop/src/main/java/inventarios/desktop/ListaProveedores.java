/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.desktop;

import inventarios.service.ProviderService;
import inventarios.to.Provider;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author heberdavid
 */
@Component
public class ListaProveedores extends javax.swing.JFrame {

    ProviderManagement providerManagement;

    ProviderService providerService;

    /**
     * Creates new form ListaProveedores
     */
    @Autowired
    public ListaProveedores(@Lazy ProviderManagement providerManagement, ProviderService providerService) {
        this.providerManagement = providerManagement;
        this.providerService = providerService;
        initComponents();
        mostrarInterfaz();
        this.setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        cerrar();
    }

    private DefaultTableModel modelo;
    int con = 0;

    public void mostrarInterfaz() {
        //para agregar los datos en un arreglo vacio//
        String data[][] = {};

        String col[] = {"No. de Proveedor", "Nombre", "Apellidos", "Dirección", "Teléfono", "E-Mail", "Código Postal"};
        modelo = new DefaultTableModel(data, col);
        providersTable.setModel(modelo);

    }

    public void mostrarLosDatos() {
        List<Provider> providers = providerService.findAll();
        Provider P;
        for (int i = 0; i < providers.size(); i++) {
            P = (Provider) providers.get(i);
            modelo.insertRow(con, new Object[]{});
            modelo.setValueAt(P.getName(), con, 0);
            modelo.setValueAt(P.getLastName(), con, 1);
            modelo.setValueAt(P.getAddress(), con, 2);
            modelo.setValueAt(P.getTelephoneNumber(), con, 3);
            modelo.setValueAt(P.getEmail(), con, 4);
            modelo.setValueAt(P.getPoBox(), con, 5);
            modelo.setValueAt(P.getNumber(), con, 6);

        }
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(ListaProveedores.DO_NOTHING_ON_CLOSE);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeleteRow = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        providersScroll = new javax.swing.JScrollPane();
        providersTable = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnGetBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("ListaProveedores.title")); // NOI18N
        setResizable(false);

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

        providersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        providersScroll.setViewportView(providersTable);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText(bundle.getString("ListaProveedores.lblTitle.text")); // NOI18N

        btnMenu.setBackground(new java.awt.Color(255, 0, 51));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMenu.setText(bundle.getString("ListaProveedores.btnMenu.text")); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnGetBack.setText(bundle.getString("ListaProveedores.btnGetBack.text")); // NOI18N
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
                .addComponent(btnDeleteRow)
                .addGap(34, 34, 34)
                .addComponent(btnDeleteAll)
                .addGap(52, 52, 52)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnGetBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(providersScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(providersScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteRow)
                    .addComponent(btnDeleteAll)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetBack)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        try {
            modelo = (DefaultTableModel) providersTable.getModel();
            modelo.removeRow(providersTable.getSelectedRow());
            providersTable.addRowSelectionInterval(0, 0);
            modelo = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) providersTable.getModel();
            int filas = providersTable.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        } // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnGetBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBackActionPerformed
        providerManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGetBackActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnGetBack;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane providersScroll;
    private javax.swing.JTable providersTable;
    // End of variables declaration//GEN-END:variables
}
