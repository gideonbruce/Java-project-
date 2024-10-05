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
    
    //flag to track signup and login modes
    private boolean isLoginMode = true;
    
    private static final String Database_Url = "jdbc:mysql://localhost:3306/login_form";
    private static final String USER = "root";
    private static final String PASSWORD = " ";
    
    public LoginForm() {
        
        //frame
        frame = new JFrame("Login Form");
        frame.setSize(800, 500);
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
        panel.add(confirmPassLabel);
        confirmPassText = new JPasswordField(20);
        confirmPassText.setBounds(150, 80, 165, 25);
        panel.add(confirmPassText);
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
        toggleButton = new JButton("Signup");
        toggleButton.setBounds(190, 120, 160, 25);
        panel.add(toggleButton);
        
        
        // action listener
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLoginMode) {
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
                    toggleButton.setText("Signup");
                    isLoginMode = true;
                }      
            }
        });

        //Action listener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());
                JOptionPane.showMessageDialog(frame, "Login Attempted for user: "+ username);
            }
        });
    
        //Action listener for signup
        signupButton.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());
                String confirmPassword = new String(confirmPassText.getPassword());
            
                if (password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(frame, "Signup successful for user: "+ username);
                } else {
                JOptionPane.showMessageDialog(frame, "Passwords do not match!");
                }
            }
        });
    
    
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new LoginForm();
    }
}
