package carmelo.spring.introduccion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan
public class SpringConfiguration {
    
    @Bean("saludaService")
//    @Scope("prototype")
    public HelloService getSaludaService(){
        return new HelloServiceImpl();
    }
}
