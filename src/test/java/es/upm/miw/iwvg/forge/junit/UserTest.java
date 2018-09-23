package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user = new User(1, "Pedro", "Reyes");

    @Test
    public void testUpper() {
        assertEquals("PEDRO REYES", user.upper());
    }

    @Test
    void testInitials() {
        assertEquals("P.", user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals(1, user.getNumber());
    }

    @Test
    void testFamilyName() {
        assertEquals("Reyes", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Pedro Reyes", user.fullName());
    }

}
