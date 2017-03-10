package carmelo.spring.data;

import carmelo.spring.data.model.Product;
import java.sql.SQLException;
import carmelo.spring.data.repository.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringDataJpa {

    public static void main(String[] args) throws SQLException {

        AbstractApplicationContext ctx
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);
      
        ProductRepository pr = ctx.getBean(ProductRepository.class);

        // crear un nuevo producto
        Product p0 = new Product();
        p0.setId(100L);
        p0.setName("Porotos");
        p0.setPrice(2.50);
        
        // agregar un nuevo producto
        pr.save(p0);
              
        // listar todos los productos
        pr.findAll().forEach(System.out::println);
        
        // productos con precio mayor a B/ 100.00
        System.out.println("--- PRODUCTOS CON SOBREPRECIO ---");
        pr.findByPriceGreaterThan(100.0).forEach(System.out::println);
          
        ctx.close();
    }
}
