package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class uiActions extends commonOps
{
    @Step ("click on element")
    public static void click (WebElement elem)
    {
        if (!platform.equalsIgnoreCase("mobile") && !platform.equalsIgnoreCase("electron") && !platform.equalsIgnoreCase("desktop") )
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }


    @Step ("send text to text field")
    public static void updateText (WebElement elem, String value)
    {
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step ("update drop down")
    public static void updateDropDown (WebElement elem, String value )
    {
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue=new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step ("mouse hover to element")
    public static void mouseHoverElements (WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }


}
