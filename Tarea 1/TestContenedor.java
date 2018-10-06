import java.util.Scanner;
public class TestContenedor{
	public static void main(String[]args){
		int ciclo=1;
		int opcion;
		int posicion;
		int error1=1;
		
		Contenedor miContenedor = new Contenedor();
		Scanner leer = new Scanner(System.in);
		while(ciclo==1){
			System.out.println("\n----------------------------------");
			System.out.println("Menu mantenimiento de Alumnos");
			System.out.println("1-Ingresar un Alumno");
			System.out.println("2-Eliminar un Alumno");
			System.out.println("3-Enlistar Alumnos");
			System.out.println("0-Salir\n");
			System.out.println("----------------------------------");
			System.out.print("\nIngrese una opcion: ");
			opcion = leer.nextInt();
			leer.reset();
			switch(opcion){
				case 1:
					System.out.println("\n--------------------------------");
					System.out.println("Eligio Ingresar Alumno..");
					System.out.println("--------------------------------");
					Alumno miAlumno = new Alumno();
					while(error1==1){
						System.out.print("Ingrese una posicion entre 1-100: ");
						posicion = leer.nextInt();
						leer.reset();
						
						if(posicion<=100 && posicion>0){
							System.out.print("Ingrese el Nombre del Alumno: ");
							miAlumno.Nombre = leer.next();
							leer.reset();
							System.out.print("Ingrese el numero de cuenta: ");
							miAlumno.Cuenta = leer.nextInt();
							leer.reset();
							miContenedor.AgregarAlumno(miAlumno,posicion);
							error1=0;
							System.out.println("Alumno agregado exitosamente!\n");
						}else{
							System.out.println("error!");
							System.out.println("Posicion no disponible...");
							System.out.println("intentelo de nuevo");
						}
					}
					error1=1;
				break;
				case 2:
					System.out.println("\n------------------------------");
					System.out.println("Eligio eliminar Alumno...");
					System.out.println("------------------------------");
					while(error1==1){
						System.out.print("Ingrese la posicion del Alumno entre 1-100: ");
						posicion = leer.nextInt();
						leer.reset();
						
						if(posicion<=100 && posicion>0){
							miContenedor.EliminarAlumno(posicion);
							System.out.println("Alumno eliminado exitosamente!");
							error1=0;
						}else{
							System.out.println("error!");
							System.out.println("Posicion no disponible...");
							System.out.println("intentelo de nuevo");
						}
					}
					error1=1;
				break;
				case 3:
					System.out.println("\n-----------------------------");
					System.out.println("Eligio enlistar Alumnos");
					System.out.println("-----------------------------");
					miContenedor.EnlistarAlumno();
				break;	
				case 0:
					System.out.println("\n-----------------");	
					System.out.println("Eligio Salir");
					System.out.println("-----------------");
					System.out.println("Gracias por utilizar nuestro servicio");
					ciclo=0;
				break;
				default:
					System.out.println("Error!");
					System.out.println("Esa opcion no esta en la lista...");
					System.out.println("Intentelo de nuevo\n");
			}
		}
	}
}
