package utils;

public class Application {

    public UserHelper user;

    public Application() {
        user = new UserHelper(this);
    }
}
