package dataXml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClaseTipoCliente {
    // declaramos los atributos
    private int idtipocliente;
    private String nombre;

    // declaramos un variable de tipo cliente
    private List<ClaseCliente> cliente;

    public ClaseTipoCliente() {

    }

    // getters y setters...
    @XmlElement(name = "cliente")
    public int getIdtipocliente() {
        return idtipocliente;
    }

    public void setIdtipocliente(int idtipocliente) {
        this.idtipocliente = idtipocliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ClaseCliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<ClaseCliente> cliente) {
        this.cliente = cliente;
    }
}
