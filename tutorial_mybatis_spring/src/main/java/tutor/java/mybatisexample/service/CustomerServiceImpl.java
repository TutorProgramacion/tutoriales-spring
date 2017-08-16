package tutor.java.mybatisexample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutor.java.mybatisexample.data.Customer;
import tutor.java.mybatisexample.data.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper mapper;

    @Override
    public List<Customer> findAll() {
        return mapper.selectAllCustomer();
    }

    @Override
    public Customer findOne(Long id) {
        return mapper.selectCustomerById(id);
    }
}
