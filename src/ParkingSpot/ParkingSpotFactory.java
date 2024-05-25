package ParkingSpot;

public class ParkingSpotFactory {

    public ParkingSpot createParkingSpace(int parkingSpotId, ParkingSpotType parkingSpotType){
        switch (parkingSpotType){
            case TWO_WHEELER -> {return new TwoWheelerParkingSpot(parkingSpotId, true, parkingSpotType);}
            case FOUR_WHEELER -> {return new FourWheelerParkingSpot(parkingSpotId, true, parkingSpotType);}
        }
        return null;
    }

}
