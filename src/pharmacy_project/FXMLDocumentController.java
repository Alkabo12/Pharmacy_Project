
package pharmacy_project;
import java.util.logging.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
 private Connection connection;
private DBHandler handler;
private PreparedStatement pst;
private ResultSet rs;
private Statement statment;
    @FXML
     TextField username;
    @FXML
     PasswordField password;
    @FXML
     Button login;
    @FXML
     Label run_medicine;
     @FXML
     Label run_customer;
    @FXML
      Label run_daily;
     @FXML
      Label run_hourly;
      @FXML
      Label run_monthly;
    @FXML       
     Label faild_username;
    @FXML
     Label faild_password;
    @FXML
     Button customer;
     @FXML
     Button medicine;
     @FXML
     Button login_signup;
     @FXML
     Button employee; 
 @FXML
     Button daily; 
 @FXML
     Button hourly; 
 @FXML
     Button monthly; 
 
 @FXML
     TextField name_customer;
 @FXML
     TextField address_customer;
 @FXML
     TextField phone_customer;
 
 
  @FXML
     TextField name_medicine;
 @FXML
     TextField price_medicine;
 @FXML
     TextField quantity_medicine;
 @FXML
       TextField  company_medicine;

@FXML
     TextField name_daily;
 @FXML
     TextField address_daily;
 @FXML
     TextField phone_daily;
 @FXML
     TextField age_daily;
 @FXML
     TextField number_day_daily;
 @FXML
     TextField day_losing_daily;
 @FXML
     TextField salary_daily;
 @FXML
     TextField ponas_daily;
 @FXML
     TextField graduate_daily;
  @FXML
     TextField name_monthly;
 @FXML
     TextField address_monthly;
 @FXML
     TextField phone_monthly;
 @FXML
     TextField age_monthly;
 @FXML
     TextField ponas_monthly;
 @FXML
     TextField day_losing_monthly;
 @FXML
     TextField salary_monthly;
 @FXML
     TextField name_hourly;
 @FXML
     TextField address_hourly;
 @FXML
     TextField phone_hourly;
 @FXML
     TextField age_hourly;
 @FXML
     TextField number_hours_hourly;
 @FXML
     TextField graduate_hourly;
 @FXML
     TextField salary_hourly;
 @FXML
    Button emp; 
@FXML
    Button back_daily; 
@FXML
    Button back_hourly; 
@FXML
    Button back_monthly; 
@FXML
    Button back_options_emp; 
@FXML
    Button back_signup_emp; 
@FXML
    Button customer2; 
@FXML
    Button medicine2; 
@FXML
    Button back_medicine2; 
@FXML
    Button back_customer2; 
@FXML
    Button back_customer;
