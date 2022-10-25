public class AntonioPriego3 {
    public static void main(String[] args) {
        int num, min = 0, cont = 0;
        for (int i = 0; i < 20; i++) {
            num = (int) (Math.random() * 21);
            if (i < 1) {
                min = num;
            }
            System.out.print(num + "  ");

            if (num < min) {
                min = num;
                cont = 0;
            }

            if (num == min) {
                cont++;
            }

            if (i == 19) {
                System.out.println();
            }
        }

        System.out.println("El mínimo es: " + min + " y aparece " + cont + " veces.");
    }
}
