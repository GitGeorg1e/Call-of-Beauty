import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class favoriteShopUi extends JFrame {
    private JTextField shopNameField;
    private JTextField shopAddressField;
    private JButton addButton;
    private JButton cancelButton;
    private mainMenu mainMenu;

    public favoriteShopUi(mainMenu mainMenu) {
        this.mainMenu = mainMenu;

        setTitle("Add Favorite Shop");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Shop Name:"));
        shopNameField = new JTextField();
        add(shopNameField);

        add(new JLabel("Shop Address:"));
        shopAddressField = new JTextField();
        add(shopAddressField);

        addButton = new JButton("Add");
        cancelButton = new JButton("Cancel");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shopName = shopNameField.getText();
                String shopAddress = shopAddressField.getText();

                if (validateInput(shopName, shopAddress)) {
                    favoriteShop newFavorite = new favoriteShop(shopName, shopAddress);
                    mainMenu.addFavoriteShop(newFavorite);
                    JOptionPane.showMessageDialog(null, "Favorite Shop Added Successfully!");
                    dispose();
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

        add(addButton);
        add(cancelButton);
    }

    private boolean validateInput(String shopName, String shopAddress) {
        return !shopName.isEmpty() && !shopAddress.isEmpty();
    }

    private void clearFields() {
        shopNameField.setText("");
        shopAddressField.setText("");
    }

    public static void main(String[] args) {
        // For testing purposes
        user sampleUser = new user("john_doe", "password", "John Doe", "john@example.com", "123 Main St", "123-456-7890");
        SwingUtilities.invokeLater(() -> new favoriteShopUi(new mainMenu(sampleUser)).setVisible(true));
    }
}
