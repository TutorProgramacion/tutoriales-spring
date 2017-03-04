package carmelo.spring.introduccion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfiguration {

    @Value("${autor}")
    private String mensaje;

    @Value("${classpath:web/index.html}")
    private Resource page;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public HelloService saludaService() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(page.getFile()));
        String msg = br.lines().collect(Collectors.joining(System.lineSeparator()));

        return new HelloServiceImpl(msg);
    }
    
}
