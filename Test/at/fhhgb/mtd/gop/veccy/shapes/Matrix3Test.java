package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix3Test {

    @Test
    void testTranslation(){
        Vector3 v = new Vector3(new double[]{5.0, 5.0, 1.0});
        Matrix3 t = TransformFactory.createTranslation(2, 3);
        Vector3 expected = new Vector3(new double[]{7.0, 8.0, 1.0});
        assertEquals(expected, t.mult(v));
    }

    @Test
    void mult() {
        Matrix3 m = new Matrix3();
        Matrix3 result = m.mult(m);

        assertEquals(m.getValues(), result.getValues());
    }

    @Test
    void testMult() {
    }

    @Test
    void getValues() {
    }
}