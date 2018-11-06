/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;
    import java.io.Serializable;
/**
 *
 * @author usuario
 */
public class Alumno implements Serializable {
    private int numero_cuenta;
    private String carrera;
    private int ano_matricula;
    private float promedio_actual;

    public Alumno(int numero_cuenta, String carrera, int ano_matricula, float promedio_actual) {
        this.numero_cuenta = numero_cuenta;
        this.carrera = carrera;
        this.ano_matricula = ano_matricula;
        this.promedio_actual = promedio_actual;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAno_matricula() {
        return ano_matricula;
    }

    public void setAno_matricula(int ano_matricula) {
        this.ano_matricula = ano_matricula;
    }

    public float getPromedio_actual() {
        return promedio_actual;
    }

    public void setPromedio_actual(float promedio_actual) {
        this.promedio_actual = promedio_actual;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numero_cuenta=" + numero_cuenta + ", carrera=" + carrera + ", ano_matricula=" + ano_matricula + ", promedio_actual=" + promedio_actual + '}';
    }
    
    
    
}
