package test;

import impl.StringUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringUtilityTest {

    StringUtility tester;

    @BeforeEach
    void setUp() {
        tester = new StringUtility();
    }

    @AfterEach
    void tearDown() {
        tester = null;
    }

    @Test
    void testReverseString(){
        assertEquals("gfeDcbA", tester.reverseString("AbcDefg"));
    }
    @Test
    void testCapitalizeString(){
        assertEquals("ABCDEFG", tester.capitalizeString("AbcDefg"));
    }
    @Test
    void testLowercaseString(){
        assertEquals("abcdefg", tester.lowercaseString("AbcDefg"));
    }
}
