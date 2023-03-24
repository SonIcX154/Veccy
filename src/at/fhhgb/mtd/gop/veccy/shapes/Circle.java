package at.fhhgb.mtd.gop.veccy.shapes;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Circle implements DrawableShape{
    private int x;
    private int y;
    private int radius;
    private Color fillColor;
    private Color strokeColor;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }



    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.strokeColor = Color.BLACK;
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
