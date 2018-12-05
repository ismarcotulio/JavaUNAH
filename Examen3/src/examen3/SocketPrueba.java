/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;
   import java.io.BufferedReader;
    /*Lee el texto de un flujo de entrada de caracteres, y almacena en búfer 
    los caracteres para proporcionar una lectura eficiente de los caracteres,
    matrices y líneas*/
    import java.io.BufferedWriter;
    /*Escribe texto en una secuencia de salida de caracteres, almacenando en 
    búfer los caracteres para proporcionar la escritura eficiente de caracteres
    individuales, matrices y cadenas.*/
    import java.io.File;
    /*Una representación abstracta de las rutas de archivo y directorio.
    Las interfaces de usuario y los sistemas operativos utilizan cadenas
    de rutas de acceso dependientes del sistema para nombrar archivos y 
    directorios. Esta clase presenta una vista abstracta e independiente del
    sistema de las rutas jerárquicas. Una ruta abstracta tiene dos componentes:*/
    import java.io.FileNotFoundException;
    /*Indica que un intento de abrir el archivo denotado por un nombre de ruta especificado ha fallado.
    Esta excepción será lanzada por los constructores FileInputStream, FileOutputStream y RandomAccessFile
    cuando no exista un archivo con la ruta de acceso especificada. También será lanzado por estos
    constructores si el archivo existe pero por algún motivo es inaccesible, por ejemplo, cuando se 
    intenta abrir un archivo de solo lectura para escribir.*/
    import java.io.FileReader;
    /*Lee el texto de los archivos de caracteres utilizando un tamaño de búfer predeterminado.
    La decodificación de bytes a caracteres utiliza un conjunto de caracteres especificado o el
    conjunto de caracteres predeterminado de la plataforma.
    El FileReader está diseñado para leer flujos de caracteres. Para leer secuencias de bytes sin procesar,
    considere usar un FileInputStream.*/
    import java.io.IOException;
    /*Señala que se ha producido una excepción de E / S de algún tipo. Esta clase es la clase general de 
    excepciones producidas por operaciones de E / S fallidas o interrumpidas.*/
    import java.io.InputStreamReader;
    /*Un InputStreamReader es un puente de flujos de bytes a flujos de caracteres: lee bytes y los 
    decodifica en caracteres usando un juego de caracteres específico. El conjunto de caracteres
    que utiliza puede especificarse por su nombre o puede darse explícitamente, o puede aceptarse
    el conjunto de caracteres predeterminado de la plataforma.
    Cada invocación de uno de los métodos de lectura () de un InputStreamReader puede hacer 
    que se lean uno o más bytes del flujo de entrada de bytes subyacente. Para habilitar 
    la conversión eficiente de bytes a caracteres, se pueden leer más bytes del flujo subyacente
    que los necesarios para satisfacer la operación de lectura actual.
    Para una mayor eficiencia, considere envolver un InputStreamReader dentro de un BufferedReader*/
    import java.io.OutputStreamWriter;
    /*Un OutputStreamWriter es un puente de flujos de caracteres a flujos de bytes: los caracteres
    escritos en él se codifican en bytes utilizando un conjunto de caracteres específico. El conjunto
    de caracteres que utiliza puede especificarse por su nombre o puede darse explícitamente, o puede
    aceptarse el conjunto de caracteres predeterminado de la plataforma.
    Cada invocación de un método write () hace que el convertidor de codificación se invoque en los
    caracteres dados. Los bytes resultantes se acumulan en un búfer antes de escribirse en el flujo
    de salida subyacente. Tenga en cuenta que los caracteres pasados ​​a los métodos write () no 
    están en búfer.
    Para mayor eficiencia, considere envolver un OutputStreamWriter dentro de un BufferedWriter
    para evitar invocaciones frecuentes de convertidores*/
    import java.io.PrintWriter;
    /*Imprime representaciones formateadas de objetos en un flujo de salida de texto. Esta 
    clase implementa todos los métodos de impresión encontrados en PrintStream. No contiene
    métodos para escribir bytes sin procesar, para los cuales un programa debe usar flujos de
    bytes no codificados.*/
    import java.net.ServerSocket;
    /*Esta clase implementa sockets de servidor. Un socket de servidor espera que las solicitudes
    ingresen a través de la red. Realiza alguna operación basada en esa solicitud, y luego,
    posiblemente, devuelve un resultado al solicitante.*/
    import java.net.Socket;
    /*Esta clase implementa sockets de cliente (también llamados simplemente "sockets").
    Un zócalo es un punto final para la comunicación entre dos máquinas.*/
    import java.util.Arrays;
    /*Esta clase contiene varios métodos para manipular matrices (como ordenar y buscar).
    Esta clase también contiene una fábrica estática que permite que las matrices se vean como listas.*/
    import java.util.Date;
    import java.util.HashMap;
    /*Implementación basada en tabla hash de la interfaz del mapa. Esta implementación proporciona
    todas las operaciones de mapas opcionales y permite valores nulos y la clave nula. (La clase HashMap
    es aproximadamente equivalente a Hashtable, excepto que no está sincronizada y permite nulos).
    Esta clase no ofrece ninguna garantía en cuanto al orden del mapa; en particular, no garantiza
    que el pedido se mantendrá constante en el tiempo.
    Esta implementación proporciona un rendimiento de tiempo constante para las operaciones básicas
    (obtener y poner), asumiendo que la función de dispersión (hash) dispersa los elementos 
    correctamente entre los grupos. La iteración sobre las vistas de colección requiere un tiempo
    proporcional a la "capacidad" de la instancia de HashMap (el número de depósitos) más su tamaño 
    (el número de asignaciones de clave-valor). Por lo tanto, es muy importante no establecer la 
    capacidad inicial demasiado alta (o el factor de carga demasiado bajo) si el rendimiento de
    la iteración es importante.
    Una instancia de HashMap tiene dos parámetros que afectan su rendimiento: capacidad inicial
    y factor de carga. La capacidad es el número de depósitos en la tabla hash, y la capacidad 
    inicial es simplemente la capacidad en el momento en que se crea la tabla hash. El factor de 
    carga es una medida de qué tan llena está permitida la tabla hash antes de que su capacidad 
    se incremente automáticamente. Cuando el número de entradas en la tabla hash excede el producto
    del factor de carga y la capacidad actual, la tabla hash se vuelve a lavar (es decir, se 
    reconstruyen las estructuras de datos internas) para que la tabla hash tenga aproximadamente
    el doble de cubetas.*/
    import java.util.Map.Entry;
    /*Una entrada de mapa (par clave-valor). El método Map.entrySet devuelve una vista de 
    colección del mapa, cuyos elementos son de esta clase. La única forma de obtener una referencia
    a una entrada de mapa es desde el iterador de esta vista de colección. Estos objetos Map.Entry 
    son válidos solo por la duración de la iteración; de manera más formal, el comportamiento de una
    entrada de mapa no está definido si el mapa de respaldo se ha modificado después de que el iterador 
    haya devuelto la entrada, excepto a través de la operación setValue en la entrada de mapa.*/
    import java.util.Scanner;
