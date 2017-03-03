package carmelo.spring.jdbc;

import java.sql.SQLException;
import carmelo.spring.jdbc.dao.ProductDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringJDBC {

    public static void main(String[] args) throws SQLException {

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        ProductDao product = ctx.getBean(ProductDao.class); 
        product.todos().forEach(System.out::println);
        
        ctx.close();
    }
}
