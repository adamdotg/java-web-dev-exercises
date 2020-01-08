package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class ArrayListExercise {
  public static void main(String[] args){
    //ArrayList<String> numbs = new ArrayList<>();
    int[] numbs = {1, 2, 6, 8, 7, 10, 22, 9, 31, 44};
    double sum = 0.0;
    for (int i=0; i<numbs.length; i++){
      if (numbs[i]%2==0){
        sum += numbs[i];
      }
    }
    System.out.println(sum);

    String[] words = {"diver", "roads", "cats", "black", "ancient", "words", "house", "I", "to", "for", "is"};
    for (int i=0; i<words.length; i++){
      if (words[i].length()==5){
        System.out.println(words[i]);
      }
//      else {
//        System.out.println("This word is not 5 characters in length: "+words[i]);
//      }
    }
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word length search value:");
    double length =  input.nextDouble();
    for (int i=0; i<words.length; i++){
      if (words[i].length()==length){
        System.out.println(words[i]);
      }
    }

  }
}
