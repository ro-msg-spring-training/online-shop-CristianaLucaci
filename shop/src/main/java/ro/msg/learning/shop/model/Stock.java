package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Stock_t")
public class Stock implements Serializable {
    @EmbeddedId
    private StockID stockID;

    @Column(name = "quantity", nullable = false)
    private int quantity;
}
