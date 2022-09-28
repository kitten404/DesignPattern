package Composite.Console;

public class PhysicalGameSlot implements VideoGame {
    private Integer version;

    public PhysicalGameSlot(){
        this.version = 2;
    }

    @Override
    public void print() {
        System.out.println("Physical slot available in version: "+this.version);
    }

    @Override
    public void add(VideoGame videoGame) {
        //N/A because its leaf
    }

    @Override
    public void remove(VideoGame videoGame) {
        //N/A because its leaf
    }

    @Override
    public VideoGame getChild(int i) {
        //N/A because its leaf
        return null;
    }
}
