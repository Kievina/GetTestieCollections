package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
        public void PriorityQueueSizeTest() {
        // given
        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.add("C");
        newQueue.add("C++");
        newQueue.add("Java");
        newQueue.add("Python");

        int expected = 4;

        // when
        int actual = newQueue.size();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void PriorityQueueContainsTest() {
        // given
        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.add("C");
        newQueue.add("C++");
        newQueue.add("Java");
        newQueue.add("Python");

        // when
        Boolean actual = newQueue.contains("C");

        // then
        Assert.assertTrue(actual);
    }
}
