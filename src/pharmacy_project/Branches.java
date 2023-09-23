package pharmacy_project;

public class Branches{
    private String name_Branchess;

  private String phone_Branchess;
  
  private String address_Branchess;
  
  private double salary_one_dayy;
  
 public void setName_Branches(String name_Branches) {
    this.name_Branchess = name_Branches;
  }
  
  
  
  public String getPhone_Branches() {
    return this.phone_Branchess;
  }
  
  public void setPhone_Branches(String phone_Branches) {
    this.phone_Branchess = phone_Branches;
  }
  
  public String getAddress_Branches() {
    return this.address_Branchess;
  }
  
  public String Get_Name() {
    return this.name_Branchess;
  }
  
  public void setAddress_Branches(String address_Branches) {
    this.address_Branchess = address_Branches;
  }
  
  public double getSalary_one_day() {
    return this.salary_one_dayy;
  }
  
  public double getsalary_monthly(){
    return getSalary_one_day()*30;
}
  
  public void setSalary_one_day(double salary_one_day) {
    this.salary_one_dayy = salary_one_day;
  }

    public Branches(String name_Branches, String phone_Branches, String address_Branches, double salary_one_day) {
        this.name_Branchess = name_Branches;
        this.phone_Branchess = phone_Branches;
        this.address_Branchess = address_Branches;
        this.salary_one_dayy = salary_one_day;
    }
    public Branches() {
    }

  //test overloading
    public double buying(int x,int y){
        return x+y;
    }
   public double buying(int x,int y,double z){
        return x+y+z;
    }
 
  
}
