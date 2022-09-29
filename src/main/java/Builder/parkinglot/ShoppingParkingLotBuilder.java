package Builder.parkinglot;

public class ShoppingParkingLotBuilder implements ParkingLotBuilder{
    private ShoppingParkingLot shoppingParkingLot;

    public ShoppingParkingLotBuilder(){
        this.shoppingParkingLot = new ShoppingParkingLot();
    }

    @Override
    public void setLength(Double length) {
        shoppingParkingLot.setLength(length);
    }

    @Override
    public void setColorLine(String colorLine) {
        shoppingParkingLot.setLineColor(colorLine);
    }

    @Override
    public void setArea(String area) {
        shoppingParkingLot.setArea(area);
    }

    public ShoppingParkingLot getResult(){
        return shoppingParkingLot;
    }
}
