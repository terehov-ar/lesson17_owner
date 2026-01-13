package tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests extends TestBase {

    @Test
    @Step("Открытие selenide mvnrep")
    void successfulTest() {
        open("https://mvnrepository.com/artifact/com.codeborne/selenide");
    }

}
