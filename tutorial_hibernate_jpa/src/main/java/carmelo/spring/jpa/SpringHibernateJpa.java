package carmelo.spring.jpa;

import java.sql.SQLException;
import carmelo.spring.jpa.dao.ProductDao;
import carmelo.spring.jpa.model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringHibernateJpa {

    public static void main(String[] args) throws SQLException {

        AbstractApplicationContext ctx
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        // obtener bean DAO
        ProductDao product = ctx.getBean("productDaoJpa", ProductDao.class);

        // contar los productos
        System.out.println("Cantidad de productos: " + product.cantidad());
        
        // buscar el producto con ID = 5
        Product p_5 = product.buscar(5);
        System.out.println("ID = 5: " + p_5);

        // insertar nuevo producto
        product.insertar(new Product(11, "Computer", 800.25));

        // eliminar el producto con ID = 5
        product.eliminar(p_5.getId());
        
        // actualizar precio de un producto
        Product p_3 = product.buscar(3);
        p_3.setPrice(1111.0);
        product.actualizar(p_3);
        
        // listar todos los productos
        product.todos().forEach(System.out::println);

        
        ctx.close();
    }
}
