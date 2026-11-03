public class Booking {
    static final int RESERVATION_MINUTES = 15;   // FR-3.1
    boolean isExpired(long minutesPassed) {
        return minutesPassed > RESERVATION_MINUTES;
    }
}
