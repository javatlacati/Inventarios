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
import inventarios.to.Product;
import inventarios.to.ProductCharacteristic;
import inventarios.util.RoundedBorder;
import inventarios.util.ShutdownManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;
import javax.validation.ConstraintViolation;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * @author david
 */
@Component
public class InventoryManagement extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField txtCharacteristics;
    private JDateChooser txtDateIn;
    private JDateChooser txtDateOut;
    private JTextField txtName;
    private JTextField txtProduct;
    private JSpinner txtQuantity;
    private JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables

    private ProductService productService;

    private LocalValidatorFactoryBean validatorFactory;

    private NavigationHandler navigationHandler;

    private ShutdownManager shutdownManager;

    public Optional<Product> found;

    /**
     * Creates new form InterfazConstructor
     */
    @Autowired
    public InventoryManagement(
            @Qualifier("inventoryManagementVisitor") NavigationHandler navigationHandler,
            ProductService productService,
            @Qualifier("getValidator") LocalValidatorFactoryBean validatorFactory,
            ShutdownManager shutdownManager
    ) {
        this.navigationHandler = navigationHandler;
        this.productService = productService;
        this.validatorFactory = validatorFactory;
        this.shutdownManager = shutdownManager;
        initComponents();
        this.getContentPane().setBackground(Color.cyan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel lblProduct = new JLabel();
        JLabel lblQuantity = new JLabel();
        JLabel lblCharacteristics = new JLabel();
        JLabel lblSerialNo = new JLabel();
        txtProduct = new JTextField();
        txtCharacteristics = new JTextField();
        txtSerialNo = new JTextField();
        JButton btnAdd = new JButton();
        JButton btnClean = new JButton();
        JButton btnClose = new JButton();
        JButton btnView = new JButton();
        JLabel lblTitle = new JLabel();
        txtName = new JTextField();
        JLabel lblName = new JLabel();
        JButton btnMenu = new JButton();
        JLabel lblDateIn = new JLabel();
        JLabel lblDateOut = new JLabel();
        txtDateIn = new JDateChooser();
        txtDateOut = new JDateChooser();
        txtQuantity = new JSpinner();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("InventoryManagement.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                closeHandler(evt);
            }
        });

        lblProduct.setFont(new Font("Trebuchet MS", 1, 24)); // NOI18N
        lblProduct.setForeground(new Color(255, 0, 0));
        lblProduct.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/Producto.png"))); // NOI18N

        lblQuantity.setFont(new Font("Trebuchet MS", 1, 24)); // NOI18N
        lblQuantity.setForeground(new Color(255, 0, 0));
        lblQuantity.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/cantidad.png"))); // NOI18N

        lblCharacteristics.setFont(new Font("Trebuchet MS", 1, 24)); // NOI18N
        lblCharacteristics.setForeground(new Color(255, 0, 0));
        lblCharacteristics.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/caracteristica.png"))); // NOI18N

        lblSerialNo.setFont(new Font("Trebuchet MS", 1, 24)); // NOI18N
        lblSerialNo.setForeground(new Color(255, 0, 0));
        lblSerialNo.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/serial.png"))); // NOI18N

        txtProduct.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtProductKeyTyped(evt);
            }
        });

        txtCharacteristics.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtCharacteristicsKeyTyped(evt);
            }
        });

        txtSerialNo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtSerialNoKeyTyped(evt);
            }
        });

        btnAdd.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/agregar1.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClean.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/Limpiar_1.png"))); // NOI18N
        btnClean.setBorder(null);
        btnClean.setContentAreaFilled(false);
        btnClean.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        btnClean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnClose.setBackground(new Color(255, 51, 51));
        btnClose.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setText(bundle.getString("InventoryManagement.btnClose.text")); // NOI18N
        btnClose.setBorder(new RoundedBorder(10));
        btnClose.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnView.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/consulta.png"))); // NOI18N
        btnView.setBorder(null);
        btnView.setContentAreaFilled(false);
        btnView.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        btnView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblTitle.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/inventario.png"))); // NOI18N

        txtName.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        lblName.setFont(new Font("Tahoma", 3, 14)); // NOI18N
        lblName.setText(bundle.getString("InventoryManagement.lblName.text")); // NOI18N

        btnMenu.setBackground(new Color(255, 0, 204));
        btnMenu.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        btnMenu.setText(bundle.getString("InventoryManagement.btnMenu.text")); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblDateIn.setText(bundle.getString("InventoryManagement.lblDateIn.text")); // NOI18N

        lblDateOut.setText(bundle.getString("InventoryManagement.lblDateOut.text")); // NOI18N

        txtQuantity.setModel(new SpinnerNumberModel(0, null, 99, 1));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(lblTitle)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblSerialNo)
                            .addComponent(lblCharacteristics)
                            .addComponent(lblProduct)
                            .addComponent(lblQuantity)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateOut)
                                    .addComponent(lblDateIn))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSerialNo)
                            .addComponent(txtCharacteristics)
                            .addComponent(txtDateOut, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProduct, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtQuantity))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClean, GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMenu, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduct)
                            .addComponent(txtProduct, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantity)
                            .addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblCharacteristics))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtCharacteristics, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSerialNo)
                                .addGap(18, 18, 18)
                                .addComponent(lblDateIn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSerialNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtDateIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblDateOut)
                            .addComponent(txtDateOut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnView, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnClean, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addNewProduct();
    }//GEN-LAST:event_btnAddActionPerformed

    private void addNewProduct() {
        String productName = txtProduct.getText();
        Integer productQuantity = (Integer) txtQuantity.getValue();
        String characteristics = txtCharacteristics.getText();
        String serial = txtSerialNo.getText();
        Date dateIn = txtDateIn.getDate();
        Date dateOut = txtDateOut.getDate();
        final ProductCharacteristic productCharacteristic = new ProductCharacteristic();

        Product clase = new Product(productName, productQuantity, serial, dateIn, dateOut, productCharacteristic);

        Set<ConstraintViolation<Product>> constraintViolations = validatorFactory.getValidator().validate(clase);
        if (constraintViolations.isEmpty()) {
            productService.save(clase);
            clearFields();
        } else {
            constraintViolations.forEach(
                    (violation)
                    -> JOptionPane.showMessageDialog(null,
                            violation.getMessage() + ". por favor corrija el valor:\"" + violation.getInvalidValue() + "\"",
                            violation.getMessage(),
                            JOptionPane.WARNING_MESSAGE)
            );
        }
    }

    /**
     * cleans all text fields
     */
    private void clearFields() {
        txtProduct.setText("");
        txtQuantity.setValue(0);
        txtCharacteristics.setText("");
        txtSerialNo.setText("");
        txtDateIn.cleanup();//setText("");
        txtDateOut.cleanup();//setText("");
    }

    private void btnCleanActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        clearFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnViewActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        navigationHandler.goToProductList(this);
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtProductKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtProductKeyTyped
        addProductOnEnterKey(evt);
    }//GEN-LAST:event_txtProductKeyTyped

    private void addProductOnEnterKey(KeyEvent evt) {
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            addNewProduct();
        }
    }

    private void txtCharacteristicsKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtCharacteristicsKeyTyped
        addProductOnEnterKey(evt);
    }//GEN-LAST:event_txtCharacteristicsKeyTyped

    private void txtSerialNoKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtSerialNoKeyTyped
        addProductOnEnterKey(evt);
    }//GEN-LAST:event_txtSerialNoKeyTyped

    private void txtNameKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int tecla = evt.getKeyChar();
        if (tecla == 10) {
            String codigoCopiado = txtName.getText().trim();
            Product sampleProduct = new Product();
            sampleProduct.setName(codigoCopiado);
            found = productService.findOne(sampleProduct);

            if (found.isPresent()) {
                Product p = found.get();
                txtProduct.setText(p.getName());
                txtQuantity.setValue(p.getQuantity());
                txtCharacteristics.setText(p.getCharacteristics().toString());
                txtSerialNo.setText(p.getSerial());
                txtDateIn.setDate(p.getDateIn());
                txtDateOut.setDate(p.getDateOut());
            } else {
                JOptionPane.showMessageDialog(null, "No Existe");
            }
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void btnMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
//        menu.setVisible(true);
//        dispose();
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void closeHandler(WindowEvent evt) {//GEN-FIRST:event_closeHandler
        shutdownManager.confirmExit();
    }//GEN-LAST:event_closeHandler

}
