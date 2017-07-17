package tutor.programacion.component;

import org.springframework.stereotype.Component;

@Component
public class CrudService {

    public void create() {
        System.out.println("crear dato...");
    }

    public void read() {
        System.out.println("leer dato...");
    }

    public void update() {
        try {
            Thread.sleep(377);
            System.out.println("actualizar dato...");
        } catch (InterruptedException ex) {

        }
    }

    public void delete() {
        System.out.println("eliminar dato...");
    }
}
