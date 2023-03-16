package at.fhhgb.mtd.gop.veccy.shapes;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Circle implements DrawableShape{
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    private int x;
    private int y;
    private int radius;
    private Color fillColor;
    private Color strokeColor;

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

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

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(this.fillColor); // Setzt die Füllfarbe
        graphicsContext.setStroke(this.strokeColor); // Setzt die Randfarbe
        // Tipp: Color.rgb(r, g, b) und Color.web(“#FFFFFF”) können auch verwendet werden!
        graphicsContext.fillOval(x, y, radius, radius); // Füllt ein Rechteck
        graphicsContext.strokeOval(x, y, radius, radius); // Rand eines Rechtecks

    }
}
