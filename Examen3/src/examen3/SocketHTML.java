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
import java.util.HashMap;
import java.util.Map;
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
                    
        /*Lee una línea de texto. Una línea se considera terminada por cualquiera de un salto de
        línea ('\ n'), un retorno de carro ('\ r'), un retorno de carro seguido inmediatamente por 
        un salto de línea, o al alcanzar el final del archivo (EOF).
        Devoluciones:
        Una cadena que contiene el contenido de la línea, sin incluir los caracteres de terminación
        de línea, o nula si se ha llegado al final de l*/
        boolean submit = linea_archivo.startsWith("POST");
        /*Comprueba si esta cadena comienza con el prefijo especificado*/
        if(submit)
        {
            System.out.println("get form data:");
            System.out.println();
            int contentLength = 0;

            while(!(linea_archivo = input.readLine()).equals(""))
            {
                if(linea_archivo.startsWith("Content-Length:"))
                {
                    contentLength = Integer.parseInt(linea_archivo.substring("Content-Length: ".length()));
                    /*1-Analiza el argumento de cadena como un entero decimal firmado. Todos los
                    caracteres de la cadena deben ser dígitos decimales, excepto que el primer 
                    carácter puede ser un signo menos ASCII '-' ('\ u002D') para indicar un valor
                    negativo o un signo más ASCII '+' ('\ u002B') para indicar un valor positivo.
                    El valor entero resultante se devuelve, exactamente como si el argumento y la
                    base 10 se dieran como argumentos al método parseInt (java.lang.String, int).*/
                    
                    /*2-Devuelve una cadena que es una subcadena de esta cadena. La subcadena comienza
                    con el carácter en el índice especificado y se extiende hasta el final de esta cadena.
                     Ejemplos:

                    "infeliz" .substring (2) devuelve "happy"
                    "Harbison" .substring (3) devuelve "bison"
                    "vacío" .substring (9) devuelve "" (una cadena vacía)*/
                }
            }

            StringBuilder requestBody = new StringBuilder();
            /*Construye un generador de cadenas sin caracteres y una capacidad inicial de 16 caracteres.*/
            String[] params;
            HashMap<String, String> $_POST = new HashMap();
            /*HashMap<K,​V>
            K - el tipo de teclas mantenidas por este mapa
            V - el tipo de valores mapeados
            Construye un HashMap vacío con la capacidad inicial predeterminada 
            (16) y el factor de carga predeterminado (0.75).
            */

            if (submit) {
                for (int i = 0; i < contentLength; i++) {
                    requestBody.append((char) input.read());
                    /*1-Anexa la representación de cadena del argumento char a esta secuencia.
                    El argumento se adjunta al contenido de esta secuencia. La longitud de esta 
                    secuencia aumenta en 1.
                    El efecto general es exactamente como si el argumento se convirtiera en una
                    cadena con el método String.valueOf (char), y el carácter de esa cadena se 
                    agregara a esta secuencia de caracteres.*/
                }

                params = requestBody.toString().split("&");
                /*Divide esta cadena alrededor de coincidencias de la expresión regular dada.
                Este método funciona como si invocara el método de división de dos argumentos
                con la expresión dada y un argumento límite de cero. Por lo tanto, las cadenas
                vacías finales no se incluyen en la matriz resultante.*/

                for(int i = 0; i < params.length; i++) {
                    String[] param = params[i].split("=");
                    $_POST.put(param[0], param[1]);
                    /*Asocia el valor especificado con la clave especificada en este mapa.
                    Si el mapa contenía previamente una asignación para la clave, se reemplaza 
                    el valor anterior.
                    Devoluciones:
                    el valor anterior asociado con la clave, o nulo si no había asignación para
                    la clave. (Un retorno nulo también puede indicar que el mapa asociado 
                    previamente a nulo con clave).*/
                }

                for(Map.Entry<String, String> in : $_POST.entrySet())
                    /*Devuelve una vista de conjunto de las asignaciones contenidas en este mapa. 
                    El conjunto está respaldado por el mapa, por lo que los cambios en el mapa se 
                    reflejan en el conjunto y viceversa. Si el mapa se modifica mientras una iteración
                    sobre el conjunto está en curso (excepto a través de la propia operación de eliminación
                    del iterador, o a través de la operación setValue en una entrada de mapa devuelta 
                    por el iterador) los resultados de la iteración no están definidos. El conjunto 
                    admite la eliminación de elementos, que elimina la asignación correspondiente 
                    del mapa, a través de las operaciones Iterator.remove, Set.remove, removeAll,
                    retainAll y clear. No soporta las operaciones add o addAll.*/
                {
                    System.out.printf("$_POST[%s] = '%s'\n", in.getKey(), in.getValue());
                    /*1-Devuelve la clave correspondiente a esta entrada.*/
                    /*2-Devuelve el valor correspondiente a esta entrada. Si la asignación
                    se ha eliminado de la asignación de respaldo (por la operación de eliminación
                    del iterador), los resultados de esta llamada no están definidos.*/
                }
            }
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
