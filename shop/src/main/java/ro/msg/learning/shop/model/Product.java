package ro.msg.learning.shop.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Product")
@Builder
public class Product extends BaseEntity<Integer>{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "weight")
    private double weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_category_ID")
    private ProductCategory category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_ID")
    private Supplier supplier;

    @Column(name = "image_url")
    private String imageUrl;

    @Override
    public String toString() {
        return "Base{" +
                "Product =" + name
                + '\'' +",Description="+ description +
                + '\'' +",Price="+ price +
                + '\'' +",Weight="+ weight +
                + '\'' +",ProductCategory="+ category.getName() +
                + '\'' +",Supplier="+ supplier.getName() +
                + '\'' +",URL="+ imageUrl +
                super.toString();
    }
}
