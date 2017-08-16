package tutor.java.mybatisexample.data;

import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {

    @Select("SELECT * FROM Customer WHERE id = #{id}")
    Customer selectCustomerById(long id);
    
    @Select("SELECT * FROM Customer")
    List<Customer> selectAllCustomer();
    
}
