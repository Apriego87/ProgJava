import java.util.Scanner;

public class AntonioPriego2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, suma = 0, cont = 0, sumafin = 0;

        System.out.print("Introduce el primer número (>=1): ");
        n1 = scan.nextInt();

        System.out.print("Introduce elsegundo número (>=1): ");
        n2 = scan.nextInt();

        if (n1 < 1 || n2 < 1) {
            System.out.println("ERROR: Uno de los 2 números (o los 2) es / son inferiores a 1.");
            System.out.println("Fin del programa.");
            System.exit(1);
        }

        System.out.printf("Múltiplos de %d entre 1 y %d: ", n1, n2);

        while (suma < (n2 - n1)) {
            suma += n1;
            System.out.printf(suma + "  ");
            sumafin += suma;
            cont++;
        }

        System.out.println();
        System.out.printf("Cantidad de números: %d", cont);

        System.out.println();
        System.out.printf("Suman: %d", sumafin);
    }
}
