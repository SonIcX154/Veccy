package at.fhhgb.mtd.gop.veccy.features;

import at.fhhgb.mtd.gop.veccy.model.CanvasModel;
import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Rectangle;

public class RectangleFeature implements NamedFeature {
    private Rectangle currentRectangle;
    private int originX;
    private int originY;
    private boolean isSelected;

    public RectangleFeature(CanvasModel model) {
        this.model = model;
    }

    private CanvasModel model;

    @Override
    public String getName() {
        return "Rectangle";
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
        if (isSelected && currentRectangle != null) {
            currentRectangle = null;
        }
    }

    @Override
    public void onMouseDrag(int x, int y) {
        if (isSelected) {
            if (currentRectangle == null) {
                originX = x;
                originY = y;
                currentRectangle = new Rectangle(originX, originY, x, y);
                currentRectangle.setFillColor(model.getCurrentFillColor());
                currentRectangle.setStrokeColor(model.getCurrentStrokeColor());
                model.addShape(currentRectangle);
            } else {
                currentRectangle.setWidth(Math.abs(x - originX));
                currentRectangle.setHeight(Math.abs(y - originY));
                currentRectangle.moveTo(Math.min(x, originX), Math.min(y, originY));
            }
        }
    }
}

