import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userUi extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private user  user;

    public userUi() {
        user = new user();
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Create the login panel
        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        user.usernameField = new JTextField();
        user.passwordField = new JPasswordField();
        user.loginButton = new JButton("Login");
        user.signUpButton = new JButton("Sign Up");

        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(user.usernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(user.passwordField);
        loginPanel.add(user.loginButton);
        loginPanel.add(user.signUpButton);

        // Create the sign-up panel
        JPanel signUpPanel = new JPanel(new GridLayout(3, 1));
        JButton customerButton = new JButton("Customer");
        JButton storeButton = new JButton("Store");

        signUpPanel.add(new JLabel("Sign Up as:"));
        signUpPanel.add(customerButton);
        signUpPanel.add(storeButton);

        // Add panels to main panel
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(signUpPanel, "SignUp");

        // Add action listeners
        user.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextComponent usernameField;
               // user = new user(usernameField.getText(), new String(passwordField.getPassword()));
                user.login();
                // Add logic to handle login
                JOptionPane.showMessageDialog(null, "Login Successful!");
            }
        });

        user.signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "SignUp");
            }
        });

        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for customer sign-up
                //JOptionPane.showMessageDialog(null, "Customer Sign Up!");
                //cardLayout.show(mainPanel, "Login");
                new customerSignup().setVisible(true);
            }
        });

        storeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for store sign-up
                //JOptionPane.showMessageDialog(null, "Store Sign Up!");
                //cardLayout.show(mainPanel, "Login");
                new shopUi().setVisible(true);
            }
        });

        // Set up the frame
        add(mainPanel);
        cardLayout.show(mainPanel, "Login");
        setTitle("User Authentication");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new userUi().setVisible(true);
            }
        });
    }
}
