public class Booking {
    static final int RESERVATION_MINUTES = 15;
    boolean isExpired(long minutesPassed) {
        return minutesPassed > RESERVATION_MINUTES;
    }
}

class DepositHold {
    void hold(String paymentToken, int amount) { }
}
