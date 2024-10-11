
public class Car {
private int carID;

public void setCarID(int value) {
   this.carID = value;
}

public int getCarID() {
   return this.carID;
}

private String mark;

public void setMark(String value) {
   this.mark = value;
}

public String getMark() {
   return this.mark;
}

private String model;

public void setModel(String value) {
   this.model = value;
}

public String getModel() {
   return this.model;
}

private String color;

public void setColor(String value) {
   this.color = value;
}

public String getColor() {
   return this.color;
}

private String plateNr;

public void setPlateNr(String value) {
   this.plateNr = value;
}

public String getPlateNr() {
   return this.plateNr;
}

private int nrOfSeats;

public void setNrOfSeats(int value) {
   this.nrOfSeats = value;
}

public int getNrOfSeats() {
   return this.nrOfSeats;
}

/**
 * <pre>
 *           1..1     1..1
 * Car ------------------------- Driver
 *           car        &gt;       driver
 * </pre>
 */
private Driver driver;

public void setDriver(Driver value) {
   this.driver = value;
}

public Driver getDriver() {
   return this.driver;
}

}
