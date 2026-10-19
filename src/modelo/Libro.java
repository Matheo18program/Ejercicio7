package modelo;

public class Libro {
    private String titulo;
    private String editorial;
    private int numeroPaginas;
    private String autor;

    public Libro(String titulo, String editorial, int numeroPaginas, String autor) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
}