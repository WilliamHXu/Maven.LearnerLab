package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();
        Person person = new Person(1);
        people.add(person);
        Person[] expected = {person};
        Person[] actual = people.getArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        People people = new People();
        Person person = new Person(1);
        people.add(person);
        Person[] expected1 = {person};
        Person[] actual1 = people.getArray();
        people.remove(person);
        Person[] expected2 = {};
        Person[] actual2 = people.getArray();
        Assert.assertArrayEquals(expected1, actual1);
        Assert.assertArrayEquals(expected2, actual2);
    }

    @Test
    public void testFindById(){
        People people = new People();
        Person person = new Person(1);
        people.add(person);
        Person actual1 = people.findById(1);
        Assert.assertEquals(person, actual1);
    }
}
