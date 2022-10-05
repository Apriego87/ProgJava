package ud2_Prácticas;

public class ej15 {
    public static void main(String[] args) {
        int cont = 0;

        boolean noEsPrimo = false;
        
        for(int num = 1;cont<100;num++){
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    noEsPrimo = true;
                }
            }
            if (!noEsPrimo) {
                System.out.println(num + "  ");
            }
        }
    }
}
