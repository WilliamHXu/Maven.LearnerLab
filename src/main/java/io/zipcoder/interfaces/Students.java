package io.zipcoder.interfaces;

public final class Students extends People<Student>{
    private static Students INSTANCE;

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

    private Students(){
        for(int i = 0; i < 43; i++){
            Student studentToAdd = new Student(i);
            studentToAdd.setName(zipCodeStudentsNames[i]);
            add(studentToAdd);
        }
    }

    public static Students getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Students();
        }
        return INSTANCE;
    }

    @Override
    public Student[] getArray(){
        Student[] result = new Student[personList.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = personList.get(i);
        }
        return result;
    }
}
