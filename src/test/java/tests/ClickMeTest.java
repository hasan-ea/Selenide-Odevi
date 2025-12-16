package tests;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.ClickMePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;

public class ClickMeTest extends BaseTests {

    ClickMePage Page=new ClickMePage();

    @Test
    public void Test1() {
        open("https://demoqa.com/elements");
        webdriver().driver().getWebDriver().manage().window().maximize();
        Page.ButtonButtonClick();
        Page.ButtonClickMeClick();
        Page.checkMessage();

    }
}
