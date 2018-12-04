/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;
   import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    import java.net.ServerSocket;
    import java.net.Socket;
    import java.util.Arrays;
    import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
    import java.util.Scanner;
public class SocketPrueba {
    public static void main(String args[]){
        try
{
    ServerSocket serverSocket = new ServerSocket(8001);

    while (true)
    {
        Socket clientSocket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        String line = in.readLine();
        boolean submit = line.startsWith("POST");

        if(submit)
        {
            System.out.println("get form data:");
            System.out.println();
            int contentLength = 0;

            while(!(line = in.readLine()).equals(""))
            {
                if(line.startsWith("Content-Length:"))
                {
                    contentLength = Integer.parseInt(line.substring("Content-Length: ".length()));
                }
            }

            StringBuilder requestBody = new StringBuilder();
            String[] params;
            HashMap<String, String> $_POST = new HashMap();

            if (submit) {
                for (int i = 0; i < contentLength; i++) {
                    requestBody.append((char) in.read());
                }

                params = requestBody.toString().split("&");

                for(int i = 0; i < params.length; i++) {
                    String[] param = params[i].split("=");
                    $_POST.put(param[0], param[1]);
                }

                for(Entry<String, String> input : $_POST.entrySet())
                {
                    System.out.printf("$_POST[%s] = '%s'\n", input.getKey(), input.getValue());
                }
            }
        }

        String htmlForm = "<html>"
            + "<head>"
            + "     <title>Entredesarrolladores form example</title>"
            + "</head>"
            + "     <body>"
            + "         <form method='POST'>"
            + "             <input type='text' name='test' value='anything'><input type='submit'>"
            + "         </form>"
            + "     </body>"
            + "</html>";

        out.write("HTTP/1.0 200 OK\r\n");
        out.write("Server: Java server\r\n");
        out.write("Content-Type: text/html\r\n");
        out.write("Content-Length: " + htmlForm.length()  + "\r\n");
        out.write("\r\n");
        out.write(htmlForm);

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
