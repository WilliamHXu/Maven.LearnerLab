package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1);
        boolean actual = instructor instanceof Teacher;
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1);
        boolean actual = instructor instanceof Person;
        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(1);
        Student student = new Student(2);
        Double hours = 8d;
        instructor.teach(student, hours);
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(hours, actual);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(1);
        Student student1 = new Student(2);
        Student student2 = new Student(3);
        Student student3 = new Student(4);
        Student student4 = new Student(5);
        Double hours = 8d;
        Student[] students = {student1, student2, student3, student4};
        instructor.lecture(students, hours);
        Double expected = 2d;
        Double actual1 = student1.getTotalStudyTime();
        Double actual2 = student2.getTotalStudyTime();
        Double actual3 = student3.getTotalStudyTime();
        Double actual4 = student4.getTotalStudyTime();
        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);
        Assert.assertEquals(expected, actual3);
        Assert.assertEquals(expected, actual4);
    }
}
