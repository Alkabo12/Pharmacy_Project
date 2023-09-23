

package pharmacy_project;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class daily_employee extends employee{
    private int Number_days;

  private double price_per_day;
  
  private double ponas_daily;
  
  private int day_losing_for_daily;
  
  public double getPonas_daily() {
    return this.ponas_daily;
  }
  
  public void setPonas_daily(double ponas_daily) {
    this.ponas_daily = ponas_daily;
  }
  
  public int getDay_losing_for_daily() {
    return this.day_losing_for_daily;
  }
  
  public void setDay_losing_for_daily(int day_losing) {
    this.day_losing_for_daily = day_losing;
  }
  
  public int getNumber_days() {
    return this.Number_days;
  }
  
  public void setNumber_days(int Number_days) {
    this.Number_days = Number_days;
  }
  
  public double getPrice_per_day() {
    return this.price_per_day;
  }
  
  public void setPrice_per_day(double price_per_day) {
    this.price_per_day = price_per_day;
  }
  




    public daily_employee() {
    }
  //test Override
    @Override
  public void print_all_data() {
    super.print_all_data();
    System.out.println("he worked " + getNumber_days() + "days");
    System.out.println("price one day is " + getPrice_per_day());
    System.out.println("he have bouns is  " + getPonas_daily());
    System.out.println("have absence " + getDay_losing_for_daily() + " days");
   
  }

  @Override // open window of daily 
   public void start() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("daily.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }

    
}
