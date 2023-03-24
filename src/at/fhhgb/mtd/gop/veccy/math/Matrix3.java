package at.fhhgb.mtd.gop.veccy.math;

import java.util.Arrays;

public class Matrix3 {
    private double[][] values;

    // Initialisiert values als Einheitsmatrix
    // 1.0 0.0 0.0
    // 0.0 1.0 0.0
    // 0.0 0.0 1.0
    public Matrix3() {
        values = new double[][]{{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
    }

    // Initialisiert this.values mit dem Parameter values (kopieren Sie die Werte!)
    public Matrix3(double[][] values) {
        this.values = new double[3][3];
        for (int i = 0; i < 3; i++) {
            this.values[i] = Arrays.copyOf(values[i], 3);
        }
    }

    // Initialisiert this.values mit den values aus dem Parameter matrix
    // (Tipp: Verwenden Sie this()!)
    public Matrix3(Matrix3 matrix) {
        this(matrix.values);
    }

    // Implementieren Sie eine Matrixmultiplikation und geben Sie eine neue Matrix3
    // Instanz mit dem Ergebnis zurück
    public Matrix3 mult(Matrix3 matrix) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += values[i][k] * matrix.values[k][j];
                }
            }
        }
        return new Matrix3(result);
    }

    // Implementieren Sie eine Multiplikation Matrix3 * Vector3 und geben Sie eine
    // neue Vector3 Instanz mit dem Ergebnis zurück
    public Vector3 mult(Vector3 vector) {
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = 0.0;
            for (int j = 0; j < 3; j++) {
                result[i] += values[i][j] * vector.getValues()[j];
            }
        }
        return new Vector3(result);
    }

    // Returniert die Instanzvariable values
    public double[][] getValues() {
        return values;
    }
}

