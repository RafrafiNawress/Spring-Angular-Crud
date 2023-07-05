package tn.esprit.summerworkshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.summerworkshop_springboot.entities.Product;
import tn.esprit.summerworkshop_springboot.entities.ProductCategory;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(ProductCategory category);
    List<Product> findByStockIdStock(Long idStock);
}
