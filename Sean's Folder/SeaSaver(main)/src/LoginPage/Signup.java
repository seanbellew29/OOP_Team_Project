/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginPage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Seán
 */
public class Signup extends Authenticate {  ////inherits Authenticate class
    private String username;    
    private String password;

    public Signup(String username, String password) {   //constructor
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void confirm(){  //overrides confirm method
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("signup.txt", true))) { //writes and creates to file singup.txt
        writer.write(username + "," + password);    //writes the username and password to the file
        writer.newLine();   //creates new line 
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error writing to file.");  //catches error writing to the file
          
    }
         JOptionPane.showMessageDialog(null, "Your account has been successfully created"); //displays when user creates account
    }
    
}
