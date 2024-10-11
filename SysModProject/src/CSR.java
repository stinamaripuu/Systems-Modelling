import java.util.Set;
import java.util.HashSet;

public class CSR extends User {
   private int employeeID;
   
   public void setEmployeeID(int value) {
      this.employeeID = value;
   }
   
   public int getEmployeeID() {
      return this.employeeID;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * CSR ------------------------- SupportTicket
    *           cSR        &gt;       supportTicket
    * </pre>
    */
   private Set<SupportTicket> supportTicket;
   
   public Set<SupportTicket> getSupportTicket() {
      if (this.supportTicket == null) {
         this.supportTicket = new HashSet<SupportTicket>();
      }
      return this.supportTicket;
   }
   
   public void respondToTicket() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void contactDriverOrPassenger(User user, String message) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
