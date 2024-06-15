package dataXml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ClaseLeerXml {
    @SuppressWarnings("unused")
    public void LeerXML() {
        // aplicamos jaxb...
        try {
            JAXBContext leerxml = JAXBContext.newInstance(ClaseTipoCliente.class);

            // aplicamos una clase que nos permite leer el archivo xml
            // y vinculamos una clase que nos permite leer el archivo xml
            Unmarshaller leer = leerxml.createUnmarshaller();

            // aplicamos una clase file para ubicar el archivo que se va a dar lectura
            File leerarchivoxml = new File("src/dataXml/xmlFile/cliente2025.xml");

            // creamos un objeto de tipo clasetipocliente..
            // ClassTipoCliente
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
