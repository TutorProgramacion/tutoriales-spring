package carmelo.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class SpringJavaConfig {

    @Bean
    public EmpleadoDao empleadoDao() {
        return new EmpleadoDaoImpl();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public EmpleadoService empleadoService() {
        return new EmpleadoServiceImpl();
    }
}
