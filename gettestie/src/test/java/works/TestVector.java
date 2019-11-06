package works;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Vector;

public class TestVector {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void vectorCloneTest() {
        Vector v = new Vector();
        Vector v_clone = new Vector();

        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        v_clone = (Vector) v.clone();

        Assert.assertTrue(v.equals(v_clone));
    }

    @Test
    public void addAllTest() {
        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add("geeks");
        arr.add("forgeeks");
        arr.add(4);

        // create default vector
        Vector v = new Vector();
        Assert.assertTrue(v.isEmpty());
        // copying all element of array list int0 vector
        v.addAll(arr);
        Assert.assertFalse(v.isEmpty());
    }
}
