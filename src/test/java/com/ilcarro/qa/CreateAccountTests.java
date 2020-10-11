package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends  TestBase{                     //preconditions: user shoud be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if(!isSignUpTabPresentInHeader()){                              //sign up not present
            logOut();
        } }
    @Test
    public void testSignUp() throws InterruptedException {                   //click On SignUp button
        click(By.cssSelector("[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));    //fill registration form
        fillRegistrationForm(
                new User().withfirstname("Rita")
                        .withSecondName("Katz")
                        .withEmail("aa5+65@bb109.com")
                        .withPassword("5Aaaaaaaa"));

        click(By.cssSelector("#check_policy"));
        pause(2000);                   //click submit button
        submitForm();                      //check, login form displayed
        Assert.assertTrue(isLoginFormPresent());
    }
    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

/* wd.findElement(By.cssSelector("#second_name")).click();
        wd.findElement(By.cssSelector("#second_name")).clear();
        wd.findElement(By.cssSelector("#second_name")).sendKeys("FV");
        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("1Aaaaaaaa");*/
    //wd.findElement(By.cssSelector("#check_policy")).click();
}