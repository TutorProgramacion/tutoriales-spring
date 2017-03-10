package carmelo.spring.jpa.dao;

import carmelo.spring.jpa.model.Product;
import java.util.List;

public interface ProductDao {

    List<Product> todos();

    Integer cantidad();

    Product buscar(Integer id);
    
    void insertar(Product product);
    
    void actualizar(Product product);
    
    void eliminar(Integer id);
}
