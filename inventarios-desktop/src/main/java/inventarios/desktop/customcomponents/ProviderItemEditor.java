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
package inventarios.desktop.customcomponents;

import inventarios.to.Provider;
import lombok.extern.java.Log;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.logging.Level;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Log
public class ProviderItemEditor extends BasicComboBoxEditor {

    private JPanel panel = new JPanel();
    private JLabel labelItem = new JLabel();
    private Provider selectedValue;

    public ProviderItemEditor() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(2, 5, 2, 2);

        labelItem.setOpaque(false);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        labelItem.setForeground(Color.WHITE);

        panel.add(labelItem, constraints);
        panel.setBackground(Color.BLUE);
    }

    @Override
    public Component getEditorComponent() {
        return this.panel;
    }

    @Override
    public Provider getItem() {
        return this.selectedValue;
    }

    @Override
    public void setItem(Object item) {
        log.log(Level.FINE, "Setting item:{0}", item);
        if (null == item) {
            return;
        }
        
        selectedValue = (Provider) item;
        labelItem.setText(selectedValue.getName());
    }

}
