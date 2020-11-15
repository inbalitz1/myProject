package Utilities;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff=new ImageDiffer();
    public static ImageDiff diff;
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static String platform;


    public static LoginPage evritLogin;
    public static MainPage evritMain;
    public static myAccountMenu evritMyAccountMenu;
    public static menu evritMenu;
    public static FavoriteMenu evritFavoriteMenu;
    public static footer evritFooter;

    public static PageObjects.evritMobile.mainPage firstPage;

    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams=new JSONObject();
    public static JsonPath jp;

    public static PageObjects.Electron.mainPage electronMain;
    public static PageObjects.Calculator.mainPage calcMain;

    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;


}
