package carmelo.spring.service;

import carmelo.spring.model.Product;
import carmelo.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository product;

    @Override
    public Iterable<Product> productList() {
        return product.findAll();
    }

    @Override
    public void productDelete(Long id) {
        this.product.delete(id);
    }

    @Override
    public void productAdd(Product product) {
        this.product.save(product);
    }

    @Override
    public Long productCount() {
        return this.product.count();
    }
}
