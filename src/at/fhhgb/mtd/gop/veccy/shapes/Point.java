package at.fhhgb.mtd.gop.veccy.shapes;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Point implements DrawableShape{
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


    }
}
