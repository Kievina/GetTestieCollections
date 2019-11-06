package works;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addTest() {
        // given
        ArrayList<String> newList = new ArrayList<>();
        String valueToAdd = "Hello";

        Assert.assertFalse(newList.contains(valueToAdd));

        // when
        newList.add(valueToAdd);

        // then
        Assert.assertTrue(newList.contains(valueToAdd));
    }

    @org.junit.Test
    public void sizeTest() {
        // given
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Hello");
        newList.add("this");
        newList.add("is");
        newList.add("a");
        newList.add("test");
        int expectedSize = 5;

        // when
        int actualSize = newList.size();

        // then
        Assert.assertEquals(expectedSize, actualSize);
    }

}
