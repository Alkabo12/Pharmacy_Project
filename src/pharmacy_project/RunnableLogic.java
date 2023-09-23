/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_project;

/**
 *
 * @author Beshoy
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class RunnableLogic implements Runnable{
    Socket socket;

    RunnableLogic(Socket s) {
        s=socket;
    }

 

//this class to cheack if client eneter username and password in connection
    @Override
    public void run() {

              try {
            DataInputStream din = new DataInputStream(
                    socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(
                    socket.getOutputStream());

            String password;
            String  username;
            
                username = din.readUTF();
                password = din.readUTF();
                
                if(username.equalsIgnoreCase("beshoy")&&password.equalsIgnoreCase("1106627477")){
                    System.out.println("username and password is correct");
                }
               else if (!username.equalsIgnoreCase("beshoy")&&!password.equalsIgnoreCase("1106627477")){
                    System.out.println("username and password is not correct");
                }
                else if (username.equalsIgnoreCase("beshoy")&&!password.equalsIgnoreCase("1106627477")){
                    System.out.println("username is correct and password is not correct");
                }
             else if (!username.equalsIgnoreCase("beshoy")&&password.equalsIgnoreCase("1106627477")){
                    System.out.println("username is not correct and password is  correct");
                }
                
                 
                 
        } catch (IOException e) {
            System.out.println("Served the client");
        }



    }
}
