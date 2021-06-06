package components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RadioButtonComponent {

    public void chooseGender(String gender) {
        $("#genterWrapper").$(byText(gender)).click();
    }

}