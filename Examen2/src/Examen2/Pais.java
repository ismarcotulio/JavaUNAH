
package Examen2;


public class Pais {
    private int Identificador;
    private String Nombre;
    private String Continente;
    private float AreaTerritorial ;

    public Pais() {
    }

    public Pais(int Identificador, String Nombre, String Continente, float AreaTerritorial) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
        this.Continente = Continente;
        this.AreaTerritorial = AreaTerritorial;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContinente() {
        return Continente;
    }

    public void setContinente(String Continente) {
        this.Continente = Continente;
    }

    public float getAreaTerritorial() {
        return AreaTerritorial;
    }

    public void setAreaTerritorial(float AreaTerritorial) {
        this.AreaTerritorial = AreaTerritorial;
    }
    
}
