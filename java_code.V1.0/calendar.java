import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class calendar {
    private List<reservation> reservations;

    public calendar() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(reservation reservation) {
        reservations.add(reservation);
    }

    public List<reservation> getReservations() {
        return reservations;
    }

    public List<reservation> getUpcomingReservations(Date currentDate) {
        List<reservation> upcomingReservations = new ArrayList<>();
        for (reservation reservation : reservations) {
            if (reservation.getDate().after(currentDate)) {
                upcomingReservations.add(reservation);
            }
        }
        return upcomingReservations;
    }
}
