package ud3_2_Practicas.arraylists;
import ud3_2_Practicas.clases.*;

public class ej4 {
    public static void main(String[] args) {
        Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
        Fecha f1 = new Fecha(16, 11, 2001);
        Lugar lugar1 = new Lugar("Madrid", "España");
        Libro libro1 = new Libro("Introducción a Java", p1,
                "0-13-031997-X", 546, 3, "Prentice-Hall", lugar1, f1);

        Libro libro2 = new Libro("Beginning Java", p1,
                "0-13-031997-X", 546, 3, "Addison", lugar1, f1);
        Libro libro3 = new Libro("Avanzado Java", p1,
                "0-13-031997-X", 546, 3, "McGraw-Hill", lugar1, f1);

        Lista a = new Lista();

        a.insertar(libro1);
        a.insertar(libro2);
        a.insertar(libro3);

        System.out.println(a);
        a.getPorTit("Avanzado");
    }
}
