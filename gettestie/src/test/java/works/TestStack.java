package works;

import static org.junit.Assert.*;

import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();

        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("this");
        stack.push("is");
        stack.push("a");
        stack.push("test");

        String expected = "test";
        String actual = stack.peek();

        assertEquals(expected, actual); // false
    }
    // Make a bigger test exercising more Stack methods.....
}
