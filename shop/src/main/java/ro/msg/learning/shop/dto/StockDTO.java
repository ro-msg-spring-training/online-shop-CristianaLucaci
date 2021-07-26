package ro.msg.learning.shop.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class StockDTO extends BaseDTO{

    int product;

    int location;

    private int quantity;

    @Override
    public String toString() {
        return "StockDto{" +
                "product=" + product +
                ", location=" + location +
                ", quantity=" + quantity +
                '}';
    }

}
