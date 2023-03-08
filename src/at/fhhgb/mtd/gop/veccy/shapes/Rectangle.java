package at.fhhgb.mtd.gop.veccy.shapes;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }

    public Rectangle boundingBox() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }

    public boolean isOverlapping(Rectangle other) {
        if(this.x < other.x && this.x + this.width > other.x || this.x > other.x && other.x + other.width > this.x){
            if(this.y < other.y && this.y + this.height > other.y || this.y > other.y && other.y + other.height > this.y){
                return true;
            }
        }
            return false;
    }
}
