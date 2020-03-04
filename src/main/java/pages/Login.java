package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(xpath = "//input[@id='email']")
    WebElement userId;

    @FindBy(xpath ="//input[@id='passwd']")
    WebElement pass;

    @FindBy(xpath = "//button[@name='SubmitLogin']")
    WebElement submit;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setUserId(){
        userId.sendKeys("jitendrabachhav0435@gmail.com");
    }

    public void setPass(){
        pass.sendKeys("jitendra123");
    }

    public void setSubmit(){
        submit.click();
    }

}
