

package pharmacy_project;

import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Customer implements Get_name,getNumber_customer {
     private String name_customer;
   public  Scanner user = new Scanner(System.in);
  
  private String number_customer;
  private String address_customer;
 @Override
  public String Get_name() {
    return this.name_customer;
  }

    public Customer() {
    }
 
  public void setName_customer(String name_customer) {
    this.name_customer = name_customer;
  }
  
     @Override
  public String getNumber_customer() {
    return this.number_customer;
  }
  
  public void setNumber_customer(String number_customer) {
    this.number_customer = number_customer;
  }
  
  public String getAddress_customer() {
    return this.address_customer;
  }
  
  public void setAddress_customer(String address_customer) {
    this.address_customer = address_customer;
  }

  //this medths to open window data of customer about fxml
      public void start() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("data of customer.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }
       public void start2() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("data of customer_emp.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }
       
}
