package works;

import org.junit.Assert;
import org.junit.Test;
import java.util.TreeSet;

public class TestTreeSet {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TreeSetClearTest() {
        TreeSet<String> al = new TreeSet<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        Assert.assertFalse(al.isEmpty());

        al.clear();

        Assert.assertTrue(al.isEmpty());
    }

    @Test
    public void TreeSetPollFirstTest() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);

        int expected = 12;
        int actual = set.pollFirst();

        Assert.assertEquals(expected, actual);
    }
}
