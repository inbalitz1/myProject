package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FavoriteMenu
{



    @FindBy (how=How.CLASS_NAME, using="totalResults")
    public WebElement txt_numFavorites;

    @FindBy (how = How.CLASS_NAME,using = "no-results-title")
    public WebElement no_fav_title;



}