public class SocketPrueba {
    public static void main(String args[]) throws IOException{
        try
{
    ServerSocket serverSocket = new ServerSocket(8001);
    /*Crea un socket de servidor, enlazado al puerto especificado. Un número de puerto de 0
    significa que el número de puerto se asigna automáticamente, generalmente desde un rango
    de puertos efímeros. Este número de puerto se puede recuperar llamando a getLocalPort*/
    PrintWriter out2 = null;
    while (true)
    {
        Socket clientSocket = serverSocket.accept();
        /*Escucha una conexión a este socket y la acepta. 
        El método bloquea hasta que se realiza una conexión.*/
        Scanner entrada = null;

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedReader in2
                            = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        /*1-Crea una secuencia de entrada de caracteres de búfer que utiliza un búfer de entrada
        de tamaño predeterminado*/
        /*2-Crea un InputStreamReader que usa el conjunto de caracteres predeterminado.*/
        /*3-Devuelve un flujo de entrada para este socket.*/
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        out2 = new PrintWriter(clientSocket.getOutputStream(), true);
        /*1-Crea una secuencia de salida de caracteres en búfer que utiliza un búfer de 
        salida de tamaño predeterminado*/
        /*2-Crea un OutputStreamWriter que utiliza la codificación de caracteres predeterminada.*/
        /*3-Devuelve un flujo de salida para este socket.*/
        String line = in.readLine();
        /*Lee una línea de texto. Una línea se considera terminada por cualquiera de un salto de
        línea ('\ n'), un retorno de carro ('\ r'), un retorno de carro seguido inmediatamente por 
        un salto de línea, o al alcanzar el final del archivo (EOF).
        Devoluciones:
        Una cadena que contiene el contenido de la línea, sin incluir los caracteres de terminación
        de línea, o nula si se ha llegado al final de l*/
        String linea_archivo = in.readLine();
                    System.out.println(linea_archivo);
                    String archivo = linea_archivo.substring(linea_archivo.indexOf('/') + 1, linea_archivo.indexOf(' ', 4));
                    System.out.println(archivo);
                    while (in.ready()) {
                        System.err.println(in.readLine());
                    }
                    out2.write("HTTP/1.1 200 OK\r\n");
                    out2.write("Content-Type: text/html\r\n");

                    entrada = new Scanner(new FileReader(archivo));

                    while (entrada.hasNext()) {
                        out2.println(entrada.nextLine());
                    }
        boolean submit = linea_archivo.startsWith("POST");
        /*Comprueba si esta cadena comienza con el prefijo especificado*/
        if(submit)
        {
            System.out.println("get form data:");
            System.out.println();
            int contentLength = 0;

            while(!(linea_archivo = in.readLine()).equals(""))
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
                    requestBody.append((char) in.read());
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

                for(Entry<String, String> input : $_POST.entrySet())
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
                    System.out.printf("$_POST[%s] = '%s'\n", input.getKey(), input.getValue());
                    /*1-Devuelve la clave correspondiente a esta entrada.*/
                    /*2-Devuelve el valor correspondiente a esta entrada. Si la asignación
                    se ha eliminado de la asignación de respaldo (por la operación de eliminación
                    del iterador), los resultados de esta llamada no están definidos.*/
                }
            }
        }
        
       
                    

        out.flush();
        out.close();
        clientSocket.close();
    }
}
catch (IOException e)
{
    e.printStackTrace();
}
    }
}
