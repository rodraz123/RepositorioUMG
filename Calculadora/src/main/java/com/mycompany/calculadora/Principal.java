/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;



/**
 *
 * @author rryax
 */
public class Principal {
                
    // Metodo principal
    public static void main (String[] args) {
        
        // Define variables 
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("Seleccionar una opcion");
            System.out.println("a - Si desea sumar");
            System.out.println("b - Si desea restar");
            System.out.println("c - Si desea multiplicar");
            System.out.println("d - Si desea dividir:");
            System.out.println("e - Salir del sistema.");
            System.out.println("-----------------------------------------------------");
            System.out.println("Escriba su opcion:");
            
            // Recibe el valor del buffer del teclado
            String strOpcion = objInput.nextLine();
            
            // Definir variables para las operaciones
            float[] fltArrNumeros = new float[2];
            float fltResultado = 0;
            
            // Define variable de error
            boolean blnError = true;
            
            switch(strOpcion) {
                case "a":
                    strOpcion = "Suma";
                    System.out.println("");
                    
                    // Solicitar los valores numericos
                    for (int i=0; i<2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                    
                    // Control
                    blnError = false;
                    
                    // Sale del case
                    break;
                    
                case "b":
                    strOpcion = "Resta";
                    System.out.println("");
                    
                    // Solicitar los valores numericos
                    for (int i=0; i<2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                    
                    // Control
                    blnError = false;
                    
                    // Sale del case
                    break;
                case "c":
                    strOpcion = "Multiplicacion";
                    
                      for (int i=0; i<2; i++) {
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0] * fltArrNumeros[1];
                    
                    blnError = false;
                    break;
                case "d":
                    
                    strOpcion = "Division";
                    
                    System.out.println("Ingrese el divisor:");
                    fltArrNumeros[0] = objInput.nextFloat();
                    
                    System.out.println("Ingrese el dividendo:");
                    fltArrNumeros[1] = objInput.nextFloat();
                    
                    if(fltArrNumeros[1] == 0)
                    {
                        System.out.println("Math Error");
                        blnError = true; 
                    }
                    
                    else 
                    {
                        fltResultado = fltArrNumeros[0] / fltArrNumeros[1];
                        blnError = false;
                    }
                    
                    break;
                    
                case "e":
                    System.out.println("Saliendo del sistema");
                    System.exit(0);
                    break;
                    
                    
                default:
                    
                    // Error
                    blnError = true;
                    
                    // sale del case
                    break;

            }
            
            System.out.println("");
            
            // Despliegue de los datos, si no hay error
            if (blnError==false) {
                System.out.println("El resultado es: " + fltResultado);
                    System.out.println("La opcion seleccionada es " + strOpcion);
                
            }
            else if (blnError == true) {
                System.out.println("Error no se puede realizar su operacion");
            
                System.out.println("La opcion seleccionada es invalida");
            }
            
            System.out.println("-----------------------------------------------------");
            
            System.out.println("Desea continuar? S/N");
            
            // Capturar el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
        } while (strContinuar.contains("s") || strContinuar.contains("S"));   
    }
}