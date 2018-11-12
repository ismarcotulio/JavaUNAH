import java.util.Scanner;

public class LecturaTeclado{
	public static void main(String []args){
	String lectura;
	Scanner lector = new Scanner(System.in);
	System.out.print("Por Favr Teclee un mensage--> ");
	lectura = lector.nextLine();
	System.out.println("Informacion capturada por el teclado-->"+lectura);
	
	}

}
