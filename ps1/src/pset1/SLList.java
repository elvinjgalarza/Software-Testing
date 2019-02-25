package pset1;

import java.util.HashSet;
import java.util.Set;

public class SLList {
    Node header; // head of list

    /* Linked List Node */
    static class Node {
        boolean elem;
        Node next;
    }

// postcondition: returns true iff <this> is an acyclic list, i.e.,
// there is no path from a node to itself
    boolean repOk() {
        Set<Node> visited = new HashSet<Node>();
        Node n = header;
        while (n != null) {
            if (!visited.add(n)) {
                return false;
            }
            n = n.next;
        }
        return true;
    }

// precondition: this.repOk()
// postcondition: adds <e> in a new node at the beginning of the
// list; the rest of the list is unmodified
    void add(boolean e) {

        Node newNode = new Node();
        newNode.elem = e;
        newNode.next = header;
        header = newNode;
    }
}
