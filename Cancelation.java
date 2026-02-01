package Proj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Cancelation {

     int canbusno;
     String canpassname;
     Date candate;

  Cancelation() {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter cancelation name");
      canpassname = sc.nextLine();
      System.out.println("enter cancelation busno");
      canbusno = sc.nextInt();
      System.out.println("enter cancelation Date");
      String dateinput = sc.next();
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
      try {
          candate = dateFormat.parse(dateinput);
      } catch (ParseException e) {
          throw new RuntimeException(e);
      }
  }

  public void cancelbooking(ArrayList<Booking> bookinglist){
      boolean checkdata = true;
      Iterator <Booking> itr = bookinglist.iterator();
      while(itr.hasNext()){
          Booking b = itr.next();
          if(b.busno == canbusno && b.passengername.equals(canpassname) && b.date.equals(candate)){
              itr.remove();
              checkdata = false;
              System.out.println("Booking removed");
          }
      }

      if(checkdata){
          System.out.println(" No matching booking found");
      }

  }

}