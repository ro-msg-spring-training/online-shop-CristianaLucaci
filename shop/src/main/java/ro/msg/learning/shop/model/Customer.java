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
@Table(name = "Customer")
public class Customer extends BaseEntity<Integer>{

    @Column(name = "first_name", nullable = false) //name=first_name
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email_address", nullable = false)
    private String emailAddress;

    @Override
    public String toString() {
        return "Base{" +
                "Customer='" + firstName  +
                " " + lastName + '\'' +
                ", username=" + username + '\'' +
                ", username=" + emailAddress +
                "} " + super.toString();
    }

}
