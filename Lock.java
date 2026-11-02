import java.util.*;

public class Lock {
    private final Set<String> processedOps = new HashSet<>();

    public boolean syncOfflineRental(String rentalId, String opId) {
        return processedOps.add(opId);
    }

    public boolean unlock(String carId, String token) {
        return validate(token) || bleUnlock(carId);
    }

    boolean validate(String token) { return token != null; }
    boolean bleUnlock(String carId) { return true; }
}
