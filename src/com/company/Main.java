package com.company;

import java.net.InetSocketAddress;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Petr", "Klíč", LocalDate.of(2000,3,5),"IT1A", 4,3,2,1);
        Student student2 = new Student("Jan", "Ptáčník", LocalDate.of(2000,3,5),"IT1A", 4,5,2,1);
        Student student3 = new Student("Pavel", "Lopata", LocalDate.of(2000,3,5),"IT1A",1,1,2,1);
        Student student4 = new Student("Dalibor", "Pádlo", LocalDate.of(2000,3,5),"IT1A", 4,5,2,1);

        System.out.println(student1.getDescription());
        System.out.println("Student "+student1+" "+student1.ifPassed());
        System.out.println("Student "+student2+" "+student2.ifPassed());
        System.out.println("Student "+student3+" "+student3.ifPassed());
        System.out.println("Student "+student4+" "+student4.ifPassed());

        System.out.println();
        //Enum řešení
        System.out.println("***Enum řešení***");

        student1.setPassed(Passed.PASSED);
        System.out.println("Student "+student1+" "+student1.getPassed().toString());

    }
}
