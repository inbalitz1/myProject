package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import javafx.scene.ImageCursor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class Verifications extends commonOps {


@Step ("verify text in element")
public static void textInElement(WebElement elem, String expectedValue)
{
    if (!platform.equalsIgnoreCase("mobile") && !platform.equalsIgnoreCase("electron") && !platform.equalsIgnoreCase("desktop") )
        wait.until(ExpectedConditions.visibilityOf(elem));
    if (platform.equalsIgnoreCase("desktop"))
        assertEquals(elem.getText().replaceAll("התצוגה היא ","").trim(),expectedValue);
    else
    assertEquals(elem.getText(),expectedValue);
}

@Step("Verify element visually")
public static void visualElement(WebElement ImageElement, String expectedImageName)
{
    BufferedImage expectedImage=null;
    try{
        expectedImage = ImageIO.read(new File(getData("ImageRepo")+expectedImageName+".png"));
    }
    catch (Exception e)
    {
        System.out.println("Error reading image file: "+e);
    }
    Screenshot imageScreenShot=new AShot().takeScreenshot(driver, ImageElement);
    BufferedImage actualImage = imageScreenShot.getImage();
    diff=imgDiff.makeDiff(actualImage, expectedImage);
    assertFalse(diff.hasDiff(),"images are not the same");


}

    @Step ("verify text with text")
    public static void text(String actualText, String expectedText)
    {
        assertEquals(actualText, expectedText);
    }
}