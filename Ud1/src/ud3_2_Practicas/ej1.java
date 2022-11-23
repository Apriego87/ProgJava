package ud3_2_Practicas;

public class ej1 {
    public static void main(String[] args) {
        /* Caballo caballo1 = new Caballo("nombre1", 3); */
        Caballo caballo2 = new Caballo("Perdigón", "Pinto", 7, 420.0, 3, false);

        System.out.println(caballo2);
        caballo2.come("zanahoria");
        caballo2.come("pienso");
    }
}
