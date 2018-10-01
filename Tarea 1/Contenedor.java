import java.util.Vector;
public class Contenedor{

	//Definiendo propiedades del contenedor
	public Vector<String> Alumno = new Vector<String>();

	public void AgregarAlumno(String alumno,int posicion){
		Alumno.add(posicion,alumno);
	};
	public void EliminarAlumno(int posicion){
		Alumno.remove(posicion);
	};
	public void EnlistarAlumno(){
		Alumno.listIterator();
	};

}
