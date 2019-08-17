/* 
 * Copyright (C) 2019 Ruslan LÃ³pez Carro
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
