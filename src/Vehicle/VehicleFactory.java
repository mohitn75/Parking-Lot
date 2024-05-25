package Vehicle;

import java.lang.foreign.ValueLayout;

public class VehicleFactory {
    VehicleInterface createVehicleObject(String vehicleNumber, VehicleType vehicleType){
        switch (vehicleType){
            case VehicleType.FOUR_WHEELER -> {return new FourWheelerVehicle(vehicleNumber, vehicleType);}
            case VehicleType.TWO_WHEELER -> {return new TwoWheelerVehicle(vehicleNumber, vehicleType);}
        }
        return null;
    }

}
