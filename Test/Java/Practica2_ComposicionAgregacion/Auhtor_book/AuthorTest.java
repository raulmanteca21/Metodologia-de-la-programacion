package Practica2_ComposicionAgregacion.Auhtor_book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void testAuthorMethods() {
        Author a = new Author("J.K. Rowling", "jk@test.com");

        // Probamos los Getters
        assertEquals("J.K. Rowling", a.getName());
        assertEquals("jk@test.com", a.getEmail());

        // Probamos el Setter
        a.setEmail("new@test.com");
        assertEquals("new@test.com", a.getEmail());

        // Probamos el formato de salida
        assertEquals("Author[name=J.K. Rowling,email=new@test.com]", a.toString());
    }
}