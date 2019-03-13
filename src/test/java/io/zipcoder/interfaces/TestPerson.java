package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void testConstructor(){
        long expected = 1;
        Person person = new Person(expected);
        long actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        long id = 1;
        Person person = new Person(id);
        String name = "Will";
        person.setName(name);
        String actual = person.getName();
        Assert.assertEquals(name, actual);
    }


}
