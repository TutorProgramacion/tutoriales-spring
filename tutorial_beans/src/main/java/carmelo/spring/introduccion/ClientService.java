package carmelo.spring.introduccion;

public class ClientService {

    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    public static ClientService createInstance() {
        return clientService;
    }
}

