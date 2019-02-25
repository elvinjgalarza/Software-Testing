package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
public class HashCodeTester {
    /*
     * P5: If two objects are equal according to the equals(Object)
     * method, then calling the hashCode method on each of
     * the two objects must produce the same integer result.
     */
// your test methods go here

    @Test public void t0(){
        Object o1 = new Object();
        Object o2 = o1;

        assertTrue(o1.hashCode() == o2.hashCode());
    }

    @Test public void t1(){
        Object o = new Object();
        C c = new C(7);

        assertFalse(o.hashCode() == c.hashCode());
    }

    @Test public void t2(){
        Object o = new Object();
        D d = new D(3,7);

        assertFalse(o.hashCode() == d.hashCode());
    }

    @Test public void t3(){
        C c = new C(7);
        Object o = new Object();

        assertFalse(c.hashCode() == o.hashCode());
    }

    @Test public void t4(){
        C c1 = new C(7);
        C c2 = c1;
        
        assertTrue(c1.hashCode() == c2.hashCode());
    }

    @Test public void t5(){
        C c = new C(7);
        D d = new D(3,7);

        assertFalse(c.hashCode() == d.hashCode());
    }

    @Test public void t6(){
        D d1 = new D(3,7);
        D d2 = d1;

        assertTrue(d1.hashCode() == d2.hashCode());
    }

    @Test public void t7(){
        D d = new D(3,7);
        Object o = new Object();

        assertFalse(d.hashCode() == o.hashCode());
    }

    @Test public void t8(){
        D d = new D(3,7);
        C c = new C(7);

        assertFalse(d.hashCode() == c.hashCode());
    }

}