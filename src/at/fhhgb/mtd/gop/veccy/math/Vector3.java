package at.fhhgb.mtd.gop.veccy.math;

public class Vector3 {
    private double[] values = new double[3];
    // Initialisiert values mit { 0.0, 0.0, 1.0 }
    public Vector3() {
        this.values = new double[] { 0.0, 0.0, 1.0 };
    }
    // Initialisiert this.values mit dem Parameter values (kopieren Sie die Werte!)
    public Vector3(double[] values) {
        this.values = values;
    }
    // Initialisiert this.values mit den values aus dem Parameter vector
    // (verwenden Sie this()!)
    // Initializes values with the provided coordinates
    public Vector3(double x, double y, double z) {
        values[0] = x;
        values[1] = y;
        values[2] = z;
    }

    // Initializes this.values with the values from the parameter vector
    // (use the constructor with individual coordinates)
    public Vector3(Vector3 vector) {
        this(vector.values[0], vector.values[1], vector.values[2]);
    }

    // Returns the values array
    public double[] getValues() {
        return values;
    }
}
