/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.desktop;

import inventarios.service.ProductService;
import inventarios.to.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author david
 */
@Component
public class ListaProductos extends javax.swing.JFrame {

    ProductService productService;

    Menu menu;
    
    InventoryManagement inventoryManagement;

    @Autowired
    public ListaProductos(ProductService productService, @Lazy Menu menu, @Lazy InventoryManagement inventoryManagement) {
        this.productService = productService;
        this.menu = menu;
        this.inventoryManagement = inventoryManagement;
         initComponents();

        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.GRAY);   
    }

    private DefaultTableModel model;
    /**
     * metodo para mostrar la interfaz vacia de la tabla
     */
    private void mostrarInterfaz() {
        //para agregar los datos en un arreglo vacio//
        String data[][] = {};

        String col[] = {"Producto", "Cantidad", "Características", "Serial", "Fecha de ingreso", "Fecha Egreso"};
        model = new DefaultTableModel(data, col);
        productsTable.setModel(model);

    }

    public void mostrarLosDatos() {
        mostrarInterfaz();
        List<Product> products = productService.findAll();
        Product p;
        for (int i = 0; i < products.size(); i++) {
            p = products.get(i);
            model.insertRow(i, new Object[]{});
            model.setValueAt(p.getName(), i, 0);
            model.setValueAt(p.getQuantity(), i, 1);
            model.setValueAt(p.getCharacteristics(), i, 2);
            model.setValueAt(p.getSerial(), i, 3);
            model.setValueAt(p.getDateIn(), i, 4);
            model.setValueAt(p.getDateOut(), i, 5);
        }
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(ListaProductos.DO_NOTHING_ON_CLOSE);
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

        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblBackgroundTitle = new javax.swing.JLabel();
        pnlTable = new javax.swing.JPanel();
        tableScroll = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        optionsMenu = new javax.swing.JPanel();
        tableOptionsPanel = new javax.swing.JPanel();
        btneliminar = new javax.swing.JButton();
        btneliminartodo = new javax.swing.JButton();
        navigationPanel = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("ListaProductos.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource
            ("/ImgFondos/Icono.png")).getImage());
    setResizable(false);

    pnlTitle.setOpaque(false);
    pnlTitle.setLayout(new javax.swing.OverlayLayout(pnlTitle));

    lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/productos agregados.png"))); // NOI18N
    pnlTitle.add(lblTitle);

    lblBackgroundTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgFondos/fondo 1.png"))); // NOI18N
    lblBackgroundTitle.setOpaque(true);
    lblBackgroundTitle.setPreferredSize(lblTitle.size());
    pnlTitle.add(lblBackgroundTitle);

    getContentPane().add(pnlTitle, java.awt.BorderLayout.PAGE_START);

    pnlTable.setOpaque(false);
    pnlTable.setLayout(new java.awt.BorderLayout());

    tableScroll.setOpaque(false);

    productsTable.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
    productsTable.setForeground(new java.awt.Color(153, 0, 0));
    productsTable.setModel(new javax.swing.table.DefaultTableModel(
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
    productsTable.setOpaque(false);
    tableScroll.setViewportView(productsTable);

    pnlTable.add(tableScroll, java.awt.BorderLayout.CENTER);

    getContentPane().add(pnlTable, java.awt.BorderLayout.CENTER);

    optionsMenu.setOpaque(false);
    optionsMenu.setLayout(new java.awt.GridLayout(1, 3));

    tableOptionsPanel.setOpaque(false);
    tableOptionsPanel.setLayout(new java.awt.GridLayout(1, 0));

    btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar fila.png"))); // NOI18N
    btneliminar.setBorder(null);
    btneliminar.setContentAreaFilled(false);
    btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btneliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btneliminarActionPerformed(evt);
        }
    });
    tableOptionsPanel.add(btneliminar);

    btneliminartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar todo.png"))); // NOI18N
    btneliminartodo.setBorder(null);
    btneliminartodo.setContentAreaFilled(false);
    btneliminartodo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btneliminartodo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btneliminartodoActionPerformed(evt);
        }
    });
    tableOptionsPanel.add(btneliminartodo);

    optionsMenu.add(tableOptionsPanel);

    navigationPanel.setOpaque(false);

    btnMenu.setBackground(new java.awt.Color(255, 0, 51));
    btnMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnMenu.setText(bundle.getString("ListaProductos.btnMenu.text")); // NOI18N
    btnMenu.setOpaque(false);
    btnMenu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnMenuActionPerformed(evt);
        }
    });
    navigationPanel.add(btnMenu);

    btnGoBack.setText(bundle.getString("ListaProductos.btnGoBack.text")); // NOI18N
    btnGoBack.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGoBackActionPerformed(evt);
        }
    });
    navigationPanel.add(btnGoBack);

    btnClose.setText(bundle.getString("ListaProductos.btnClose.text")); // NOI18N
    btnClose.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCloseActionPerformed(evt);
        }
    });
    navigationPanel.add(btnClose);

    optionsMenu.add(navigationPanel);

    getContentPane().add(optionsMenu, java.awt.BorderLayout.SOUTH);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            model = (DefaultTableModel) productsTable.getModel();
            final int selectedRow = productsTable.getSelectedRow();
            Product toBeDeleted = new Product();

            toBeDeleted.setName((String) model.getValueAt(selectedRow, 0));
            toBeDeleted.setQuantity((Integer) model.getValueAt(selectedRow, 1));
//            toBeDeleted.setCharacteristics((ProductCharacteristic) model.getValueAt(selectedRow, 2));
            toBeDeleted.setSerial((String) model.getValueAt(selectedRow, 3));
            toBeDeleted.setDateIn((Date) model.getValueAt(selectedRow, 4));
            toBeDeleted.setDateOut((Date) model.getValueAt(selectedRow, 5));

            productsTable.addRowSelectionInterval(0, 0);
            productService
                    .findOne(toBeDeleted)
                    .ifPresent(productService::delete);
            mostrarLosDatos(); // reload            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneliminartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminartodoActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
            int filas = productsTable.getRowCount();
            for (int i = 0; filas > i; i++) {
                model.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }

    }//GEN-LAST:event_btneliminartodoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        inventoryManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private javax.swing.JTable datos;
    private javax.swing.JScrollPane jScrollPane1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminartodo;
    private javax.swing.JLabel lblBackgroundTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JPanel optionsMenu;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable productsTable;
    private javax.swing.JPanel tableOptionsPanel;
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration//GEN-END:variables
}
