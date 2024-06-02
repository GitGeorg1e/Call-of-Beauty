import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class reservation {
    private int reservationId;
    private Date date;
    private String time;
    private String status;
    private JButton confirmButton;
    private JButton cancelButton;
    private JButton activateReminderButton;

    public reservation(int reservationId, Date date, String time, String status) {
        this.reservationId = reservationId;
        this.date = date;
        this.time = time;
        this.status = status;
        this.confirmButton = new JButton("Confirm");
        this.cancelButton = new JButton("Cancel");
        this.activateReminderButton = new JButton("Activate Reminder");

        addListeners();
    }

    private void addListeners() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmBooking();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelBooking();
            }
        });

        activateReminderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                activateReminder(new Reminder());
            }
        });
    }

    public void confirmBooking() {
        this.status = "Confirmed";
        System.out.println("Booking confirmed");
    }

    public void cancelBooking() {
        this.status = "Cancelled";
        System.out.println("Booking cancelled");
    }

    public void activateReminder(Reminder reminder) {
        System.out.println("Reminder activated");
    }

    public void makeBooking() {
        System.out.println("Making a new booking");
    }

    // Getters and Setters
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public JButton getActivateReminderButton() {
        return activateReminderButton;
    }
}
