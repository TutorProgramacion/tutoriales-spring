package carmelo.spring.introduccion.service;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class SaludaServiceImpl implements SaludaService {

    @Autowired
    private MessageSource ms;

    @Override
    public void saluda(String name, String lastname) {
        System.out.println(
                ms.getMessage("saluda",
                        new Object[]{name, lastname},
                        Locale.ENGLISH));
    }

}
