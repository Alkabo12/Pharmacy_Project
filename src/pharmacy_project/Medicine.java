/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_project;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Medicine {

    public Medicine() {
    }
     public  Scanner user = new Scanner(System.in);
     private String name_medicine;
  
  private String company;
  
  private double price_medicine;
  
  private int quantity;
  
  private String EXP_date;
  
  public Medicine(String name_medicine, double price_medicine) {
    this.name_medicine = name_medicine;
    this.price_medicine = price_medicine;
  }
  
  public String Get_name() {
    return this.name_medicine;
  }
  
  public void setName_medicine(String name_medicine) {
    this.name_medicine = name_medicine;
  }
  
  public String getCompany() {
    return this.company;
  }
  
  public void setCompany(String company) {
    this.company = company;
  }
  
  public double getPrice_medicine() {
    return this.price_medicine;
  }
  
  public void setPrice_medicine(double price_medicine) {
    this.price_medicine = price_medicine;
  }
  
  public int getQuantity() {
    return this.quantity;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  public String getEXP_date() {
    return this.EXP_date;
  }
  
  public void setEXP_date(String EXP_date) {
    this.EXP_date = EXP_date;
  }
  
 
  
 
 //this medths to open window data of medicine about fxml
  public void start() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("data of medicine.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
    } 
  public void start2() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("data of medicine_emp.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
    } 
}