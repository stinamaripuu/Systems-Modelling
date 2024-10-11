
public class User {
private int userID;

public void setUserID(int value) {
   this.userID = value;
}

public int getUserID() {
   return this.userID;
}

private String firstname;

public void setFirstname(String value) {
   this.firstname = value;
}

public String getFirstname() {
   return this.firstname;
}

private String surname;

public void setSurname(String value) {
   this.surname = value;
}

public String getSurname() {
   return this.surname;
}

private int phoneNumber;

public void setPhoneNumber(int value) {
   this.phoneNumber = value;
}

public int getPhoneNumber() {
   return this.phoneNumber;
}

private String email;

public void setEmail(String value) {
   this.email = value;
}

public String getEmail() {
   return this.email;
}

private String password;

public void setPassword(String value) {
   this.password = value;
}

public String getPassword() {
   return this.password;
}

private Boolean validated;

public void setValidated(Boolean value) {
   this.validated = value;
}

public Boolean getValidated() {
   return this.validated;
}

public void login() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void logout() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void viewProfile() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
