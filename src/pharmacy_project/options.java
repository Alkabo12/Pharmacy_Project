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



public class options  {
  
    //this medths to open window options for owner 
    public void start() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("options.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();

    }
//this medths to open window options for emp 
    public void start_login() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("options for emp.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }
    public void login() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage st = new Stage();
            Scene sc = new Scene(root);
            st.setTitle("pharmacy System");
            st.setScene(sc);
            st.show();
  }
}
