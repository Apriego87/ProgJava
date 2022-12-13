package ud3_2_Practicas.colecciones2;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayProducto {
    ArrayList<Producto> lista = new ArrayList<Producto>();

    public boolean vacia() {
        return lista.isEmpty();
    }

    public int size() {
        return lista.size();
    }

    public String imprimir() {
        return lista.toString();
    }

    public void agregar(Producto producto) {
        lista.add(producto);
    }

    public Producto busPorPos(int pos) {
        return lista.get(pos - 1);
    }

    public Producto busPorCod(int cod){
        Producto prod = null;
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getCodigo() == cod){
                prod = lista.get(i);
            }
        }
        return prod;
    }

    public Producto borrPorCod(int cod){
        return lista.remove(lista.indexOf(busPorCod(cod)));
    }

    public Producto cambiarPrecio(int cod, double precio){
        Producto prod = busPorCod(cod);
        prod.setPrecio(precio);
        return prod;
    }

    @Override
    public String toString() {
        String mensaje;
        if (vacia()) {
            return "La lista de productos está vacía.";
        }

        mensaje = "\n" + size() + " producto(s) en la lista: \n--------------------\n";

        for (int i = 0; i < size(); i++) {
            mensaje += lista.get(i) + "--------------------\n";
        }

        return mensaje;
    }
}
