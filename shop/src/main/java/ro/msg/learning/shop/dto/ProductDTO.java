package ro.msg.learning.shop.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class ProductDTO extends BaseDTO{

    private String name;
    private String description;
    private BigDecimal price;
    private Double weight;
    private int categoryID;
    private String categoryName;
    private int supplierID;
    private String imageUrl;

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", category=" + categoryName +
                '}';
    }

}