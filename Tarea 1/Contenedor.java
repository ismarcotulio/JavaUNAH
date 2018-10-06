import java.util.Vector;
public class Contenedor{

	//Definiendo contenedor de clase Alumno
	public Alumno AlumnoContenedor[] = new Alumno[100];
	//metodos de la clase contenedor 
	public void AgregarAlumno(Alumno alumno,int posicion){
		if(AlumnoContenedor[posicion]==null){
			AlumnoContenedor[posicion]=alumno;
		}
	};
	public void EliminarAlumno(int posicion){
		AlumnoContenedor[posicion]=null;
	};
	public void EnlistarAlumno(){
		System.out.println("Numero\t\tNombre\t\tCuenta\t\t");
		for(int x=0;x<AlumnoContenedor.length;x++){
			if(AlumnoContenedor[x]!=null){	
			System.out.println(x+"\t\t"+AlumnoContenedor[x].Nombre+"\t\t"+AlumnoContenedor[x].Cuenta);
			}
		}
	};

}
