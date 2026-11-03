public class Telemetry {
    // FR-4.2: MQTT ingest of GPS and speed
    void onMessage(String carId, double lat, double lon, double speed) { }
}

// FR-4.7: geofence check on rental end
class Geofence {
    boolean isInsideZone(double lat, double lon) { return true; }
}
