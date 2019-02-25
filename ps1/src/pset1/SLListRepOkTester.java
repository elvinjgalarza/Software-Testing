package pset1;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import pset1.SLList.Node;
public class SLListRepOkTester {
    @Test public void t0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    /* test repOk is true for only one node */
    @Test public void t1() {
        SLList l = new SLList();
        Node n = new Node();
// your code goes here
        l.header = n;
        n.elem = true;
        n.next = null;
        assertTrue(l.repOk());
    }
// your code goes here

    /* test repOk() is false for only one node */
    @Test public void t2(){
        SLList l = new SLList();
        Node n = new Node();
        n.elem = true;
        l.header = n;
        l.header.next = l.header;
        assertFalse(l.repOk());
    }

    /* test repOk() with two true nodes */
    @Test public void t3(){
        SLList l = new SLList();
        Node n1 = new Node();
        Node n2 = new Node();

        l.header = n1;
        n1.elem = true;

        n2.elem = true;
        l.header.next = n2;

        assertTrue(l.header.elem);
        assertTrue(l.header.next != null);
        assertTrue(l.header.next.elem);
        assertTrue(l.header.next.next == null);
        assertTrue(l.repOk());
    }

    /* test repOk() with two false nodes */
    @Test public void t4(){
        SLList l = new SLList();
        Node n1 = new Node();
        Node n2 = new Node();

        // n1 at front
        l.header = n1;
        assertFalse(l.header.elem);
        n1.elem = false;
        assertFalse(l.header.elem);

        n2.elem = false;
        l.header.next = n2;
        assertFalse(l.header.next.elem);
        assertTrue(l.header.next != null);

        // make n2's next the head to make a cycle
        n2.next = l.header;
        assertTrue(n2.next != null);

        assertFalse(l.repOk());
    }
}