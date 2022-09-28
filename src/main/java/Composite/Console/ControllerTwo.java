package Composite.Console;

import Singleton.Log;

public class ControllerTwo implements VideoGame{
    private String color;
    private Log log;

    public ControllerTwo() {
        this.color = "Blue";
        log = Log.getInstance();
    }

    @Override
    public void print() {
        this.log.info("Controller Two");
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
