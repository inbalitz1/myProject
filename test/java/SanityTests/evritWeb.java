package SanityTests;

import Extensions.Verifications;
import Extensions.uiActions;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import javafx.scene.control.ScrollToEvent;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners (Utilities.listeners.class)
public class evritWeb extends commonOps {
    @Test (description = "test01: login to Evrit")
    @Description ("Test Description: login to Evrit web application")
    public void test01_login() {



        driver.findElement(By.name("myAccount")).click();
        webFlows.login(getData("user"),getData("pass"));


        Verifications.textInElement(evritMain.txt_mainHeading,"קוראים ממליצים");
      
    }

    @Test (description = "test02: verify Default Favorite Books")
    @Description ("Test Description: verifies numbers of Default Favorites Books is 0 ")
    public void test02_verifyDefaultFavoriteBooks()  {



        driver.findElement(By.name("wishlist")).click();

        Verifications.textInElement(evritFavoriteMenu.no_fav_title,"עדיין לא שמרת ספרים במועדפים שלך");

    }

    @Test (description = "test03: add and favorite book")
    @Description ("Test Description: add one favorite book ")
    public void test03_addToFavorites()  {
        driver.findElement(By.name("wishlist")).click();


        driver.findElement(By.className("full-list-text")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[1]/div/div/div[1]/a")).click();
       //driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div/div/span[2]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div[4]/div/div/div[1]/div[2]/div/span[2]")).click();
    }

    @Test (description = "test04: verify Favorite Books after adding one book")
    @Description ("Test Description: verifies numbers of Favorites Books is 1 ")
    public void test04_verifyOneFavoriteBook() {
        driver.findElement(By.name("wishlist")).click();
        wait = new WebDriverWait(driver,10);
        Verifications.textInElement(evritFavoriteMenu.txt_numFavorites, "1");

    }

    @Test (description = "test05: delete and verify zero favorites books")
    @Description ("Test Description: verifies numbers of Favorites Books is 0 again after delete")
    public void test05_deleteFavoriteBook(){
        driver.findElement(By.name("wishlist")).click();
       //driver.findElement (By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div/span[2]")).click();
        driver.findElement (By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div/div/div/div[2]/div/div[7]/div[1]/div/span[2]")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/div[13]/div/div[4]/a")).click();
        Verifications.textInElement(evritFavoriteMenu.no_fav_title,"עדיין לא שמרת ספרים במועדפים שלך");
    }


    @Test (description = "test06: buy a Free Book")
    @Description ("Test Description: buy a Free Book from the store")
    public void test06_buyFreeBooks(){
        driver.findElement(By.name("wishlist")).click();
        webFlows.buyFreeBooks();

    }


    @Test (description = "test07: verify Logo ")
    @Description ("Test Description: verify Evrit's logo")
    public void test07_verifyLogo(){
        Verifications.visualElement(evritMain.evritLogo, "evritLogo");

    }




}
