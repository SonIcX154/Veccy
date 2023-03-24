package at.fhhgb.mtd.gop.veccy.features;
import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Line;
import at.fhhgb.mtd.gop.veccy.model.CanvasModel;

public class LineFeature implements NamedFeature{
    private Line currentLine;
    private int originX;
    private int originY;
    private boolean isSelected;

    public LineFeature(CanvasModel model) {
        this.model = model;
    }

    private CanvasModel model;

    @Override
    public String getName() {
        return "Line";
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
        if (isSelected && currentLine != null) {
            currentLine = null;
        }
    }

    @Override
    public void onMouseDrag(int x, int y) {
    if (isSelected) {
            if (currentLine == null) {
                originX = x;
                originY = y;
                currentLine = new Line(originX, originY, originX, originY);
                currentLine.setFillColor(model.getCurrentFillColor());
                currentLine.setStrokeColor(model.getCurrentStrokeColor());
                model.addShape(currentLine);
            } else {
                currentLine.setX2(x);
                currentLine.setY2(y);
            }
        }
    }
}
