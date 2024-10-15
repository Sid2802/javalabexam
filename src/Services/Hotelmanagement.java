package Services;

import java.util.ArrayList;

import Entity.Customer;
import Entity.Room;


public class Hotelmanagement {
	private ArrayList<Room> rooms;
	private ArrayList<Customer> customer;

	public Hotelmanagement() {
		rooms = new ArrayList<>();
		customer = new ArrayList<>();
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public void bookRoom(String customerName, int roomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
				room.bookRoom();
				customer.add(new Customer(customerName, roomNumber));
				System.out.println("Room " + roomNumber + " booked successfully for " + customerName + ".");
				return;
			}
		}
		System.out.println("Room " + roomNumber + " is not available.");
	}

	public void cancelBooking(String customerName) {
		Customer customerToCancel = null;
		for (Customer customer : customer) {
			if (customer.getName().equals(customerName)) {
				customerToCancel = customer;
				break;
			}
		}

		if (customerToCancel != null) {
			for (Room room : rooms) {
				if (room.getRoomNumber() == customerToCancel.getRoomNumber()) {
					room.releaseRoom();
					customer.remove(customerToCancel);
					System.out.println("Booking canceled for " +customerName + ".");
					return;
				}
			}
		} else {
			System.out.println("No booking found for " + customerName + ".");
		}
	}

	public void displayAvailableRooms() {
		System.out.println("Available rooms:");
		boolean hasAvailableRooms = false;
		for (Room room : rooms) {
			if (room.isAvailable()) {
				System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType()
						+ ", Price: $" + room.getPrice());
				hasAvailableRooms = true;
			}
		}
		if (!hasAvailableRooms) {
			System.out.println("No available rooms.");
		}
	}
}
