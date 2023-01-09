package ud4_5_6_practicas;

import java.util.*;
import ud3_2_Practicas.clases.*;

public class ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = scan.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = scan.nextInt();

        System.out.print("Introduce el año: ");
        int year = scan.nextInt();

        System.out.printf("\n Método 1: %d", metodo1(dia, mes, year).diaSemana());
        System.out.printf("\n Método 2: %d", metodo2(dia, mes, year).getDay());
        System.out.printf("\n Método 3: %d", metodo3(dia, mes, year));
    }

    public static Fecha metodo1(int dia, int mes, int year) {
        Fecha f1 = new Fecha(dia, mes, year);
        return f1;
    }

    public static Date metodo2(int dia, int mes, int year) {
        @SuppressWarnings("deprecation")

        Date f2 = new Date(dia, mes, year);
        return f2;
    }

    public static int metodo3(int dia, int mes, int year) {
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(metodo2(dia, mes, year));
		return(c.get((Calendar.DAY_OF_WEEK)));
    }
}
