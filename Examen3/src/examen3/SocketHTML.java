package examen3;
    import java.io.BufferedReader;
import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.PrintWriter;
    import java.net.ServerSocket;
    import java.net.Socket;
    import java.util.Arrays;
    import java.util.Date;
    import java.util.Scanner;
public class SocketHTML {

    public static void main(String[] args) throws IOException {
         System.out.println("Inicializando Servidor de Tiempo");
        ServerSocket listener = new ServerSocket(9090);
        PrintWriter out = null;
        try {
            while (true) {
                System.out.println("Servidor esperando Conexion de Cliente........");
                Socket socket = listener.accept();
                System.out.println("Connexion Acceptada.....");
                Scanner entrada = null;
                try {
                    // System.out.println("Enviado paquete Con Fecha y Hora....");
                    out = new PrintWriter(socket.getOutputStream(), true);
                    //out.println(new Date().toString());

                    BufferedReader input
                            = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String linea_archivo = input.readLine();
                    System.out.println(linea_archivo);
                    String archivo = linea_archivo.substring(linea_archivo.indexOf('/') + 1, linea_archivo.indexOf(' ', 4));
                    System.out.println(archivo);
                    while (input.ready()) {
                        System.err.println(input.readLine());
                    }
                    out.write("HTTP/1.1 200 OK\r\n");
                    out.write("Content-Type: text/html\r\n");

                    entrada = new Scanner(new FileReader(archivo));

                    while (entrada.hasNext()) {
                        out.println(entrada.nextLine());
                    }
                } catch (FileNotFoundException e) {
                  File archivo = new File("error404.html");
                    out.write("HTTP/1.1 200 OK\r\n");
                    out.write("Content-Type: text/html\r\n");

                    entrada = new Scanner(new FileReader(archivo));

                    while (entrada.hasNext()) {
                        out.println(entrada.nextLine());
                    }
                } finally {
                    //entrada.close();
                    socket.close();
                    System.out.println("Connexion con servidor terminada.....");
                }
            }

        } finally {
            listener.close();
        }
    }
    
}
