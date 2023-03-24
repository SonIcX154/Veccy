package at.fhhgb.mtd.gop.veccy.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void boundingBox() {
        Line line = new Line(0, 0, 10, 10);
        Rectangle line1 = line.boundingBox();
        Line line5 = new Line(10, 10, 0, 0);
        Rectangle line2 = line5.boundingBox();
        Line line6 = new Line(0, 10, 10, 0);
        Rectangle line3 = line6.boundingBox();
        Line line4 = new Line(10, 0, 0, 10);
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertEquals(line1.area(), rectangle.area());
        assertEquals(line2.area(), rectangle.area());
        assertEquals(line3.area(), rectangle.area());
        assertEquals(line4.boundingBox().area(), rectangle.area());
    }
    @Test
    void testLineConstructor() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(1, line.getX1());
        assertEquals(2, line.getY1());
        assertEquals(3, line.getX2());
        assertEquals(4, line.getY2());
    }

}