package carmelo.spring.introduccion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service(value="saludaService")
//@Scope("prototype")
public class HelloServiceImpl implements HelloService/*, InitializingBean, DisposableBean*/ {

    @Override
    public void saludar() {
        System.out.println("--- Hello Spring Framework ---");
    }

    @PostConstruct
    public void initHello() {
        System.out.println("--- run init method ---");
    }

    @PreDestroy
    public void destroyHello() {
        System.out.println("--- run destroy method ---");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("--- run init method ---");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("--- run destroy method ---");
//    }
}
