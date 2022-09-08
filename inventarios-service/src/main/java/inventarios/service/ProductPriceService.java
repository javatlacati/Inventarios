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
package inventarios.service;

import inventarios.repository.ProductPriceRepository;
import inventarios.to.Product;
import inventarios.to.ProductCharacteristic;
import inventarios.to.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Ruslan López Carro
 */
@Service
public class ProductPriceService {
    @Autowired
    private ProductPriceRepository productPriceRepository;

    public Page<ProductPrice> findAll(Pageable pageable) {
        return productPriceRepository.findAll(pageable);
    }

    public <S extends ProductPrice> S save(S entity) {
        return productPriceRepository.save(entity);
    }
}
