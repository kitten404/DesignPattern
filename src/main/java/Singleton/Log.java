package Singleton;

public class Log {
    private static Log instance;

    private Log(){}

    public static Log getInstance(){
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public static void info(String message) {
        System.out.println(message);
    }
}
