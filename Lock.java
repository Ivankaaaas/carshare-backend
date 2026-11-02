import java.util.*;

public class Lock {
    private final Set<String> processedOps = new HashSet<>();

    public boolean syncOfflineRental(String rentalId, String opId) {
        return processedOps.add(opId);
    }

    public boolean unlock(String carId, String token) {
        if (isExpired(token)) return false;
        return validate(token) || bleUnlock(carId);
    }

    boolean validate(String token) { return token != null; }
    boolean isExpired(String token) { return false; }
    boolean bleUnlock(String carId) { return true; }
}
