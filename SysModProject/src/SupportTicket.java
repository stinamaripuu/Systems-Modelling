
public class SupportTicket {
   private int ticketID;
   
   public void setTicketID(int value) {
      this.ticketID = value;
   }
   
   public int getTicketID() {
      return this.ticketID;
   }
   
   private int userID;
   
   public void setUserID(int value) {
      this.userID = value;
   }
   
   public int getUserID() {
      return this.userID;
   }
   
   private String issueDescription;
   
   public void setIssueDescription(String value) {
      this.issueDescription = value;
   }
   
   public String getIssueDescription() {
      return this.issueDescription;
   }
   
   private TicketStatus status;
   
   public void setStatus(TicketStatus value) {
      this.status = value;
   }
   
   public TicketStatus getStatus() {
      return this.status;
   }
   
   private String createdDate;
   
   public void setCreatedDate(String value) {
      this.createdDate = value;
   }
   
   public String getCreatedDate() {
      return this.createdDate;
   }
   
   private String resolvedDate;
   
   public void setResolvedDate(String value) {
      this.resolvedDate = value;
   }
   
   public String getResolvedDate() {
      return this.resolvedDate;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * SupportTicket ------------------------- CSR
    *           supportTicket        &lt;       cSR
    * </pre>
    */
   private CSR cSR;
   
   public void setCSR(CSR value) {
      this.cSR = value;
   }
   
   public CSR getCSR() {
      return this.cSR;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * SupportTicket ------------------------- RideRequest
    *           supportTicket        &lt;       rideRequest
    * </pre>
    */
   private RideRequest rideRequest;
   
   public void setRideRequest(RideRequest value) {
      this.rideRequest = value;
   }
   
   public RideRequest getRideRequest() {
      return this.rideRequest;
   }
   
   public void createTicket(String description) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void updateStatus(TicketStatus newStatus) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
