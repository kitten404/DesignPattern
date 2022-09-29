import Builder.parkinglot.ApartmentParkingLotBuilder;
import Builder.parkinglot.Director;
import Builder.parkinglot.ShoppingParkingLot;
import Builder.parkinglot.ShoppingParkingLotBuilder;
import Composite.Console.ControllerOne;
import Composite.Console.ControllerTwo;
import Composite.Console.NintendoSwitch;
import Composite.Console.PhysicalGameSlot;
import Observer.uber.DriverLocalization;
import Observer.uber.Localization;
import Observer.uber.UserLocalization;
import Strategy.pet.CatTreatment;
import Strategy.pet.DogTreatment;
import Strategy.pet.Pet;
import Strategy.pet.Treatment;

import java.time.LocalDateTime;

public class DesignPatternV1 {
    public static void main(String[] args){
        // --- Observer ---
        var date = LocalDateTime.now();
        var localization = new Localization();
        var observer1 = new DriverLocalization("", null);
        var observer2 = new UserLocalization("", null);
        localization.addObserver(observer1);
        localization.addObserver(observer2);
        localization.setLocation("@43.5249759,-70.42435,13z", date);

        // ---- Strategy ----
        var treatment = new Treatment();
        var pet = Pet.DOG;
        if(pet == Pet.CAT){
            treatment.giveInstructionForTreatment(new CatTreatment(false, 9));
        }else{
            treatment.giveInstructionForTreatment(new DogTreatment(90));
        }

        // --- Composite ---
        var controllerOne = new ControllerOne();
        var controllerTwo = new ControllerTwo();
        var physicalGameSlot = new PhysicalGameSlot();

        var nintendoSwitch = new NintendoSwitch();
        nintendoSwitch.add(controllerOne);
        nintendoSwitch.add(controllerTwo);
        nintendoSwitch.add(physicalGameSlot);

        nintendoSwitch.print();

        nintendoSwitch.remove(controllerTwo);

        nintendoSwitch.print();

        // --- builder ---
        var director = new Director();

        var shoppingParkingLotBuilder = new ShoppingParkingLotBuilder();
        director.buildShoppingParkingLot(shoppingParkingLotBuilder);
        var shoppingParkingLot = shoppingParkingLotBuilder.getResult();
        System.out.println("Shopping Parking Lot");
        System.out.println("Area: "+shoppingParkingLot.getArea()+" LineColor: "+shoppingParkingLot.getLineColor()+" Length: "+shoppingParkingLot.getLength());

        var apartmentParkingLotBuilder = new ApartmentParkingLotBuilder();
        director.buildApartmentParkingLot(apartmentParkingLotBuilder);
        var apartmentParkingLot = apartmentParkingLotBuilder.getResult();
        System.out.println("Apartment Parking Lot");
        System.out.println("Area: "+apartmentParkingLot.getArea()+" LineColor: "+apartmentParkingLot.getLineColor()+" Length: "+apartmentParkingLot.getLength());
    }
}
