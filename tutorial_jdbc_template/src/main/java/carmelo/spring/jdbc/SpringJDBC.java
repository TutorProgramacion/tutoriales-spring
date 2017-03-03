package carmelo.spring.jdbc;

import java.sql.SQLException;
import carmelo.spring.jdbc.dao.ProductDao;
import carmelo.spring.jdbc.model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringJDBC {

    public static void main(String[] args) throws SQLException {

        AbstractApplicationContext ctx 
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        ProductDao product = ctx.getBean(ProductDao.class);

        System.out.println("Cantidad de productos: " + product.cantidad());
        System.out.println("Producto con ID = 25: " + product.buscar(25));

        // crear un nuevo producto
        Product p0 = new Product(111, "Computer", 800.25);

        // insertar nuevo producto
        product.insertar(p0);

        // bucar el producto con ID = 35
        Product p1 = product.buscar(35);
        p1.setName("Server Computer");
        p1.setPrice(1001.25);

        // actualizar el producto con ID = 35
        product.actualizar(p1);

        // listar todos los productos
        product.todos().forEach(System.out::println);

        // eliminar el producto con ID = 111
        product.eliminar(p0.getId());

        ctx.close();
    }
}
