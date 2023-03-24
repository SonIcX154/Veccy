package at.fhhgb.mtd.gop.veccy.features;
import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Circle;
import at.fhhgb.mtd.gop.veccy.model.CanvasModel;


public class CircleFeature implements NamedFeature {
    private Circle currentCircle;
    private int originX;
    private int originY;
    private boolean isSelected;
    private CanvasModel model;

    public CircleFeature(CanvasModel model) {
        this.model = model;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void onSelect() {
        isSelected = true;
    }

    @Override
    public void onDeselect() {
        isSelected = false;
    }

    @Override
    public void onMouseClick(int x, int y) {
        if (isSelected && currentCircle != null) {
            currentCircle = null;
        }
    }

    @Override
    public void onMouseDrag(int x, int y) {
        if (isSelected) {
            if (currentCircle == null) {
                originX = x;
                originY = y;
                currentCircle = new Circle(originX, originY, 0);
                currentCircle.setFillColor(model.getCurrentFillColor());
                currentCircle.setStrokeColor(model.getCurrentStrokeColor());
                model.addShape(currentCircle);
            } else {
                int radius = (int) Math.sqrt(Math.pow(x - originX, 2) + Math.pow(y - originY, 2));
                currentCircle.setRadius(radius);
            }
        }
    }
}
