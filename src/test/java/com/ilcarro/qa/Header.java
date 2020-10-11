package com.ilcarro.qa;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Header extends TestBase {
    @Test
    public void OpenHeadersPagesTests() throws InterruptedException {
        click(By.cssSelector(".header__nav.desktop>li>[href='/search']"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".search-sidebar__content")));
       Thread.sleep(1000);
        click(By.cssSelector(".header__nav.desktop>li>[href='/car']"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".let-carwork-style_let_car__location__30BIh")));
      Thread.sleep(1000);
        click(By.cssSelector(".header__nav.desktop>li>[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".signup__fields")));
        Thread.sleep(1000);
        click(By.cssSelector(".header__nav.desktop>li>[href='/login']"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".signup__fields")));
        Thread.sleep(3000);
        click(By.cssSelector(".container.header>a>[src='/static/media/logo.147e80f5.svg']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[action='#']")));
        Thread.sleep(3000);
        click(By.cssSelector(".footer__nav>li>[href='/search']"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".search-sidebar__content")));
        Thread.sleep(5000);
        click(By.xpath("//header/section[1]/a[1]/img[1]"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[action='#']")));
        Thread.sleep(5000);
        click(By.cssSelector(".footer__nav>li>[href='/car']"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".let-carwork-style_let_car__location__30BIh")));
        Thread.sleep(3000);




    }
}
