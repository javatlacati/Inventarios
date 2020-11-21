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
import inventarios.service.restclient.ProviderService;
import inventarios.to.Provider;
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
import java.util.ResourceBundle;

/**
 *
 * @author heberdavid
 */
@Component
public class ListaProveedores extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTable providersTable;
    // End of variables declaration//GEN-END:variables

    private NavigationHandler navigationHandler;

    private ProviderService providerService;

    private ShutdownManager shutdownManager;

    private DefaultTableModel modelo;

    /**
     * Creates new form ListaProveedores
     */
    @Autowired
    public ListaProveedores(
            @Qualifier("listaProvedoresVisitor") NavigationHandler navigationHandler,
            ProviderService providerService, ShutdownManager shutdownManager) {
        this.navigationHandler = navigationHandler;
        this.providerService = providerService;
        this.shutdownManager = shutdownManager;
        initComponents();
        mostrarInterfaz();
        this.setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        cerrar();
    }

    public void mostrarInterfaz() {
        //para agregar los datos en un arreglo vacio//
        String data[][] = {};

        String col[] = {"No. de Proveedor", "Nombre", "Apellidos", "Dirección", "Teléfono", "E-Mail", "Código Postal"};
        modelo = new DefaultTableModel(data, col);
        providersTable.setModel(modelo);

    }

    public void mostrarLosDatos() {
        List<Provider> providers = providerService.findAll();
        mostrarInterfaz();
        Provider P;
        for (int i = 0; i < providers.size(); i++) {
            P = providers.get(i);
            modelo.insertRow(i, new Object[]{});
            modelo.setValueAt(P.getNumber(), i, 0);
            modelo.setValueAt(P.getName(), i, 1);
            modelo.setValueAt(P.getLastName(), i, 2);
            modelo.setValueAt(P.getAddress(), i, 3);
            modelo.setValueAt(P.getTelephoneNumber(), i, 4);
            modelo.setValueAt(P.getEmail(), i, 5);
            modelo.setValueAt(P.getPoBox(), i, 6);

        }
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(ListaProveedores.DO_NOTHING_ON_CLOSE);
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

        JButton btnDeleteRow = new JButton();
        JButton btnDeleteAll = new JButton();
        JScrollPane providersScroll = new JScrollPane();
        providersTable = new JTable();
        JLabel lblTitle = new JLabel();
        JButton btnMenu = new JButton();
        JButton btnGetBack = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("ListaProveedores.title")); // NOI18N
        setResizable(false);

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

        providersScroll.setViewportView(providersTable);

        lblTitle.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText(bundle.getString("ListaProveedores.lblTitle.text")); // NOI18N

        btnMenu.setBackground(new Color(255, 0, 51));
        btnMenu.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        btnMenu.setText(bundle.getString("ListaProveedores.btnMenu.text")); // NOI18N
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnGetBack.setText(bundle.getString("ListaProveedores.btnGetBack.text")); // NOI18N
        btnGetBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGetBackActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnDeleteRow)
                .addGap(34, 34, 34)
                .addComponent(btnDeleteAll)
                .addGap(52, 52, 52)
                .addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnGetBack)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(providersScroll, GroupLayout.PREFERRED_SIZE, 718, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(lblTitle)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(providersScroll, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteRow)
                    .addComponent(btnDeleteAll)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetBack)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteRowActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        try {
            modelo = (DefaultTableModel) providersTable.getModel();
            modelo.removeRow(providersTable.getSelectedRow());
            providersTable.addRowSelectionInterval(0, 0);
            modelo = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private void btnDeleteAllActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
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

    private void btnGetBackActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnGetBackActionPerformed
        navigationHandler.goToProviderManagement(this);
    }//GEN-LAST:event_btnGetBackActionPerformed

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            mostrarLosDatos();
        }
        super.setVisible(visible);
    }


    private void btnMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

}
