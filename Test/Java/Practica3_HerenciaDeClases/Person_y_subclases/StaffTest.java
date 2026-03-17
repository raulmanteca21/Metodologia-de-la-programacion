package Practica3_HerenciaDeClases.Person_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void testGettersAndSetters() {
        Staff st = new Staff("Luis", "Sevilla", "UPM", 3000);
        assertEquals("Luis", st.getName());
        assertEquals("Sevilla", st.getAddress());
        assertEquals("UPM", st.getSchool());
        assertEquals(3000, st.getPay());

        st.setSchool("UCM");
        st.setPay(3500);

        assertEquals("UCM", st.getSchool());
        assertEquals(3500, st.getPay());
    }

    @Test
    void testToString() {
        Staff st = new Staff("Luis", "Sevilla", "UPM", 3000);
        assertEquals(
                "StaffPerson[name= Luis,address=Sevilla]School=UPM ,pay=3000.0]",
                st.toString()
        );

        st.setSchool("UCM");
        st.setPay(3500);

        assertEquals(
                "StaffPerson[name= Luis,address=Sevilla]School=UCM ,pay=3500.0]",
                st.toString()
        );
    }
}