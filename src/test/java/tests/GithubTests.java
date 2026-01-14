package tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubTests extends TestBase {

    @Test
    @Step("Check github title")
    void successfulTest() {
        open("https://github.com/");
        $("#hero-section-brand-heading").shouldHave(text("The future of building happens together"));
    }
}
