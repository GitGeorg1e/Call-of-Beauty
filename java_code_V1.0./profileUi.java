import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class profileUi extends JFrame {
    private profile profile;
    private JTextField bioField;
    private JTextField emailField;
    private JLabel profilePictureLabel;
    private JButton saveButton;

    public profileUi(profile profile) {
        this.profile = profile;

        setTitle("Profile");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2));

        add(new JLabel("Profile ID:"));
        JLabel profileIdLabel = new JLabel(String.valueOf(profile.getProfileId()));
        add(profileIdLabel);

        add(new JLabel("User ID:"));
        JLabel userIdLabel = new JLabel(String.valueOf(profile.getUserId()));
        add(userIdLabel);

        add(new JLabel("Bio:"));
        bioField = new JTextField(profile.getBio());
        add(bioField);

        add(new JLabel("Email:"));
        emailField = new JTextField(profile.getEmail());
        add(emailField);

        add(new JLabel("Profile Picture:"));
        profilePictureLabel = new JLabel(new ImageIcon(profile.getProfilePicture().getPath()));
        add(profilePictureLabel);

        profile.getEditProfileButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editProfile();
            }
        });

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveProfile();
            }
        });

        add(profile.getEditProfileButton());
        add(saveButton);

        setVisible(true);
    }

    private void editProfile() {
        // Logic to edit profile (e.g., allow file chooser for profile picture)
        JOptionPane.showMessageDialog(this, "Edit Profile Button Clicked!");
    }

    private void saveProfile() {
        profile.setBio(bioField.getText());
        profile.setEmail(emailField.getText());
        // Assume profile picture update is handled elsewhere
        JOptionPane.showMessageDialog(this, "Profile saved successfully!");
    }

    public static void main(String[] args) {
        // Sample data for testing
        profile sampleProfile = new profile(1, 1, "This is a bio", new File("path/to/profile/picture.png"), "user@example.com");
        new profileUi(sampleProfile);
    }
}
