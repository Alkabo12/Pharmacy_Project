


package pharmacy_project;

//this calss  Aggregation
public class Pharmacy {
    private String name;
  
  private double time_open;
  
  private double time_clsoe;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public double getTime_open() {
    return this.time_open;
  }
  
  public void setTime_open(double time_open) {
    this.time_open = time_open;
  }
  
  public double getTime_clsoe() {
    return this.time_clsoe;
  }
  
  public void setTime_clsoe(double time_clsoe) {
    this.time_clsoe = time_clsoe;
  }
  
  public Pharmacy(String name, double time_open, double time_clsoe) {
    this.name = name;
    this.time_open = time_open;
    this.time_clsoe = time_clsoe;
  }
}
