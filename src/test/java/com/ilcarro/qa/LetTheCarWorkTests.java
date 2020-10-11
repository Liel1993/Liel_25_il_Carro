package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LetTheCarWorkTests extends TestBase {

    @Test
    public void letTheCarWork() throws InterruptedException {
        click(By.cssSelector(".header__nav.desktop>li>[href='/car']"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".let-carwork-style_let_car__location__30BIh")));
        addNewCarWork(new FillCar().setCountry("Israel").setAddress("Ha Ahim Zeeher")
                .setDistance_included("1000") .setSerial_number("111-34-555")
                .setBrand("BMV" ) .setYear("2004")
                .setModel("I1").setEngine("A20") .setFuel_consumtion("40")
                .setFuel("disel")
                .setTransmission("manual").setWd("RMD").setHorsepower("100")
                .setTorque("200")
                .setDoors("4").setSeats("4").setClass1("C").setAbout("ggjgj")
                .setType("USB").setPrice("200"));

        pause(2000);
        submitForm();                                           //[type='submit']
    }

    public void addNewCarWork(FillCar fillCar) throws InterruptedException{
        type(By.cssSelector(".country"), "Israel");
        type(By.cssSelector(".address"), "Ha Ahim Zeeher");
        type(By.cssSelector(".distance_included"), "1000");
        type(By.cssSelector(".serial_number"), "111-34-555");
        type(By.cssSelector(".brand"), "BMV");
        type(By.cssSelector(".year"), "2004");
        type(By.cssSelector(".model"), "I8");
        type(By.cssSelector(".engine"), "A20");
        type(By.cssSelector(".fuel_consumption"), "40");
        type(By.cssSelector(".fuel"), "disel");
        type(By.cssSelector(".transmition"), "manual");
        type(By.cssSelector(".wd"), "RWD");
        type(By.cssSelector(".horsepower"), "100");
        type(By.cssSelector(".torque"), "200");
        type(By.cssSelector(".doors"), "4");
        type(By.cssSelector(".seats"), "4");
        type(By.cssSelector(".class"), "C");
        //pause(1000);
        type(By.name("about"), "hjfjf");
        //pause(3000);
        type(By.cssSelector(".type_feature"), "USB");
       // pause(2000);
        type(By.cssSelector(".price"), "200");
    }
}