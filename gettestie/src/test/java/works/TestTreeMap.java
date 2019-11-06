package works;

import org.junit.Assert;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TreeMapGetTest() {
        // given
        Map<String, String> map = new TreeMap<>();
        Assert.assertTrue(map.isEmpty());
        map.put("John", "A");
        String expected = "A";

        // when
        String actual = map.get("John");

        // then
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TreeMapSizeTest() {
        // given
        Map<String, String> map = new TreeMap<>();
        map.put("John", "A");
        int expected = 1;

        // when
        int actual = map.size();

        // then
        Assert.assertEquals(expected, actual);
    }
}
