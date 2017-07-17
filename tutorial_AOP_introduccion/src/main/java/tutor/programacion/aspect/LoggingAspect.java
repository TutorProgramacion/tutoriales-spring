package tutor.programacion.aspect;

import java.time.LocalDateTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* tutor.programacion.component.*.*(..))")
    public void serviceMethod() { }

    @Before("serviceMethod()")
    public void beforeLoginAdvice(JoinPoint jp) {
        System.out.println("\n" + jp.toLongString());
        System.out.println("iniciado " + LocalDateTime.now());
    }

    @After("serviceMethod()")
    public void afterLoginAdvice() {
        System.out.println("finalizado " + LocalDateTime.now());
    }
    
}
