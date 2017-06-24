package carmelo.spring.validator;

import carmelo.spring.model.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {

        Person person = (Person) obj;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "person.nombre", "El nombre no puede estar vacio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellido", "person.apellido", "El apellido no puede estar vacio.");

        String correo = person.getCorreo();
        if (correo == null || !correo.endsWith("@mail.com.pa")) {
            errors.rejectValue("correo", "person.correo", "El correo no es valido, debe terminar en @mail.com.pa.");
        }

        Integer edad = person.getEdad();
        if (edad == null || edad < 0) {
            errors.rejectValue("edad", "person.edad", "Debes indicar la edad y no puede ser negativa.");
        }

        String nacionalidad = person.getNacionalidad();
        if (nacionalidad == null || nacionalidad.equals("...")) {
            errors.rejectValue("nacionalidad", "person.nacionalidad", "Indica tu pais de nacimiento o recidencia.");
        }
    }
}
