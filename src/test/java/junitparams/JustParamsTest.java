package junitparams;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;

@RunWith(JUnitParamsRunner.class)
public class JustParamsTest {

    @Test
    @Parameters({ "1", "2" })
    public void singleParam(int number) {
        assertTrue(number > 0);
    }

    @Test
    @Parameters({ "a \n b", "a(asdf)" })
    public void specialCharsInParam(String a) throws Exception {
    }

    @Test
    @Parameters({ "1, false", "2, true" })
    public void multipleParams(int number, boolean what) throws Exception {
        assertEquals(what, number > 1);
    }
}
