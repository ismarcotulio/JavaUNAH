
package Examen2;

import java.io.Serializable;

public class Vinculacion implements Serializable {
    private int IdentificadorVinculacion;
    private int IdPais;
    private int IdCiudad;

    public Vinculacion() {
    }

    public Vinculacion(int IdentificadorVinculacion, int IdPais, int IdCiudad) {
        this.IdentificadorVinculacion = IdentificadorVinculacion;
        this.IdPais = IdPais;
        this.IdCiudad = IdCiudad;
    }

    public int getIdentificadorVinculacion() {
        return IdentificadorVinculacion;
    }

    public void setIdentificadorVinculacion(int IdentificadorVinculacion) {
        this.IdentificadorVinculacion = IdentificadorVinculacion;
    }

    public int getIdPais() {
        return IdPais;
    }

    public void setIdPais(int IdPais) {
        this.IdPais = IdPais;
    }

    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }
    
    
}
