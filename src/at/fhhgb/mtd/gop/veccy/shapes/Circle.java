package at.fhhgb.mtd.gop.veccy.shapes;

public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int area() {
        return (int) (Math.PI * this.radius * this.radius);
    }

    public Rectangle boundingBox() {
        return new Rectangle (this.x - this.radius, this.y - this.radius, this.radius * 2, this.radius * 2);
    }
}
