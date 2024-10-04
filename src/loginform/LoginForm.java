/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginform;

/**
 *
 * @author Gideon
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {

    /**
     * @param args the command line arguments
     */
    
    private JFrame frame;
    private JPanel panel;
    private JLabel userLabel, passLabel, confirmPassLabel, modelLabel;
    private JPasswordField passText;
    private JTextField userText;
    
    public LoginForm() {
        
        //frame
        frame = new JFrame("Login/Signup Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create panel
        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        
        //text fields & labels for username
        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165. 25);
        panel.add(userText);
        
        //text field & labels for password
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passText);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
