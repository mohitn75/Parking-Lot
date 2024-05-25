package Gates;

import ParkingSpot.ParkingSpot;
import Ticket.Ticket;
import Vehicle.Vehicle;

import java.util.List;
import java.util.Objects;

public class EntryGate {

    Vehicle vehicle;
    Ticket ticket;
    List<ParkingSpot> parkingSpots;

    public EntryGate(Vehicle vehicle, Ticket ticket, List<ParkingSpot> parkingSpots) {
        this.vehicle = vehicle;
        this.ticket = ticket;
        this.parkingSpots = parkingSpots;
        giveEntryToVehicle(vehicle, ticket.getParkingSpot());
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    void giveEntryToVehicle(Vehicle vehicle, ParkingSpot assignedParkingSpot){
        if(assignedParkingSpot == null){
            System.out.println("No Space, park outside");
        }
        else {
            assignedParkingSpot.setVehicle(vehicle);
            assignedParkingSpot.setEmpty(false);
            System.out.printf("Vehicle : %s ( %s ) to be parked at spot : %d \n", vehicle.getVehicleNumber(), vehicle.getVehicleType().toString(), assignedParkingSpot.getParkingSpotId());

//            for (ParkingSpot parkingSpot : this.parkingSpots) {
//                if(Objects.equals(parkingSpot.getParkingSpotType().toString(), vehicle.getVehicleType().toString()) && parkingSpot.getEmpty()) {
//                    parkingSpot.setEmpty(false);
//                    parkingSpot.setVehicle(vehicle);
//                    System.out.printf("Vehicle : %s ( %s ) to be parked at spot : %d \n", vehicle.getVehicleNumber(), vehicle.getVehicleType().toString(), parkingSpot.getParkingSpotId());
//                    break;
//                }
//            }

        }
    }


}
