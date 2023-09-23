package pharmacy_project;

public class Owner extends Branches{

    public String getName_owner() {
        return name_owner;
    }

    public void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    public Owner() {
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getAddress_owner() {
        return address_owner;
    }

    public void setAddress_owner(String address_owner) {
        this.address_owner = address_owner;
    }

    public String getPhone_owner() {
        return phone_owner;
    }

    public void setPhone_owner(String phone_owner) {
        this.phone_owner = phone_owner;
    }


 private String name_owner;
 private double revenue;
private String address_owner;
private String phone_owner;

    public Owner(String name_owner, double revenue, String address_owner, String phone_owner) {
        this.name_owner = name_owner;
        this.revenue = revenue;
        this.address_owner = address_owner;
        this.phone_owner = phone_owner;
    }
    @Override
 public double getsalary_monthly(){
    return getSalary_one_day()*30;
}
 
}
