package ud3_Practicas.arrays;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        System.out.println(comprobar(crearArray(leer())));
    }

    public static int[] leer() {
        Scanner scan = new Scanner(System.in);

        int[] size = new int[2];

        System.out.print("Cuántas filas?: ");
        size[0] = scan.nextInt();

        System.out.print("Cuántas columnas: ");
        size[1] = scan.nextInt();

        return size;
    }

    public static int[][] crearArray(int[] size) {
        Scanner scan = new Scanner(System.in);
        int[][] nums = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            System.out.printf("Fila %d\n", i + 1);
            for (int j = 0; j < size[1]; j++) {
                System.out.printf(" Introduce el dato %d: ", j + 1);
                nums[i][j] = scan.nextInt();
            }
        }

        scan.close();

        return nums;
    }

    public static boolean comprobar(int[][] nums) {
        boolean hola = true;
        int suma = 0, oldSuma = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i  > 0) {
                    suma += nums[i][j];
                }

                if (i == 0) {
                    oldSuma += nums[i][j];
                }
            }

            if (i > 0){
                if (suma != oldSuma) {
                    hola = false;
                }
                oldSuma = suma;
            }
        }
        return hola;
    }
}
