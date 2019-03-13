package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    private final String[] zipCodeStudentsNames = {
            "Swapna", "Davis", "Julian", "Thao", "Mark", "Katherine",
            "Neela", "Sean M.", "Will", "Delenda", "Joe", "Ashley B.",
            "Laxmi", "Yang", "Aswathy", "Swarthi", "Shuchi", "Cara",
            "Reese", "Sravani", "Cris", "Eric", "Alex", "David",
            "Ashley", "Brian", "David", "Ashley R.", "Brian", "Eleanor",
            "Leah", "Nirmala", "Kyle", "Charlie", "Marlys", "Marshilla",
            "Ajah", "James", "Mike", "Robyn", "Francisco", "Sean R.", "Sunhyun",
            "Arcy", "Zaina", "Kat"
    };

    @Test
    public void test(){
        boolean containsAll = true;
        Students students = Students.getInstance();
        for (int i = 0; i < 43; i++) {
            if(!students.findById(i).getName().equals(zipCodeStudentsNames[i])){
                containsAll = false;
                break;
            }
        }
        Assert.assertTrue(containsAll);
    }
}
