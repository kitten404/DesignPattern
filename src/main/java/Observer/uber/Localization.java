package Observer.uber;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Localization implements Subject{
    private List<Observer> observers;
    private String geo;
    private LocalDateTime date;

    public Localization() {
        this.observers = new ArrayList<>();
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void setLocation(String geo, LocalDateTime date) {
        this.geo = geo;
        this.date = date;
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf( observer );

        if( index > -1 ){
            observers.remove( observer );
        }
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(e -> {
            e.update(this.geo, this.date);
        });
    }
}
