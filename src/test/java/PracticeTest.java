import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class PracticeTest {


    @Test
    public void goIbibo() {

    WebDriver driver;
            System.setProperty("webdriver.chrome.driver","chromedriver");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.get("https://www.goibibo.com/flights/air-DEL-BLR-20200304--1-0-0-E-D/?utm_source=SVGMedia&utm_medium=DisplayAffiliate&utm_campaign=flights_71017_wow3");

    List<WebElement> dateBox = driver.findElements(By.xpath("//div[@class='marginB10']/child::*"));

           int size=1;
           for (WebElement webElement : dateBox) {
           System.out.println(webElement.getText());
           size++;
           System.out.println(size+":----------------------------------------------");
    }

            driver.close();
    }


    @Test
    public void olxTest () {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.olx.in/");

        List<String> iList = new ArrayList<>();
        List<String> iPrice = new ArrayList<>();

        List<WebElement> items = driver.findElements(By.xpath("//span[@class='_2tW1I']"));
        List<WebElement> price = driver.findElements(By.xpath("//span[@class='_89yzn']"));


        for (WebElement webElement : items) {
            System.out.println(webElement.getText());
            iList.add(webElement.getText());
        }

        for (WebElement webElement : price) {
            System.out.println(webElement.getText());
            iPrice.add(webElement.getText());
        }


        Map<String,String> Item_Price = new HashMap<>();

        Iterator<String> iListIterator = iList.iterator();
        Iterator<String> iPriceIterator = iPrice.iterator();


        while (iListIterator.hasNext() && iPriceIterator.hasNext()) {
            Item_Price.put(iListIterator.next(),iPriceIterator.next());
        }

        driver.close();
    }

    @Test
    public void jigsaw() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://money.rediff.com/index.html");

        Thread.sleep(30000);

        List<String> company1= new ArrayList<>();
        List<Double> price= new ArrayList<>();


        Map<String,Double>mapCompany=new HashMap<>();

        List<WebElement> price1 = driver.findElements(By.xpath("//div[@class='hmnseindicestable']/child::*/li[2]"));
        List<WebElement> company= driver.findElements(By.xpath("//div[@class='hmnseindicestable']/child::*/li[1]"));

        for (WebElement webElementHeader :price1) {
            price.add(Double.parseDouble(webElementHeader.getText()));
        }
        for (WebElement webElementHeader :company) {
            company1.add(webElementHeader.getText());
        }
        Iterator<Double> newsIterator = price.iterator();

        Iterator<String> scorePointIterator = company1.iterator();


        while(newsIterator.hasNext()&&scorePointIterator.hasNext())
        {
            mapCompany.put(scorePointIterator.next(),newsIterator.next());

        }
       mapCompany.entrySet().stream().forEach(System.out::println);
        driver.close();

    }

}
