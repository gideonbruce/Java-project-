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
    private JPasswordField passText, confirmPassText;
    private JTextField userText;
    private JButton loginButton, signupButton, toggleButton;
    
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
        userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100, 10, 165, 25);
        panel.add(userText);
        
        //text field & labels for password
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);
        
        passText = new JPasswordField(20);
        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);
        
        //confirm password label
        confirmPassLabel = new JLabel("Confirm Password:");
        confirmPassLabel.setBounds(10, 80, 150, 25);
        panel.add(confirmPassText);
        
        //initially hidden
        confirmPassLabel.setVisible(false);
        confirmPassText.setVisible(false);
        
        //login button
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 120, 80, 25);
        panel.add(loginButton);
        
        //signup button
        signupButton = new JButton("Signup");
        signupButton.setBounds(100, 120, 80, 25);
        signupButton.setVisible(false); //hide initially
        panel.add(signupButton);
        
        //changing the button between login and signup interfaces
        toggleButton = new JButton("Switch to Signup");
        toggleButton.setBounds(190, 120, 160, 25);
        panel.add(toggleButton);
        
        //toggle between modes on button click
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerfomed(ActionEvent e) {
                if (isLoginMode) {
                    // switching to signup mode
                    confirmPassLabel.setVisible(true);
                    confirmPassText.setVisible(true);
                    loginButton.setVisible(false);
                    signupButton.setVisible(true);
                    toggleButton.setText("Switch to Login");
                    isLoginMode = false;
                } else {
                    // switching to Login mode
                    confirmPassLabel.setVisible(false);
                    confirmPassText.setVisible(false);
                    loginButton.setVisible(true);
                    signupButton.setVisible(false);
                    toggleButton.setText("Switch to Signup");
                    isLoginMode = true;
                }
            }
        });
        
        //showing interface
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
