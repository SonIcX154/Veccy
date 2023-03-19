package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CircleTest {
    @Test
    void area() {
        Circle circle = new Circle(0, 0, 10);
        assertEquals(314, circle.area());
        assertNotEquals(15, circle.area());
    }
    @Test
    void boundingBox() {
        Circle circle = new Circle(0, 0, 10);
        Rectangle rectangle = new Rectangle(0, 0, 20, 20);
        Rectangle circleBoundingBox = circle.boundingBox();
        assertEquals(rectangle.area(), circleBoundingBox.area());
    }

}