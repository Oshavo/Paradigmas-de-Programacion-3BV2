package sockets.servidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import sockets.conexion.Conexion;

public class Servidor extends Conexion {
    public Servidor() throws IOException{super("servidor");}

    public void startServer() {
        try {
            System.out.println("Esperando...");
            cs = ss.accept(); 
            System.out.println("Cliente en linea");

            salidaCliente = new DataOutputStream(cs.getOutputStream());
            salidaCliente.writeUTF("Peticion recibida y aceptada");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            while((mensajeServidor = entrada.readLine()) != null) {
                System.out.println(mensajeServidor);
            }

            System.out.println("Fin de la conexion");
            ss.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
