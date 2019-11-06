package works;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void iteratorHasNextTest() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Iterator to traverse the list
        Iterator iterator = list.iterator();

        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void iteratorRemoveTest() {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            al.add(i);

        Iterator itr = al.iterator();

        // checking the next element availability
        while (itr.hasNext()) {
            //  moving cursor to next element
            int i = (Integer) itr.next();

            // Removing odd elements
            if (i % 2 != 0)
                itr.remove();
        }

        Assert.assertTrue(al.contains(0));
        Assert.assertTrue(al.contains(2));
        Assert.assertTrue(al.contains(4));
        Assert.assertTrue(al.contains(6));
        Assert.assertTrue(al.contains(8));

    }
}
