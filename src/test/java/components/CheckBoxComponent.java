package components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckBoxComponent {

    public void chooseHobby(String hobby) {
        $("#hobbiesWrapper").$(byText(hobby)).click();
    }

}