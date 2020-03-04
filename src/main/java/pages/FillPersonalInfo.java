package pages;

import drivers.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FillPersonalInfo extends Drivers {

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement selectTitle;

    @FindBy(xpath="//input[@id='customer_firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='passwd']")
    WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement date;

    @FindBy(xpath = "//select[@name='months']")
    WebElement month;

    @FindBy(xpath = "//select[@id='years']")
    WebElement year;

    @FindBy(xpath="//input[@id='company']")
    WebElement compName;

    @FindBy(xpath = "//input[@name='address1']")
    WebElement add1;

    @FindBy(xpath = "//input[@name='address2']")
    WebElement add2;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    @FindBy(xpath = "//input[@name='postcode']")
    WebElement postCode;

    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;

    @FindBy(xpath = "//textarea[@name='other']")
    WebElement otherInfo;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement phoneNo;

    @FindBy(xpath = "//input[@name='phone_mobile']")
    WebElement mobNo;

    @FindBy(xpath = " //span[contains(text(),'Register')]")
    WebElement reg;

    @FindBy(xpath = " //input[@name='alias']")
    WebElement refAddress;

    public FillPersonalInfo(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setSelectTitle() throws InterruptedException {
        selectTitle.click();
        Thread.sleep(2000);
    }

    public void setFirstName(){
        firstName.sendKeys("jitendra");
    }

    public void setLastName(){
        lastName.sendKeys("bachhav");
    }
    public void setPassword() throws InterruptedException {
        password.sendKeys("jitendra123");
        Thread.sleep(3000);
    }
    public void setDate() throws InterruptedException {
        date.click();
       // Select dropdown=new Select();
        //dropdown.selectByVisibleText("12");
        date.sendKeys("12");


    }

    public void setMonth() throws InterruptedException {
        month.click();
        month.sendKeys("March");
       // Select drop=new Select(month);
        //drop.selectByVisibleText(" March");
    }

    public void setYear() throws InterruptedException {
        year.click();
        year.sendKeys("1998");
        //Select dList=new Select(year);
       // dList.selectByVisibleText("2019");
        Thread.sleep(3000);
    }

    public void setCompName() throws InterruptedException {
        compName.sendKeys("Thoughworks");
        Thread.sleep(2000);
    }

    public void setAdd1() throws InterruptedException {
        add1.sendKeys("newyorkCity");
        Thread.sleep(2000);
    }

    public void setAdd2() throws InterruptedException {
        add2.sendKeys("sentMarryRoad");
        Thread.sleep(2000);
    }

    public void setCity() throws InterruptedException {
        city.sendKeys("NewYork");
        Thread.sleep(2000);
    }

    public void setState() throws InterruptedException {
        state.click();
        state.sendKeys("Florida");
        Thread.sleep(2000);
    }

    public void setPostCode() throws InterruptedException {
        postCode.sendKeys("32040");
        Thread.sleep(2000);
    }

    public void setCountry() throws InterruptedException {
        country.sendKeys("USA");
        Thread.sleep(2000);
    }

    public void setPhoneNo() throws InterruptedException {
        phoneNo.sendKeys("7709881268");
        Thread.sleep(2000);
    }

    public void setMobNo() throws InterruptedException {
        mobNo.sendKeys("7020376730");
        Thread.sleep(2000);
    }

    public void setOtherInfo() throws InterruptedException {
        otherInfo.sendKeys("beCool");
        Thread.sleep(2000);
    }

    public void register() throws InterruptedException {
        reg.click();
        Thread.sleep(2000);
    }

    public void setRefAddress(){
        refAddress.sendKeys("Delhi");
    }


}
