import java.util.Scanner;
public class EjemploAlumno2{
	public static void main(String []args){
		Scanner lector = new Scanner(s);
		
		Alumno AlumnoNumero1 = new Alumno();
		AlumnoNumero1.NumeroCuenta = 12345;
		AlumnoNumero1.NombreApellido = "Marco Ruiz";
		AlumnoNumero1.PromedioActual = 90.75f;
		AlumnoNumero1.toString();
	}
}
