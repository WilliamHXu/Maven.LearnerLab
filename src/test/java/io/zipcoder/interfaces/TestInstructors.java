package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    private final String[] zipCodeInstructorsNames = {
            "Kris", "Froilan", "Leon", "Wilhem", "Dolio", "Nhu"
    };

    @Test
    public void test(){
        boolean containsAll = true;
        Instructors instructors = Instructors.getInstance();
        for (int i = 0; i < zipCodeInstructorsNames.length; i++) {
            if(!instructors.findById(i+100).getName().equals(zipCodeInstructorsNames[i])){
                containsAll = false;
                break;
            }
        }
        Assert.assertTrue(containsAll);
    }
}
