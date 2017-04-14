package carmelo.spring;

import carmelo.spring.controller.HomeController;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"carmelo.spring.controller"})
public class WebAppConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public HandlerMapping handlerMapping() {
        Properties urlMaps = new Properties();
        urlMaps.put("/index.html", "homeController");

        SimpleUrlHandlerMapping handler = new SimpleUrlHandlerMapping();
        handler.setMappings(urlMaps);

        return handler;
    }

    @Bean
    public HomeController homeController() {
        return new HomeController();
    }
}
