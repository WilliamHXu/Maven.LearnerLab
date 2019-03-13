package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    private static ZipCodeWilmington INSTANCE;
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ZipCodeWilmington();
        }
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Instructor lecturer = null;
        Instructor[] instructorsArr = instructors.getArray();
        for (Instructor instructor : instructorsArr){
            if(instructor.equals(teacher)){
                lecturer = instructor;
            }
        }
        if(lecturer != null){
            lecturer.lecture(students.getArray(), numberOfHours);
        }
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor lecturer = null;
        Instructor[] instructorsArr = instructors.getArray();
        for (Instructor instructor : instructorsArr){
            if(instructor.getId() == id){
                lecturer = instructor;
            }
        }
        if(lecturer != null){
            lecturer.lecture(students.getArray(), numberOfHours);
        }
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
