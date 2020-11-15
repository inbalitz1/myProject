package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.io.File;

public class MainPage
{



    @FindBy (how=How.LINK_TEXT, using="קוראים ממליצים")
    public WebElement txt_mainHeading;

    @FindBy (how = How.CSS, using = "img[src='/Images/Products/NewBO/Configurations/evritlogo0720[1].png']")
    public WebElement evritLogo;


}
