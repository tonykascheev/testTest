import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    public ChromeDriver driver;
    public PageBase pageBase;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageBase = PageFactory.initElements(driver,PageBase.class);

    }
    public void click (String xpath) {
        waitVisibility(xpath);
        driver.findElement(By.xpath(xpath)).click();
    }
    public void waitVisibility(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }
    public void sendKeys (String xpath,String x) {
        waitVisibility(xpath);
        driver.findElement(By.xpath(xpath)).sendKeys(x);
    }





}
