package carmelo.spring.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfig {

    public static void main(String[] args) {
        try(AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml")){ 

            //MyBean bean = ctx.getBean("mybean", MyBean.class);
            
            OtherBean other = ctx.getBean("otherbean", OtherBean.class);
            MyBean bean = other.getMyBean();
            
            System.out.println("--> " + bean.getValor() + " - " + bean.getMensaje() + " <--");
            
            ListBean list = ctx.getBean("listbean", ListBean.class);
            list.getBeanItems().forEach(System.out::println);
        }
    }
}
