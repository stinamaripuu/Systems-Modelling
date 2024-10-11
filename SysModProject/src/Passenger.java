import java.util.Set;
import java.util.HashSet;
import Array;

public class Passenger extends User {
private int passengerID;

public void setPassengerID(int value) {
   this.passengerID = value;
}

public int getPassengerID() {
   return this.passengerID;
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
 *           1..1     0..*
 * Passenger ------------------------- RideRequest
 *           passenger        &gt;       rideRequest
 * </pre>
 */
private Set<RideRequest> rideRequest;

public Set<RideRequest> getRideRequest() {
   if (this.rideRequest == null) {
this.rideRequest = new HashSet<RideRequest>();
   }
   return this.rideRequest;
}

public RideRequest requestRide(String pickupLocation, String dropOffLocation) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void contactSupport(String issue) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void provideFeedback(Driver driver, int rating, String feedback) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Array viewRideHistory() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
