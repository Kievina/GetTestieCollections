package works;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestComparable {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArraySortPerson() {
        Person p1 = new Person("John", 1991);
        Person p2 = new Person("Sally", 1995);
        Person p3 = new Person("Amy", 1989);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        //System.out.println(people.toString());
        Assert.assertEquals(p1, people.get(0));
        Assert.assertEquals(p2, people.get(1));
        Assert.assertEquals(p3, people.get(2));

        Collections.sort(people);
        //System.out.println(people.toString());

        Assert.assertEquals(p3, people.get(0));
        Assert.assertEquals(p1, people.get(1));
        Assert.assertEquals(p2, people.get(2));
    }
}
