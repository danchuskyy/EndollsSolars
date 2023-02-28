/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m03poomorenodaniel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danch
 */
public class M03POOMorenoDaniel {

    public static void main(String[] args) {
        
        //creamos el scanner 
        Scanner scanner = new Scanner(System.in);
        String comando;
        
        //creo un arraylist para meter las casas
        ArrayList<Casa> listadecasas = new ArrayList<>();
        Boolean quit = false;
        

        do {
            
            //muestro por pantalla paa que el usuario ponga el comando
            System.out.print("> ");
            comando = scanner.nextLine();

            
            // hago un split del comando
            String[] comandosplit = comando.split(" ");     //split del comando
            
            
            //empieza el programa, le digo que coja la posicion 0
            switch (comandosplit[0].toLowerCase()) {    //lo ponemos en minuscula
                
                
                //creo los casos 
                case "addcasa":
                    
                    
                    //creo una condicion diciendo que el parametro introducido por el usuario tiene que ser igual a 4
                    if (comandosplit.length == 4) {     
                        
                        //hago un parseint para convertir la superficio en integer, estaba en string
                        int posi3 = Integer.parseInt(comandosplit[3]);
                        
                        // condicion diciendo que superficie tiene que ser mayor que 10 m2
                        if (posi3 > 10) {    
                            
                            //creo un OBJETO llamado EJEMPLOCASA
                            Casa ejemplocasa = new Casa(comandosplit[1], comandosplit[2], posi3, true);    
                            
                            //añado el objeto a la lista de casas
                            listadecasas.add(ejemplocasa);
                            
                            System.out.println("se ha añadido la casa");
                            
                            
                            
                    }else {     //si la superficie es menor que 10, te muestra un error
                            System.out.println("Superficie incorrecta. Ha de ser més gran de 10. ");
                        }

                    } else {   // si no contiene 4 parametros te salta un error
                        System.out.println("ERROR: Número de paràmetres incorrecte ");
                    }

                    break;
                    
                    
                case "addplaca":
                    
                    System.out.println("se ha añadido la placa");
                    break;
                
                case "list":
                    //dbcasa.getList();
                    System.out.println("lista de casas");
                    
                    
                    //creo un bucle llamando a la clase Casa, le doy el nombre de la variable i, y que recorra la listadecasas.
                    for(Casa i : listadecasas) {
                                System.out.println(i.getNif());
                                

                        }
                    break;

                
                case "quit":
                    // Finalizar el bucle si se introduce el comando "salir"
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Mensaje de error si se introduce un comando desconocido
                    System.out.println("Comando desconocido. Introduce un comando válido.");
                    break;
            }
            
        } while (quit != true);
    }
    }

