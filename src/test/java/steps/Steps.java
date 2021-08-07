package steps;

import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Steps {

    @Допустим("^открыта страница \"([^\"]*)\"$")
    public void openPage(String pageURL) {
        open(pageURL);
        getWebDriver().manage().window().maximize();
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(pageURL, currentPageURL, "Значения ссылок не сопадают");
    }

    @Допустим("^в строку поиска введено значение \"([^\"]*)\"$")
    public void enterValue(String text) {
        $(By.name("q")).setValue(text);

        // для демонстрации работы теста
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Допустим("^нажата кнопка \"([^\"]*)\"$")
    public void clickOnButton(String text) {
        $(By.cssSelector("input[value='" + text + "']")).click();

        // для демонстрации работы теста
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Тогда("^первая ссылка называется \"([^\"]*)\"$")
    public void checkLinkName(String link) {
        String actualLinkText = $$(By.cssSelector(".g .LC20lb.DKV0Md")).get(0).getText();
        assertEquals(link, actualLinkText, "Названия ссылок не совпадают");

        // для демонстрации работы теста
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Тогда("^выполнено нажатие на ссылку \"([^\"]*)\"$")
    public void clickOnLink(String link) {
        $(By.xpath("//*[contains(text(), \"" + link + "\")]")).click();

        // для демонстрации работы теста
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Тогда("^открыт сайт \"([^\"]*)\"$")
    public void openLink(String siteURL) {
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(siteURL, currentPageURL, "Значения ссылок не сопадают");

        // для демонстрации работы теста
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Тогда("^цена гаджента равна \"([^\"]*)\"$")
    public void checkGadgetPrice(String price) {
        String actualPriceInfo = $(By.className("price-container")).getText();
        assertTrue(actualPriceInfo.contains(price), "Актуальная и ожидаемая цена не совпадают");

        // для демонстрации работы теста
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
