import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Squareroot_Test {
    @BeforeClass
    public static void before_test() {

        System.out.println("starting Squareroot test");

    }


    @Test
    public void positive_float() {

        Calculator mycalc = new Calculator();
        System.out.println("test 1) Squareroot +ve");
        assertEquals("Squareroot 5 not working correctly",2,mycalc.square_root(4),0.00001);
    }

    @Test
    public void negative_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 2) Square_root -ve");
        assertEquals("Squareroot -5 not working correctly",-1,mycalc.square_root(-6),0.00001);
    }
}
