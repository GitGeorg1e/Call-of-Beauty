import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.*;
import java.util.Date;

public class mainMenu extends JFrame {
    private user user;
    private JLabel usernameLabel;
    private JLabel favoriteShopLabel;
    private JButton profileButton;
    private JButton reservationButton;
    private JButton favoritesButton;
    private JButton calendarButton;

    public mainMenu(user user) {
        this.user = user;
        setTitle("Main Menu");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Create header panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.LIGHT_GRAY);
        headerPanel.setPreferredSize(new Dimension(400, 100));

        // Add user info to header
        usernameLabel = new JLabel("Welcome, " + user.getusername());
        usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(usernameLabel, BorderLayout.CENTER);
        
        // Add an image/icon (assuming there is a placeholder image at path "user.png")
        JLabel userImageLabel = new JLabel(new ImageIcon("user.png"));
        headerPanel.add(userImageLabel, BorderLayout.WEST);

        // Create center panel for favorite shop
        JPanel centerPanel = new JPanel();
        favoriteShopLabel = new JLabel("Favorite Shop: None");
        centerPanel.add(favoriteShopLabel);

        // Create footer panel for buttons
        JPanel footerPanel = new JPanel(new GridLayout(1, 4));

        profileButton = new JButton("Profile");
        reservationButton = new JButton("Reservation");
        favoritesButton = new JButton("Favorites");
        calendarButton = new JButton("Calendar");

        footerPanel.add(profileButton);
        footerPanel.add(reservationButton);
        footerPanel.add(favoritesButton);
        footerPanel.add(calendarButton);

        // Add panels to main panel
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        add(mainPanel);

        // Add action listeners to buttons
        profileButton.addActionListener(e -> openProfile());
        reservationButton.addActionListener(e -> openReservation());
        favoritesButton.addActionListener(e -> openFavorites());
        calendarButton.addActionListener(e -> openCalendar());
    }

    private void openProfile() {
        // Logic to open the profile window
        //JOptionPane.showMessageDialog(this, "Profile Button Clicked!");
         profile sampleProfile = new profile(1, 1, "This is a bio", new File("path/to/profile/picture.png"), "user@example.com");
        new profileUi(sampleProfile).setVisible(true);
    }

    private void openReservation() {
        // Sample reservation for demonstration
       // reservation sampleReservation = new reservation(1, new Date(), "12:00 PM", "Pending");
        //new reservationUi(sampleReservation).setVisible(true);
        new reservationUi(null).setVisible(true);
    }

    private void openFavorites() {
        // Logic to open the favorites window
        JOptionPane.showMessageDialog(this, "Favorites Button Clicked!");
    }

    private void openCalendar() {
        // Logic to open the calendar window
        JOptionPane.showMessageDialog(this, "Calendar Button Clicked!");
    }

    public void setFavoriteShop(String shopName) {
        favoriteShopLabel.setText("Favorite Shop: " + shopName);
    }

    public static void main(String[] args) {
        user sampleUser = new user("john_doe", "password", "John Doe", "john@example.com", "123 Main St", "123-456-7890");
        SwingUtilities.invokeLater(() -> new mainMenu(sampleUser).setVisible(true));
    }
}
