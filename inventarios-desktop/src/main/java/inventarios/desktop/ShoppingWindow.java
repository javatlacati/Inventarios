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

import com.toedter.calendar.JDateChooser;
import inventarios.desktop.navigation.NavigationHandler;
import inventarios.service.ProductService;
import inventarios.service.ProviderService;
import inventarios.service.PurchaseService;
import inventarios.to.Product;
import inventarios.to.Provider;
import inventarios.to.Purchase;
import inventarios.util.ShutdownManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author EfraJiJim
 */
@Component
public class ShoppingWindow extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JComboBox<String> cmbProvider;
    private JTextField txtAdress;
    private JTextField txtContributor;
    private JDateChooser txtDate;
    private JTextField txtEmail;
    private JList<Product> txtProduct;
    private JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables

    private NavigationHandler navigationHandler;

    private ProviderService providerService;

    private ProductService productService;

    private PurchaseService purchaseService;

    private ShutdownManager shutdownManager;

    /*
    Se Realiza el llamado del ArrayList
     */
    DefaultTableModel model = new DefaultTableModel();

    TableRowSorter busqueda = new TableRowSorter(model);

    @Autowired
    public ShoppingWindow(
            @Qualifier("shoppingVisitor") NavigationHandler navigationHandler,
            ProviderService providerService,
            ProductService productService,
            PurchaseService purchaseService,
            ShutdownManager shutdownManager
    ) {
        this.navigationHandler = navigationHandler;
        this.providerService = providerService;
        this.productService = productService;
        this.purchaseService = purchaseService;
        this.shutdownManager = shutdownManager;
        initComponents();

        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(Color.cyan);
        cerrar();
    }

    //Método para confirmar el cierre deJFrame//
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(ShoppingWindow.DO_NOTHING_ON_CLOSE);
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

        JPanel pntlButtons = new JPanel();
        JButton btnAdd = new JButton();
        JButton btnSearch = new JButton();
        JButton btnClean = new JButton();
        JButton btnClose = new JButton();
        JButton btnMenu = new JButton();
        JPanel centerPanel = new JPanel();
        JPanel pnlLabels = new JPanel();
        JLabel lblDate = new JLabel();
        JLabel lblProvider = new JLabel();
        JLabel lblAddress = new JLabel();
        JLabel lblTelephone = new JLabel();
        JLabel lblContributor = new JLabel();
        JLabel lblEmail = new JLabel();
        JLabel lblProduct = new JLabel();
        JPanel pnlFields = new JPanel();
        txtDate = new JDateChooser();
        cmbProvider = new JComboBox<>();
        txtAdress = new JTextField();
        txtTelephone = new JTextField();
        txtContributor = new JTextField();
        txtEmail = new JTextField();
        JScrollPane scrollProducts = new JScrollPane();
        txtProduct = new JList<>();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("ShoppingWindow.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new BorderLayout(30, 10));

        pntlButtons.setLayout(new GridLayout(0, 1));

        btnAdd.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/agregar1.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pntlButtons.add(btnAdd);

        btnSearch.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/consulta.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pntlButtons.add(btnSearch);

        btnClean.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/Limpiar_1.png"))); // NOI18N
        btnClean.setBorder(null);
        btnClean.setContentAreaFilled(false);
        btnClean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        pntlButtons.add(btnClean);

        btnClose.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/cerrar.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pntlButtons.add(btnClose);

        btnMenu.setBackground(new Color(51, 51, 255));
        btnMenu.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        btnMenu.setText(bundle.getString("ShoppingWindow.btnMenu.text")); // NOI18N
        btnMenu.setAutoscrolls(true);
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pntlButtons.add(btnMenu);

        getContentPane().add(pntlButtons, BorderLayout.EAST);

        centerPanel.setLayout(new GridLayout(1, 0));

        pnlLabels.setLayout(new GridLayout(0, 1));

        lblDate.setText(bundle.getString("ShoppingWindow.lblDate.text")); // NOI18N
        pnlLabels.add(lblDate);

        lblProvider.setText(bundle.getString("ShoppingWindow.lblProvider.text")); // NOI18N
        pnlLabels.add(lblProvider);

        lblAddress.setText(bundle.getString("ShoppingWindow.lblAddress.text")); // NOI18N
        pnlLabels.add(lblAddress);

        lblTelephone.setText(bundle.getString("ShoppingWindow.lblTelephone.text")); // NOI18N
        pnlLabels.add(lblTelephone);

        lblContributor.setText(bundle.getString("ShoppingWindow.lblContributor.text")); // NOI18N
        pnlLabels.add(lblContributor);

        lblEmail.setText(bundle.getString("ShoppingWindow.lblEmail.text")); // NOI18N
        pnlLabels.add(lblEmail);

        lblProduct.setText(bundle.getString("ShoppingWindow.lblProduct.text")); // NOI18N
        pnlLabels.add(lblProduct);

        centerPanel.add(pnlLabels);

        pnlFields.setLayout(new GridLayout(0, 1));
        pnlFields.add(txtDate);
        pnlFields.add(cmbProvider);

        txtAdress.setPreferredSize(new Dimension(70, 25));
        txtAdress.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtAdressKeyTyped(evt);
            }
        });
        pnlFields.add(txtAdress);

        txtTelephone.setPreferredSize(new Dimension(70, 25));
        txtTelephone.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtTelephoneKeyTyped(evt);
            }
        });
        pnlFields.add(txtTelephone);

        txtContributor.setPreferredSize(new Dimension(70, 25));
        txtContributor.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtContributorKeyTyped(evt);
            }
        });
        pnlFields.add(txtContributor);

        txtEmail.setPreferredSize(new Dimension(70, 25));
        txtEmail.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        pnlFields.add(txtEmail);

        scrollProducts.setViewportView(txtProduct);

        pnlFields.add(scrollProducts);

        centerPanel.add(pnlFields);

        getContentPane().add(centerPanel, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Clears the Text Field's contents when clicked
     */
    private void btnCleanActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        clearFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnAddActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        add();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtAdressKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtAdressKeyTyped
        addOnEnterKey(evt);
    }//GEN-LAST:event_txtAdressKeyTyped

    private void txtTelephoneKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyTyped
        addOnEnterKey(evt);
    }//GEN-LAST:event_txtTelephoneKeyTyped

    private void txtContributorKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtContributorKeyTyped
        addOnEnterKey(evt);
    }//GEN-LAST:event_txtContributorKeyTyped

    private void txtEmailKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        addOnEnterKey(evt);
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnSearchActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        navigationHandler.goToShoppingList(this);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        navigationHandler.goToFrame(this, Menu.class);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void add() {
        /*
        Declaramos las variables donde se guardara el contenido para los TextFiel
         */
        Date date = txtDate.getDate();
        Provider provider = (Provider) cmbProvider.getSelectedItem();
        String adress = txtAdress.getText();
        String telephone = txtTelephone.getText();
        String RFC = txtContributor.getText();
        String mail = txtEmail.getText();
        List<Product> product = txtProduct.getSelectedValuesList();
        /*
        Se hace la instancia para guardar los datos en el ArrayList
         */
        Purchase clase = new Purchase(null, date, provider, product, null);
        purchaseService.save(clase);
        clearFields();
        /*
       * Agregar el contendio al jTable
         */
    }
    
    private void addOnEnterKey(KeyEvent evt) {
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            add();
        }
    }

    private void clearFields() {
        txtDate.cleanup();
        cmbProvider.setModel(new ProviderComboBoxModel(providerService.findAll()));
        txtProduct.setModel(new ProductListModel(productService.findAll()));
        txtAdress.setText("");
        txtTelephone.setText("");
        txtContributor.setText("");
        txtEmail.setText("");
        txtProduct.clearSelection();
    }

    @Override
    public void setVisible(boolean b) {
        cmbProvider.setModel(new ProviderComboBoxModel(providerService.findAll()));
        txtProduct.setModel(new ProductListModel(productService.findAll()));
        super.setVisible(b);
    }
}
