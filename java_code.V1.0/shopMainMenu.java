import javax.swing.*;
import java.awt.*;

public class shopMainMenu extends JFrame {
    private shop shop;
    private JLabel shopNameLabel;
    private JLabel addressLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JButton profileButton;
    private JButton productsButton;
    private JButton ordersButton;
    private JButton settingsButton;

    public shopMainMenu(shop shop) {
        this.shop = shop;
        setTitle("Shop Main Menu");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create header panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.LIGHT_GRAY);
        headerPanel.setPreferredSize(new Dimension(400, 100));

        // Add shop info to header
        shopNameLabel = new JLabel("Welcome, " + shop.getShopName());
        shopNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(shopNameLabel, BorderLayout.CENTER);

        // Add an image/icon (assuming there is a placeholder image at path "shop.png")
        JLabel shopImageLabel = new JLabel(new ImageIcon("shop.png"));
        headerPanel.add(shopImageLabel, BorderLayout.WEST);

        // Create center panel for shop details
        JPanel centerPanel = new JPanel(new GridLayout(3, 1));
        addressLabel = new JLabel("Address: " + shop.getAddress());
        emailLabel = new JLabel("Email: " + shop.getEmail());
        phoneLabel = new JLabel("Phone: " + shop.getPhone());
        centerPanel.add(addressLabel);
        centerPanel.add(emailLabel);
        centerPanel.add(phoneLabel);

        // Create footer panel for buttons
        JPanel footerPanel = new JPanel(new GridLayout(1, 4));

        profileButton = new JButton("Profile");
        productsButton = new JButton("Products");
        ordersButton = new JButton("Orders");
        settingsButton = new JButton("Settings");

        footerPanel.add(profileButton);
        footerPanel.add(productsButton);
        footerPanel.add(ordersButton);
        footerPanel.add(settingsButton);

        // Add panels to main panel
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        add(mainPanel);

        // Add action listeners to buttons
        profileButton.addActionListener(e -> openProfile());
        productsButton.addActionListener(e -> openProducts());
        ordersButton.addActionListener(e -> openOrders());
        settingsButton.addActionListener(e -> openSettings());

        setVisible(true);
    }

    private void openProfile() {
        // Logic to open the profile window
        JOptionPane.showMessageDialog(this, "Profile Button Clicked!");
    }

    private void openProducts() {
        // Logic to open the products window
        JOptionPane.showMessageDialog(this, "Products Button Clicked!");
    }

    private void openOrders() {
        // Logic to open the orders window
        JOptionPane.showMessageDialog(this, "Orders Button Clicked!");
    }

    private void openSettings() {
        // Logic to open the settings window
        JOptionPane.showMessageDialog(this, "Settings Button Clicked!");
    }

    public static void main(String[] args) {
        // Sample shop data for testing
        shop sampleShop = new shop("shop_user", "password", "Sample Shop", "123 Shop St", "shop@example.com", "123-456-7890");
        SwingUtilities.invokeLater(() -> new shopMainMenu(sampleShop).setVisible(true));
    }
}
