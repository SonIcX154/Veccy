package at.fhhgb.mtd.gop.veccy.shapes;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Rectangle boundingBox() {
        return new Rectangle (this.x, this.y, 1, 1);
    }
}
