package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String classRoom;
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private boolean isPassed = true;

    private Passed passed;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String classRoom, int subject1, int subject2, int subject3, int subject4) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.classRoom = classRoom;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    //V případě že nemá maturitu za sebou
    public Student(String firstName, String lastName, LocalDate dateOfBirth, String classRoom) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.classRoom = classRoom;
        subject1 = 0;
        subject2 = 0;
        subject3 = 0;
        subject4 = 0;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public int getSubject4() {
        return subject4;
    }

    public void setSubject4(int subject4) {
        this.subject4 = subject4;
    }

    public Passed getPassed() {
        return passed;
    }

    public void setPassed(Passed passed) {
        this.passed = passed;
    }

    public String getDescription() {
        return getFirstName() + ", " + getLastName() + ", " + getDateOfBirth() + ", " + getClassRoom() + ", " + getSubject1() + ", " + getSubject2() + ", " + getSubject3() + ", " + getSubject4();
    }

    public String ifPassed() {
        if (subject1 == 0) {
            return "Student " + getFirstName() + " " + getLastName() + " nemá maturitu za sebou!";
        } else {
            return rating();
        }
    }

    public String rating() {
        ArrayList<Integer> listOfMarks = new ArrayList<>();
        listOfMarks.add(getSubject1());
        listOfMarks.add(getSubject2());
        listOfMarks.add(getSubject3());
        listOfMarks.add(getSubject4());
        int count = 0;
        for (Integer i : listOfMarks) {
            count += 1;
            if (i == 5) {
                isPassed = false;
                break;
            } else {
                isPassed = true;
            }
        }
        int sumOfMarks = 0;
        sumOfMarks = getSubject1() + getSubject2() + getSubject3() + getSubject4();
        int aveMark = sumOfMarks / count;
        if (isPassed == true) {
            if (aveMark < 1.5) {
                return "Student " + getFirstName() + " " + getLastName() + " "+Passed.PASSED_WITH_HONOR;
            } else {
                return "Student " + getFirstName() + " " + getLastName() + " "+Passed.PASSED;
            }
        } else {
            return "Student " + getFirstName() + " " + getLastName() + " "+Passed.NOT_PASSED;
        }
    }
}