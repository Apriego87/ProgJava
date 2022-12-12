package ud3_2_Practicas.arraylists;

import ud3_2_Practicas.clases.*;

public class Libro {
    private String titulo;
    private Persona autor;
    private String isbn;
    private int paginas;
    private int edicion;
    private String editorial;
    private Lugar lugar;
    private Fecha fechaEdicion;

    /* public Libro() {
    } */

    public Libro(String titulo, Persona autor, String isbn, int paginas, int edicion, String editorial, Lugar lugar, Fecha fechaEdicion) {
        titulo = this.titulo;
        autor = this.autor;
        isbn = this.isbn;
        paginas = this.paginas;
        edicion = this.edicion;
        editorial = this.editorial;
        lugar = this.lugar;
        fechaEdicion = this.fechaEdicion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicion() {
        return this.edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Fecha getFechaEdicion() {
        return this.fechaEdicion;
    }

    public void setFechaEdicion(Fecha fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return " \n\tTítulo: " + getTitulo() + "\n" +
                " \t" + getEdicion() + "a. edición" + "\n" +
                " \tAutor: " + getAutor() + "\n" +
                " \tISBN: " + getIsbn() + "\n" +
                " \t" + getLugar() + getFechaEdicion() + "\n" +
                " \t" + getPaginas() + " páginas." + "\n" +
                " \tEditorial: " + getEditorial();
    }

}
