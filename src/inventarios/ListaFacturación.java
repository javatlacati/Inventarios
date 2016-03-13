/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventarios;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Personal
 */
public class ListaFacturación extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    int con = 0;
    

    /**
     * Creates new form ListaFacturación
     */
    public ListaFacturación() {
        initComponents();
        MostrarInterfaz();
        MostrarLosDatos();
        this.setIconImage
         (new ImageIcon(getClass().getResource
        ("/ImgFondos/Icono.png")).getImage());
        cerrar();
        this.getContentPane().setBackground(Color.GRAY);
        
    }
     public void MostrarInterfaz()
    {
     //para agregar los datos en un arreglo vacio//
        String data [][]={};
        
        String col[]=  {"RFC", "Razón Social", "Calle", "No. Ext.", "No. Int.","Colonia","Localidad","Delegación/Municipio","Estado","País","Código Postal","E-Mail"};
        modelo = new DefaultTableModel(data, col);
        jTable1.setModel(modelo); 
        
       
    }
    
    public void MostrarLosDatos()
        {
            Facturación f;
            for(int i=0; i<FacturaciónVentana.contenedor.size(); i++)
            {
                f = (Facturación) FacturaciónVentana.contenedor.get(i);
                modelo.insertRow(con, new Object[]{});
                modelo.setValueAt(f.getRFC(),con , 0);
                modelo.setValueAt(f.getRS(),con , 1);
                modelo.setValueAt(f.getCalle(),con , 2);
                modelo.setValueAt(f.getNE(),con , 3);
                modelo.setValueAt(f.getNI(),con , 4);
                modelo.setValueAt(f.getColonia(),con , 5);
                modelo.setValueAt(f.getLocalidad(),con , 6);
                modelo.setValueAt(f.getDM(),con , 7);
                modelo.setValueAt(f.getEstado(),con , 8);
                modelo.setValueAt(f.getPais(),con , 9);
                modelo.setValueAt(f.getCP(),con , 10);
                modelo.setValueAt(f.getEM(),con , 11);
                
                
            }
        }
     //Método para confirmar el cierre deJFrame//
    public void cerrar(){
        try {
            this.setDefaultCloseOperation(ListaFacturación.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    confirmarSalida();
                }
                });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    //Confirmar salida//
        public void confirmarSalida(){
            int valor= JOptionPane.showConfirmDialog(this, "¿Desea cerrar todas las ventanas abiertas?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Facturas Agregadas");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar fila.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/eliminar todo.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgLetras/regresar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(147, 147, 147)
                        .addComponent(jButton2)
                        .addGap(70, 70, 70)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
            modelo=(DefaultTableModel) jTable1.getModel();
            modelo.removeRow(jTable1.getSelectedRow());
            jTable1.addRowSelectionInterval(0,0);
            modelo=null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
            DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
          int filas=jTable1.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFacturación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFacturación().setVisible(true);
            }
        });
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

