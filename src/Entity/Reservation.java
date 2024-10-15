package Entity;

public class Reservation {
	private long reservationid;
	private long roomid;
	private long customeid;
	public Reservation(long reservationid, long roomid, long customeid) {
		super();
		this.reservationid = reservationid;
		this.roomid = roomid;
		this.customeid = customeid;
	}
	public long getReservationid() {
		return reservationid;
	}
	public void setReservationid(long reservationid) {
		this.reservationid = reservationid;
	}
	public long getRoomid() {
		return roomid;
	}
	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}
	public long getCustomeid() {
		return customeid;
	}
	public void setCustomeid(long customeid) {
		this.customeid = customeid;
	}
	
}
