package Observer.uber;

import java.time.LocalDateTime;

public interface Observer {
    void update(String geo, LocalDateTime date);
}
