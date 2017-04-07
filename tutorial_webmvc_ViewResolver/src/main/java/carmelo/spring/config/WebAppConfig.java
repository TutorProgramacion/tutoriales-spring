package carmelo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"carmelo.spring.controller"})
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
        registry.order(9);
    }
    
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(2);
        return resolver;
    }
    
    @Bean
    public ViewResolver xmlViewResolver() {
        XmlViewResolver resolver = new XmlViewResolver();
        resolver.setOrder(1);
        return resolver;
    }
//    
//    @Bean
//    public ViewResolver rbViewResolver() {
//        ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
//        resolver.setBasename("myviews");
//        return resolver;
//    }   
//    
//    @Bean
//    public ViewResolver viewResolver() {
//        return new BeanNameViewResolver();
//    }
//
//    @Bean(name = "home")
//    public View homex() {
//        JstlView view = new JstlView();
//        view.setUrl("/WEB-INF/views/home.jsp");
//        return view;
//    }
//    
}
