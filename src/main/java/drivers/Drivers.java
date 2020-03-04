package drivers;
import config.ConfigFiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers extends ConfigFiles {

   public static WebDriver driver;

    public static void init(){
        System.setProperty(CHROME_KEY,CHROME_VALUE);
        driver=new ChromeDriver();
        driver.get(URL);
    }
}

