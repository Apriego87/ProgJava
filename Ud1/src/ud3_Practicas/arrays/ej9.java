package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] notas = new float[30];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Introduce la nota del alumno %d: ", i + 1);
            float sig = scan.nextFloat();
            if (sig < 0) {
                break;
            }
            notas[i] = sig;
        }

        System.out.println("\nCalificaciones:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.printf("\nNota media: %f", media(notas));
        System.out.printf("\nNúmero de aprobados: %d", notas.length - susp(notas));
        System.out.printf("\nNúmero de suspensos: %d", susp(notas));
        System.out.printf("\nNota máxima: %f", max(notas));
    }

    public static float media(float[] notas) {
        float suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static int susp(float[] notas) {
        int cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                cont++;
            }
        }
        return cont;
    }

    public static float max(float[] notas) {
        float max = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }
}
