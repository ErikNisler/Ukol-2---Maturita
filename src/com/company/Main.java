package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Petr", "Klíč", LocalDate.of(2000,3,5),"IT1A"));
        listOfStudents.add(new Student("Jan", "Ptáčník", LocalDate.of(2000,3,5),"IT1A",
                4,5,2,1));
        listOfStudents.add(new Student("Pavel", "Lopata", LocalDate.of(2000,3,5),"IT1A",
                1,1,2,1));
        listOfStudents.add(new Student("Dalibor", "Pádlo", LocalDate.of(2000,3,5),"IT1A",
                4,5,2,1));


       /** Student student1 = new Student("Petr", "Klíč", LocalDate.of(2000,3,5),"IT1A");
        Student student2 = new Student("Jan", "Ptáčník", LocalDate.of(2000,3,5),"IT1A",
                4,5,2,1);
        Student student3 = new Student("Pavel", "Lopata", LocalDate.of(2000,3,5),"IT1A",
                1,1,2,1);
        Student student4 = new Student("Dalibor", "Pádlo", LocalDate.of(2000,3,5),"IT1A",
                4,5,2,1);*/

        System.out.println(listOfStudents.get(0).ifPassed());
        System.out.println(listOfStudents.get(1).ifPassed());
        System.out.println(listOfStudents.get(2).ifPassed());
        System.out.println(listOfStudents.get(3).ifPassed());

    }
}
