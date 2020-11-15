package Utilities;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import PageObjects.myAccountMenu;
import org.openqa.selenium.support.PageFactory;

public class managePages extends Base
{
    public static void init()
    {

        evritLogin = PageFactory.initElements(driver,LoginPage.class);
        evritMain=PageFactory.initElements(driver, MainPage.class);
        evritMyAccountMenu=PageFactory.initElements(driver, myAccountMenu.class);
        evritMenu = PageFactory.initElements(driver,PageObjects.menu.class);
        evritFavoriteMenu=PageFactory.initElements(driver,PageObjects.FavoriteMenu.class);
        evritFooter=PageFactory.initElements(driver,PageObjects.footer.class);

        firstPage=PageFactory.initElements(driver,PageObjects.evritMobile.mainPage.class);

        electronMain = PageFactory.initElements(driver,PageObjects.Electron.mainPage.class);
        calcMain = PageFactory.initElements(driver,PageObjects.Calculator.mainPage.class);
    }

}
