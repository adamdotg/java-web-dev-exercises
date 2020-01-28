package technology.src;

public class Computer {

  private String OS;
  private int ram;
  private int storage;

  public Computer(String OS, int ram, int storage){
    this.OS = OS;
    this.ram = ram;
    this.storage = storage;
  }
  public static int generic = 10; //static field
  public String computerInfo(){
    return (this.OS + "\n" + this.ram + "\n" + this.storage);
  }

  public int valueStat(){

    if (this.ram < generic){
      System.out.println("Ram is less than generic number:"+this.ram);
      return (this.ram);
    } else {
    System.out.println("Ram: "+ this.ram + "\nStorage: "+ this.storage +"\n"+ "divided by 3");
    return ((this.ram + this.storage) / 3);
  }
}

}
