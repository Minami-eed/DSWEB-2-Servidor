package dataXml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TestJaxb {
    public static void main(String[] args) {
        // instaríamos las respectivas clase...
        List<ClaseCliente> list = new ArrayList<ClaseCliente>();
        ClaseCliente cliente = new ClaseCliente();

        // agregamos la data cliente
        cliente.setIdcliente(100);
        cliente.setNombre("rosa maria");
        cliente.setApellido("Gomez Sanchez");
        cliente.setDni("13454589");
        cliente.setSexo("f");
        cliente.setTelefono("38147958");

        // agregamos al listado
        list.add(cliente);
        ClaseCliente clientedos = new ClaseCliente();
        clientedos.setIdcliente(200);
        clientedos.setNombre("flor de liz");
        clientedos.setApellido("rivera");
        clientedos.setDni("10352239");
        clientedos.setSexo("f");
        clientedos.setTelefono("3814687");

        // agregamos al listado
        list.add(clientedos);
        ClaseCliente clientetres = new ClaseCliente();
        clientetres.setIdcliente(300);
        clientetres.setNombre("nilson alexander");
        clientetres.setApellido("gomez zapata");
        clientetres.setDni("405646698");
        clientetres.setSexo("M");
        clientetres.setTelefono("38146984");

        // agregamos al listado
        list.add(clientetres);

        // instancias la clase tipo cliente
        ClaseTipoCliente cltipo = new ClaseTipoCliente();

        // asignamos el listado
        cltipo.setCliente(list);

        // aplicamos JAXB
        try {
            JAXBContext con = JAXBContext.newInstance(ClaseTipoCliente.class);

            // aplicamos la clase marshalling
            // vinculamos marshaller con jaxcont...
            Marshaller mar = con.createMarshaller();

            // preparamos el formato para el archivo xml
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // aplicamos la clase file
            File archivoxml = new File("src/dataXml/xmlFile/cliente2025.xml");
            mar.marshal(cltipo, archivoxml);

            // emitimos un mensaje por consola
            System.out.println("archivo convertido");
        } catch (JAXBException e) {
            e.printStackTrace();

        }
    }
}
