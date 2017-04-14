package carmelo.spring.service;

import java.util.Arrays;
import java.util.List;
import carmelo.spring.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> findAll() {

        Customer customer1 = new Customer(1L, "Juan", "Uno", "Calle 274", "Veraguas");
        Customer customer2 = new Customer(2L, "Pedro", "Dos", "Calle 004", "Chiriqui");
        Customer customer3 = new Customer(3L, "Miguel", "Tres", "Calle 174", "Darien");
        Customer customer4 = new Customer(4L, "Daniel", "Cuatro", "Calle 284", "Colon");
        Customer customer5 = new Customer(5L, "Ramiro", "Cinco", "Calle 277", "Panama");

        return Arrays.asList(customer1, customer2, customer3, customer4, customer5);
    }

}
