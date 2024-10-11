
public class RideRequest {
private int requestID;

public void setRequestID(int value) {
   this.requestID = value;
}

public int getRequestID() {
   return this.requestID;
}

private int passengerID;

public void setPassengerID(int value) {
   this.passengerID = value;
}

public int getPassengerID() {
   return this.passengerID;
}

private int driverID;

public void setDriverID(int value) {
   this.driverID = value;
}

public int getDriverID() {
   return this.driverID;
}

private String/*No type specified!*/ status;

public void setStatus(String/*No type specified!*/ value) {
   this.status = value;
}

public String/*No type specified!*/ getStatus() {
   return this.status;
}

private String pickUpLocation;

public void setPickUpLocation(String value) {
   this.pickUpLocation = value;
}

public String getPickUpLocation() {
   return this.pickUpLocation;
}

private String dropOffLocation;

public void setDropOffLocation(String value) {
   this.dropOffLocation = value;
}

public String getDropOffLocation() {
   return this.dropOffLocation;
}

private String pickupTime;

public void setPickupTime(String value) {
   this.pickupTime = value;
}

public String getPickupTime() {
   return this.pickupTime;
}

private String dropOffTime;

public void setDropOffTime(String value) {
   this.dropOffTime = value;
}

public String getDropOffTime() {
   return this.dropOffTime;
}

/**
 * <pre>
 *           0..*     1..1
 * RideRequest ------------------------- Passenger
 *           rideRequest        &lt;       passenger
 * </pre>
 */
private Passenger passenger;

public void setPassenger(Passenger value) {
   this.passenger = value;
}

public Passenger getPassenger() {
   return this.passenger;
}

/**
 * <pre>
 *           0..*     1..1
 * RideRequest ------------------------- Driver
 *           rideRequest        &lt;       driver
 * </pre>
 */
private Driver driver;

public void setDriver(Driver value) {
   this.driver = value;
}

public Driver getDriver() {
   return this.driver;
}

public void updateStatus(String/*No type specified*/ newStatus) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public double calculateFare(double distance, double duration) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
