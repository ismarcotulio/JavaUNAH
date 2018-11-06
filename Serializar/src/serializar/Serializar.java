/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

     import java.io.FileNotFoundException;
     import java.io.FileOutputStream;
     import java.io.IOException;
    import java.io.InputStream;
import java.io.ObjectInputStream;
     import java.io.ObjectOutputStream;
     import java.util.logging.Level;
     import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class Serializar {

  
    public static void main(String[] args) {
       try{
           ObjectOutputStream objeto_a_escribir = new ObjectOutputStream(new FileOutputStream("Archivo.bin"));
           objeto_a_escribir.writeObject(new Alumno(1234,"Ingenieria Mecanica",2018,99.87f));
           objeto_a_escribir.close();
           
           ObjectInputStream objeto_a_leer = new ObjectInputStream(new FileInputStream("Archivo.bin"));
           Alumno mi_alumno = (Alumno)objeto_a_leer.readObject();
           objeto_a_leer.close();
           
           System.out.println("mi_alumno");
           
       }catch(FileNotFoundException ex){
           System.out.println("Error en la apertura del archivo");
       }catch(IOException ex){
           System.out.println("Error entrada/salida");
       }catch(ClassNotFoundException ex){
           System.out.println("La clase alumno no esta definida");
       }
    }
    private static InputStream FileInputStream(String archivobin){
        throw new UnsupportedOperationException("not supported yet");
    }
}
/*Escribir 5 objetos con un Scanner*/


