import Observer.uber.DriverLocalization;
import Observer.uber.Localization;
import Observer.uber.UserLocalization;

import java.time.LocalDateTime;

public class DesignPatternV1 {
    public static void main(String[] args){
        var date = LocalDateTime.now();
        var localization = new Localization();
        var observer1 = new DriverLocalization("", null);
        var observer2 = new UserLocalization("", null);
        localization.addObserver(observer1);
        localization.addObserver(observer2);
        localization.setLocation("@43.5249759,-70.42435,13z", date);
    }
}
