package ud2_Prácticas;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float result = 1;

        System.out.print("Introduce la base: ");
        float base = scan.nextFloat();

        System.out.print("Introduce el exponente: ");
        int exp = scan.nextInt();

        scan.close();

        result = base;

        for(int i = 1; i<exp; i++){
            
            result *= base;
        }

        System.out.println(result);
    }
}
