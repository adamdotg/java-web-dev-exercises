package technology.src;

public class SmartPhone extends Computer {
  public SmartPhone(String OS, int ram, int storage){
    super(OS, ram, storage);
  }

  private String OS;

  public String getOS(){
    return OS;
  }

  public int getStats(){
    return valueStat();
  }
}
