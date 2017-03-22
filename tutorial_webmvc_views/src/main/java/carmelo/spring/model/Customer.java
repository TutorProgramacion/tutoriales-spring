package carmelo.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {

    @Id private Long id;
    
    private String firstName;
    private String lastName;
    private String street;
    private String city;
}
