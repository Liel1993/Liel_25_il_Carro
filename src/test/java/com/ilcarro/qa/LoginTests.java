package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){         //go to login page
        if(!isLoginFormPresent()){             //if user logged in, click logout, go to log in
            if(isUserLoggedIn()){
                logOut();
            }
            ClickLogInTabOnHeader();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest(){                                            //fillLoginFrom
        fillLoginFrom(new User().withEmail("aa5+65@bb109.com").withPassword("5Aaaaaaaa"));      //submit login
        submitForm();
        Assert.assertTrue(isUserLoggedIn());
        String email = wd.findElement(By.cssSelector("[href='/account']")).getText();        //Assert userLoggedIn
        System.out.println(email);
        Assert.assertEquals(email, "aa5+65@bb109.com");
    }

    public void fillLoginFrom(User user) {
        type(By.name("email"),user.getEmail());
        type(By.name("password"), user.getPassword());
    }
}
