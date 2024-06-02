import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customerSignup extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField addressField;
    private JTextField phoneField;
    private JButton confirmButton;

    public customerSignup() {
        setTitle("Customer Sign Up");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(7, 2));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);

        confirmButton = new JButton("Confirm");
        add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String name = nameField.getText();
                String email = emailField.getText();
                String address = addressField.getText();
                String phone = phoneField.getText();

                if (validateInput(username, password, name, email, address, phone)) {
                    user newUser = new user(username, password, name, email, address, phone);
                    JOptionPane.showMessageDialog(null, "Sign Up Successful! Redirecting to Main Menu...");
                    // Redirect to main menu or next step
                    dispose();
                    new mainMenu(newUser).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error! Invalid input, please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    clearFields();
                }
            }
        });
    }

    private boolean validateInput(String username, String password, String name, String email, String address, String phone) {
        // Add your validation logic here (e.g., non-empty fields, valid email format, etc.)
        return !username.isEmpty() && !password.isEmpty() && !name.isEmpty() && email.contains("@") && !address.isEmpty() && phone.matches("\\d+");
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        nameField.setText("");
        emailField.setText("");
        addressField.setText("");
        phoneField.setText("");
    }
}

    
