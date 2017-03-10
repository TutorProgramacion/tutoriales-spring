package carmelo.spring.data.repository;

import carmelo.spring.data.model.Product;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends
        CrudRepository<Product, Long>,
        QueryDslPredicateExecutor<Product> {

}
