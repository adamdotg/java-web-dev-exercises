package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
  public static void main(String[] arg){
    HashMap<Integer, String> students = new HashMap<>();
    Scanner input = new Scanner(System.in);
    String newStudent;

    System.out.println("Enter student info");

    do{
      System.out.print("Student:");
      newStudent = input.nextLine();

      if (!newStudent.equals("")){
        System.out.print("ID:");
        Integer newID = input.nextInt();
        students.put(newID, newStudent);

        input.nextLine();
      }
    } while(!newStudent.equals(""));

    System.out.println(students);

  }
}
