package Strategy.pet;

public class DogTreatment implements PetTreatment{
    private Integer backLength;

    public DogTreatment(Integer backLength) {
        this.backLength = backLength;
    }

    @Override
    public void firstTimeVetVisit() {
        System.out.println("Steps to first vet visit: take the dog to the vet's room and check ears, paw and heartbeat");
        if(this.backLength > 80){
            System.out.println("The dog should be treated with a muzzle on");
        }
    }
}
