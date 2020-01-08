package exercises;

import java.util.Arrays;

public class Array {
  public static void main(String[] args){
    int[] numbers = {1, 1, 2, 3, 5, 8};

    for (int i : numbers){
      if(i%2!=0){
        System.out.println(i);
      }
    }

    int maxWords = 40;

    String phrase = "I would not, could not, in a box." +
      " I would not, could not with a fox." +
      " I will not eat them in a house." +
      " I will not eat them with a mouse.";
    //String[] phraseArr = new String[maxWords];
    String[] phraseArr = phrase.split(" ");
    System.out.println(Arrays.toString(phraseArr));

    String[] phraseArrDel = phrase.split("\\.");
    System.out.println(Arrays.toString(phraseArrDel));
  }
}
