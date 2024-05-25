package ParkingSpot;

import Vehicle.Vehicle;

public class FourWheelerParkingSpot extends ParkingSpot implements ParkingSpotInterface{


    public FourWheelerParkingSpot(int parkingSpotId, Boolean isEmpty, ParkingSpotType parkingSpotType) {
        super(parkingSpotId, isEmpty, parkingSpotType);
        System.out.println("Creating a 4-Wheeler Parking spot");
    }

    @Override
    public Double getPriceOfParkingSpot(){
        return 40.0;
    }
}
