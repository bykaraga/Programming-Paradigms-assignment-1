import java.util.*;
public class Main {
    private static final int SEATS = 10;
    private static boolean[] 1seats = new boolean[SEATS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display available seats\n2. Book a seat\n3. Cancel reservation\n4. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) displaySeats();
            else if (choice == 2) bookSeat();
            else if (choice == 3) cancelReservation();
            else break;
        }
        scanner.close();
    }

    public static void displaySeats() {
        for (int i = 0; i < SEATS; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }

    public static void bookSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seat number to book: ");
        int seat = scanner.nextInt();
        if (seat < 1 || seat > SEATS || seats[seat - 1]) {
            System.out.println("Invalid or already booked seat.");
        } else {
            seats[seat - 1] = true;
            System.out.println("Seat booked successfully.");
        }
    }

    public static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seat number to cancel: ");
        int seat = scanner.nextInt();
        if (seat < 1 || seat > SEATS || !seats[seat - 1]) {
            System.out.println("Invalid or not booked seat.");
        } else {
            seats[seat - 1] = false;
            System.out.println("Reservation canceled successfully.");
        }
    }
}