package carmelo.spring.introduccion;

public class HelloServiceImpl implements HelloService {

    private String msg;

    public HelloServiceImpl(String msg) {
        this.msg = msg;
    }

    @Override
    public void saludar() {
        System.out.println("\n--- " + msg + " ---\n");
    }
}
