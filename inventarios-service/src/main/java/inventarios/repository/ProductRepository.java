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
package inventarios.repository;

import inventarios.to.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    default boolean removeNFromInventory(Long id, int toRemove) {
        return findById(id).map(product -> {
            Integer quantityAvailable = product.getQuantityAvailable();
            int stock = quantityAvailable - toRemove;
            if (stock >= 0) {
                product.setQuantityAvailable(stock);
                save(product); // update
                return true;
            } else {
                return false;
            }
        }).orElse(false);
    }
}
