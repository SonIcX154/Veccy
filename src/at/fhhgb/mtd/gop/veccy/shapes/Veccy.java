package at.fhhgb.mtd.gop.veccy.shapes;

import at.fhhgb.mtd.gop.veccy.VeccyGUI;
import at.fhhgb.mtd.gop.veccy.model.CanvasModel;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Veccy extends Application {
    public static void main(String[] args) {
        launch();

    }
    @Override
    public void start(Stage stage) throws Exception {
        VeccyGUI veccyGUI = new VeccyGUI(stage);
        CanvasModel model = veccyGUI.getModel();

        for(int x = 307; x < 970; x += 5) {
            Circle c = new Circle(x, 600 + (int) (Math.cos(x * 0.005) * 200), 20);
            c.setFillColor(Color.color(Math.random(), Math.random(), Math.random()));
            model.addShape(c);
        }

        Circle eye1 = new Circle(317, 200, 50);
        Circle eye2 = new Circle(887, 200, 50);
        Circle pupil1 = new Circle(315, 205, 20);
        Circle pupil2 = new Circle(885, 205, 20);
        eye1.setFillColor(Color.WHITE);
        eye2.setFillColor(Color.WHITE);
        pupil1.setFillColor(Color.BLACK);
        pupil2.setFillColor(Color.BLACK);
        model.addShape(eye1);
        model.addShape(eye2);
        model.addShape(pupil1);
        model.addShape(pupil2);
    }
}