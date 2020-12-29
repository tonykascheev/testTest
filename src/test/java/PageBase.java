import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends  WebDriverSettings {
    public WebDriver driver;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;}


        @FindBy(xpath = "//body/div[@id='app']/div[1]/section[1]/form[1]/input[1]")
        private WebElement LoginField;
        @FindBy(xpath = "//body/div[@id='app']/div[1]/section[1]/form[1]/input[2]")
        private WebElement PasswordField;
        @FindBy(xpath = "//button[contains(text(),'Войти')]")
        private WebElement LoginBtn;


        public void Login (String x, String y){
            driver.get("http://192.168.88.54/auth");
            LoginField.sendKeys(x);
            PasswordField.sendKeys(y);
            LoginBtn.click();
        }



}

