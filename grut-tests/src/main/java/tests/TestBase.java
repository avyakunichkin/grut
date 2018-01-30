package tests;

import org.junit.Before;
import types.Role;
import utils.Application;

public class TestBase {

    Application app;

    @Before
    void initApp(){
        app = new Application();
    }

    void authorization(Role role) {
        app.user.authorization(role);
    }
}
