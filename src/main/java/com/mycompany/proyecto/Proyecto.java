/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ALE
 */
public class Proyecto {
    
    public static void desplegarMenu()
    {
        System.out.println("1. Agregar Voluntario Nuevo o Integrantes de Familia ");
        System.out.println("2. Mostar Listado de Voluntarios o Integrantes de familia ");
        System.out.println("0. Para terminar el programa.");
        System.out.println("Ingrese su opcion: ");
    }
    public static void agregarPersona(ArrayList<Persona> Lista, int opcion)
    {
        Scanner entrada = new Scanner(System.in);
        if(opcion==1)
        {
            Persona nuevaP= new Persona();
            System.out.println("Ingrese el nombre: ");
            nuevaP.setNombre(entrada.nextLine());
            System.out.println("Ingrese el apellido: ");
            nuevaP.setApellido(entrada.nextLine());
            System.out.println("Ingrese rut: ");
            nuevaP.setRut(entrada.nextLine());
            System.out.println("Ingrese la edad: ");
            nuevaP.setEdad(entrada.nextInt());
            entrada.nextLine();
            System.out.println("Ingrese el numero de telefono: ");
            nuevaP.setTelefono(entrada.nextDouble());
            entrada.nextLine();
            System.out.println("Ingrese el correo: ");
            nuevaP.setMail(entrada.nextLine());
            System.out.println("Direccion: ");
            nuevaP.setDireccion(entrada.nextLine());
            System.out.println("Comuna: ");
            nuevaP.setComuna(entrada.nextLine());
            System.out.println("Region: ");
            nuevaP.setRegion(entrada.nextLine());
            System.out.println("Profesion o algo en lo que es bueno: ");
            nuevaP.setProfesion(entrada.nextLine());
            System.out.println("Lo que no puede/quiere hacer: ");
            nuevaP.setDebilidad(entrada.nextLine());
            nuevaP.setAsignado(false);
            nuevaP.setTipo("Voluntario");
            Lista.add(nuevaP);
        }
        else
        {
            Persona nuevaP= new Persona();
            System.out.println("Ingrese el nombre: ");
            nuevaP.setNombre(entrada.nextLine()); 
            System.out.println("Ingrese el apellido: ");
            nuevaP.setApellido(entrada.nextLine());
            System.out.println("Ingrese rut: ");
            nuevaP.setRut(entrada.nextLine());
            System.out.println("Ingrese la edad: ");
            nuevaP.setEdad(entrada.nextInt());
            entrada.nextLine();
            System.out.println("Ingrese el numero de telefono: ");
            nuevaP.setTelefono(entrada.nextDouble());
            entrada.nextLine();
            System.out.println("Ingrese el correo: ");
            nuevaP.setMail(entrada.nextLine());
            System.out.println("Direccion: ");
            nuevaP.setDireccion(entrada.nextLine());
            System.out.println("Comuna: ");
            nuevaP.setComuna(entrada.nextLine());
            System.out.println("Region: ");
            nuevaP.setRegion(entrada.nextLine());
            nuevaP.setProfesion("null");
            nuevaP.setDebilidad("null");
            nuevaP.setAsignado(false);
            nuevaP.setTipo("Familiar");
            Lista.add(nuevaP);
        }
    }
    
    public static void mostrarPersona(ArrayList<Persona> lista)
    {
        if(!lista.isEmpty())
        {
            if("Voluntario".equals(lista.get(0).getTipo()))
            {
                for(int i=0; i< lista.size();i++)
                {
                    System.out.println("El nombre del Voluntario es: "+ lista.get(i).getNombre()+" "+lista.get(i).getApellido());
                    System.out.println("Rut: "+ lista.get(i).getRut());
                    System.out.println("Edad: "+ lista.get(i).getEdad());
                    System.out.println("Correo Electronic: "+lista.get(i).getMail());
                    System.out.println("Region: "+lista.get(i).getRegion() +"|| Comuna: "+lista.get(i).getComuna()+"||Direccion: "+lista.get(i).getDireccion());
                    System.out.println("");
                }
            }
            else
            {
                for(int i=0; i< lista.size();i++)
                {
                    System.out.println("El nombre de la Persona es: "+ lista.get(i).getNombre()+" "+lista.get(i).getApellido());
                    System.out.println("Rut: "+ lista.get(i).getRut());
                    System.out.println("Edad: "+ lista.get(i).getEdad());
                    System.out.println("Correo Electronic: "+lista.get(i).getMail());
                    System.out.println("Region: "+lista.get(i).getRegion() +"|| Comuna: "+lista.get(i).getComuna()+"||Direccion: "+lista.get(i).getDireccion());
                    System.out.println("");
                }
            }
        }
        else
            return;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Scanner entrada = new Scanner(System.in);
        File file = new File("C:\\Users\\alexa\\Documents\\personas.txt");
        ArrayList<Persona> ListaVoluntarios=new ArrayList<Persona>();
        ArrayList<Persona> ListaIntegrantesFamilia=new ArrayList<Persona>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        int eleccion;
        String  st;
        String[] aux;
        while((st = br.readLine()) != null)
        {
            aux = st.split(", ");
            Persona personita = new Persona( aux[0], aux[1],Integer.parseInt(aux[2]),Double.parseDouble(aux[3]),aux[4],aux[5],aux[6],aux[7],aux[8],aux[9],Boolean.parseBoolean(aux[10]),aux[11]);
            //System.out.println(aux[11]);
            if(aux[11].equals("Voluntario"))
            {
                ListaVoluntarios.add(personita);
            }
            else
            {
                ListaIntegrantesFamilia.add(personita);
            }
        }
        
        int opcion;
        do
        {
            desplegarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese 1 para Agregar Voluntarios o 2 para Agregar Integrantes de familia. Ingrese 3 para sali al menu principal");
                    do
                    {
                        eleccion = entrada.nextInt();
                        entrada.nextLine();
                        if(eleccion==3)
                        {
                            System.out.println("Saliendo del sub-menu");
                            break;
                        }
                         
                        switch(eleccion)
                        {
                            case 1:
                                agregarPersona(ListaVoluntarios,eleccion);
                                eleccion=3;
                                break;
                                
                            case 2:
                                agregarPersona(ListaIntegrantesFamilia,eleccion);
                                eleccion=3;
                                break;
                                
                            default:
                                System.out.println("Opcion Invalida, intente de nuevo.");
                        }
                    }while(eleccion!=3);
                    break;

                case 2: 
                    System.out.println("Ingrese 1 para Mostrar Voluntarios o 2 para Mostrar Integrantes de familia. Ingrese 3 para sali al menu principal");
                    do
                    {
                        eleccion= entrada.nextInt();
                        entrada.nextLine();
                        switch(eleccion)
                        {
                            case 1:
                                mostrarPersona(ListaVoluntarios);
                                eleccion=3;
                                break;
                            case 2:
                                mostrarPersona(ListaIntegrantesFamilia);
                                eleccion=3;
                                break;
                            case 3:
                                System.out.println("Saliendo del sub-menu");
                                break;
                            default:
                                System.out.println("Opcion Invalida, intente de nuevo.");
                        }
                    }while(eleccion!=3);
                    
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa....");
                    break;
                    
                default:
                    System.out.println("Opcion Invalida, intente de nuevo.");
            }
        } while(opcion!=0);
    }
}
