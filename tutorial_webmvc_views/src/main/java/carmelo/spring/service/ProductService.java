package carmelo.spring.service;

import carmelo.spring.model.Product;

public interface ProductService {

    Iterable<Product> productList();

    void productDelete(Long id);
    
    void productAdd(Product product);
    
    Long productCount();
}
