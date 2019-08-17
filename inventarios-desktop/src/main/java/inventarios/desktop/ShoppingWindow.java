/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.desktop;

import inventarios.service.ProductService;
import inventarios.service.ProviderService;
import inventarios.service.PurchaseService;
import inventarios.to.Product;
import inventarios.to.Provider;
import inventarios.to.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;

/**
 *
 * @author EfraJiJim
 */
@Component
public class ShoppingWindow extends javax.swing.JFrame {

    ListaCompras listaCompras;

    Menu menu;
    
    ProviderService providerService;
        
    ProductService productService;
    
    PurchaseService purchaseService;
    /*
    Se Realiza el llamado del ArrayList
     */
    DefaultTableModel model = new DefaultTableModel();

    TableRowSorter busqueda = new TableRowSorter(model);

    @Autowired
    public ShoppingWindow(ListaCompras listaCompras, inventarios.desktop.Menu menu, ProviderService providerService, ProductService productService, PurchaseService purchaseService) {
        this.listaCompras = listaCompras;
        this.menu = menu;
        this.providerService = providerService;
        this.productService = productService;
        this.purchaseService = purchaseService;
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
                    confirmarSalida();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Confirmar salida//
    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Desea cerrar todas la ventanas abiertas?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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

        pntlButtons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        pnlLabels = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblProvider = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblContributor = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        pnlFields = new javax.swing.JPanel();
        txtDate = new com.toedter.calendar.JDateChooser();
        cmbProvider = new javax.swing.JComboBox<>();
        txtAdress = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtContributor = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        scrollProducts = new javax.swing.JScrollPane();
        txtProduct = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("ShoppingWindow.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(30, 10));

        pntlButtons.setLayout(new java.awt.GridLayout(0, 1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/agregar1.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pntlButtons.add(btnAdd);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/consulta.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pntlButtons.add(btnSearch);

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/Limpiar_1.png"))); // NOI18N
        btnClean.setBorder(null);
        btnClean.setContentAreaFilled(false);
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        pntlButtons.add(btnClean);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/cerrar.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pntlButtons.add(btnClose);

        btnMenu.setBackground(new java.awt.Color(51, 51, 255));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMenu.setText(bundle.getString("ShoppingWindow.btnMenu.text")); // NOI18N
        btnMenu.setAutoscrolls(true);
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pntlButtons.add(btnMenu);

        getContentPane().add(pntlButtons, java.awt.BorderLayout.EAST);

        centerPanel.setLayout(new java.awt.GridLayout(1, 0));

        pnlLabels.setLayout(new java.awt.GridLayout(0, 1));

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

        pnlFields.setLayout(new java.awt.GridLayout(0, 1));
        pnlFields.add(txtDate);
        pnlFields.add(cmbProvider);

        txtAdress.setPreferredSize(new java.awt.Dimension(70, 25));
        txtAdress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdressKeyTyped(evt);
            }
        });
        pnlFields.add(txtAdress);

        txtTelephone.setPreferredSize(new java.awt.Dimension(70, 25));
        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelephoneKeyTyped(evt);
            }
        });
        pnlFields.add(txtTelephone);

        txtContributor.setPreferredSize(new java.awt.Dimension(70, 25));
        txtContributor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContributorKeyTyped(evt);
            }
        });
        pnlFields.add(txtContributor);

        txtEmail.setPreferredSize(new java.awt.Dimension(70, 25));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        pnlFields.add(txtEmail);

        txtProduct.setModel(new ProductListModel(productService.findAll()));
        scrollProducts.setViewportView(txtProduct);

        pnlFields.add(scrollProducts);

        centerPanel.add(pnlFields);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Clears the Text Field's contents when clicked
     */
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        clearFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        add();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtAdressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdressKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            add();
        }
    }//GEN-LAST:event_txtAdressKeyTyped

    private void txtTelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            add();
        }
    }//GEN-LAST:event_txtTelephoneKeyTyped

    private void txtContributorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContributorKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            add();
        }
    }//GEN-LAST:event_txtContributorKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            add();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        listaCompras.mostrarLosDatos();
        listaCompras.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.add(this);
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JComboBox<String> cmbProvider;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContributor;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblProvider;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JPanel pnlFields;
    private javax.swing.JPanel pnlLabels;
    private javax.swing.JPanel pntlButtons;
    private javax.swing.JScrollPane scrollProducts;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtContributor;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JList<Product> txtProduct;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables

    private void add() {
        /*
        Declaramos las variables donde se guardara el contenido para los TextFiel
         */
        Date date = txtDate.getDate();
        Provider provider = (Provider)cmbProvider.getSelectedItem();
        String adress = txtAdress.getText();
        String telephone = txtTelephone.getText();
        String RFC = txtContributor.getText();
        String mail = txtEmail.getText();
        List<Product> product = txtProduct.getSelectedValuesList();
        /*
        Se hace la instancia para guardar los datos en el ArrayList
         */
        Purchase clase = new Purchase(null,date, provider, product, null);
        purchaseService.save(clase);
        clearFields();
        /*
       * Agregar el contendio al jTable
         */
    }

    private void clearFields() {
        txtDate.cleanup();
        List<Provider> providers = providerService.findAll();
        cmbProvider.setModel(new ProviderComboBoxModel(providers));
//        txtProvider.setText("");
        txtAdress.setText("");
        txtTelephone.setText("");
        txtContributor.setText("");
        txtEmail.setText("");
        txtProduct.clearSelection();
    }
}