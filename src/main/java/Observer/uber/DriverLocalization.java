package Observer.uber;

import java.time.LocalDateTime;

public class DriverLocalization implements Observer {
    private String geo;
    private LocalDateTime date;

    public DriverLocalization(String geo, LocalDateTime date) {
        this.geo = geo;
        this.date = date;
    }

    @Override
    public void update(String geo, LocalDateTime date) {
        this.geo = geo;
        this.date = date;
        this.localizationOnScreen();
    }

    public void localizationOnScreen() {
        System.out.println("The Driver geolocalization is: "+this.geo+ "Date: "+this.date);
    }
}
