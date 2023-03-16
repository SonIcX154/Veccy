package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector3Test {

    @Test
    void getValues() {
        Vector3 v = new Vector3();
        assertArrayEquals(new double[]{0.0, 0.0, 1.0}, v.getValues());
    }
}