package _01objetos;

public class Libro {
  private String isbn;
  private String titulo;
  private String autor;
  private int numeroPaginas;

  public Libro(String isbn) {
    this.isbn = isbn;
  }


  public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
  }
  // ------------------------------------------------------------------------------------------

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNumeroPaginas() {
    return this.numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  // ------------------------------------------------------------------------------------------

  @Override
  public String toString() {
    return "{" +
      " isbn='" + isbn + "'" +
      ", titulo='" + titulo + "'" +
      ", autor='" + autor + "'" +
      ", numeroPaginas='" + numeroPaginas + "'" +
      "}";
  }



}
