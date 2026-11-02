public class Telemetry {
    void onMessage(String carId, double lat, double lon, double speed) { }
}

class Geofence {
    boolean isInsideZone(double lat, double lon) { return true; }
}
