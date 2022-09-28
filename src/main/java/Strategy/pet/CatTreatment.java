package Strategy.pet;

public class CatTreatment implements PetTreatment{
    private boolean areVaccinesOk;
    private Integer backLength;

    public CatTreatment(boolean areVaccinesOk, Integer backLength) {
        this.areVaccinesOk = areVaccinesOk;
        this.backLength = backLength;
    }

    @Override
    public void firstTimeVetVisit() {
        if(!this.areVaccinesOk){
            System.out.println("The cat should take all the missing vaccines in this visit");
        }
        if(this.backLength < 10){
            System.out.println("The cat should take vermifuge");
        }
    }
}
