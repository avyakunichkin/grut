package utils;

import locators.LoginPage;
import model.User;
import types.Role;

import static com.codeborne.selenide.Selenide.$;

public class UserHelper extends BaseHelper{

    public UserHelper(Application app) {
        super(app);
    }

    public void authorization(Role role){
        $(LoginPage.login).setValue(User.getUser(role).login);
    }

    public void checkAuthResult() {

    }
}
