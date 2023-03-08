package at.fhhgb.mtd.gop.veccy.shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void boundingBox() {
        Line line = new Line(0, 0, 10, 10);
        Rectangle line1 = line.BoundingBox();
        Line line5 = new Line(10, 10, 0, 0);
        Rectangle line2 = line5.BoundingBox();
        Line line6 = new Line(0, 10, 10, 0);
        Rectangle line3 = line6.BoundingBox();
        Line line7 = new Line(10, 0, 0, 10);
        Rectangle line4 = line7.BoundingBox();
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertEquals(line1.area(), rectangle.area());
        assertEquals(line2.area(), rectangle.area());
        assertEquals(line3.area(), rectangle.area());
        assertEquals(line4.area(), rectangle.area());
    }
}