package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Location")
public class Location extends BaseEntity<Integer>{
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address_country", nullable = false)
    private String addressCountry;

    @Column(name = "address_city", nullable = false)
    private String addressCity;

    @Column(name = "address_county", nullable = false)
    private String addressCounty;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;
}
