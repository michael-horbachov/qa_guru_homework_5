package components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelectorComponent {

    public void selectState(String state) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
    }

    public void selectCity(String city) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
    }

}