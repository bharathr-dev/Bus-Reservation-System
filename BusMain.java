package Proj;
import java.util.*;
public class BusMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Bus> buslist = new ArrayList<Bus>();//todo: 1

        buslist.add(new Bus(1, true, 2));
        buslist.add(new Bus(2, false, 5));

        ArrayList<Booking> bookinglist = new ArrayList<>();

        while (true) {
            System.out.println("--------------------------");
            System.out.println(" Press 1 to view bus details \n Press 2 to Book ticket \n Press 3 to Cancel the booking \n press 4 to view available seats");
            System.out.println("--------------------------");
            System.out.print(" enter number: ");

            int cusinput = sc.nextInt();

            if (cusinput == 1) {
                for (Bus s : buslist) { //todo: 2
                    s.display();
                }
            }

            if (cusinput == 2) {
                Booking bookingobj = new Booking();  // todo:3
                int result = (bookingobj.isavailable(buslist, bookinglist)); //todo 5
                if (result == 1) {
                    bookinglist.add(bookingobj);
                    System.out.println("booking done");
                } else if (result == 0) {
                    System.out.println("sea1ts are full");
                } else if (result == -1) {
                    System.out.println("invalid bus no");

                }
            }

            if (cusinput == 3) {

                Cancelation bookingcanobj = new Cancelation();
                bookingcanobj.cancelbooking(bookinglist);
            }

        }

    }
}
