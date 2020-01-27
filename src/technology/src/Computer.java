

public class Computer {

  private String OS;
  private double ram;
  private double storage;

  public Computer(String OS, double ram, double storage){
    this.OS = OS;
    this.ram = ram;
    this.storage = storage;
  }

  public String computerInfo(){
    return (this.OS + "\n" + this.ram + "\n" + this.storage);
  }

  public double valueStat(){
    return (this.ram + this.storage / 3);
  }

//  public String getOS(){
//
//  };

}
