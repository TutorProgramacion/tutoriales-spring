package carmelo.spring.jdbc.dao;

import carmelo.spring.jdbc.model.Product;
import java.util.List;

public interface ProductDao {

    List<Product> todos();

    Integer cantidad();

    Product buscar(Integer id);
    
    void insertar(Product product);
    
    void actualizar(Product product);
    
    void eliminar(Integer id);
}
