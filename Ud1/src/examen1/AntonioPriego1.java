import java.util.Scanner;

public class AntonioPriego1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mins, dias = 60 * 24, anyo = dias * 365;

        System.out.print("Introduce los minutos (>=1): ");
        mins = scan.nextInt();

        while (mins < 1) {
            System.out.print("ERROR: introduce un valor superior a 1, por favor: ");
            mins = scan.nextInt();
        }

        scan.close();

        System.out.println("Años: " + (mins / anyo));
        System.out.println("Días: " + ((mins % anyo) / (dias)));
    }
}
