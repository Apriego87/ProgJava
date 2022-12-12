package _03colecciones2_2;

public class pruebaLista {
    public static void main(String[] args) {

        Persona p1 = new Persona(1234567, 31, "Nombre", "Apellido1 Apellido2");
        Persona p2 = new Persona(7654321, 22, "Persona 2", "Persona2 Persona2");
        Persona p3 = new Persona(1212343, 12, "Niño", "Apeniño1 Apeniño2");

        Lista l = new Lista();
        System.out.println(l.size());
        System.out.println(l.vacia());

        l.insertar(p1);
        l.insertar(p2);
        l.insertar(p3);
        System.out.println(l);

        System.out.println(l.recuperar(0));
        System.out.println(l.recuperar(2));

        System.out.println(l.borrarPorPos(1));

        System.out.println(l);

        System.out.println(l.buscarPorApe("ape"));
    }
}
