package Builder.parkinglot;

public class Director {
    public ParkingLotBuilder buildApartmentParkingLot(ParkingLotBuilder parkingLotBuilder) {
        parkingLotBuilder.setColorLine("Red");
        parkingLotBuilder.setArea("Inside");
        parkingLotBuilder.setLength(20.5);
        return parkingLotBuilder;
    }

    public ParkingLotBuilder buildShoppingParkingLot(ParkingLotBuilder parkingLotBuilder) {
        parkingLotBuilder.setColorLine("yellow");
        parkingLotBuilder.setArea("outside");
        parkingLotBuilder.setLength(20.0);
        return parkingLotBuilder;
    }
}
