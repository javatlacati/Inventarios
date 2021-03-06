/*
 * Copyright (C) 2019 Ruslan López <scherzo16 at gmail.com>
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

import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

/**
 *
 * @author oscar
 */
public class FrameEliminar extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnDelete;
    private JLabel lblInstructions;
    private JTextField txtDelete;
    // End of variables declaration//GEN-END:variables
     /**
     * Creates new form FrameEliminar
     */
    public FrameEliminar() {
        initComponents();
    }
    
    @Override
    public java.awt.Image getIconImage() {
        java.awt.Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("ImagenBloqueo/cheques.png"));
        
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new JButton();
        txtDelete = new JTextField();
        lblInstructions = new JLabel();

        setTitle("ELIMINAR REGISTRO_ISC.ITSE");
        setIconImage(getIconImage());
        setLocation(new Point(400, 300));
        setResizable(false);

        btnDelete.setFont(new Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnDelete.setIcon(new ImageIcon(getClass().getResource("/incon/files_folder_256.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        lblInstructions.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        lblInstructions.setIcon(new ImageIcon(getClass().getResource("/incon/eliminar.gif"))); // NOI18N
        lblInstructions.setText("Eliminacion de articulo mediante su codigo:");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblInstructions))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtDelete, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblInstructions)
                .addGap(54, 54, 54)
                .addComponent(txtDelete, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String nombreborrar = txtDelete.getText();
        boolean encontrado = false;
        RegistroClase c = null;

//         for(int i=0; i<lista.size(); i++){
//               
//             
//             if(nombreborrar.equals(c.getCodigo(lista.size(i))))
//             {
//                 
//                 
//                 
//                 
//                 
//                 
//                 
//             }
//       
//     
//            
//             
//     
//
//
//   
//         }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtDeleteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrameEliminar().setVisible(true);
        });
    }
}
