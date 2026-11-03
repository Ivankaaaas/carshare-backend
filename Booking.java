public class Booking {
    static final int RESERVATION_MINUTES = 15;   // FR-3.1
    boolean isExpired(long minutesPassed) {
        return minutesPassed > RESERVATION_MINUTES;
    }
}

// FR-3.3: deposit hold through the payment gateway adapter (PSP, no card data stored)
class DepositHold {
    void hold(String paymentToken, int amount) { /* call PSP sandbox */ }
}
