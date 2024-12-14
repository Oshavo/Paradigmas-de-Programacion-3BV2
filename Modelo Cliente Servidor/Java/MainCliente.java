package sockets.main;

import java.io.IOException;
import sockets.cliente.Cliente;

public class MainCliente {
    public static void main(String[] args) throws IOException {
        Cliente cli = new Cliente();

        System.out.println("Iniciando cliente\n");
        cli.startClient();
    }
}