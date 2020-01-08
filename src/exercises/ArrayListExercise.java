package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class ArrayListExercise {
  public static void main(String[] args){
    ArrayList<Integer> numbs = new ArrayList<Integer>();
      numbs.add(1);
      numbs.add(2);
      numbs.add(6);
      numbs.add(8);
      numbs.add(7);
      numbs.add(10);
      numbs.add(22);
      numbs.add(9);
      numbs.add(31);
      numbs.add(44);

    double sum = 0.0;
    //int[] numbs = {1, 2, 6, 8, 7, 10, 22, 9, 31, 44};
    for (Integer numb : numbs) {
      if (numb % 2 != 0) {
        sum += numb;
      }
    }
    System.out.println(sum);

    String[] words = {"diver", "roads", "cats", "black", "ancient", "words", "house", "I", "to", "for", "is"};
    for (String word : words) {
      if (word.length() == 5) {
        System.out.println(word);
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
