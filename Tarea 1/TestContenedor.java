import java.util.Scanner;
public class TestContenedor{
	public static void main(String[]args){
		Contenedor miContenedor = new Contenedor();
		Alumno miAlumno = new Alumno();
		Alumno miAlumno2 = new Alumno();
		miAlumno2.Nombre = "Juan";
		miAlumno2.Cuenta = 1235;
		miAlumno.Nombre = "Marco";
		miAlumno.Cuenta = 1234;
		miContenedor.AgregarAlumno(miAlumno,10);
		miContenedor.AgregarAlumno(miAlumno2,30);
		miContenedor.EnlistarAlumno();	
	}
}
