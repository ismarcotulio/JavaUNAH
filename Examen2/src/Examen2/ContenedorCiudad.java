package Examen2;
public class ContenedorCiudad{

	//Definiendo contenedor de clase Alumno
	public Ciudad CiudadContenedor[] = new Ciudad[100];
	//metodos de la clase contenedor 
	public void AgregarCiudad(Ciudad ciudad,int posicion){
		if(CiudadContenedor[posicion]==null){
			CiudadContenedor[posicion]=ciudad;
		}
	};
	public void EliminarCiudad(int posicion){
		CiudadContenedor[posicion]=null;
	};
        
        public void EliminarCiudad(String palabra){
            for(int x=0;x<CiudadContenedor.length;x++){
                if(CiudadContenedor[x].getNombreCiudad()==palabra){
                    CiudadContenedor[x]=null;
                }
            }
        }; 
        
	public void EnlistarCiudad(){
		System.out.println("");
		for(int x=0;x<CiudadContenedor.length;x++){
			if(CiudadContenedor[x]!=null){	
			System.out.println(x+"\t\t"+CiudadContenedor[x].getNombreCiudad());
			}
		}
	};

}

