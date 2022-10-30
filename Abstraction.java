package abstraction;
import java.util.Scanner;

interface  AirlineBooking1{
    void airlineSelection();
}
interface  AirlineBooking2{
   void picktoDestination();
   void checkin();
   void checkout();
   void classSelection ();
   void ticketBooking();        
}

//class PIA extends AirlineBooking{
//    void picktoDestination(){};
//    void checkin(){};
//    void checkout(){};
//    void airlineSelection(){};
//    void classSelection(){};
//        
//}

class AirBlue implements AirlineBooking1, AirlineBooking2{
    public  void airlineSelection(){}
   public void picktoDestination(){}
   public void checkin(){}
   public void checkout(){}
   public void classSelection(){}
   public void ticketBooking(){}  
}
public class Abstraction {

    public static void main(String[] args) {
    AirBlue AB = new AirBlue();
    Scanner input = new Scanner(System.in);
     p.airlineSelection();
    
    }
    
}