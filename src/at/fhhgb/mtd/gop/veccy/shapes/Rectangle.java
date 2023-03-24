package at.fhhgb.mtd.gop.veccy.shapes;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import at.fhhgb.mtd.gop.veccy.math.Vector3;


public class Rectangle extends Shape{
    private int width;
    private int height;
    private double[] getCoordinates(){
        Vector3 coordinates = new Vector3(new double[3]);
    /*double[][] coordinates = new double[][];
    coordinates [0][0] = co1[0];
    coordinates

    */
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
        return new Rectangle(this.x, this.y);
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
