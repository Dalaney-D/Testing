/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.sof.equation.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;

/**
 *
 * @author dell
 */
public class MSEdgeTestNG {

    public String TestGoogle() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("TestNG", Keys.ENTER);
        driver.findElement(By.partialLinkText("https://testng.org")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        return driver.getCurrentUrl();
    }

    public String TestFacebook() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("0901491282");
        driver.findElement(By.name("pass")).sendKeys("*************", Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
//        driver.quit();
        return driver.getTitle();
    }

    @Test
    public void testEdgeWhenSearchInGoogle() throws InterruptedException {
        Assert.assertEquals(TestGoogle(), "https://testng.org/doc/");
    }

    @Test
    public void testEgdeWhenLoginToFacebook() throws InterruptedException {
        Assert.assertEquals(TestFacebook(), "Log in to Facebook");
    }

}
