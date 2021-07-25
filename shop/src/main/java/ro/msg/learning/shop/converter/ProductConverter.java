package ro.msg.learning.shop.converter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ro.msg.learning.shop.dto.ProductCategoryDTO;
import ro.msg.learning.shop.dto.ProductDTO;
import ro.msg.learning.shop.model.Product;

@AllArgsConstructor
@Component
public class ProductConverter implements BaseConverter<Product, ProductDTO>{

    private final ProductCategoryConverter productCategoryConverter;
    @Override
    public Product dtoToEntity(ProductDTO productDTO) {
        if(productDTO == null) {
            return null;
        }

        Product product = Product.builder()
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .weight(productDTO.getWeight())
                .imageUrl(productDTO.getImageUrl())
                .build();

        product.setId(productDTO.getID());

        return product;
    }

    @Override
    public ProductDTO entityToDto(Product product) {
        if(product == null){
            return null;
        }
        ProductCategoryDTO category = productCategoryConverter.entityToDto(product.getCategory());
        ProductDTO productDTO = ProductDTO.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .weight(product.getWeight())
                .categoryID(category.getID())
                .categoryName(category.getName())
                .imageUrl(product.getImageUrl())
                .supplierID(product.getSupplier().getId())
                .build();

        productDTO.setID(product.getId());

        return productDTO;
    }
}
