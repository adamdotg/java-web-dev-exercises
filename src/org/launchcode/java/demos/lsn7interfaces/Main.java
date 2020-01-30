package org.launchcode.java.demos.lsn7interfaces;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class Main {
  private ArrayList<Flavor> flavors;

  public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        //Comparator comparator = new FlavorComparator();

        flavors.sort(new FlavorComparator());
        for (int i = 0; i<flavors.size(); i++ ){
          System.out.println(flavors.get(i));
        }
        System.out.println("------------------------");
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        cones.sort(new ConeComparator());
        for (int i=0; i<cones.size(); i++){
          System.out.println(cones.get(i));
        }
        System.out.println("------------------------");
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        toppings.sort(new ToppingComparator());
        for (int i = 0; i < toppings.size(); i++){
          System.out.println(toppings.get(i));
        }
        flavors.sort(new FlavorAllergensComparator());
        for (int i = 0; i<flavors.size(); i++){
          System.out.println();
        }
        System.out.println("looking "+ flavors.size());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
