
package Herencia;


public class Alumno extends Ciudadano{
    
    //Propiedades
    
    private String Intituto;
    private String grado;
    private int numero_cuenta;
    private int promedio;
    
    //Constructor simple

    public Alumno() {
    }
    
    //Constructor sobrecargado

    public Alumno(String Intituto, String grado, int numero_cuenta, int promedio, int identidad, String nombre_apellido) {
        super();
        nombre_apellido = getNombre_apellido();
        identidad = getIdentidad();
        this.Intituto = Intituto;
        this.grado = grado;
        this.numero_cuenta = numero_cuenta;
        this.promedio = promedio;
    }

    public String getIntituto() {
        return Intituto;
    }

    public void setIntituto(String Intituto) {
        this.Intituto = Intituto;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString(){
        return promedio+"|"+Intituto+"|"+grado+"|"+getIdentidad();
    }
    
    
    
}
