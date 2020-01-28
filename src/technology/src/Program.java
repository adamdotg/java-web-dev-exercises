package technology.src;

public class Program {
  public static void main(String[] args){

    Laptop myLaptop = new Laptop("Snow Leopard", 16, 500);
    SmartPhone myPhone = new SmartPhone("iOS", 4, 128);

    System.out.println(myLaptop.getInfo());
    System.out.println(myLaptop.getOS());
    System.out.println("---------");
//    System.out.println(myLaptop.getVal());
    System.out.println("Some other calculation from Laptop.java: "+myLaptop.getStats());
    System.out.println("Same thing but from SmartPhone.java: "+myPhone.getStats());
  }





}
