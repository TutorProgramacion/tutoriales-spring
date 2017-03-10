package carmelo.spring.data.repository;

import java.util.List;
import carmelo.spring.data.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
    @Query("select p from Product p where p.price > :precio")
    List<Product> findByPriceGreaterThan(@Param("precio") Double price);
    
}
