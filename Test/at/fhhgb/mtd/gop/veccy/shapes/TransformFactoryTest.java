package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformFactoryTest {

    @Test
    void createTranslation() {
        Matrix3 expected = new Matrix3(new double[][] {
                { 1, 0, 2 },
                { 0, 1, 3 },
                { 0, 0, 1 }
        });
        // Call the method being tested
        Matrix3 actual = TransformFactory.createTranslation(2, 3);

        // Compare the expected and actual matrices
        assertArrayEquals(expected.getValues(), actual.getValues());
    }

    @Test
    void createRotation() {
        Matrix3 expected = new Matrix3(new double[][] {
                { 0.5403023058681398, -0.8414709848078965, 0 },
                { 0.8414709848078965, 0.5403023058681398, 0 },
                { 0, 0, 1 }
        });
    }

    @Test
    void createHorizontalMirroring() {
    }

    @Test
    void createVerticalMirroring() {
    }

    @Test
    void createScaling() {
    }
}