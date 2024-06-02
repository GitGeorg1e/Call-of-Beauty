import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class user {
    private String userId;
    private String username;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;

    JTextField usernameField;
    JPasswordField passwordField;
    JButton signUpButton;
    JButton loginButton;

    public user(String username, String password, String name, String email, String address, String phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
    public user() {
        // Default constructor
    }

    public String getusername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void register() {
        // Registration logic
    }

    public void login() {
        // Login logic
    }
}
