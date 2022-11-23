package _01objetos;
public class PruebaLibro {
  public static void main(String[] args) {
    
    /* Libro libro1 = new Libro();
    Libro libro2 = new Libro(); */
    Libro libro3 = new Libro("111222");
    Libro libro4 = new Libro("9788426417213", "Descubriendo a Coco", "Edmonde Charles-Roux", 584);
    
    System.out.println(libro4);
    System.out.println(libro4.getTitulo());

    libro4.prestar();

    libro4.setAutor("Antonio Priego");
    System.out.println(libro4);
    
    //
    /* libro1.isbn= "9788426417213";
    libro1.titulo= "Descubriendo a Coco";
    libro1.autor= "Edmonde Charles-Roux";
    libro1.numeroPaginas= 584;
    //
    libro2.isbn= "9788475069364";
    libro2.titulo= "Grace Memorias";
    libro2.autor= "Grace Coddington";
    libro2.numeroPaginas= 416; */
    
    
  }
}
