
package Herencia;


public class Alumno extends Ciudadano{
    
    private String Intituto;
    private String grado;
    private int numero_cuenta;
    private int promedio;

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
    
    
    
}
