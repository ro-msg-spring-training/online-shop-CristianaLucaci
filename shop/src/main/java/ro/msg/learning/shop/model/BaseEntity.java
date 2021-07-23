package ro.msg.learning.shop.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

//containing just the primary key
@MappedSuperclass
@Data
public abstract class BaseEntity <I extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private I id;

    @Override
    public String toString(){
        return "BaseEntity{" + "id" + id + "}";
    }
}
