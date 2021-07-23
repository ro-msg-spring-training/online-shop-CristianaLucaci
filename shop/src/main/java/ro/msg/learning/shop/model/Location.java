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
@Table(name = "Location_t")
public class Location extends BaseEntity<Integer>{
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "addressCountry", nullable = false)
    private String addressCountry;

    @Column(name = "addressCity", nullable = false)
    private String addressCity;

    @Column(name = "addressCounty", nullable = false)
    private String addressCounty;

    @Column(name = "addressStreetAddress", nullable = false)
    private String adressStreetAdress;
}
