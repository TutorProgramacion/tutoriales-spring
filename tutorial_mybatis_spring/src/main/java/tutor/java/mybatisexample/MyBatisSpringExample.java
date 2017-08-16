package tutor.java.mybatisexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tutor.java.mybatisexample.data.CustomerMapper;
import tutor.java.mybatisexample.service.CustomerService;

public class MyBatisSpringExample {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);

//        CustomerMapper cm = ctx.getBean(CustomerMapper.class);
//        cm.selectAllCustomer().forEach(System.out::println);

        ctx.scan("tutor.java.mybatisexample.service");
        
        CustomerService cs = ctx.getBean(CustomerService.class);
        cs.findAll().forEach(System.out::println);
    }
}
