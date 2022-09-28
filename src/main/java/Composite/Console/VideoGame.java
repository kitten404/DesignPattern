package Composite.Console;

public interface VideoGame {
    public void print();
    public void add(VideoGame videoGame);
    public void remove(VideoGame videoGame);
    public VideoGame getChild(int i);
}
