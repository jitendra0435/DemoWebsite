import drivers.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FillPersonalInfo;
import pages.Login;
import pages.SignIn;

import java.util.List;

public class TeaCompanyTest extends Drivers {

    @BeforeClass
    public static void beforeClass() throws Exception {
        init();
    }

    @Test(priority = 1)
    public void givenMethodForSignInToSite() throws InterruptedException {
        SignIn sign = new SignIn(driver);
        sign.clickOnSignIn();
        sign.enterEmail();
        sign.submit();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void givenMethopdForSubmitPersonalInfo() throws InterruptedException {

        FillPersonalInfo info = new FillPersonalInfo(driver);
        info.setSelectTitle();
        info.setFirstName();
        info.setLastName();
        info.setPassword();
        info.setDate();
        info.setMonth();
        info.setYear();
        info.setCompName();
        info.setAdd1();
        info.setAdd2();
        info.setCity();
        info.setState();
        info.setCountry();
        info.setPostCode();
        info.setPhoneNo();
        info.setMobNo();
        info.setOtherInfo();
        info.setRefAddress();
        info.register();
    }

    @Test
    public void givenMethodForCheckLoginProperlyOrNot() throws InterruptedException {
        Login log = new Login(driver);
        SignIn sign = new SignIn(driver);
        sign.clickOnSignIn();
        Thread.sleep(3000);
        log.setUserId();
        log.setPass();
        log.setSubmit();
//
//        WebElement dresses = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"));
//        dresses.click();
//       List<WebElement> items = driver.findElements(By.xpath("//div[@class='product-container']"));
//        for (WebElement webElement : items) {
//           System.out.println(webElement.getText());
//        }

//        List<WebElement> price = driver.findElements(By.xpath("//ul[@class='product_list grid row']/child::li"));
//
//        for (WebElement webelement:price) {
//            System.out.println(webelement.getText());
//        }

        List<WebElement> price = driver.findElements(By.xpath("//span[@class='price product-price']"));

        for (WebElement webelement:price) {

            System.out.println(webelement.getText());

        }



    }
}
