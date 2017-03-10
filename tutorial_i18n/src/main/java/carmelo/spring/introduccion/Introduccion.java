package carmelo.spring.introduccion;

import carmelo.spring.introduccion.service.SaludaService;
import java.util.Locale;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Introduccion {

    public static void main(String[] args) {

        AbstractApplicationContext ctx 
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        String msg_en = ctx.getMessage("title", null, Locale.ENGLISH);
        String msg_es = ctx.getMessage("title", null, new Locale("es"));
        
        System.out.println("English: " + msg_en);
        System.out.println("Español: " + msg_es);
        
        SaludaService ss = ctx.getBean(SaludaService.class);
        ss.saluda("carmelo", "marin");
        
        ctx.close();      
    }
}