@FXML
    Button back_medicine; 

 @FXML
 //to run fisrt window (login)
    private void handleButtonAction(ActionEvent event) throws IOException{
        
        if(username.getText().equals("beshoy")&& password.getText().equals("1106627477")){
             System.out.println("done");
              options cs=new options();
             cs.start();
             
            Stage stage=(Stage) login.getScene().getWindow();
            stage.close();
        }
         else if(username.getText().equals("emp")&& password.getText().equals("emp")){
             System.out.println("done");
              options cs=new options();
             cs.start_login();
             
            Stage stage=(Stage) emp.getScene().getWindow();
            stage.close();
        }
         if(((!username.getText().equals("beshoy")&& !password.getText().equals("1106627477")))||((!username.getText().equals("emp")&& !password.getText().equals("emp")))){
            faild_username.setText("Invalid username");
            faild_password.setText("Invalid Password");
        }
          if(((username.getText().equals("beshoy")&& !password.getText().equals("1106627477")))||((username.getText().equals("emp")&& !password.getText().equals("emp")))){
            faild_username.setText("");
            faild_password.setText("Invalid Password");
        }
          if(((!username.getText().equals("beshoy")&& password.getText().equals("1106627477")))||((!username.getText().equals("emp")&& password.getText().equals("emp")))){
            faild_username.setText("Invalid username");
            faild_password.setText("");
        }    
       
    }
     @FXML
     public void back_medicine(ActionEvent event) throws IOException{
           options cs=new options();
             cs.start();
             
            Stage stage=(Stage) back_medicine.getScene().getWindow();
            stage.close();
     }
     @FXML
     public void back_medicine2(ActionEvent event) throws IOException{
           options cs=new options();
             cs.start_login();
             
            Stage stage=(Stage) back_medicine2.getScene().getWindow();
            stage.close();
     }
      @FXML
     public void medicine2(ActionEvent event) throws IOException{
         Medicine kk=new Medicine();
        kk.start2();
        Stage stage=(Stage) medicine2.getScene().getWindow();   
        stage.close();
     }
    @FXML
     public void back_customer(ActionEvent event) throws IOException{
         options cs=new options();
             cs.start();
             
            Stage stage=(Stage) back_customer.getScene().getWindow();
            stage.close();
     }
     @FXML
     public void back_customer2(ActionEvent event) throws IOException{
         options cs=new options();
             cs.start_login();
             
            Stage stage=(Stage) back_customer2.getScene().getWindow();
            stage.close();
     }
    @FXML
     public void cusomer2(ActionEvent event) throws IOException{
         Customer d=new Customer();
        d.start2();
        Stage stage=(Stage) customer2.getScene().getWindow();
        stage.close();
     }
    @FXML
     public void back_daily(ActionEvent event) throws IOException{
         employee kk=new employee();
        kk.start();
        Stage stage=(Stage)back_daily.getScene().getWindow(); 
        stage.close();
     }
     @FXML
     public void back_hourly(ActionEvent event) throws IOException{
         employee kk=new employee();
        kk.start();
        Stage stage=(Stage)back_hourly.getScene().getWindow(); 
        stage.close();
     }
     @FXML
     public void back_monthly(ActionEvent event) throws IOException{
         employee kk=new employee();
        kk.start();
        Stage stage=(Stage)back_monthly.getScene().getWindow(); 
        stage.close();
     }
    
      @FXML
     public void back_signup_emp(ActionEvent event) throws IOException{
        options cs=new options();
             cs.login();
            Stage stage=(Stage) back_signup_emp.getScene().getWindow();
            stage.close();
     }
     @FXML
     public void back_options_emp(ActionEvent event) throws IOException{
          options cs=new options();
             cs.start();
             
            Stage stage=(Stage) back_options_emp.getScene().getWindow();
            stage.close();
     }
    @FXML
     public void login(ActionEvent event) throws IOException{
         options cs=new options();
             cs.login();
             
            Stage stage=(Stage) login_signup.getScene().getWindow();
            stage.close();
     }
     @FXML
     public void options(ActionEvent event) throws IOException{
         options cs=new options();
             cs.start();
             
            Stage stage=(Stage) login.getScene().getWindow();
            stage.close();
     }
   //to run window of customer
    @FXML
    public void customer(ActionEvent event) throws IOException{
        Customer d=new Customer();
        d.start();
        Stage stage=(Stage) customer.getScene().getWindow();
        stage.close();
}
    
    @FXML   //to run window of medicine
    public void medicine(ActionEvent event) throws IOException{
        Medicine kk=new Medicine();
        kk.start();
        Stage stage=(Stage) medicine.getScene().getWindow();   
        stage.close();
        
    }     
    @FXML   //to open uml in google
    public void network(ActionEvent event) {
       try {
   URI uri= new URI("https://www.fda.gov/drugs/new-drugs-fda-cders-new-molecular-entities-and-new-therapeutic-biological-products/novel-drug-approvals-2020"); 
   java.awt.Desktop.getDesktop().browse(uri);
  } catch (Exception e) {
   e.printStackTrace();
  }
       
    } 
    @FXML    //to connect and cheak username and password in client
    public void server(ActionEvent event) throws IOException{
         try {
            ServerSocket s = new ServerSocket(5000);
            Socket socket;
            while (true) {
                socket = s.accept();
                new Thread(new RunnableLogic(socket)).start();
                System.out.println(Thread.activeCount());
            }
        }
        catch(IOException e)
        {
            System.out.println("Done");
        }
    }
    
     @FXML //to send username and password in network
     public void client(ActionEvent event) throws IOException{
        Scanner user = new Scanner(System.in);
      Socket socket = new Socket("localhost",5000);

       
        DataInputStream din = new DataInputStream(socket.getInputStream());

        
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        String username;
              String password;
       try{
        
            System.out.println("Enter username");
            username = user.next();
            System.out.println("Enter password");
            password = user.next();
            dout.writeUTF(username);
             dout.writeUTF(password);
            dout.flush();
           username = din.readUTF();
           password = din.readUTF();
            System.out.println("username  from the server is " + username + '\n');
            System.out.println("password  from the server is " + password + '\n');
   }
       catch(Exception s){
           System.out.println("you have mistake");
       }
    }
     @FXML //to run window of working
    public void employee(ActionEvent event) throws IOException{
        employee kk=new employee();
        kk.start();
        Stage stage=(Stage)employee.getScene().getWindow(); 
        stage.close();
        
    }
    @FXML //to run window of daily
    public void daily(ActionEvent event) throws IOException{
        daily_employee kk=new daily_employee();
        kk.start();
        Stage stage=(Stage)daily.getScene().getWindow(); 
        stage.close();
    }
     @FXML //to run window of hourly
    public void hourly(ActionEvent event) throws IOException{
        hourly_employee kk=new hourly_employee();
        kk.start();
        Stage stage=(Stage)hourly.getScene().getWindow(); 
        stage.close();
    }
     @FXML //to run window of monhtly
    public void monthly(ActionEvent event) throws IOException{
        Monthly_employee kk=new Monthly_employee();
        kk.start();
        Stage stage=(Stage)monthly.getScene().getWindow();    
        stage.close();
    }      
    @FXML //to run database about table of customer
      public void signUp_customer(ActionEvent event){
       try{   
        DBHandler pp=new DBHandler();
        pp.getConnection();
        pp.customer(name_customer.getText(), address_customer.getText(), phone_customer.getText());
       
       if(name_customer.getText().equals("")||address_customer.getText().equals("")||phone_customer.getText().equals("")){
            run_customer.setText("Empty Data");
        }
        else{ run_customer.setText("");
     run_customer.setText("Connected");
        }
    } catch (SQLException e1) {
        run_customer.setText("");
     run_customer.setText("failed");
                    }
    } 
 @FXML //to run database about table of medicine
      public void signUp_medicine(ActionEvent event){
         try {
          DBHandler pp=new DBHandler();
        pp.getConnection();
        pp.medicine(name_medicine.getText(), price_medicine.getText(), quantity_medicine.getText(), company_medicine.getText());
        if(name_medicine.getText().equals("")||price_medicine.getText().equals("")||quantity_medicine.getText().equals("")||company_medicine.getText().equals("")){
            run_medicine.setText("Empty Data");
        }
        else{ run_medicine.setText("");
     run_medicine.setText("Connected");
        }
    } catch (SQLException e1) {
        run_medicine.setText("");
     run_medicine.setText("failed");
                    }
         
      }
         
      
  @FXML //to run database about table of dialy_emp
       public void signUp_daily(ActionEvent event)throws IOException, SQLException{
         try {   DBHandler pp=new DBHandler();
        pp.getConnection();
        pp.daily(name_daily.getText(), address_daily.getText(), phone_daily.getText(),age_daily.getText(), number_day_daily.getText(), day_losing_daily.getText(), salary_daily.getText(),ponas_daily.getText(),graduate_daily.getText());
    if(name_daily.getText().equals("")||address_daily.getText().equals("")||phone_daily.getText().equals("")||age_daily.getText().equals("")||number_day_daily.getText().equals("")||day_losing_daily.getText().equals("")||salary_daily.getText().equals("")||ponas_daily.getText().equals("")||graduate_daily.getText().equals("")){
            run_daily.setText("Empty Data");
        }
        else{run_daily.setText("");
        run_daily.setText("Connected");}
         }
         catch (SQLException e1) {
        run_daily.setText("");
     run_daily.setText("failed");
                    }
       }
       
      
      @FXML //to run database about table of monthly_emp
       public void signUp_monthly(ActionEvent event)throws IOException, SQLException{
         try{  DBHandler pp=new DBHandler();
        pp.getConnection();
        pp.monthly(name_monthly.getText(), age_monthly.getText(), address_monthly.getText(), phone_monthly.getText(), salary_monthly.getText(), ponas_monthly.getText(), day_losing_monthly.getText());
    if(name_monthly.getText().equals("")||age_monthly.getText().equals("")||address_monthly.getText().equals("")||phone_monthly.getText().equals("")||salary_monthly.getText().equals("")||ponas_monthly.getText().equals("")||day_losing_monthly.getText().equals("")){
            run_monthly.setText("Empty Data");
        }
      else{ run_monthly.setText("");
     run_monthly.setText("Connected");
         }
         }
          catch (SQLException e1) {
        run_monthly.setText("");
     run_monthly.setText("failed");
                    }
       }
       

 
        @FXML //to run database about table of hourly_emp
       public void signUp_hourly(ActionEvent event)throws IOException, SQLException{
         try{  DBHandler pp=new DBHandler();
        pp.getConnection();
        pp.hourly(name_hourly.getText(), age_hourly.getText(), number_hours_hourly.getText(), address_hourly.getText(), phone_hourly.getText(), salary_hourly.getText(), graduate_hourly.getText());
      if(name_hourly.getText().equals("")||age_hourly.getText().equals("")||number_hours_hourly.getText().equals("")||address_hourly.getText().equals("")||phone_hourly.getText().equals("")||salary_hourly.getText().equals("")||graduate_hourly.getText().equals("")){
            run_hourly.setText("Empty Data");
        }
        else{run_hourly.setText("");
        run_hourly.setText("Connected");}
         }
         catch (SQLException e1) {
        run_hourly.setText("");
     run_hourly.setText("failed");
                    }
       
       }
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        
    }       
}
