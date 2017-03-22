package carmelo.spring.repository;

import java.util.List;
import carmelo.spring.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByPriceGreaterThan(Double price);

}
