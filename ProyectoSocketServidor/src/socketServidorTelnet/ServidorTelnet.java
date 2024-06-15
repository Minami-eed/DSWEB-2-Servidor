package socketServidorTelnet;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTelnet {
	// declaramos los objetos
	ServerSocket server;
	Socket socket;
	int puerto = 9001;
	DataOutputStream salida;
	BufferedReader entrada;

	// creamos un metodo de nombre iniciar...
	public void iniciar() {
		System.out.println("esperando conexión desde un cliente"); // emitimos
																	// un
																	// mensaje

		try {
			server = new ServerSocket(puerto);
			socket = new Socket();

			socket = server.accept();

			entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String mensaje = entrada.readLine();
			String resp = "";

			switch (mensaje) {
				case "enero":
					resp = "january";
					break;

				case "febrero":
					resp = "february";
					break;

				case "marzo":
					resp = "march";
					break;

				default:
					resp = "no se encuentra dentro del rango";
					break;

			}

			System.out.println("mensaje del cliente " + mensaje);

			salida = new DataOutputStream(socket.getOutputStream());
			salida.writeUTF("el servidor contesta al cliente  la traduccion es " + resp);

			// cerramos
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
