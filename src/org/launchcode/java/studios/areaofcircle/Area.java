package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
            //add if then for negative number, non number, empty string
        if (radius < 0) {
            System.out.println("This number is less than 0: " + radius);
        }



//      System.out.println("The area of a circle of radius "+radius+" is: "+area);
//      25double area = 3.14 * radius * radius;
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+radius+" is: "+area);
    }
}
