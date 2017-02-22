package carmelo.spring.introduccion;

public class HelloServiceImpl implements HelloService {

    @Override
    public void saludar() {
        System.out.println("\n--- Hello Spring Framework ---\n");
    }
}
