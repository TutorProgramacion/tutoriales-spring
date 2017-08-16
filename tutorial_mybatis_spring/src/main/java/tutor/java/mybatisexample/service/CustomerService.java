package tutor.java.mybatisexample.service;

import java.util.List;
import tutor.java.mybatisexample.data.Customer;

public interface CustomerService {

    List<Customer> findAll();

    Customer findOne(Long id);
}
