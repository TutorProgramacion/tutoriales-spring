package carmelo.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    
    public interface TestView {};
    public interface FullNameView { };
    public interface FullNameAndDirectionView extends FullNameView { };
    
    private Long id;
    
    @JsonView(value = {FullNameView.class, TestView.class})
    private String firstName;
    
    @JsonView(FullNameView.class)
    private String lastName;
    
    @JsonView(FullNameAndDirectionView.class)
    private String street;
    
    @JsonView(TestView.class)
    private String city;
}
