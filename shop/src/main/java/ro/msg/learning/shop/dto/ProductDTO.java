package ro.msg.learning.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.msg.learning.shop.model.Product;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private int productID;
    private String name;
    private String description;
    private BigDecimal price;
    private Double weight;
    private int categoryID;
    private String categoryName;
    private String categoryDescription;
    private int supplierID;
    private String imageUrl;

    public static ProductDTO toDTO(Product product) {

        return ProductDTO.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .weight(product.getWeight())
                .categoryID(product.getCategory().getId())
                .categoryName(product.getCategory().getName())
                .categoryDescription(product.getCategory().getDescription())
                .imageUrl(product.getImageUrl())
                .supplierID(product.getSupplier().getId())
                .build();
    }

}