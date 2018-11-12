package at.semanticlabs.idea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LatePropertyEvaluationTest {

    private static final String PROPERTY_NAME = "foo";
    private static final String EXPECTED_PROPERTY_VALUE = "bar";

    @Test
    void readsSystemPropertyProvidedToSureFire() {
        assertEquals(System.getProperty(PROPERTY_NAME), EXPECTED_PROPERTY_VALUE);
    }

}
