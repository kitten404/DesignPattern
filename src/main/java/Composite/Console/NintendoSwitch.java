package Composite.Console;

import java.util.ArrayList;
import java.util.List;

public class NintendoSwitch implements VideoGame{
    private List<VideoGame> videoGameList;

    public NintendoSwitch() {
        this.videoGameList = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Nintendo Switch components so far");
        for(VideoGame vdl : videoGameList) {
            vdl.print();
        }
    }

    @Override
    public void add(VideoGame videoGame) {
        this.videoGameList.add(videoGame);
    }

    @Override
    public void remove(VideoGame videoGame) {
        if(this.videoGameList.indexOf(videoGame) > -1) {
            this.videoGameList.remove(videoGame);
        }
    }

    @Override
    public VideoGame getChild(int i) {
        return this.videoGameList.get(i);
    }
}
