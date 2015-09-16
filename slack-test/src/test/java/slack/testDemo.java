package slack;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by wworden on 9/16/15.
 */
public class testDemo {


@Test
    public void testShouldPass(){
    assertTrue(true);
    }

@Test
    public void testShouldFail(){
    assertTrue(false);
}

    @Test(dependsOnMethods = { "testShouldFail" })
    public void testShouldSkip(){
        assertTrue(true);
    }
}
