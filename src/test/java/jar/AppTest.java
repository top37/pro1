package jar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testApp()
    {
        assett();
        App app = new App();
        app.setName("aqiang");
        System.out.println(app.getName());
    }

    private void assett() {

        int one = 1;
        int two = 2;
        int three = one + two;
        int four = two + two;
        assertTrue( true );
    }

}
