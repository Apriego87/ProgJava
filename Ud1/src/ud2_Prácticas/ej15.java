package ud2_Prácticas;

public class ej15 {
    public static void main(String[] args) {
        Boolean flag = false;
        int contPrimos = 0, num = 2;
        while (contPrimos < 100) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if ((num % j) == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(num + " \n");
                contPrimos++;
            }
            num++;
            flag = false;
        }
    }
}