package ParkingSpot;

import Vehicle.Vehicle;

public class TwoWheelerParkingSpot extends ParkingSpot implements ParkingSpotInterface{

    public TwoWheelerParkingSpot(int parkingSpotId, Boolean isEmpty, ParkingSpotType parkingSpotType) {
        super(parkingSpotId, isEmpty, parkingSpotType);
        System.out.println("Creating a 2-Wheeler Parking spot");
    }

    @Override
    public Double getPriceOfParkingSpot(){
        return 20.0;
    }

}
