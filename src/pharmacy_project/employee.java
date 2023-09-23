/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_project;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public  class employee {
 private String name;
 private int age;
 private boolean graduate;
 private String address;
 private String phone_number;
  
 

 public employee() {
        
    }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getAge() {
    return this.age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public boolean isGraduate() {
    return this.graduate;
  }
  
  public void setGraduate(boolean graduate) {
    this.graduate = graduate;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getPhone_number() {
    return this.phone_number;
  }
  
  public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
  }

  
  //test Override
 public void print_all_data() {
    System.out.println("name is " + getName() + " Age is " + getAge());
    System.out.println(" and is " + isGraduate() + " graduate");
    System.out.println(" his number is " + getPhone_number());
    System.out.println(" and adress is " + getAddress());
  }
 //this medths to open window working about fxml
 public void start() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("working.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }

}
