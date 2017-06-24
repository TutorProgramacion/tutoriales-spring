package carmelo.spring.model;

public class Person {

    private String nombre;
    private String apellido;
    private String correo;
    private String nacionalidad;
    private Integer edad;

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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", nacionalidad=" + nacionalidad + ", edad=" + edad + '}';
    }
    
}
