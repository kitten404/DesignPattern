package Builder.parkinglot;

public class ApartmentParkingLotBuilder implements ParkingLotBuilder{
    private ApartmentParkingLot apartmentParkingLot;

    public ApartmentParkingLotBuilder(){
        this.apartmentParkingLot = new ApartmentParkingLot();
    }

    @Override
    public void setLength(Double length) {
        this.apartmentParkingLot.setLength(length);
    }

    @Override
    public void setColorLine(String colorLine) {
        this.apartmentParkingLot.setLineColor(colorLine);
    }

    @Override
    public void setArea(String area) {
        this.apartmentParkingLot.setArea(area);
    }

    public ApartmentParkingLot getResult(){
        return this.apartmentParkingLot;
    }
}
