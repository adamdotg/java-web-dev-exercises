

public class Laptop extends Computer {
  public Laptop(String OS, double ram, double storage) {
    super(OS, ram, storage);
  }

    private String name;
    private String osVersion = "10.6.6";

    public String getOS(){
      return osVersion;
    }

    public String getInfo(){
      return computerInfo();
    }

}
