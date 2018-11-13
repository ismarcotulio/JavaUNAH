
package Examen2;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[]args){
        try {
            ObjectOutputStream escribirPais = new ObjectOutputStream(new FileOutputStream("ARCHIVO.BIN"));
         
            
            escribirPais.close();
            
            ObjectInputStream leerPais = new ObjectInputStream(new FileInputStream("ARCHIVO.BIN"));
            Pais mi_pais= (Pais) leerPais.readObject();
            leerPais.close();
            
            //Imprimir y mostrar en pantalla el archivo desaerializado
            System.out.println(mi_pais);
        }catch(FileNotFoundException ex){
            System.err.println("Error en la Apertura del Archivo...");
        }catch (IOException ex) {
            System.err.println("Error de Entrada/Salida...");
        }catch (ClassNotFoundException ex){
            System.err.println("La clase alumno no esta definida...");
        }
                int ciclo=1;
                int identificador;
                float area;
                String nombre;
		String opcion;
		int posicion;
                int desicion;
		int error1=1;
                String palabra;
                
		
		ContenedorVinculacion miContenedorVinculacion = new ContenedorVinculacion();
                ContenedorPais miContenedorPais = new ContenedorPais();
                ContenedorCiudad miContenedorCiudad = new ContenedorCiudad();
		Scanner leer = new Scanner(System.in);
		while(ciclo==1){
			System.out.println("\n------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Menu");
                        System.out.println("1-Paises \t\t 2-Ciudades \t\t 3-Vinculacion \t\t\t 4-Listado \t\t\t 5-salir");
                        System.out.println("1.1-Agregar un Pais \t 2.1-Agregar Ciudad \t 3.1-Agregar una vinculacion\t 4.1-Listado del Pais \t\t ");
			System.out.println("1.2- Eliminar una Pais \t 2.1-Eliminar una ciudad 3.2-Eliminar una vinculacion \t 4.2-Listado de las Ciudades");
			System.out.println("1.3-Modificar paises \t 2.3-Modificar ciudades  3.3-Modificar Vinculacion");
                        System.out.print("1.4-Listado del Pais \t 2.4-Listado de Ciudades");
			System.out.println("\n------------------------------------------------------------------------------------------------------------------------");
			System.out.print("\nIngrese una opcion: ");
			opcion = leer.next();
			leer.reset();
                        
                        
			switch(opcion){
				case "1.1":
					System.out.println("\n--------------------------------");
					System.out.println("Eligio Agregar Pais..");
					System.out.println("--------------------------------");
					Pais miPais = new Pais();
                                        
					while(error1==1){
						System.out.print("Agregar una posicion entre 1-100: ");
						posicion = leer.nextInt();
						leer.reset();
						
						if(posicion<=100 && posicion>0){
                                                    error1 = miContenedorPais.ComprobarIdentificadorPais(posicion);
                                                        if(error1==0){
                                                            
                                                        miPais.setIdentificadorPais(posicion);
                                                        
							System.out.print("Agregar el nombre del pais: ");
							nombre = leer.next();
                                                        miPais.setNombrePais(nombre);
							leer.reset();
                                                        System.out.print("Agregar el continente del pais: ");
							nombre = leer.next();
                                                        miPais.setContinente(nombre);
							leer.reset();
                                                        System.out.print("Agregar Area Territorial del pais: ");
							area = leer.nextFloat();
                                                        miPais.setAreaPais(area);
							leer.reset();
							miContenedorPais.AgregarPais(miPais, posicion);
							System.out.println("Pais agregado exitosamente!\n");
                                                        }else{
                                                            System.out.println("Esa posicion ya esta ocupada...");
                                                            System.out.println("Intentelo de nuevo...");
                                                            System.out.println("");
                                                        }
                                                        
						}else{
							System.out.println("error!");
							System.out.println("Posicion no disponible...");
							System.out.println("intentelo de nuevo");
						}
					}
					error1=1;
				break;
				case "1.2":
					System.out.println("\n------------------------------");
					System.out.println("Eligio eliminar un pais...");
					System.out.println("------------------------------");
                                        
                                                    while(error1==1){
                                                
                                                        System.out.print("Ingrese la posicion del Pais entre 1-100: ");
                                                        posicion = leer.nextInt();
                                                        leer.reset();

                                                        if(posicion<=100 && posicion>0){
                                                            error1 = miContenedorPais.ComprobarIdentificadorPais(posicion);
                                                            if(error1==1){
                                                                miContenedorPais.EliminarPais(posicion);
                                                                System.out.println("Pais eliminado exitosamente!");
                                                                error1=0;
                                                            }else{
                                                                System.out.println("Codigo invalido...");
                                                                System.out.println("Pais no existe...");
                                                                System.out.println("intentelo de nuevo...");
                                                                error1=1;
                                                            }
                                                                
                                                        }else{
                                                                System.out.println("error!");
                                                                System.out.println("Posicion no disponible...");
                                                                System.out.println("intentelo de nuevo");
                                                        }
                                                    }
                                                    error1=1;
                                                
					
				break;
				case "1.3":
					System.out.println("\n-----------------------------");
					System.out.println("Eligio modificar Pais");
					System.out.println("-----------------------------");
					miContenedorPais.ModificarPais();
				break;	
                                
                                case "2.1":
					System.out.println("\n--------------------------------");
					System.out.println("Eligio Agregar una Ciudad..");
					System.out.println("--------------------------------");
					Ciudad miCiudad = new Ciudad();
					while(error1==1){
						System.out.print("Agregar una posicion entre 1-100: ");
						posicion = leer.nextInt();
						leer.reset();
						
						if(posicion<=100 && posicion>0){
                                                    error1 = miContenedorPais.ComprobarIdentificadorPais(posicion);
                                                        if(error1==0){
                                                            System.out.println("Ingrese Identificador de la ciudad");
                                                        identificador = leer.nextInt();
                                                        miCiudad.setIdentificadorPais(identificador);
                                                        leer.reset();
                                                        
							System.out.print("Agregar el nombre de la ciudad: ");
							nombre = leer.next();
                                                        miCiudad.setNombreCiudad(nombre);
							leer.reset();
							/*System.out.print("");
							miPais.Cuenta = leer.nextInt();
							leer.reset();
							miContenedor.AgregarAlumno(miAlumno,posicion);
							error1=0;*/
							System.out.println("Ciudad agregado exitosamente!\n");
                                                        }else{
                                                            System.out.println("Esa posicion ya esta ocupada...");
                                                            System.out.println("Intentelo de nuevo...");
                                                            System.out.println("");
                                                        }
                                                        
						}else{
							System.out.println("error!");
							System.out.println("Posicion no disponible...");
							System.out.println("intentelo de nuevo");
						}
					}
					error1=1;
				break;
				case "2.2":
					System.out.println("\n------------------------------");
					System.out.println("Eligio eliminar una Ciudad...");
					System.out.println("------------------------------");
                                        System.out.println("Como desea Eliminar?");
                                                System.out.println("1-Nombre");
                                                System.out.println("2-identificador");
                                                //System.out.println("3-Posicion");
                                                desicion = leer.nextInt();
                                                leer.reset();
                                                if(desicion==2){
                                                    while(error1==1){
                                                
                                                        System.out.print("Ingrese la posicion de la ciudad entre 1-100: ");
                                                        posicion = leer.nextInt();
                                                        leer.reset();

                                                        if(posicion<=100 && posicion>0){
                                                                miContenedorCiudad.EliminarCiudad(posicion);
                                                                System.out.println("Ciudad eliminado exitosamente!");
                                                                error1=0;
                                                        }else{
                                                                System.out.println("error!");
                                                                System.out.println("Posicion no disponible...");
                                                                System.out.println("intentelo de nuevo");
                                                        }
                                                    }
                                                    error1=1;
                                                }else{
                                                    while(error1==1){
                                                        System.out.print("Ingrese el nombre de la Ciudad: ");
                                                        palabra = leer.nextLine();
                                                        leer.reset();
                                                        miContenedorPais.EliminarPais(palabra);
                                                    }
                                                    
                                                }
					
				break;
				case "2.3":
					System.out.println("\n-----------------------------");
					System.out.println("Eligio modificar una ciudad");
					System.out.println("-----------------------------");
					miContenedorCiudad.ModificarCiudad();
				break;
                                        case "3.1":
					System.out.println("\n--------------------------------");
					System.out.println("Eligio agregar Vinculacion..");
					System.out.println("--------------------------------");
					Vinculacion miVinculacion = new Vinculacion();
                                       
                                        
					while(error1==1){
						System.out.print("Agregar una posicion entre 1-100: ");
						posicion = leer.nextInt();
						leer.reset();
						
						if(posicion<=100 && posicion>0){
                                                    error1 = miContenedorVinculacion.ComprobarIdentificadorVinculacion(posicion);
                                                        if(error1==0){
                                                            System.out.println("Ingrese el identificador de la vinculacion");
                                                        identificador = leer.nextInt();
                                                        miVinculacion.setIdentificadorVinculacion(identificador);
                                                        leer.reset();
                                                        
                                                        //Que hay que hacer aqui en agregar vinculacion, ya que no podemos meter datos en este paso
							/*System.out.print("Agregar el ");
							nombre = leer.next();
                                                        miVinculacion.setAgregarVinculacion(nombre);
							leer.reset();*/
                                                        
                                                        
							/*System.out.print("");
							miPais.Cuenta = leer.nextInt();
							leer.reset();
							miContenedor.AgregarAlumno(miAlumno,posicion);
							error1=0;*/
							System.out.println("Vinculacion agregada exitosamente!\n");
                                                        }else{
                                                            System.out.println("Esa posicion ya esta ocupada...");
                                                            System.out.println("Intentelo de nuevo...");
                                                            System.out.println("");
                                                        }
                                                        
						}else{
							System.out.println("error!");
							System.out.println("Posicion no disponible...");
							System.out.println("intentelo de nuevo");
						}
					}
					error1=1;
				break;
				case "3.2":
					System.out.println("\n------------------------------");
					System.out.println("Eligio eliminar una vinculacion...");
					System.out.println("------------------------------");
                                        System.out.println("Como desea Eliminar?");
                                                System.out.println("1-Nombre");
                                                System.out.println("2-identificacion");
                                                //System.out.println("3-Posicion");
                                                desicion = leer.nextInt();
                                                leer.reset();
                                                if(desicion==2){
                                                    while(error1==1){
                                                
                                                        System.out.print("Ingrese la posicion de la vinculacion entre 1-100: ");
                                                        posicion = leer.nextInt();
                                                        leer.reset();

                                                        if(posicion<=100 && posicion>0){
                                                                miContenedorVinculacion.EliminarVinculacion(posicion);
                                                                System.out.println("Vinculacion eliminada exitosamente!");
                                                                error1=0;
                                                        }else{
                                                                System.out.println("error!");
                                                                System.out.println("Posicion no disponible...");
                                                                System.out.println("intentelo de nuevo");
                                                        }
                                                    }
                                                    error1=1;
                                                }else{
                                                    while(error1==1){
                                                        System.out.print("Ingrese la vinculacion: ");
                                                        palabra = leer.nextLine();
                                                        leer.reset();
                                                        miContenedorPais.EliminarPais(palabra);
                                                    }
                                                    
                                                }
					
				break;
				case "3.3":
					System.out.println("\n-----------------------------");
					System.out.println("Eligio modificar una vinculacion");
					System.out.println("-----------------------------");
					miContenedorVinculacion.ModificarVinculacion();
				break;
                                        
                                        
				case "5":
					System.out.println("\n-----------------");	
					System.out.println("Eligio Salir");
					System.out.println("-----------------");
					System.out.println("Gracias por utilizar nuestro servicio");
					ciclo=0;
                                        
                                        
				break;
				default:
					System.out.println("Error!");
					System.out.println("Esa opcion no esta en la lista...");
					System.out.println("Intentelo de nuevo\n");
			}
		}
	}
}

    

