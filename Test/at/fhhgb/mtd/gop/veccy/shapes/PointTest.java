package at.fhhgb.mtd.gop.veccy.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void boundingBox() {
        Point point = new Point(0, 0);
        Rectangle rectangle = new Rectangle(0, 0, 1, 1);
        Rectangle pointBoundingBox = point.boundingBox();
        assertEquals(rectangle.area(), pointBoundingBox.area());
    }
    @Test
    void testPointConstructor() {
        Point point = new Point(3, 4);
        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

}