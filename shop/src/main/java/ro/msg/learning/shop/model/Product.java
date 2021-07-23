package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Product_t")
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
    @JoinColumn(name = "ProductCategoryID")
    private ProductCategory category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SupplierID")
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
