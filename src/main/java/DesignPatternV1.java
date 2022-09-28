import Observer.uber.DriverLocalization;
import Observer.uber.Localization;
import Observer.uber.UserLocalization;
import Strategy.pet.CatTreatment;
import Strategy.pet.DogTreatment;
import Strategy.pet.Pet;
import Strategy.pet.Treatment;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.Flow;

public class DesignPatternV1 {
    public static void main(String[] args){
        // Observer
        var date = LocalDateTime.now();
        var localization = new Localization();
        var observer1 = new DriverLocalization("", null);
        var observer2 = new UserLocalization("", null);
        localization.addObserver(observer1);
        localization.addObserver(observer2);
        localization.setLocation("@43.5249759,-70.42435,13z", date);

        // ---- Strategy ---
        var treatment = new Treatment();
        var pet = Pet.DOG;
        if(pet == Pet.CAT){
            treatment.giveInstructionForTreatment(new CatTreatment(false, 9));
        }else{
            treatment.giveInstructionForTreatment(new DogTreatment(90));
        }
    }
}
