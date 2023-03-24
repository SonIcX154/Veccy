package at.fhhgb.mtd.gop.veccy.shapes;

import at.fhhgb.mtd.gop.veccy.math.Matrix3;
import at.fhhgb.mtd.gop.veccy.math.TransformFactory;
import at.fhhgb.mtd.gop.veccy.math.Vector3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix3Test {
    //ToDo Transformationen Testen!!

    @Test
    void testTranslation(){
        Vector3 v = new Vector3(new double[]{5.0, 5.0, 1.0});
        Matrix3 t = TransformFactory.createTranslation(2, 3);
        Vector3 expected = new Vector3(new double[]{7.0, 8.0, 1.0});
        assertArrayEquals(expected.getValues(), t.mult(v).getValues());
    }

    @Test
    void testMatrixMult() {
        Matrix3 m = new Matrix3();
        Matrix3 result = m.mult(m);

        assertArrayEquals(m.getValues(), result.getValues());
    }

    @Test
    void testMatrixVectorMult() {
        Matrix3 m = new Matrix3();
        Vector3 v = new Vector3();
        Vector3 result = m.mult(v);

        assertArrayEquals(v.getValues(), result.getValues());
    }
}