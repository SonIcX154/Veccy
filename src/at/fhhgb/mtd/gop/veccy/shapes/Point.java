package at.fhhgb.mtd.gop.veccy.shapes;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Point implements DrawableShape{
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x;
    private int y;
    private Color fillColor;
    private Color strokeColor;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Rectangle boundingBox() {
        return new Rectangle (this.x, this.y, 1, 1);
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.BLACK); // Set the fill color
        graphicsContext.fillRect(x, y, 1, 1); // Fill a 1x1 rectangle (representing the point)

    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
}
