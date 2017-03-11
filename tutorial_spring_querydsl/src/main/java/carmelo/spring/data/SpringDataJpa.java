package carmelo.spring.data;

import carmelo.spring.data.model.QProduct;
import carmelo.spring.data.repository.ProductRepository;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.sql.SQLException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringDataJpa {

    public static void main(String[] args) throws SQLException {

        AbstractApplicationContext ctx
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        ProductRepository pr = ctx.getBean(ProductRepository.class);

        QProduct qp = QProduct.product;

        BooleanExpression precio = qp.price.gt(100.0);
        BooleanExpression helado = qp.name.contains("Ice");

        Predicate helados_caros = helado.and(precio);

        pr.findAll(helados_caros).forEach(System.out::println);

//        pr.findAll(qp.isNotNull(), qp.price.asc())
//                .forEach(System.out::println);
//        
//        long count = pr.count(qp.price.between(50.0, 220.0));
//        System.out.println("count: " + count);
        
        ctx.close();
    }
}
