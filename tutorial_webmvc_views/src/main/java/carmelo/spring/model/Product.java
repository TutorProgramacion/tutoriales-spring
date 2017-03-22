package carmelo.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

    @Id private Long id;
    private String name;
    private Double price;
}
