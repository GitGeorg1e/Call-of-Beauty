import javax.swing.*;

public class shop {
    private String username;
    private String password;
    private String shopName;
    private String address;
    private String email;
    private String phone;
    private JButton confirmButton;
    private JButton cancelButton;

    public shop(String username, String password, String shopName, String address, String email, String phone) {
        this.username = username;
        this.password = password;
        this.shopName = shopName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.confirmButton = new JButton("Confirm");
        this.cancelButton = new JButton("Cancel");
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public void setConfirmButton(JButton confirmButton) {
        this.confirmButton = confirmButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }
}
