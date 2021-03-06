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
import inventarios.service.restclient.PurchaseService;
import inventarios.to.OrderDetail;
import inventarios.to.Product;
import inventarios.to.Provider;
import inventarios.to.Purchase;
import inventarios.util.ShutdownManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author Oscar Marroquin
 */
@Component
public class ListaCompras extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(ListaCompras.class.getName());

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTable shoppingTable;
    // End of variables declaration//GEN-END:variables

    private NavigationHandler navigationHandler;

    private PurchaseService purchaseService;

    private ShutdownManager shutdownManager;

    private DefaultTableModel modelo;
    private int con = 0;

    /**
     * Creates new form ListaCompras
     */
    @Autowired
    public ListaCompras(
            @Qualifier("listaComprasVisitor") NavigationHandler navigationHandler,
            PurchaseService purchaseService, ShutdownManager shutdownManager
    ) {
        this.navigationHandler = navigationHandler;
        this.purchaseService = purchaseService;
        this.shutdownManager = shutdownManager;
        initComponents();
        mostrarInterfaz();
        cerrar();
    }

    public void mostrarInterfaz() {
        //para agregar los datos en un arreglo vacio//
        String data[][] = {};

        String col[] = {"Fecha", "Proveedor", "Productos", "Detalles de la Orden"};
        modelo = new DefaultTableModel(data, col);
        shoppingTable.setModel(modelo);

    }

    public void mostrarLosDatos() {
        List<Purchase> purchases = purchaseService.findAll();

        LOG.log(Level.INFO, "retrieved purchases:{0}", purchases);

        Purchase c;
        for (int i = 0; i < purchases.size(); i++) {
            c = purchases.get(i);
            modelo.insertRow(con, new Object[]{});
            modelo.setValueAt(c.getDate(), con, 0);
            Optional<Provider> provider = Optional.ofNullable(c.getProvider());
            modelo.setValueAt(
                    provider
                            .map(Provider::getName)
                            .orElse("no provider set"),
                    con, 1);
            final Optional<List<Product>> producto = Optional.ofNullable(c.getProducto());
            modelo.setValueAt(producto
                    .map(List::stream)
                    .flatMap(Stream::findFirst)
                    .map(Product::getName)
                    .orElse("no product set"),
                    con, 2);
            final Optional<OrderDetail> requestingOrder = Optional.ofNullable(c.getRequestingOrder());
            modelo.setValueAt(requestingOrder.map(OrderDetail::getId).orElse(-1L), con, 3);
        }
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(ListaCompras.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    shutdownManager.confirmExit();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
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

        JScrollPane shoppingScroll = new JScrollPane();
        shoppingTable = new JTable();
        JButton btnDeleteRow = new JButton();
        JButton btnDeleteAll = new JButton();
        JLabel lblTitle = new JLabel();
        JButton btnMenu = new JButton();
        JButton btnGetBack = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("ListaCompras.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        setResizable(false);

        shoppingScroll.setViewportView(shoppingTable);

        btnDeleteRow.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/eliminar fila.png"))); // NOI18N
        btnDeleteRow.setBorder(null);
        btnDeleteRow.setContentAreaFilled(false);
        btnDeleteRow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });

        btnDeleteAll.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/eliminar todo.png"))); // NOI18N
        btnDeleteAll.setBorder(null);
        btnDeleteAll.setContentAreaFilled(false);
        btnDeleteAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        lblTitle.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText(bundle.getString("ListaCompras.lblTitle.text")); // NOI18N

        btnMenu.setBackground(new Color(255, 0, 51));
        btnMenu.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        btnMenu.setText(bundle.getString("ListaCompras.btnMenu.text")); // NOI18N
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnGetBack.setText(bundle.getString("ListaCompras.btnGetBack.text")); // NOI18N
        btnGetBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGetBackActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(shoppingScroll, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnDeleteRow, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteAll)
                                .addGap(31, 31, 31)
                                .addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGetBack))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(lblTitle)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(22, 22, 22)
                .addComponent(shoppingScroll, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteAll, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteRow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetBack)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteRowActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        try {
            modelo = (DefaultTableModel) shoppingTable.getModel();
            modelo.removeRow(shoppingTable.getSelectedRow());
            shoppingTable.addRowSelectionInterval(0, 0);
            modelo = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private void btnDeleteAllActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) shoppingTable.getModel();
            int rows = shoppingTable.getRowCount();
            for (int i = 0; rows > i; i++) {
                model.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnGetBackActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnGetBackActionPerformed
        navigationHandler.goToShopping(this);
    }//GEN-LAST:event_btnGetBackActionPerformed

}
