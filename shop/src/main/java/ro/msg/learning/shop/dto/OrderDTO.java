package ro.msg.learning.shop.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

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

    private String countryAddress;

    private String cityAddress;

    private String countyAddress;

    private String streetAddress;

    @Override
    public String toString() {
        return "CustomerOrderDto{" +
                "shippedFrom=" + locationName +
                ", customer=" + locationId +
                ", createdAt=" + createdAt +
                ", country='" + countryAddress + '\'' +
                ", city='" + cityAddress + '\'' +
                ", county='" + countyAddress + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                '}';
    }
}
