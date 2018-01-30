package tests;

import org.junit.Test;
import types.Role;

public class FirstTest extends TestBase{

    @Test
    void authorizedTest(){
        authorization(Role.SUPER);
        app.user.checkAuthResult();
    }
}
