/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop;

import inventarios.service.ProductService;
import inventarios.to.Product;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

/**
 *
 * @author david
 */
@Component
public class InventoryManagement extends javax.swing.JFrame {

    @Autowired
    Menu menu;

    @Autowired
    ProductService productService;

    @Autowired
    ListaProductos listaProductos;

    public Optional<Product> found;

    /**
     * Creates new form InterfazConstructor
     */
    public InventoryManagement() {
        initComponents();
        this.getContentPane().setBackground(Color.cyan);
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

        lblProduct = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("InventoryManagement.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeHandler(evt);
            }
        });

        lblProduct.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblProduct.setForeground(new java.awt.Color(255, 0, 0));
        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/Producto.png"))); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 0, 0));
        lblQuantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/cantidad.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/caracteristica.png"))); // NOI18N

        lblSerialNo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblSerialNo.setForeground(new java.awt.Color(255, 0, 0));
        lblSerialNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/serial.png"))); // NOI18N

        txtProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductKeyTyped(evt);
            }
        });

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        txtSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerialNoKeyTyped(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/agregar1.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/Limpiar_1.png"))); // NOI18N
        btnClean.setBorder(null);
        btnClean.setContentAreaFilled(false);
        btnClean.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/cerrar.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/consulta.png"))); // NOI18N
        btnView.setBorder(null);
        btnView.setContentAreaFilled(false);
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/inventario.png"))); // NOI18N

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblName.setText(bundle.getString("InventoryManagement.lblName.text")); // NOI18N

        btnMenu.setBackground(new java.awt.Color(255, 0, 204));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenu.setText(bundle.getString("InventoryManagement.btnMenu.text")); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel7.setText(bundle.getString("InventoryManagement.jLabel7.text")); // NOI18N

        jLabel8.setText(bundle.getString("InventoryManagement.jLabel8.text")); // NOI18N

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(lblTitle)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSerialNo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblProduct)
                            .addComponent(lblQuantity))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSerialNo)
                                    .addComponent(jTextField3)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClean, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProduct)
                        .addGap(18, 18, 18)
                        .addComponent(lblQuantity)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSerialNo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String productName = txtProduct.getText();
        String productQuantity = txtQuantity.getText();
        String Caracteristicas = jTextField3.getText();
        String Serial = txtSerialNo.getText();
        String Fechai = jTextField5.getText();
        String Fechae = jTextField6.getText();

        Product clase = new Product(productName, productQuantity, Caracteristicas, Serial, Fechai, Fechae);
        productService.save(clase);
        txtProduct.setText("");
        txtQuantity.setText("");
        jTextField3.setText("");
        txtSerialNo.setText("");
        jTextField5.setText("");
        jTextField6.setText("");

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        //limpiar las cajas de texto
        txtProduct.setText("");
        txtQuantity.setText("");
        jTextField3.setText("");
        txtSerialNo.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // cerrar la ventana 
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        listaProductos.mostrarLosDatos();
        listaProductos.setVisible(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btnAdd.doClick();
        }
    }//GEN-LAST:event_txtProductKeyTyped

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btnAdd.doClick();
        }
    }//GEN-LAST:event_txtQuantityKeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btnAdd.doClick();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void txtSerialNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNoKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btnAdd.doClick();
        }
    }//GEN-LAST:event_txtSerialNoKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int tecla = evt.getKeyChar();
        if (tecla == 10) {
            String codigoCopiado = txtName.getText().trim();
            Product sampleProduct = new Product();
            sampleProduct.setProducto(codigoCopiado);
            found = productService.findOne(Example.of(sampleProduct));

            if (found.isPresent()) {
                Product p = found.get();
                txtQuantity.setText(String.valueOf(p.getCantidad()));
                jTextField3.setText(p.getCaracteristicas());
                txtSerialNo.setText(p.getSerial());
            } else {
                JOptionPane.showMessageDialog(null, "No Existe");
            }

//            for (int i = 0; i < contenedor.size(); i++) {
//                p = contenedor.get(i);
//                if (codigoCopiado.equalsIgnoreCase(p.getProducto())) {
//                    txtQuantity.setText(p.getCantidad());
//                    jTextField3.setText(p.getCaracteristicas());
//                    txtSerialNo.setText(p.getSerial());
//                    Encontrado = i;
//                    break;
//                } else {
//                    
//                    break;
//                }
//            }
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void closeHandler(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeHandler
        confirmarSalida();
    }//GEN-LAST:event_closeHandler

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables
}
