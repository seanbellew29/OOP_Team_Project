/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginPage;

import HomePage.SeaSaverHomeGUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Seán
 */
public class LoginPage extends Authenticate{ //inherits Authenticate class
    private String username;
    private String password;

    public LoginPage(String username, String password) {    //constructor
        this.username = username;
        this.password = password;
    }
    
    @Override   //overrides the confirm method
    public void confirm(){
        boolean correctPass = false;
       try(BufferedReader read = new BufferedReader(new FileReader("signup.txt"))){ //Reads file called signup.txt 
        String line;    //holds the users info in line
         while((line = read.readLine()) != null){   //reads file until the end of it 
             if(line.equals(username + ","+ password)){   //if the log in is the same as the text in the file then password and username is correct
                 correctPass = true;    //if file is found the users name and password is correct
             }
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Reading to the file");   //catching errors reading to the file 
        }
        if(correctPass){
            JOptionPane.showMessageDialog(null, "Login Successful");    //will display when Username and Password matches the singup file
           new SeaSaverHomeGUI().setVisible(true);  //sets the homepage to visible after user inserts details
           
        }else{
            JOptionPane.showMessageDialog(null, "Invalid credentials");//invalid username or password will display this message
        }
    }
}
