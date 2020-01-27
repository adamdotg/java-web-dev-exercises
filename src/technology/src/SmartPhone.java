

public class SmartPhone extends Computer {
  public SmartPhone(String OS, double ram, double storage){
    super(OS, ram, storage);
  }

  private String OS;

  public String getOS(){
    return OS;
  }

}
