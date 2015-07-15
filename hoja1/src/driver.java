/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmartinez
 */
import java.util.Scanner;
public class driver{
private static Scanner teclado; 
private static int opciones;
private static int AmFm=0;
private static int memoria;
//private static boolean bloquear=true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    procesador radio = new procesador();
    teclado=new Scanner(System.in);
    System.out.print("Ingrese el numero de boton que desea presionar");
    opciones=teclado.nextInt();
    
    while(opciones!=8){
            
        if(opciones==1){
            radio.setEstado(true);
            if(radio.getEstado()==true){
                System.out.println("El radio esta encendido");
                System.out.print("Ingrese el numero de boton que desea presionar");
                opciones=teclado.nextInt();
                //bloquear=false;
    
            }
        }
        
        else if(opciones==2){
        radio.setEstado(false);
            if(radio.getEstado()==false){
                System.out.println("El radio se apagara en este momento");
                System.exit(0);
                //bloquear=true;
            }
        
        }
        //while(bloquear==false){
            //if (bloquear==false){
                if(opciones==3){
                radio.setAMFM(0);
                    if(radio.getAMFM()==0){
                        System.out.println("El radio esta en AM");
                        System.out.print("Ingrese el numero de boton que desea presionar");
    
                        opciones=teclado.nextInt();
    
                    }
                }
        
                else if(opciones==4){
                    radio.setAMFM(1);
                        if(radio.getAMFM()==1){
                            System.out.println("El radio esta en FM");
                            System.out.print("Ingrese el numero de boton que desea presionar");
    
                            opciones=teclado.nextInt();
    
                        }
    
                }
        
        
                    else if(opciones==5){
                        if(radio.getAMFM()==0){
                            System.out.println("El radio esta sintonizando en AM");
                            radio.sintonizar(false);
                            System.out.println(radio.getEmisora());
                            System.out.print("Ingrese el numero de boton que desea presionar");

                            opciones=teclado.nextInt();
    
                        }
        
                        if(radio.getAMFM()==1){
                            System.out.println("El radio esta sintonizando en FM");
                            radio.sintonizar(true);
                            System.out.println(radio.getEmisora());
                            System.out.print("Ingrese el numero de boton que desea presionar");

                            opciones=teclado.nextInt();

                        }
    
                    }
        

                    else if(opciones==6){
                    System.out.println("Seleccione el numero de memoria que desea utilizar 1-12");
                    memoria=teclado.nextInt();
                    radio.guardar(memoria);
                    System.out.print("Ingrese el numero de boton que desea presionar");

                    opciones=teclado.nextInt();


                    }

                    else if(opciones==7){
                    System.out.println("Seleccione el numero de memoria que desea verificar 1-12");
                    memoria=teclado.nextInt();
                    radio.memoria(memoria);
                    System.out.print("Ingrese el numero de boton que desea presionar");

                    opciones=teclado.nextInt();


                    }
                    else{
                        System.out.println("Ingrese una opcion correcta");
                        System.out.print("Ingrese el numero de boton que desea presionar");

                        opciones=teclado.nextInt();

                    }
                
                
                    }
                }
            }
    //}
//}