package ParkingLot;

import ParkingSpot.ParkingSpot;
import ParkingSpot.ParkingSpotFactory;
import ParkingSpot.ParkingSpotType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<ParkingSpot> parkingSpots;

    public ParkingLot(){
        this.parkingSpots = new ArrayList<>();
    }

    public List<ParkingSpot> initializeParkingLot() {

        List<ParkingSpot> parkingLot = new ArrayList<>();

        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();

        ParkingSpot parkingSpot = parkingSpotFactory.createParkingSpace(1, ParkingSpotType.FOUR_WHEELER);
        addParkingSpace(parkingSpot);

        parkingSpot = parkingSpotFactory.createParkingSpace(2, ParkingSpotType.TWO_WHEELER);
        addParkingSpace(parkingSpot);

        displayParkingLot();
        return this.parkingSpots;
    }

    public void addParkingSpace(ParkingSpot newParkingSpot){
        this.parkingSpots.add(newParkingSpot);
    }

    public void removeParkingSpace(int parkingSpotId){
        this.parkingSpots.forEach(parkingSpot -> {
            if(parkingSpot.getParkingSpotId() == parkingSpotId){
                this.parkingSpots.remove(parkingSpotId);
                return;
            }
        });
    }

    public void displayParkingLot(){
        System.out.println("\n*****Current Parking Lot*****");
        this.parkingSpots.forEach(parkingSpot -> {
            System.out.printf("%d %s %b %f\n",parkingSpot.getParkingSpotId(),parkingSpot.getParkingSpotType(), parkingSpot.getEmpty(), parkingSpot.getPrice());
        });
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
