/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop;

import inventarios.to.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class ProviderComboBoxModel extends AbstractListModel implements ComboBoxModel {

    Provider selectedItem;
    List<Provider> model;

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
