package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static Instructors INSTANCE;

    private final String[] zipCodeInstructorsNames = {
            "Kris", "Froilan", "Leon", "Wilhem", "Dolio", "Nhu"
    };

    private Instructors() {
        for(int i = 0; i < zipCodeInstructorsNames.length; i++){
            Instructor instructor = new Instructor(i + 100);
            instructor.setName(zipCodeInstructorsNames[i]);
            add(instructor);
        }
    }

    public static Instructors getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    @Override
    public Instructor[] getArray(){
        Instructor[] result = new Instructor[personList.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = personList.get(i);
        }
        return result;
    }
}
