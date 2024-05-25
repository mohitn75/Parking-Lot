package Ticket;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

import java.util.Date;

public class Ticket {

    String ticketId;
    Vehicle vehicle;
    Date entryTime;
    ParkingSpot parkingSpot;

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Ticket(Vehicle vehicle, Date entryTime, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

}
