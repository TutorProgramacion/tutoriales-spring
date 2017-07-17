
package tutor.programacion.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tutor.programacion.component.CrudService;

@Configuration
@ComponentScan({"tutor.programacion.aspect", "tutor.programacion.component"})
@EnableAspectJAutoProxy
public class TutorialAOP {
    
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TutorialAOP.class);
        
        CrudService ps = ctx.getBean(CrudService.class);
        
        ps.create();
        ps.read();
        ps.update();
        ps.delete();
    }
}
