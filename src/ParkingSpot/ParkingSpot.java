package ParkingSpot;

import Vehicle.Vehicle;

public class ParkingSpot implements ParkingSpotInterface {

    int parkingSpotId;
    Boolean isEmpty;
    ParkingSpotType parkingSpotType;
    Vehicle vehicle;
    Double price;

    public ParkingSpot(int parkingSpotId, Boolean isEmpty, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.isEmpty = isEmpty;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = getVehicle();
        this.price = getPriceOfParkingSpot();
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Double getPriceOfParkingSpot() {
        return this.price;
    }
}
