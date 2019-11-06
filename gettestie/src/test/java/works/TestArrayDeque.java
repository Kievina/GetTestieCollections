package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class TestArrayDeque {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    @org.junit.Test
    public void DequeAddFirstTest() {
        Deque<String> deque = new LinkedList<String>();
        deque.add("Element 1 (Tail)"); // add to tail
        deque.addFirst("Element 2 (Head)");
        /*deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)"); //add to head
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        deque.offerLast("Element 7 (Tail)");*/

        String expected = "Element 2 (Head)";
        String actual = deque.peek();

        Assert.assertEquals(expected, actual); // true
    }

    @Test public void DequeRemoveFirstTest() {
        Deque<String> deque = new LinkedList<String>();
        deque.add("Element 1 (Tail)"); // add to tail
        deque.addFirst("Element 2 (Head)");
        /*deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)"); //add to head
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        deque.offerLast("Element 7 (Tail)");*/

        String expected = "Element 2 (Head)";
        deque.removeFirst();

        Assert.assertFalse(deque.contains(expected)); // false
    }
}
