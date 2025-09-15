import java.util.*;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        if (movieName == null) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: " + price);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        ticket1.displayTicketDetails();
        ticket1.displayTicketDetails();
    }
}
