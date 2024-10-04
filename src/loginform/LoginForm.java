/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginform;

/**
 *
 * @author Bruce
 */

import javax.swing.*;

public class LoginForm {

    /**
     * @param args the command line arguments
     */
    
    private JFrame frame;
    private JPanel panel;
    
    public LoginForm() {
        
        //frame
        frame = new JFrame("Login/Signup Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create panel
        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        
        //text fields & labels
        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
