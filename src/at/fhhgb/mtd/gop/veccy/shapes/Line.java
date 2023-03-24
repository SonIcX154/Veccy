package at.fhhgb.mtd.gop.veccy.shapes;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Line extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color fillColor;
    private Color strokeColor;
    private double[] getCoordinates;

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle boundingBox() {
        if (x1 < x2 && y1 < y2) {
            return new Rectangle(x1, y1, x2 - x1, y2 - y1);
        } else if (x1 < x2 && y1 > y2) {
            return new Rectangle(x1, y2, x2 - x1, y1 - y2);
        } else if (x1 > x2 && y1 < y2) {
            return new Rectangle(x2, y1, x1 - x2, y2 - y1);
        } else {
            return new Rectangle(x2, y2, x1 - x2, y1 - y2);
        }
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(Color.BLACK); // Set the stroke color
        graphicsContext.setLineWidth(2); // Set the line width
        graphicsContext.strokeLine(x1, y1, x2, y2); // Draw the line

    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
}