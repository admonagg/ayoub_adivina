package ayoub_adivino;

// Ayoub Hiar

//Funciona correctamente, corregido por ANTON GEYKO GEYKO.

import java.util.Random;
import java.util.Scanner;

public class Ayoub_Adivino {

    public static void main(String[] args) {
        
        int n = 0,cont = 0;
  
        int max = 50;
        int min = 10;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > randomNum) {
                System.out.print("Te pasaste Amigo");
            } else if (n < randomNum){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != randomNum);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
        
        //Corregido mediante el siguiente metodo
             /*for(int i=1 ; i<=100; i++) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(randomNum);
    }*/
             
    }
    

    
}