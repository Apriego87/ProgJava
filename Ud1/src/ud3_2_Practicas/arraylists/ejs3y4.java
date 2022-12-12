package ud3_2_Practicas.arraylists;

import java.util.Scanner;

import ud3_2_Practicas.clases.*;;

public class ejs3y4 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Lugar barbastro = new Lugar("Barbastro", "España");
        Fecha fecha1 = new Fecha(22, 11, 2020);
        datosPersona(persona);
        Libro libro1 = new Libro("Introduction to Java Programming", persona, "1", 370, 3, "McGraw Hill", barbastro,
                fecha1);

        System.out.println(libro1);
    }

    public static Persona datosPersona(Persona persona) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el DNI: ");
        persona.ponDni(scan.nextInt());

        System.out.print("Introduce la edad: ");
        persona.ponEdad(scan.nextInt());

        System.out.print("Introduce el nombre: ");
        persona.ponNombre(scan.next());

        System.out.print("Introduce los apellidos: ");
        persona.ponApellidos(scan.next());

        return persona;
    }
}

/*
 * scan.nextInt(), 20, "Antonio", "Priego"
 * 
 * "Introducción a la programación en Java", persona, "0-13-031997-X", 371, 2,
 * "McGraw Hill", barbastro, fecha1
 */
