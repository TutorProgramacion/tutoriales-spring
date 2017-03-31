package carmelo.spring.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Usuario {

    @Size(min = 3, max = 20, message = "El nombre debe tener mas de 3 letras y menos de 20.")
    private String nombre;

    @NotBlank(message = "Debe indicar el apellido del usuario.")
    private String apellido;

    @Email
    @NotBlank
    private String correo;

    @Pattern(regexp = "^[a-zA-Z]\\w{3,14}$", message = "Debe contener numeros seguidos de letras")
    private String password;

    @Min(value = 18, message = "El usuario debe tener 18+")
    @NotNull
    private Integer edad;

    @NotNull
    private Boolean sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

}
