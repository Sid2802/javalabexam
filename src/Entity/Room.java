package Entity;
public class Room {
	private int roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;

    
    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = true; 
    }

    
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false; 
    }

    public void releaseRoom() {
        isAvailable = true; 
    }
}
