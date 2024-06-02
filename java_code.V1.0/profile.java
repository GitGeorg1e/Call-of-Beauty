import javax.swing.*;
import java.io.File;

public class profile {
    private int profileId;
    private int userId;
    private String bio;
    private File profilePicture;
    private String email;
    private JButton editProfileButton;

    public profile(int profileId, int userId, String bio, File profilePicture, String email) {
        this.profileId = profileId;
        this.userId = userId;
        this.bio = bio;
        this.profilePicture = profilePicture;
        this.email = email;
        this.editProfileButton = new JButton("Edit Profile");
    }

    public void editProfile() {
        // Logic to edit profile
        System.out.println("Editing profile");
    }

    // Getters and Setters
    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public File getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(File profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JButton getEditProfileButton() {
        return editProfileButton;
    }

    public void setEditProfileButton(JButton editProfileButton) {
        this.editProfileButton = editProfileButton;
    }
}
