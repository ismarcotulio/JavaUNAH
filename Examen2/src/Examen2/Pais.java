
package Examen2;


public class Pais {
    private int IdentificadorPais;
    private String NombrePais;
    private String Continente;
    private float AreaPais ;

    public Pais() {
    }

    public Pais(int IdentificadorPais, String NombrePais, String Continente, float AreaPais) {
        this.IdentificadorPais = IdentificadorPais;
        this.NombrePais = NombrePais;
        this.Continente = Continente;
        this.AreaPais = AreaPais;
    }

    public int getIdentificadorPais() {
        return IdentificadorPais;
    }

    public void setIdentificadorPais(int IdentificadorPais) {
        this.IdentificadorPais = IdentificadorPais;
    }

    public String getNombrePais() {
        return NombrePais;
    }

    public void setNombrePais(String NombrePais) {
        this.NombrePais = NombrePais;
    }

    public String getContinente() {
        return Continente;
    }

    public void setContinente(String Continente) {
        this.Continente = Continente;
    }

    public float getAreaPais() {
        return AreaPais;
    }

    public void setAreaPais(float AreaPais) {
        this.AreaPais = AreaPais;
    }

    
    
}
