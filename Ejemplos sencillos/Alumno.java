public class Alumno{
	//definiendo propiedades del Alumno
	public int NumeroCuenta;
	public String NombreApellido;
	public String CentroUniversitario;
	public String Carrera;
	public float PromedioActual;

	//Sobreescribiendo el metodo toString()
	public String toString(){
		return "Numero Cuenta --> "+NumeroCuenta +"ln Promedio-->"+PromedioActual;
	}

}
