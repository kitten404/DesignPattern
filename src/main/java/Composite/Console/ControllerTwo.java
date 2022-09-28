package Composite.Console;

public class ControllerTwo implements VideoGame{
    private String color;

    public ControllerTwo() {
        this.color = "Blue";
    }

    @Override
    public void print() {
        System.out.println("Controller one available. color: "+this.color);
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
