package Vehicle;

public class Vehicle implements VehicleInterface{

    String vehicleNumber;
    VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void enterVehicle(String vehicleNumber, VehicleType vehicleType) {
        System.out.printf("%s with number %s enters parking lot\n", vehicleType.toString(), vehicleNumber);
        //Todo: occupy parking spot logic
    }

    @Override
    public void exitVehicle(String vehicleNumber, VehicleType vehicleType) {
        System.out.printf("%s with number %s exits parking lot\n", vehicleType.toString(), vehicleNumber);
        //Todo: free up parking spot logic
    }
}
