/* 
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package inventarios.desktop;

import inventarios.desktop.navigation.NavigationHandler;
import inventarios.service.ProductService;
import inventarios.to.Product;
import inventarios.util.ShutdownManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author david
 */
@Component
public class ListaProductos extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTable productsTable;
    // End of variables declaration//GEN-END:variables

    private ProductService productService;

    private NavigationHandler navigationHandler;

    private ShutdownManager shutdownManager;

    private DefaultTableModel model;

    @Autowired
    public ListaProductos(ProductService productService,
            @Qualifier("listaProductosNavigationHandler") NavigationHandler navigationHandler,
            ShutdownManager shutdownManager) {
        this.productService = productService;
        this.navigationHandler = navigationHandler;
        this.shutdownManager = shutdownManager;
        initComponents();

        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.GRAY);
    }

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
                    shutdownManager.confirmExit();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel pnlTitle = new JPanel();
        JLabel lblTitle = new JLabel();
        JLabel lblBackgroundTitle = new JLabel();
        JPanel pnlTable = new JPanel();
        JScrollPane tableScroll = new JScrollPane();
        productsTable = new JTable();
        JPanel optionsMenu = new JPanel();
        JPanel tableOptionsPanel = new JPanel();
        JButton btneliminar = new JButton();
        JButton btneliminartodo = new JButton();
        JPanel navigationPanel = new JPanel();
        JButton btnMenu = new JButton();
        JButton btnGoBack = new JButton();
        JButton btnClose = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("ListaProductos.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource
            ("/ImgFondos/Icono.png")).getImage());
    setResizable(false);

    pnlTitle.setOpaque(false);
    pnlTitle.setLayout(new OverlayLayout(pnlTitle));

    lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    lblTitle.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/productos agregados.png"))); // NOI18N
    pnlTitle.add(lblTitle);

    lblBackgroundTitle.setIcon(new ImageIcon(getClass().getResource("/ImgFondos/fondo 1.png"))); // NOI18N
    lblBackgroundTitle.setOpaque(true);
    lblBackgroundTitle.setPreferredSize(lblTitle.size());
    pnlTitle.add(lblBackgroundTitle);

    getContentPane().add(pnlTitle, BorderLayout.PAGE_START);

    pnlTable.setOpaque(false);
    pnlTable.setLayout(new BorderLayout());

    tableScroll.setOpaque(false);

    productsTable.setFont(new Font("Monospaced", 1, 18)); // NOI18N
    productsTable.setForeground(new Color(153, 0, 0));
    productsTable.setOpaque(false);
    tableScroll.setViewportView(productsTable);

    pnlTable.add(tableScroll, BorderLayout.CENTER);

    getContentPane().add(pnlTable, BorderLayout.CENTER);

    optionsMenu.setOpaque(false);
    optionsMenu.setLayout(new GridLayout(1, 3));

    tableOptionsPanel.setOpaque(false);
    tableOptionsPanel.setLayout(new GridLayout(1, 0));

    btneliminar.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/eliminar fila.png"))); // NOI18N
    btneliminar.setBorder(null);
    btneliminar.setContentAreaFilled(false);
    btneliminar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    btneliminar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            btneliminarActionPerformed(evt);
        }
    });
    tableOptionsPanel.add(btneliminar);

    btneliminartodo.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/eliminar todo.png"))); // NOI18N
    btneliminartodo.setBorder(null);
    btneliminartodo.setContentAreaFilled(false);
    btneliminartodo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    btneliminartodo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            btneliminartodoActionPerformed(evt);
        }
    });
    tableOptionsPanel.add(btneliminartodo);

    optionsMenu.add(tableOptionsPanel);

    navigationPanel.setOpaque(false);

    btnMenu.setBackground(new Color(255, 0, 51));
    btnMenu.setFont(new Font("Tahoma", 1, 18)); // NOI18N
    btnMenu.setText(bundle.getString("ListaProductos.btnMenu.text")); // NOI18N
    btnMenu.setOpaque(false);
    btnMenu.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            btnMenuActionPerformed(evt);
        }
    });
    navigationPanel.add(btnMenu);

    btnGoBack.setText(bundle.getString("ListaProductos.btnGoBack.text")); // NOI18N
    btnGoBack.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            btnGoBackActionPerformed(evt);
        }
    });
    navigationPanel.add(btnGoBack);

    btnClose.setText(bundle.getString("ListaProductos.btnClose.text")); // NOI18N
    btnClose.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            btnCloseActionPerformed(evt);
        }
    });
    navigationPanel.add(btnClose);

    optionsMenu.add(navigationPanel);

    getContentPane().add(optionsMenu, BorderLayout.SOUTH);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
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

    private void btneliminartodoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btneliminartodoActionPerformed
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

    private void btnMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnGoBackActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        navigationHandler.goToInventoryManagement(this);
    }//GEN-LAST:event_btnGoBackActionPerformed
}
