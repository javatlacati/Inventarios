/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.repository;

import inventarios.to.ProductCharacteristic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsRepository  extends JpaRepository<ProductCharacteristic, Long> {
    
}
