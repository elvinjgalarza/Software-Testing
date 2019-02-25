package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
     /*
     * P1: For any non-null reference value x, x.equals(null) should return false.
     */
    @Test public void t0() {
        assertFalse(new Object().equals(null));
    }
    // your test methods for P1 go here
    @Test public void t1(){
        C c = new C(7);
        assertFalse(c.equals(null));
    }

    @Test public void t2(){
        D d = new D(3,7);
        assertFalse(d.equals(null));
    }

    /*
     * P2: It is reflexive: for any non-null reference value x, x.equals(x)
     * should return true.
     */
// your test methods for P2 go here
    @Test public void t3(){
        Object o = new Object();
        assertTrue(o.equals(o));
    }

    @Test public void t4(){
        C c = new C(7);
        assertTrue(c.equals(c));
    }

    @Test public void t5(){
        D d = new D(3,7);
        assertTrue(d.equals(d));
    }

    /*
     * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
     * should return true if and only if y.equals(x) returns true.
     */
// your test methods for P3 go here
    @Test public void t6(){
        Object o1 = new Object();
        Object o2 = o1;
        assertTrue(o2.equals(o1));
    }

    @Test public void t7(){
        Object o = new Object();
        C c = new C(7);
        assertFalse(o.equals(c));
    }

    @Test public void t8(){
        Object o = new Object();
        D d = new D(3,7);
        assertFalse(o.equals(d));
    }

    @Test public void t9(){
        Object o = new Object();
        C c = new C(7);
        assertFalse(c.equals(o));
    }

    @Test public void t10(){
        C c = new C(7);
        D d = new D(3,7);
        assertFalse(c.equals(d));
    }

    @Test public void t11(){
        Object o = new Object();
        D d = new D(3,7);
        assertFalse(d.equals(o));
    }

    @Test public void t12(){
        C c = new C(7);
        D d = new D(3,7);
        assertFalse(d.equals(c));
    }

    @Test public void t13(){
        C c1 = new C(7);
        C c2 = c1;
        assertTrue(c2.equals(c1));
    }

    @Test public void t14(){
        D d1 = new D(3,7);
        D d2 = d1;
        assertTrue(d2.equals(d1));
    }



    /*
     * P4: It is transitive: for any non-null reference values x, y, and z,
     * if x.equals(y) returns true and y.equals(z) returns true, then
     * x.equals(z) should return true.
     */
// you do not need to write tests for P4
}