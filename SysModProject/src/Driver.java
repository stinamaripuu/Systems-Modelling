import java.util.Set;
import java.util.HashSet;

public class Driver extends User {
private int driverID;

public void setDriverID(int value) {
   this.driverID = value;
}

public int getDriverID() {
   return this.driverID;
}

private int carID;

public void setCarID(int value) {
   this.carID = value;
}

public int getCarID() {
   return this.carID;
}

private float rating;

public void setRating(float value) {
   this.rating = value;
}

public float getRating() {
   return this.rating;
}

/**
 * <pre>
 *           1..1     1..1
 * Driver ------------------------- RideRequest
 *           driver        &gt;       rideRequest
 * </pre>
 */
private RideRequest rideRequest;

public void setRideRequest(RideRequest value) {
   this.rideRequest = value;
}

public RideRequest getRideRequest() {
   return this.rideRequest;
}

/**
 * <pre>
 *           1..1     0..*
 * Driver ------------------------- Communication
 *           driver        &gt;       communication
 * </pre>
 */
private Set<Communication> communication;

public Set<Communication> getCommunication() {
   if (this.communication == null) {
this.communication = new HashSet<Communication>();
   }
   return this.communication;
}

/**
 * <pre>
 *           1..1     1..1
 * Driver ------------------------- Car
 *           driver        &lt;       car
 * </pre>
 */
private Car car;

public void setCar(Car value) {
   this.car = value;
}

public Car getCar() {
   return this.car;
}

public void acceptRide(RideRequest request) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void declineRide(RideRequest request) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void completeRide(RideRequest request) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public double viewBalance() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void provideFeedback(Passenger passenger, int rating, String feedback) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
