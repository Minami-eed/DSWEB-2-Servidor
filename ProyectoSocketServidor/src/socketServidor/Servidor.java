package socketServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		try {
			ServerSocket servidor=new ServerSocket(4500);
			System.out.println("Servidor  a la escucha de la peticiones"); //emitimos un mensaje por consola
			
			Socket clienteservidor=servidor.accept(); //aceptamos la peticion externa
			ObjectInputStream recibir=new ObjectInputStream(clienteservidor.getInputStream());
			System.out.println("mensaje llegado con exito"); //imprimimos mensaje por pantalla
			
			String mensaje=(String) recibir.readObject(); //almacenamos el mensaje en variable de tipo de cadena
			System.out.println("mensaje desde el cliente "+mensaje); //imprimimos el mensaje del cliente por pantalla.
			
			ObjectOutputStream enviar=new ObjectOutputStream(clienteservidor.getOutputStream()); //salida desde el servidor
			enviar.writeObject("Hola Cliente la capital del PERU es LIMA");
			
			clienteservidor.close(); //cerramos
			servidor.close(); //cerramos el servidor
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
         catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	}
}
