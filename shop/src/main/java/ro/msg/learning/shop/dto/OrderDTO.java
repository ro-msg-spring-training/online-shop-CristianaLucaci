package ro.msg.learning.shop.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class OrderDTO extends BaseDTO{
    private int locationId;

    private String locationName;

    private int customerId;

    private String customerName;

    private LocalDateTime createdAt;

    private String addressCountry;

    private String addressCity;

    private String addressCounty;

    private String streetAddress;

    private List<StockDTO> products;

    public static Integer getQuantityById(List<StockDTO> orderProducts, Integer productId) {
        for (StockDTO op: orderProducts) {
            if (op.getProduct() == productId) {
                return op.getQuantity();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CustomerOrderDto{" +
                "shippedFrom=" + locationName +
                ", customer=" + locationId +
                ", createdAt=" + createdAt +
                ", country='" + addressCountry + '\'' +
                ", city='" + addressCity + '\'' +
                ", county='" + addressCounty + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                '}';
    }
}
