package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void testImplementation(){
        Student student = new Student(1);
        boolean actual = student instanceof Learner;
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(1);
        boolean actual = student instanceof Person;
        Assert.assertTrue(actual);
    }

    @Test
    public void testLearn(){
        Student student = new Student(1);
        Double study = 8d;
        student.learn(study);
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(study, actual);
    }

}
