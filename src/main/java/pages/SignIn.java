package pages;

import drivers.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends Drivers
{
    @FindBy(xpath="//a[@class='login']")
    WebElement signInButton;

    @FindBy(xpath ="//input[@id='email_create']")
    WebElement email;

    @FindBy(xpath= "//button[@name='SubmitCreate']")
    WebElement submit;

    public SignIn(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void clickOnSignIn(){
        signInButton.click();
    }

    public void enterEmail() throws InterruptedException {
        Thread.sleep(3000);
        email.sendKeys("jitendrabachhav0435@gmail.com");
        Thread.sleep(3000);
    }

    public void submit() {
        submit.click();
    }
}
