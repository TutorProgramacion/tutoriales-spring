package carmelo.spring.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Carmelo Marin Abrego
 */
public class Autowiring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springXMLConfig.xml");

        for (String bean_name : ctx.getBeanDefinitionNames()) {
            System.out.println(":: " + bean_name);
        }

        EmpleadoService es = ctx.getBean("empleadoService", EmpleadoService.class);

        System.out.println("EDao: " + ((EmpleadoServiceImpl)es).getEmpleadoDao());

        ctx.close();
    }

}
