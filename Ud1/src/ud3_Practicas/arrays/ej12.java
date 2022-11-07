package ud3_Practicas.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un string: ");
        String texto = scan.nextLine();

        char[] letras = new char [texto.length()];

        for (int i = 0; i < texto.length();i++){
            letras[i] = texto.charAt(i);
            
        }

        
    }
}
