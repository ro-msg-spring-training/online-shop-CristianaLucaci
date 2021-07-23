package ro.msg.learning.shop.service;

import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.dto.ProductDTO;

public interface ProductService {
    Product createProduct(ProductDTO product);
    Product updateProduct(int id, ProductDTO product);
    Product deleteProduct(int id);
    Product getProduct(int id);
}
