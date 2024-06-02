import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.Date;
import java.util.List;

public class calendarUi extends JFrame {
    private calendar calendar;
    private Jcalendar jcalendar;
    private DefaultListModel<String> reservationListModel;
    private JList<String> reservationList;

    public calendarUi(calendar calendar) {
        this.calendar = calendar;

        setTitle("Calendar");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Create the calendar component
        jcalendar = new Jcalendar();
        jcalendar.addPropertyChangeListener("calendar", evt -> updateReservationList());
        add(jcalendar, BorderLayout.CENTER);

        // Create the list for upcoming reservations
        reservationListModel = new DefaultListModel<>();
        reservationList = new JList<>(reservationListModel);
        JScrollPane scrollPane = new JScrollPane(reservationList);
        scrollPane.setPreferredSize(new Dimension(200, 0));
        add(scrollPane, BorderLayout.EAST);

        // Initialize the reservation list
        updateReservationList();

        setVisible(true);
    }

    private void updateReservationList() {
        reservationListModel.clear();
        Date selectedDate = jcalendar.getDate();
        List<reservation> upcomingReservations = calendar.getUpcomingReservations(selectedDate);
        for (reservation reservation : upcomingReservations) {
            reservationListModel.addElement(reservation.toString());
        }

        // Highlight dates with reservations
        highlightReservationDates();
    }

    private void highlightReservationDates() {
        List<reservation> reservations = calendar.getReservations();
        for (reservation reservation : reservations) {
            jCalendar.getDayChooser().addDateEvaluator(new ReservationDateEvaluator(reservation.getDate()));
        }
    }

    public static void main(String[] args) {
        // Sample data for testing
        calendar calendar = new calendar();
        calendar.addReservation(new reservation(1, new Date(), "12:00 PM", "Confirmed"));
        new calendarUi(calendar);
    }
}
