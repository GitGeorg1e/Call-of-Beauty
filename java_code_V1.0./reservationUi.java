import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


public class reservationUi extends JFrame {
    private static reservation reservation;
    private JTextField reservationIdField;
    private JTextField dateField;
    private JTextField timeField;
    private JTextField statusField;
    private JButton saveButton;

    public reservationUi(reservation reservation) {
        this.reservation = reservation;

        setTitle("Create New Reservation");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(6, 2));
        add(new JLabel("Reservation ID:"));
        reservationIdField = new JTextField();
        add(reservationIdField);

        add(new JLabel("Date (dd/MM/yyyy):"));
        dateField = new JTextField();
        add(dateField);

        add(new JLabel("Time (HH:mm):"));
        timeField = new JTextField();
        add(timeField);

        add(new JLabel("Status:"));
        statusField = new JTextField();
        add(statusField);

        add(new JLabel("Actions:"));
        JPanel buttonPanel = new JPanel();
        saveButton = new JButton("Save");
        buttonPanel.add(saveButton);
        add(buttonPanel);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveReservation();
            }
        });

        setVisible(true);
    }
    
    private void saveReservation() {
        try {
            int reservationId = Integer.parseInt(reservationIdField.getText());
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateField.getText());
            String time = timeField.getText();
            String status = statusField.getText();

            reservation = new reservation(reservationId, date, time, status);
            JOptionPane.showMessageDialog(this, "Reservation saved successfully!");
            dispose();  // Close the window after saving
            // Redirect to main menu or next step
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving reservation. Please check your input.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new reservationUi(reservation).setVisible(true));
    }
}