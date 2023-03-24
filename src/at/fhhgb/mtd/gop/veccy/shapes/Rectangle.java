package at.fhhgb.mtd.gop.veccy.shapes;

import javafx.scene.canvas.GraphicsContext;
import at.fhhgb.mtd.gop.veccy.math.Vector3;
import at.fhhgb.mtd.gop.veccy.math.Matrix3;
import at.fhhgb.mtd.gop.veccy.math.TransformFactory;


public class Rectangle extends Shape {
    private int width;
    private int height;

    private double[][] getCoordinates() {
        Vector3[] corners = new Vector3[4];
        corners[0] = new Vector3(super.getX(), super.getY(), 1.0);
        corners[1] = new Vector3(super.getX() + width, super.getY(), 1.0);
        corners[2] = new Vector3(super.getX() + width, super.getY() + height, 1.0);
        corners[3] = new Vector3(super.getX(), super.getY() + height, 1.0);

        double[][] coordinates = new double[2][corners.length];
        for (int i = 0; i < corners.length; i++) {
            coordinates[0][i] = corners[i].getValues()[0];
            coordinates[1][i] = corners[i].getValues()[1];
        }

        Matrix3 translation = TransformFactory.createTranslation(-super.getX() - width / 2, -super.getY() - height / 2);
        Matrix3 inverseTranslation = TransformFactory.createTranslation(super.getX() + width / 2, super.getY() + height / 2);

        if (this.transform != null) {
            for (int i = 0; i < corners.length; i++) {
                corners[i] = translation.mult(corners[i]);
                corners[i] = this.transform.mult(corners[i]);
                corners[i] = inverseTranslation.mult(corners[i]);
            }

        }
        return coordinates;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
    }

    public int area() {
        return this.width * this.height;
    }

    public Rectangle boundingBox() {
        return new Rectangle(super.getX(), super.getY(), this.width, this.height);
    }

    public boolean isOverlapping(Rectangle other) {
        if (super.getX() < other.getX() && super.getX() + this.width > other.getX() || super.getX() > other.getX() && other.getX() + other.width > super.getX()) {
            return super.getY() < other.getY() && super.getY() + this.height > other.getY() || super.getY() > other.getY() && other.getY() + other.height > super.getY();
        }
        return false;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        super.draw(graphicsContext);
        double[][] coordinates = getCoordinates();
        graphicsContext.fillPolygon(coordinates[0], coordinates[1], coordinates[0].length);
        graphicsContext.strokePolygon(coordinates[0], coordinates[1], coordinates[0].length);
    }
}
