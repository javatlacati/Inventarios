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
import inventarios.service.restclient.EmployeeService;
import inventarios.to.EmployeeDetail;
import java.awt.BorderLayout;
import java.awt.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;

/**
 *
 * @author IDELFONSO
 */
@Component
public class ListaEmpleados extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTable tblEmployees;
    // End of variables declaration//GEN-END:variables

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    @Qualifier("listaEmpleadosVisitor")
    private NavigationHandler navigationHandler;

    private DefaultTableModel modelo;
    private int cont = 0;

    /**
     * Creates new form TablaClientes
     */
    public ListaEmpleados() {
        initComponents();
        ((JPanel) getContentPane()).setOpaque(false);
    }

    public void cargarinterfaz() {
        String x[][] = {};
        String columnas[] = {"matricula", "nombre", "primera apellido", "segundo apellido", "domicilio", "puesto", "Hora de entrada", "Hora de salida"};
        modelo = new DefaultTableModel(x, columnas);
        tblEmployees.setModel(modelo);
    }

    public void mostrardatos(EmployeeDetail c) {

        modelo.insertRow(cont, new Object[]{});

        modelo.setValueAt(c.getNumber(), cont, 0);
        modelo.setValueAt(c.getName(), cont, 1);
        modelo.setValueAt(c.getMiddleName(), cont, 2);
        modelo.setValueAt(c.getLastName(), cont, 3);
        modelo.setValueAt(c.getHomeAdress(), cont, 4);
        modelo.setValueAt(c.getPosition(), cont, 5);
        modelo.setValueAt(c.getStartTime(), cont, 6);
        modelo.setValueAt(c.getEndTime(), cont, 7);

        cont++;

    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        cargarinterfaz();
        EmployeeDetail c;
        cont = 0;

        List<EmployeeDetail> employeeDetails = employeeService.findAll();
        for (EmployeeDetail employeeDetail : employeeDetails) {
            mostrardatos(employeeDetail);
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

        JPanel applicationContent = new JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                Point point1 = new Point(10, 10);
                Point point2 = new Point(
                    getWidth() - 10,
                    getHeight() - 10);

                //ultramar 10,73,123

                final GradientPaint gp = new GradientPaint(
                    point1, new Color(72,114,126),
                    point2, new Color(156,191,127),
                    true);

                final Graphics2D g2 = (Graphics2D) g;
                g2.setPaint(gp);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        JPanel pnlTitle = new JPanel();
        JLabel lblTitle = new JLabel();
        JPanel pnlButtons = new JPanel();
        JButton btnGetBack = new JButton();
        JButton btnClose = new JButton();
        JScrollPane scrlEmployees = new JScrollPane();
        tblEmployees = new JTable();

        applicationContent.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        applicationContent.setLayout(new BorderLayout(0, 10));

        pnlTitle.setOpaque(false);
        pnlTitle.setLayout(new GridLayout(1, 0, 15, 0));

        lblTitle.setFont(new Font("Verdana", 1, 18)); // NOI18N
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        lblTitle.setText(bundle.getString("ListaEmpleados.lblTitle.text")); // NOI18N
        pnlTitle.add(lblTitle);

        pnlButtons.setOpaque(false);
        pnlButtons.setLayout(new GridLayout(1, 0));

        btnGetBack.setFont(new Font("Verdana", 1, 18)); // NOI18N
        btnGetBack.setText(bundle.getString("ListaEmpleados.btnGetBack.text")); // NOI18N
        btnGetBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGetBackActionPerformed(evt);
            }
        });
        pnlButtons.add(btnGetBack);

        btnClose.setText(bundle.getString("ListaEmpleados.btnClose.text")); // NOI18N
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlButtons.add(btnClose);

        pnlTitle.add(pnlButtons);

        applicationContent.add(pnlTitle, BorderLayout.NORTH);

        scrlEmployees.setViewportView(tblEmployees);

        applicationContent.add(scrlEmployees, BorderLayout.CENTER);

        getContentPane().add(applicationContent, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetBackActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnGetBackActionPerformed
        navigationHandler.goToEmployeeRegistration(this);
    }//GEN-LAST:event_btnGetBackActionPerformed

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        navigationHandler.goToEmployeeRegistration(this);
    }//GEN-LAST:event_btnCloseActionPerformed

}
