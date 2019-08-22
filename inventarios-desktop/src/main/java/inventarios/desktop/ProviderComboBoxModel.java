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

import inventarios.to.Provider;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import java.util.ArrayList;
import java.util.List;


public class ProviderComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private Provider selectedItem;
    private List<Provider> model;

    public ProviderComboBoxModel( List<Provider> model) {
        this.model = new ArrayList<>(model);
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Provider) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return model.size();
    }

    @Override
    public String getElementAt(int index) {
        return model.get(index).getName();
    }

}
