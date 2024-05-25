import ParkingLot.ParkingLot;
import ParkingSpot.ParkingSpot;
import Utils.EntryGateController;
import Vehicle.VehicleType;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();
        List<ParkingSpot> parkingSpots = parkingLot.initializeParkingLot();

        while(true){
            Scanner scanner = new Scanner(System.in);
            String entryOrExit = scanner.nextLine();
            VehicleType vehicleType;
            if(Objects.equals(entryOrExit, "Entry")){
                String vehicleNumber = scanner.nextLine();
                int wheeler = scanner.nextInt();
                if(wheeler == 2) vehicleType = VehicleType.TWO_WHEELER;
                else vehicleType = VehicleType.FOUR_WHEELER;
                EntryGateController.vehicleEntry(vehicleNumber, vehicleType, parkingSpots);
            }
            if(Objects.equals(entryOrExit, "Exit")){
                String vehicleNumber = scanner.nextLine();
                //Todo: Maintain list of tickets (based on ticket Ids) and delete them once exit finished.
            }
        }

    }
}