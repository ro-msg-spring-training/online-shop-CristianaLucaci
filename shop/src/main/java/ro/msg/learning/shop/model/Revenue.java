package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Revenue")
public class Revenue extends BaseEntity<Integer>{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LocationID")
    private Location location;

    @Column(name = "data")
    private LocalDate date;

    @Column(name = "suma")
    private BigDecimal sum;

}
