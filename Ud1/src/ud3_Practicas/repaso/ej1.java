package ud3_Practicas.repaso;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            introd(nums, scan.nextInt());
        }

        
    }

    public static void introd(int[] nums, int num) {
        for (int i = 0; i < 10; i++) {
            nums[i] = num;
        }
    }

    public static void valorMax(int[] nums) {
        
    }
}
