import Array;

public class Communication {
private int chatID;

public void setChatID(int value) {
   this.chatID = value;
}

public int getChatID() {
   return this.chatID;
}

private int user1ID;

public void setUser1ID(int value) {
   this.user1ID = value;
}

public int getUser1ID() {
   return this.user1ID;
}

private int user2ID;

public void setUser2ID(int value) {
   this.user2ID = value;
}

public int getUser2ID() {
   return this.user2ID;
}

private Array content;

public void setContent(Array value) {
   this.content = value;
}

public Array getContent() {
   return this.content;
}

/**
 * <pre>
 *           0..*     1..1
 * Communication ------------------------- Passenger
 *           communication        &lt;       passenger
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
 * Communication ------------------------- Driver
 *           communication        &lt;       driver
 * </pre>
 */
private Driver driver;

public void setDriver(Driver value) {
   this.driver = value;
}

public Driver getDriver() {
   return this.driver;
}

public void sendMessage(User user1, User user2, String content) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Array viewMessages(int userID) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
