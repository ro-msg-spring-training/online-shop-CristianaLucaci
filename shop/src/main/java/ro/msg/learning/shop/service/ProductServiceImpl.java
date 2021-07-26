package ro.msg.learning.shop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.exception.ProductCategoryNotFoundException;
import ro.msg.learning.shop.exception.ProductNotFoundException;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.ProductCategory;
import ro.msg.learning.shop.repository.ProductCategoryRepository;
import ro.msg.learning.shop.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public Product createProduct(Product product, Integer productCategoryID) {
        ProductCategory productCategory = productCategoryRepository.findById(productCategoryID)
                .orElseThrow(() -> new ProductCategoryNotFoundException(productCategoryID));

        product.setCategory(productCategory);
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product updatedProduct = productRepository.findById(id)
                .map(oldProduct -> {
                    oldProduct.setName(product.getName());
                    oldProduct.setDescription(product.getDescription());
                    oldProduct.setPrice(product.getPrice());
                    oldProduct.setWeight(product.getWeight());
                    oldProduct.setCategory(product.getCategory());
                    oldProduct.setSupplier(product.getSupplier());
                    oldProduct.setImageUrl(product.getImageUrl());
                    return oldProduct;
                })
                .orElseThrow(() -> new ProductNotFoundException(id));

        return productRepository.save(updatedProduct);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.deleteById(id);
    }

    @Override
    public Product getProduct(int id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
