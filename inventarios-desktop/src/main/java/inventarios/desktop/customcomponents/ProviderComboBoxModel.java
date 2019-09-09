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
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class ProviderComboBoxModel extends AbstractListModel<Provider> implements ComboBoxModel<Provider> {

    private Provider selectedItem;
    private List<Provider> model;

    public ProviderComboBoxModel( List<Provider> model) {
        this.model = new ArrayList<>(model);
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        Provider selectedProvider = (Provider) (anItem);
        selectedItem = model.stream().filter(provider->provider.getName().equals(selectedProvider)).findFirst().orElse(null);
    }

    @Override
    public Provider getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return model.size();
    }

    @Override
    public Provider getElementAt(int index) {
        return model.get(index);
    }

}
