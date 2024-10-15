package operation;

import java.util.Scanner;

import Entity.Room;
import Services.Hotelmanagement;

public class Testhotelmanagementsystem {
	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		Hotelmanagement hotelManagement = new Hotelmanagement();

		hotelManagement.addRoom(new Room(101, "Single", 100.0));
		hotelManagement.addRoom(new Room(102, "Double", 150.0));
		hotelManagement.addRoom(new Room(103, "Suite", 250.0));
		hotelManagement.addRoom(new Room(104, "Single", 100.0));
		hotelManagement.addRoom(new Room(105, "Double", 150.0));
		try {
			do {
				System.out.println("\nHotel Management System");
				System.out.println("1. Book a Room");
				System.out.println("2. Cancel a Booking");
				System.out.println("3. Display Available Rooms");
				System.out.println("4. Exit");

				System.out.print("Enter your choice: ");
				choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					System.out.print("Enter customer name: ");
					String customerName = scanner.nextLine();
					System.out.print("Enter room number to book: ");
					int roomNumber = scanner.nextInt();
					hotelManagement.bookRoom(customerName, roomNumber);
					break;

				case 2:
					System.out.print("Enter customer name to cancel: ");
					String cancelName = scanner.nextLine();
					hotelManagement.cancelBooking(cancelName);
					break;

				case 3:
					hotelManagement.displayAvailableRooms();
					break;

				case 4:
					System.out.println("Exiting the system...");
					scanner.close();
					return;

				default:
					System.out.println("Invalid choice, please try again.");
				}
			} while (choice != 4);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
