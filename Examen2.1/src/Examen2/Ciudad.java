
package Examen2;


public class Ciudad extends Pais{
   private int IdentificadorCiudad;
   private String NombreCiudad;
   private float AreaCiudad;

    public Ciudad() {
    }

    public Ciudad(int IdentificadorCiudad, String NombreCiudad, float AreaCiudad) {
        this.IdentificadorCiudad = IdentificadorCiudad;
        this.NombreCiudad = NombreCiudad;
        this.AreaCiudad = AreaCiudad;
    }

    public int getIdentificadorCiudad() {
        return IdentificadorCiudad;
    }

    public void setIdentificadorCiudad(int IdentificadorCiudad) {
        this.IdentificadorCiudad = IdentificadorCiudad;
    }

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String NombreCiudad) {
        this.NombreCiudad = NombreCiudad;
    }

    public float getAreaCiudad() {
        return AreaCiudad;
    }

    public void setAreaCiudad(float AreaCiudad) {
        this.AreaCiudad = AreaCiudad;
    }
   
   
   
}
