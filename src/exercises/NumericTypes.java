package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle length:");
        double length = input.nextDouble();
        System.out.println("Rectangle width:");
        double width = input.nextDouble();
        double area = width * length;
        System.out.println("The rectangles area is:" + area);

    }
}
