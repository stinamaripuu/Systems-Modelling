
public class Payment {
private int paymentID;

public void setPaymentID(int value) {
   this.paymentID = value;
}

public int getPaymentID() {
   return this.paymentID;
}

private int rideRequestID;

public void setRideRequestID(int value) {
   this.rideRequestID = value;
}

public int getRideRequestID() {
   return this.rideRequestID;
}

private double amount;

public void setAmount(double value) {
   this.amount = value;
}

public double getAmount() {
   return this.amount;
}

private PaymentMethod paymentType;

public void setPaymentType(PaymentMethod value) {
   this.paymentType = value;
}

public PaymentMethod getPaymentType() {
   return this.paymentType;
}

private String transactionDate;

public void setTransactionDate(String value) {
   this.transactionDate = value;
}

public String getTransactionDate() {
   return this.transactionDate;
}

/**
 * <pre>
 *           1..1     1..1
 * Payment ------------------------- RideRequest
 *           payment        &gt;       rideRequest
 * </pre>
 */
private RideRequest rideRequest;

public void setRideRequest(RideRequest value) {
   this.rideRequest = value;
}

public RideRequest getRideRequest() {
   return this.rideRequest;
}

public boolean processPayment() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public boolean refund() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
