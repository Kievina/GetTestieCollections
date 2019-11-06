package works;

import org.junit.Assert;

import java.util.HashSet;

public class TestHashSet {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void HashSetIsEmptyTest() {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements

        Boolean actual = h.isEmpty();

        Assert.assertFalse(actual); // true
    }

    @org.junit.Test
    public void HashSetContainsTest() {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements

        Boolean actual1 = h.contains("India");
        Boolean actual2 = h.contains("USA");

        Assert.assertTrue(actual1); // true
        Assert.assertFalse(actual2); // true
    }
}
