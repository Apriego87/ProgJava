package ud3_2_Practicas.colecciones1;


public class ej1 {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("elTitulo", "elAutor");
        Cancion cancion2 = new Cancion("elTitulo2", "elAutor2");
        Cancion cancion3 = new Cancion();

        /* System.out.println(prueba.dameAutor());
        System.out.println(prueba.dameTitulo());

        prueba.ponTitulo("titulo2");
        prueba.ponAutor("autor2");

        System.out.println(prueba.dameAutor());
        System.out.println(prueba.dameTitulo()); */

        CD cd = new CD();

        System.out.println(cd.agrega(cancion2));
        System.out.println(cd.agrega(cancion1));

        System.out.println(cd.numeroCanciones());

        System.out.println(cd.dameCancion(1));

        System.out.println(cd.grabaCancion(1, new Cancion("titulo3", "autor3")));

        System.out.println(cd);
    }
}
