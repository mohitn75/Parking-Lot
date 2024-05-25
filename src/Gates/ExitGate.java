package Gates;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;
import Ticket.Ticket;

import java.util.Date;
import java.util.List;


public class ExitGate {

    Ticket ticket;
    List<ParkingSpot> parkingSpots;

    public ExitGate(Ticket ticket, List<ParkingSpot> parkingSpots) {
        this.ticket = ticket;
        this.parkingSpots = parkingSpots;
        this.parkingSpots = giveExitToVehicle(ticket, parkingSpots);
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public List<ParkingSpot> giveExitToVehicle(Ticket ticket, List<ParkingSpot> parkingSpots){
        double fees = 0.0;
        Date currentTime = new Date();
        fees = (currentTime.getTime() - ticket.getEntryTime().getTime()) * ticket.getParkingSpot().getPrice();
        System.out.printf("Exit granted for vehicle : %s , fees to be paid : %f", ticket.getVehicle().getVehicleNumber(), fees);
        parkingSpots.forEach(parkingSpot -> {
            if(parkingSpot.getParkingSpotId() == ticket.getParkingSpot().getParkingSpotId()){
                parkingSpots.remove(parkingSpot);
            }
        });
        return parkingSpots;
    }

}
