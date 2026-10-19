package principal;

import modelo.Docente;
import modelo.Libro;
import modelo.Telefono;
import utilidades.OperacionesMatematicas;
import utilidades.Trigonometria;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Sudamericana", 471, "Gabriel García Márquez");
        System.out.println("Libro: " + libro.getTitulo() + " - " + libro.getAutor()
                + " (" + libro.getNumeroPaginas() + " páginas, " + libro.getEditorial() + ")");

        Telefono telefono = new Telefono("REF-001", 1200000, "Samsung", "Galaxy A54");
        System.out.println("Teléfono: " + telefono.getMarca() + " " + telefono.getModelo()
                + " - Ref: " + telefono.getReferencia() + " - Costo: " + telefono.getCosto());

        Docente docente1 = new Docente("Ana Pérez", 1012345678L, "3001234567", "ana@correo.com");
        System.out.println("Docente 1: " + docente1.getNombre() + " - " + docente1.getDocumento()
                + " - " + docente1.getTelefono() + " - " + docente1.getEmail());

        Docente docente2 = new Docente();
        docente2.setNombre("Luis Gómez");
        docente2.setDocumento(987654321L);
        docente2.setTelefono("3109876543");
        docente2.setEmail("luis@correo.com");
        System.out.println("Docente 2: " + docente2.getNombre() + " - " + docente2.getDocumento()
                + " - " + docente2.getTelefono() + " - " + docente2.getEmail());

        System.out.println("\nRaíz cuadrada de 25: " + OperacionesMatematicas.raizCuadrada(25));
        System.out.println("Logaritmo base 10 de 1000: " + OperacionesMatematicas.logaritmoBase10(1000));
        System.out.println("Logaritmo natural de e: " + OperacionesMatematicas.logaritmoNatural(Math.E));

        System.out.println("\nSeno de PI/2: " + Trigonometria.seno(Math.PI / 2));
        System.out.println("Coseno de 0: " + Trigonometria.coseno(0));
        System.out.println("Tangente de PI/4: " + Trigonometria.tangente(Math.PI / 4));
    }
}   