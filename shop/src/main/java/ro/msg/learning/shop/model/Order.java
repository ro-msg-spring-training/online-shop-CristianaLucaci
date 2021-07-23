package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Order_t")
public class Order extends BaseEntity<Integer>{

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "LocationID")
    @Column(name = "shipped_from")
    private Location shippedFrom;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @Column(name = "customer")
    private Customer customer;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "address_country", nullable = false)
    private String addressCountry;

    @Column(name = "address_city", nullable = false)
    private String addressCity;

    @Column(name = "address_county", nullable = false)
    private String addressCounty;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

}
