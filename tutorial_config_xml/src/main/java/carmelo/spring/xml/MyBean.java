package carmelo.spring.xml;

public class MyBean {

    public MyBean() {
    }

    public MyBean(Integer valor, String mensaje) {
        this.valor = valor;
        this.mensaje = mensaje;
    }

    private Integer valor;
    private String mensaje;

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "MyBean{" + "valor=" + valor + ", mensaje=" + mensaje + '}';
    }

}
