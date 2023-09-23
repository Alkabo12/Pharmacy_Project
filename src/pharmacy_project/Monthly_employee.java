


package pharmacy_project;

import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Monthly_employee extends employee{
    private double salary_monthly;
   public  Scanner user = new Scanner(System.in);
  private int day_losing_for_monthly;
  private double ponas_manthly;  
  
  public double getSalary_monthly() {
    return this.salary_monthly;
  }

    public Monthly_employee() {
    }
  
  public void setSalary_monthly(double salary_monthly) {
    this.salary_monthly = salary_monthly;
  }
  
  public int getDay_losing_for_monthly() {
    return this.day_losing_for_monthly;
  }
  
  public void setDay_losing_for_monthly(int day_losing_for_monthly) {
    this.day_losing_for_monthly = day_losing_for_monthly;
  }
  
  public double getPonas_manthly() {
    return this.ponas_manthly;
  }
  
  public void setPonas_manthly(double ponas_manthly) {
    this.ponas_manthly = ponas_manthly;
  }
  

  

  
@Override
  public void print_all_data() {
    super.print_all_data();//test Override
    System.out.println("salary of monthly is " + getSalary_monthly());
    System.out.println("have absence  " + getDay_losing_for_monthly() + " days");
    
    System.out.println("he have bouns is  " + getPonas_manthly());
   
  }
   
    @Override  //this medths to open window monthly about fxml
   public void start() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("monthly.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }
} 

