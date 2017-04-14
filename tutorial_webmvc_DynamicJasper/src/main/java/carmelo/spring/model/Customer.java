package carmelo.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private Integer ID;
    private String  FIRSTNAME;
    private String  LASTNAME;
    private String  STREET;
    private String  CITY;
}
