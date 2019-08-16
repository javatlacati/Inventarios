/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.desktop;

import inventarios.to.Product;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Ivana Martinez C
 */
public class ProductListModel extends AbstractListModel {
    Product selectedItem;
    List<Product> model;

    public ProductListModel(List<Product> model) {
        this.model = model;
    }

    @Override
    public int getSize() {
        return model.size();
    }

    @Override
    public Object getElementAt(int index) {
        return model.get(index);
    }
}
