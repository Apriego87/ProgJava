package _03colecciones2_2;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Persona> lista;

    public Lista(){
        lista = new ArrayList<Persona>();
    }

    public int size(){
        return lista.size();
    }

    public boolean vacia(){
        return lista.isEmpty();
    }

    public void insertar (Persona p){
        lista.add(p);
    }

    public Persona recuperar (int pos){
        if (pos < 1 || pos > size()){
            return null;
        }
        else {
            return lista.get(pos-1);
        }
    }

    public Persona borrarPorPos(int pos){
        if (pos < 1 || pos > size()){
            return null;
        }
        else{
            return lista.remove(pos-1);
        }
    }

    public int buscarPorDNI(long num){
        int pos = -1;

        for (int i = 0; i < size(); i++){
            if (lista.get(i).dameNif().dameDni() == num){
                pos = i + 1;
            }
        }
        return pos;
    }

    public Persona borrarPorDNI(long num){
        int pos = buscarPorDNI(num);
        if (pos == -1){
            return null;
        }
        return borrarPorPos(pos);
    }

    public String buscarPorApe(String apellido){
        String encontrados = "Lista de personas que contienen la cadena '" + apellido + "':\n";
        for (int i = 0; i < size(); i++){
            if(lista.get(i).dameApellidos().toLowerCase().contains(apellido.toLowerCase())){
                encontrados += lista.get(i) + "\n";
            }
        }
        return encontrados;
    }


    @Override
    public String toString() {
        String mensaje;
        if (vacia()){
            return "La lista de personas está vacía.";
        }

        mensaje = size() + " persona(s) en la lista: \n--------------------\n";

        for (int i = 0; i < size(); i++){
            mensaje += lista.get(i) + "--------------------\n";
        }
        
        return mensaje;
    }

}
