package ro.msg.learning.shop.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class ProductCategoryDTO extends BaseDTO{
    String name;
    String description;
}
