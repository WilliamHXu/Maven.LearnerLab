package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Before
    public void setup(){
        ZipCodeWilmington zipCodeWilmington = null;
    }

    @Test
    public void testHostLectureTeacher(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructor[] instructors = zipCodeWilmington.getInstructors().getArray();
        Instructor instructor = instructors[0];
        Student[] students = zipCodeWilmington.getStudents().getArray();
        // Fill initial study times
        Double[] initialStudyTimes = new Double[zipCodeWilmington.getStudents().getArray().length];
        for (int i = 0; i < initialStudyTimes.length; i++){
            initialStudyTimes[i] = students[i].getTotalStudyTime();
        }
        zipCodeWilmington.hostLecture(instructor, 43d);
        boolean flag = true;
        for (int i = 0; i < initialStudyTimes.length; i++) {
            if(students[i].getTotalStudyTime() != initialStudyTimes[i] + 1){
                flag = false;
            }
        }
        Assert.assertTrue(flag);
    }

    @Test
    public void testHostLectureID(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructor[] instructors = zipCodeWilmington.getInstructors().getArray();
        Instructor instructor = instructors[0];
        Student[] students = zipCodeWilmington.getStudents().getArray();
        // Fill initial study times
        Double[] initialStudyTimes = new Double[zipCodeWilmington.getStudents().getArray().length];
        for (int i = 0; i < initialStudyTimes.length; i++){
            initialStudyTimes[i] = students[i].getTotalStudyTime();
        }
        zipCodeWilmington.hostLecture(101, 43d);
        boolean flag = true;
        for (int i = 0; i < initialStudyTimes.length; i++) {
            if(students[i].getTotalStudyTime() != initialStudyTimes[i] + 1){
                flag = false;
            }
        }
        Assert.assertTrue(flag);
    }
}
