package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String firstSentence = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice" +
                " she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";
        System.out.println("Enter a word that was used in the first sentence of Alice's Adventures in Wonderland");
        String word = input.next().toLowerCase();
            if (firstSentence.toLowerCase().contains(word)){
                System.out.println("Word found");
                String secondSentence = firstSentence.replace(word, "");
                System.out.println(secondSentence);
            } else {
                System.out.println("Word not found");
            }
        System.out.println(firstSentence.indexOf(word));
        System.out.println(word.length());
    }
}
