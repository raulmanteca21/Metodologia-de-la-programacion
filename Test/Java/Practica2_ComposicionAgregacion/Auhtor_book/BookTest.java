package Practica2_ComposicionAgregacion.Auhtor_book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testBookConstructorsAndGetters() {
        Author a = new Author("Tolkien", "tolkien@test.com");

        // Constructor 1 (sin cantidad)
        Book b1 = new Book("123", "Hobbit", a, 15.5);
        assertEquals("123", b1.getIsbn());
        assertEquals("Hobbit", b1.getName());
        assertEquals(a, b1.getAuthor());
        assertEquals(15.5, b1.getPrice());
        assertEquals(0, b1.getQty()); // Valor por defecto

        // Constructor 2 (con cantidad)
        Book b2 = new Book("456", "LOTR", a, 20.0, 10);
        assertEquals(10, b2.getQty());
    }

    @Test
    void testBookSettersAndLogic() {
        Author a = new Author("Tolkien", "tolkien@test.com");
        Book b = new Book("456", "LOTR", a, 20.0, 10);

        // Modificamos valores
        b.setPrice(25.0);
        b.setQty(50);

        // Verificamos cambios
        assertEquals(25.0, b.getPrice());
        assertEquals(50, b.getQty());

        // Verificamos delegación de métodos (obtener nombre del autor a través del libro)
        assertEquals("Tolkien", b.getAuthorName());

        // Verificamos el toString compuesto
        assertEquals("Book[isbn=456,name=LOTR,Author[name=Tolkien,email=tolkien@test.com],price=25.0,qty=50]", b.toString());
    }
}