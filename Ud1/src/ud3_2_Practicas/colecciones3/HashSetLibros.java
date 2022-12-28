package ud3_2_Practicas.colecciones3;

import java.util.HashSet;
import java.util.Iterator;

import ud3_2_Practicas.clases.*;

// Repaso ArrayList

public class HashSetLibros {
  // private final static int MAX = 100; no tiene sentido....
  private HashSet<Libro> lista = new HashSet<Libro>();

  public boolean vacia() {
    return lista.isEmpty();
  }

  public int length() {
    return lista.size();
  }

  public void insertar(Libro libro) {
    lista.add(libro);
  }

  public void eliminar(Libro libro) {
    lista.remove(libro);
  }

  public boolean buscar(Libro libro) {
    return lista.contains(libro);
  }

  public Object busPorTit(String tit) {
    Iterator value = lista.iterator();

    System.out.println("The iterator values are: ");
    while (value.hasNext()) {
      System.out.println(value.next());
    }
    return value.next();
  }

  

  /* public String toString() {
    String cad = lista.size() + " Elementos de la lista:\n\n";
    for (int i = 0; i < lista.size(); i++)
      cad += lista.iterator() + "\n-----------------------------------------------\n";
    return cad;
  } */

}