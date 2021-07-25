package ro.msg.learning.shop.converter;

import ro.msg.learning.shop.dto.ProductCategoryDTO;
import ro.msg.learning.shop.model.ProductCategory;

public class ProductCategoryConverter implements BaseConverter<ProductCategory, ProductCategoryDTO>{
    @Override
    public ProductCategory dtoToEntity(ProductCategoryDTO productCategoryDTO) {
        return null;
    }

    @Override
    public ProductCategoryDTO entityToDto(ProductCategory productCategory) {
        return null;
    }
}
