package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3, 4);
    }

    @Test
    void testPointIntIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
        assertEquals(4, point.getZ());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(0, point.getZ());
    }

    @Test
    void testModuleWithXandY() {
        assertEquals(3.6055, point.moduleWithXandY(), 10e-5);
    }

    @Test
    void testPhaseWithXandY() {
        assertEquals(0.9828, point.phaseWithXandY(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(3, point.getZ());
    }

    @Test
    void testToString() {
        assertEquals(String.format("Point{x=%d, y=%d, z=%d}", point.getX(), point.getY(), point.getZ()), point.toString());
    }


}