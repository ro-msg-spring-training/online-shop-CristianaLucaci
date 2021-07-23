package ro.msg.learning.shop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.dto.ProductDTO;
import ro.msg.learning.shop.repository.ProductCategoryRepository;
import ro.msg.learning.shop.repository.ProductRepository;
import ro.msg.learning.shop.repository.SupplierRepository;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;
    private final SupplierRepository supplierRepository;



    @Override
    public Product createProduct(ProductDTO product) {
        return null;
    }

    @Override
    public Product updateProduct(int id, ProductDTO product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }

    @Override
    public Product getProduct(int id) {

        return null;
    }

   /* private Collection<ProductDTO> getProducts() {
        return  productRepository.findAll().stream()
                .map(ProductDTO::toProduct)
                .toList();
    }*/

}
