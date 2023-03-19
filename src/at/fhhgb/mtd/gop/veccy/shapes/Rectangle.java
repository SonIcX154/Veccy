package at.fhhgb.mtd.gop.veccy.shapes;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Rectangle implements DrawableShape{
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int x;
    private int y;
    private int width;
    private int height;
    private Color fillColor;
    private Color strokeColor;

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

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.RED); // Setzt die Füllfarbe
        graphicsContext.setStroke(Color.BLUE); // Setzt die Randfarbe
// Tipp: Color.rgb(r, g, b) und Color.web(“#FFFFFF”) können auch verwendet werden!
        graphicsContext.fillRect(x, y, width, height); // Füllt ein Rechteck
        graphicsContext.strokeRect(x, y, width, height); // Rand eines Rechtecks

    }
}
