package pharmacy_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandler extends Configs implements Runnable {
 private Connection connection;
private DBHandler handler;
private PreparedStatement pst;
private ResultSet rs;
private Statement statment;
public Connection getConnection()//test connection
	{
		  try {
                   String con = "jdbc:mysql://"+ this.dbhost + ":" + this.dbport + "/" + this.dbname+"?autoReconnect=true&useSSL=false";
  		connection = DriverManager.getConnection(con,this.dbuser,this.dbpass);
                        System.out.println("done");
		} catch (SQLException e) {
		
                         System.out.println("false");
		}
		return connection;		
	}
        
	 public void customer(String name,String address,String phone_number)throws SQLException{  //input in a table customer in database
 
  String insert = "INSERT INTO customer(address,name,phone_number)"+"VALUES(?,?,?)";
        pst = connection.prepareStatement(insert);
                        pst.setString(1,address);
                        pst.setString(2,name);
                        pst.setString(3,phone_number);
                       if(name.equals("")||address.equals("")||name.equals("")||phone_number.equals("")){
                            System.out.println("Empty data"); 
                        }
                        else{   
                           pst.executeUpdate(); 
                            System.out.println("done"); 
                        System.out.println("in the table of customer");
                         statment = connection.createStatement();//start statment
            rs = statment.executeQuery("select * from customer");//set statment syql
            while (rs.next()) {
                String addresss = rs.getString("address");
                String names=rs.getString("name");
                String phone_numbers=rs.getString("phone_number");
                System.out.println("name is "+names+" and address is "+addresss+" and phone_number is "+phone_number);
}
                        }                      
                  } 
         
  public void medicine(String name,String price,String Quantity,String company)throws SQLException{  //input and output in a table medicine in database
  
  String insert = "INSERT INTO medicine(name,price,Quantity,company)"+"VALUES(?,?,?,?)";
        pst = connection.prepareStatement(insert);
                        pst.setString(1,name);
                        pst.setString(2,price);
                        pst.setString(3,Quantity);
                        pst.setString(4,company);
                       
                        if(name.equals("")||price.equals("")||Quantity.equals("")||company.equals("")){
                            System.out.println("Empty data"); 
                        }
                        else{   pst.executeUpdate(); 
                            System.out.println("done"); 
                        System.out.println("in the table of medicine");
                         statment = connection.createStatement();//start statment
            rs = statment.executeQuery("select * from medicine");//set statment syql
            while (rs.next()) {
                String namee = rs.getString("name");
                String pricee=rs.getString("price");
                String quantity=rs.getString("Quantity");
                String companyy=rs.getString("company");
                System.out.println("name is "+namee+" and price is "+pricee+" and quantity is "+quantity+" and name of company is "+ companyy);
}
                        }                 
  }
  public void daily(String name,String address,String phone_number,String age,String number_days,String day_losing,String salary,String pons,String graduate)throws SQLException{ //input and output in a table daily in database
   
  String insert = "INSERT INTO daily_emp(name,address,phone_number,age,number_days,day_losing,salary,ponas,graduate)"+"VALUES(?,?,?,?,?,?,?,?,?)";
   
  pst = connection.prepareStatement(insert);
                        pst.setString(1,name);
                        pst.setString(2,address);
                        pst.setString(3,phone_number);
                        pst.setString(4,age);
                         pst.setString(5,number_days);
                          pst.setString(6,day_losing);
                           pst.setString(7,salary);
                            pst.setString(8,pons);
                             pst.setString(9,graduate);
                             
                 if(name.equals("")||address.equals("")||phone_number.equals("")||age.equals("")
                ||number_days.equals("")||day_losing.equals("")||salary.equals("")
                         ||salary.equals("")||pons.equals("")||graduate.equals("")){
                                   System.out.println("Empty data"); 
                             }
                             else{  pst.executeUpdate(); 
                        System.out.println("done");  
                        System.out.println("in the table of daily");
                                statment = connection.createStatement();//start statment
            rs = statment.executeQuery("select * from daily_emp");//set statment syql
             
            while (rs.next()) {
                String namee = rs.getString("name");
                String addres=rs.getString("address");
                String phone_numberr=rs.getString("phone_number");
                String agee=rs.getString("age");
                String number_dayss = rs.getString("number_days");
                String day_losingg=rs.getString("day_losing");
                String salaryy=rs.getString("salary");
                String ponss=rs.getString("ponas");
                String graduatee=rs.getString("graduate");
                System.out.println("name is "+namee+" and address is "+addres+" and phone_number is "+ phone_numberr +" and age is "+ agee+" and number_days"+ number_dayss +" and day_losing "+ day_losingg +" and salary "+ salaryy+" and pons "+ ponss +" and graduate "+graduatee);
}
                                     }     
  }
   public void monthly(String name,String age,String address,String phone_number,String salary,String ponas,String day_losing)throws SQLException{ //input and output in a table monthly_emp in database
      
  String insert = "INSERT INTO monthly_emp(name,age,address,phone_number,salary,ponas,day_losing)"+"VALUES(?,?,?,?,?,?,?)";
        pst = connection.prepareStatement(insert);
                        pst.setString(1,name);
                        pst.setString(2,age);
                        pst.setString(3,address);
                        pst.setString(4,phone_number);
                         pst.setString(5,salary);
                          pst.setString(6,ponas);
                           pst.setString(7,day_losing);
                   if(name.equals("")||address.equals("")||phone_number.equals("")||age.equals("")
                     ||day_losing.equals("")||salary.equals("")
                         ||ponas.equals("")){
                                   System.out.println("Empty data"); 
                             } 
                          else{ pst.executeUpdate(); 
                        System.out.println("done");
                        System.out.println("in the table of monthly");
                          statment = connection.createStatement();//start statment
            rs = statment.executeQuery("select * from monthly_emp");//set statment syql
            while (rs.next()) {
                String namee = rs.getString("name");
                String agee=rs.getString("age");
                String addres=rs.getString("address");
                String phone_numberr=rs.getString("phone_number");
                String salaryy = rs.getString("salary");
                String ponass=rs.getString("ponas");
                String day_losingg=rs.getString("day_losing");
                System.out.println("name is "+namee+" and address is "+addres+" and phone_number is "+phone_numberr+" and age is "+ agee+" and ponas"+ ponass +" and day_losing "+ day_losingg +" and salary "+ salaryy);
                        
            }  
   }}
   
   public void hourly(String name,String age,String number_hours,String address,String phone_number,String salary,String graduate)throws SQLException{ //input and output in a table hourly_emp in database
      
       String insert = "INSERT INTO hourly_emp(name,age,number_hours,address,phone_number,salary,graduate)"+"VALUES(?,?,?,?,?,?,?)";
        pst = connection.prepareStatement(insert);
                        pst.setString(1,name);
                        pst.setString(2,age);
                        pst.setString(3,number_hours);
                        pst.setString(4,address);
                         pst.setString(5,phone_number);
                          pst.setString(6,salary);
                           pst.setString(7,graduate);
                           if(name.equals("")||address.equals("")||phone_number.equals("")||age.equals("")
                     ||graduate.equals("")||salary.equals("")
                         ||number_hours.equals("")){
                                   System.out.println("Empty data"); 
                             } 
                           else{    pst.executeUpdate(); 
                        System.out.println("done");
                        System.out.println("in the table of hourly");
                        statment = connection.createStatement();//start statment
            rs = statment.executeQuery("select * from hourly_emp");//set statment syql
            while (rs.next()) {
                String namee = rs.getString("name");
                String agee=rs.getString("age");
                String addres=rs.getString("address");
                String phone_numberr=rs.getString("phone_number");
                String salaryy = rs.getString("salary");
                String graduatee=rs.getString("graduate");
                String number_hourss=rs.getString("number_hours");
                System.out.println("name is "+namee+" and address is "+addres+" and phone_number is "+phone_numberr+" and age is "+ agee+" and graduate "+ graduatee +" and number_hours"+ number_hourss +" and salary "+ salaryy);
                        
            }
                                   }    
       
                        
                    } 
    @Override
    public void run() { // output in a table customer in database in multithreads
       try { statment = connection.createStatement();//start statment
            rs = statment.executeQuery("select * from customer");//set statment syql
            while (rs.next()) {
                String namee = rs.getString("name");
                String addresss=rs.getString("address");
                String number=rs.getString("phone_number");
                System.out.println("name is "+namee+" and address is "+addresss+" and phone number is "+number);
}
                    } catch (SQLException e1) {
                         System.out.println("false");
                    }
    }
}