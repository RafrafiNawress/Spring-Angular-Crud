package tn.esprit.summerworkshop_springboot.services;

import tn.esprit.summerworkshop_springboot.entities.Product;
import tn.esprit.summerworkshop_springboot.entities.ProductCategory;

import java.util.List;

public interface IProductService {

    Product addProduct(Product product, Long idStock);
    Product retrieveProduct(Long id);
    List<Product> retreiveAllProduct();
    List<Product> retrieveProductByCategory(ProductCategory category);
    void deleteProduct(Long id);
    List<Product> retreiveProductStock(Long id);


}
