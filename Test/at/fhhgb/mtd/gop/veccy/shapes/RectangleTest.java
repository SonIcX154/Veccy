package at.fhhgb.mtd.gop.veccy.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test void area() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertEquals(100, rectangle.area());
        assertNotEquals(15, rectangle.area());
    }
    @Test void boundingBox() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Rectangle RectangleBoundingBox = rectangle.boundingBox();
        assertEquals(rectangle.area(), RectangleBoundingBox.area());
    }
    @Test void isOverlapping() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Rectangle rectangle2 = new Rectangle(5, 5, 10, 10);
        Rectangle rectangle3 = new Rectangle(15, 15, 10, 10);
        Rectangle rectangle4 = new Rectangle(3, 3, 5, 5);


        assertTrue(rectangle.isOverlapping(rectangle2));
        assertFalse(rectangle.isOverlapping(rectangle3));
        assertTrue(rectangle.isOverlapping(rectangle4));
    }
}