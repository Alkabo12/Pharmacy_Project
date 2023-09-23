/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_project;

import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class hourly_employee extends employee{
    private int Number_hours;
   public  Scanner user = new Scanner(System.in);
  private double salarey_hours;
  
  public int getNumber_hours() {
    return this.Number_hours;
  }
  
  public void setNumber_hours(int Number_hours) {
    this.Number_hours = Number_hours;
  }
  
  public double getSalarey_hours() {
    return this.salarey_hours;
  }
  
  public void setSalarey_hours(double salarey_hours) {
    this.salarey_hours = salarey_hours;
  }
  
@Override
  public void print_all_data() {  //test Override
    super.print_all_data();
    System.out.println("he is worked " + getNumber_hours() + " hours");
    System.out.println("salary of one hour is " + getSalarey_hours());
   
  }
   public hourly_employee() {
    }
 @Override
    public void start() throws IOException { //this medths to open window hourly about fxml
          Parent root = FXMLLoader.load(getClass().getResource("hourly.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }
}
