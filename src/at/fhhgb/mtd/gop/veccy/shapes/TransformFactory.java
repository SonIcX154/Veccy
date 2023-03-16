package at.fhhgb.mtd.gop.veccy.shapes;
import java.lang.Math;


public class TransformFactory {
    public static Matrix3 createTranslation(int deltaX, int deltaY) {
        return new Matrix3(new double[][] {
                { 1, 0, deltaX },
                { 0, 1, deltaY },
                { 0, 0, 1 }
        });
    }

    public static Matrix3 createRotation(double radians) {
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        return new Matrix3(new double[][] {
                { cos, -sin, 0 },
                { sin, cos, 0 },
                { 0, 0, 1 }
        });
    }

    public static Matrix3 createHorizontalMirroring() {
        return new Matrix3(new double[][] {
                { -1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        });
    }

    public static Matrix3 createVerticalMirroring() {
        return new Matrix3(new double[][] {
                { 1, 0, 0 },
                { 0, -1, 0 },
                { 0, 0, 1 }
        });
    }

    public static Matrix3 createScaling(double factorX, double factorY) {
        return new Matrix3(new double[][] {
                { factorX, 0, 0 },
                { 0, factorY, 0 },
                { 0, 0, 1 }
        });
    }
}