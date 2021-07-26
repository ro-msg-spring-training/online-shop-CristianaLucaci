package ro.msg.learning.shop.service;

import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product, Integer productCategoryID);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
    Product getProduct(int id);
    List<Product> getProducts();
}
