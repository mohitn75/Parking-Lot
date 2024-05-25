package Utils;

import Gates.EntryGate;
import ParkingSpot.ParkingSpot;
import ParkingSpot.ParkingSpotFactory;
import Ticket.Ticket;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class EntryGateController {

    public static void vehicleEntry(String vehicleNumber, VehicleType vehicleType, List<ParkingSpot> parkingSpots){
        Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType);
        ParkingSpot parkingSpot = isVacantForVehicle(vehicle, parkingSpots);
        Ticket ticket = new Ticket(vehicle, new Date(), parkingSpot);
        EntryGate entryGate = new EntryGate(vehicle, ticket, parkingSpots);
    }

    public static ParkingSpot isVacantForVehicle(Vehicle vehicle, List<ParkingSpot> TotalParkingSpots){
        for (ParkingSpot parkingSpot : TotalParkingSpots) {
            if (Objects.equals(parkingSpot.getParkingSpotType().toString(), vehicle.getVehicleType().toString()) && parkingSpot.getEmpty()) {
                return parkingSpot;
            }
        }
        return null;
    }

}
