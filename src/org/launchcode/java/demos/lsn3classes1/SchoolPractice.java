package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
    Student myStudent = new Student();
    Course myCourse = new Course();
    Teacher myTeacher = new Teacher();

    ArrayList<String> days = new ArrayList<>();
      days.add("Monday");
      days.add("Wednesday");
      days.add("Friday");

    myStudent.setName("Adam");
    //myStudent.getName();
    myStudent.setNumberOfCredits(1);
    myStudent.setGpa(4.0);

    myCourse.setDays(days);
    myCourse.setInstructor("Professor Cheffing");
    myCourse.setRoomNumber(15);
    myCourse.setTime("4pm - 9pm");

    myTeacher.setFirstName("Martha");
    myTeacher.setLastName("Griffin");
    myTeacher.setSubject("Math");
    myTeacher.setYearsTeaching(32);

    System.out.println("Student name: "+myStudent.getName());
    System.out.println("Student credits: "+myStudent.getNumberOfCredits());
    System.out.println("Student gpa: "+myStudent.getGpa());

    System.out.println(("Days: "+myCourse.getDays() ));
    System.out.println("Course instructor: "+ myCourse.getInstructor());
    System.out.println(("Room number: "+ myCourse.getRoomNumber()));
    System.out.println("Course time: "+myCourse.getTime());

    System.out.println("\n"+myTeacher.getFirstName()+" "+myTeacher.getLastName()+" has been teaching "+myTeacher.getSubject()+" for "+myTeacher.getYearsTeaching()+" years."+"\n");

    myStudent.myMessage();
    }
}
