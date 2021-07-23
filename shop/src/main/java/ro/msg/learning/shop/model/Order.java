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
    @Column(name = "shippedFrom")
    private Location shippedFrom;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @Column(name = "customer")
    private Customer customer;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "addressCountry", nullable = false)
    private String addressCountry;

    @Column(name = "addressCity", nullable = false)
    private String addressCity;

    @Column(name = "addressCounty", nullable = false)
    private String addressCounty;

    @Column(name = "addressStreetAddress", nullable = false)
    private String adressStreetAdress;

}
