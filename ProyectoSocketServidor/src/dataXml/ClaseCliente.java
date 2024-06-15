package dataXml;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "idcliente", "nombre", "apellido", "dni", "sexo", "telefono" })
public class ClaseCliente {
    // declaramos sus atributos
    private int idcliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String sexo;
    private String telefono;

    // constructores
    public ClaseCliente() {

    }

    public ClaseCliente(int idcliente, String nombre, String apellido, String dni, String sexo, String telefono) {
        // super();
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    // getters y setters.
    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
