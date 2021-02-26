/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author rryax
 */
public class RuletaP {
    
    
    public static void main(String[]args){
        //declara variables
        Scanner objInput = new Scanner(System.in);
        Random r = new Random();
          String strContinuar;
          
 int saldoinicial = 100;
        int saldofinal = 0;
        int saldofinal1 = 0;
        int creditos = 0;
        int coste = 10;
        int ganancia_perdida;
        int apuesta = 0;
        String nombre;
        String enter;
        //inicia menu del programa
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("BIENVENIDO, POR FAVOR INGRESE SU NOMBRE");
        //lee el buffer del teclado para tomar el nombre
        Scanner objNombre = new Scanner(System.in);
        nombre = objNombre.nextLine();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(nombre+ " estas son las reglas:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("    Esta ruleta esta divida en 10 partes iguales de 10 numeros.");
        System.out.println("    Los numeros pares son de color negro y los numeros impares son de color impar.");
        System.out.println("    Iniciara el juego con 100 creditos de saldo inicial.");
        System.out.println("    Cada apuesta tiene un valor de 10 creditos.");
        System.out.println("    Si usted acierta el numero, ganara el triple de la apuesta. Si no acierta al numero, pero si al color, obtendra el doble de la apuesta.");
        System.out.println("    Debe elegir solamente numeros de 1 a 10.");
        System.out.println("    El juego termina cuando usted desee ya no continuar o cuando ya no tenga creditos disponibles.");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("    Presione ENTER para empezar:");
        Scanner objEnter = new Scanner(System.in);
        enter = objEnter.nextLine();
        //inicia el ciclo y asigna valores aleatorios
      do {
         int adivinar = r.nextInt(10);
       
       System.out.println("--------------------------------------------------------------------------");
        System.out.println("Ingresa el numero con el que deseas probar suerte");
        apuesta = objInput.nextInt();
        System.out.println("Usted esta iniciando esta apuesta con:" + saldoinicial+ " de saldo");
        System.out.println("--------------------------------------------------------------------------");
     
        //valida que el usuario posea creditos para jugar.
        if(saldoinicial <= 0)
        {System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ya no posee creditos para jugar");
            System.out.println("Gracias por su preferencia. Saliendo...");
            System.out.println("--------------------------------------------------------------------------");
            System.exit(0);
        }
        //valida que el numero ingresado no sea mayor a 10. 
        else if(apuesta > 10 || apuesta <0 )
        {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("El numero: "+ apuesta+ " no forma parte del rango valido");
            System.out.println("Por favor ingrese un numero valido");
            System.out.println("--------------------------------------------------------------------------");
        }
        //valida si el numero ha sido acertado
        else if(adivinar != apuesta)
        {
           //valida si los colores han sido acertados
            if(adivinar %2 == 0 && apuesta %2 == 0)
          {
              System.out.println("--------------------------------------------------------------------------");
              System.out.println("El numero es incorrecto pero ha acertado el color (color negro), por esto, ha ganado algunos creditos");
              System.out.println("El numero ganador era:"+adivinar);
              ganancia_perdida = coste * 2;
              System.out.println("Ha ganado:" +ganancia_perdida + " creditos a su saldo");
              saldoinicial = saldoinicial + ganancia_perdida;
             System.out.println("Usted tiene acualmente: " + saldoinicial+ " creditos de saldo.");
             System.out.println("--------------------------------------------------------------------------");
          }//valida si los colores han sido acertados
            else if(adivinar %2 != 0 && apuesta %2 != 0)
            {
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("El numero es incorrecto pero ha acertado el color(blanco), por esto, ha ganado algunos creditos");
                System.out.println("El numero ganador era:"+adivinar);
              ganancia_perdida = coste * 2;
              System.out.println("Ha ganado:" +ganancia_perdida + " creditos a su saldo");
              saldoinicial = saldoinicial + ganancia_perdida;
             System.out.println("Usted tiene acualmente: " + saldoinicial+ " creditos de saldo.");
             System.out.println("--------------------------------------------------------------------------");
            }
            else {
                
            
             System.out.println("--------------------------------------------------------------------------");   
            System.out.println("El numero no es el ganador");
            System.out.println("El numero ganador era:"+adivinar);
            ganancia_perdida = coste * 1;
            System.out.println("Ha perdido:" + ganancia_perdida + " creditos de su saldo.");
            saldoinicial = saldoinicial - ganancia_perdida;
            System.out.println("Usted tiene acualmente: " + saldoinicial+ " creditos de saldo.");
            System.out.println("--------------------------------------------------------------------------");
            }
          
                    
             
        }
        //valida si el numero ha sido acertado
        else if (adivinar == apuesta)
        {
          System.out.println("--------------------------------------------------------------------------");
            System.out.println("Numero ganador");
            System.out.println("El numero ganador era:"+adivinar);
            ganancia_perdida = coste*3;
            System.out.println("Ha ganado: "+ganancia_perdida + " creditos en su saldo");
            saldoinicial = saldoinicial + ganancia_perdida;
            
           System.out.println("Usted tiene acualmente: " + saldoinicial+ " creditos de saldo.");
           System.out.println("--------------------------------------------------------------------------");
        }
      
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Desea continuar?");
        System.out.println("Si  No");
        //lee el buffer del teclado
        Scanner objInput2 = new Scanner(System.in);
        strContinuar = objInput2.nextLine();
        
        if(strContinuar.contains("n")|| strContinuar.contains("N"))
        {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Gracias por visitarnos " + nombre);
            System.out.println("Su saldo final es: " + saldoinicial + " puede pasar a caja a canjear sus creditos");
            System.out.println("Presione ENTER para salir...");
            strContinuar = objInput2.nextLine();
            System.exit(0);
        }
        //repite el ciclo
       } while (strContinuar.contains("s") || strContinuar.contains("S"));  
       
        
    }
    
}
