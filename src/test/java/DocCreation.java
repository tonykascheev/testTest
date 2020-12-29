import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DocCreation extends WebDriverSettings {



    @Test
    public void docCreation () {
        pageBase.Login("admin_elib","Q1w2e3r4");
        click("//button[contains(text(),'Документ')]");
        //ГК
        sendKeys("//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[1]/section[1]/section[1]/section[1]/section[1]/input[1]","ЭЙЧ-ЭС-БИ-СИ БАНК");
        click("//li[contains(text(),'ЭЙЧ-ЭС-БИ-СИ БАНК')]");
        //Раздел досье
        click("//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[4]/section[1]/section[1]/section[1]/input[1]");
        click("//li[contains(text(),'Юридическое досье')]");
        //Формат документа
        click("//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[5]/section[1]/section[1]/section[1]/input[1]");
        click("//li[contains(text(),'Электронный документ с электронной подписью')]");
        //Место хранения в каталоге
        sendKeys("//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[7]/section[1]/section[1]/div[1]/input[1]","Описание");
        click(" //body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[7]/section[2]/div[1]/span[1]");
        //Краткое/Полное наименование
        click("//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[8]/section[1]/section[1]/section[1]/section[1]/input[1]");
        click("//li[contains(text(),'ТУ на подключение к инженерным сетям')]");
        //Классификация
        click("//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[1]");
        //Добавление файла
        driver.findElement(By.xpath("//*[@id=\"app\"]/section/section/form/section[2]/section/div/input"))
                .sendKeys("C:\\Test.png");
        //Номер документа
        sendKeys("//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[1]/div[1]/input[1]",
                "Этот документ создан с помощью автотеста" );
        //Вид документа
        click("//span[contains(text(),'Документ ЮЛ')]");
        //Период документа гоl
        click("//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[4]/section[1]/section[1]/section[1]/input[1]");
        click("//li[contains(text(),'2020')]");
        //Период документа квартал
        click("//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[5]/section[1]/section[1]/input[1]");
        click("//li[contains(text(),'4')]");
        //Владелец документа
        click("//span[contains(text(),'Документ Клиента')]");
        //Добавить
        click("//button[contains(text(),'Добавить')]");
    }



}
