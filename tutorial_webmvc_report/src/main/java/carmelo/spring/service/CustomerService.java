package carmelo.spring.service;

import carmelo.spring.model.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
}
