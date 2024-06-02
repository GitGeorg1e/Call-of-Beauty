import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shopUi extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField shopNameField;
    private JTextField addressField;
    private JTextField emailField;
    private JTextField phoneField;
    private JButton confirmButton;
    private JButton cancelButton;

    public shopUi() {
        setTitle("Shop Sign Up");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(8, 2));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Shop Name:"));
        shopNameField = new JTextField();
        add(shopNameField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);

        confirmButton = new JButton("Confirm");
        cancelButton = new JButton("Cancel");

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String shopName = shopNameField.getText();
                String address = addressField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();

                if (validateInput(username, password, shopName, address, email, phone)) {
                    shop newShop = new shop(username, password, shopName, address, email, phone);
                    JOptionPane.showMessageDialog(null, "Sign Up Successful! Redirecting to Shop Main Menu...");
                    dispose();
                    new shopMainMenu(newShop).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error! Invalid input, please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    clearFields();
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        add(confirmButton);
        add(cancelButton);
    }

    private boolean validateInput(String username, String password, String shopName, String address, String email, String phone) {
        return !username.isEmpty() && !password.isEmpty() && !shopName.isEmpty() && !address.isEmpty() && email.contains("@") && phone.matches("\\d+");
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        shopNameField.setText("");
        addressField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new shopUi().setVisible(true));
    }
}
