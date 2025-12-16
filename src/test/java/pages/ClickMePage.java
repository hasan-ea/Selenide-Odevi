package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClickMePage {

    private SelenideElement ButtonButton =$("#item-4");
    private SelenideElement ButtonClickMe =$(byText("Click Me")) ;
    private SelenideElement ClickMeMesseage = $("#dynamicClickMessage") ;

    public void ButtonButtonClick () {
        ButtonButton.click();
    }

    public void ButtonClickMeClick(){
        ButtonClickMe.scrollIntoView(true).click();
    }

    public void checkMessage() {
        $(ClickMeMesseage).shouldHave(exactText("You have done a dynamic click"));
    }


}

