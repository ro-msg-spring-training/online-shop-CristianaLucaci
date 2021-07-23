package ro.msg.learning.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductCategoryDTO {
    private int id;
    private String name;
    private String description;
}
