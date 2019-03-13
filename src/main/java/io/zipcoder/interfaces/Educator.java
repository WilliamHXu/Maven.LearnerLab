package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    KRIS,
    FROILAN,
    LEON,
    WILHEM,
    DOLIO,
    NHU;

    private final Instructor instructor;
    private double timeWorked;

    public Educator() {
        this.instructor = new Instructor(this.ordinal());
        instructor.setName(this.name());
        timeWorked = 0d;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
