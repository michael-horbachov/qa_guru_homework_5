package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SubmittedForm {

    private final SelenideElement submittedForm = $("#example-modal-sizes-title-lg"),
            tableRow1 = $(".table tr", 1),
            tableRow2 = $(".table tr", 2),
            tableRow3 = $(".table tr", 3),
            tableRow4 = $(".table tr", 4),
            tableRow5 = $(".table tr", 5),
            tableRow6 = $(".table tr", 6),
            tableRow7 = $(".table tr", 7),
            tableRow8 = $(".table tr", 8),
            tableRow9 = $(".table tr", 9),
            tableRow10 = $(".table tr", 10),
            closeButton = $("#closeLargeModal");

    public void verifySubmittedFormIsOpen() {
        submittedForm.shouldHave(text("Thanks for submitting the form"));
    }

    public void verifyValuesOfTableRow1(String firstName, String lastName) {
        tableRow1.shouldHave(text("Student Name"), text(firstName + " " + lastName));
    }

    public void verifyValuesOfTableRow2(String email) {
        tableRow2.shouldHave(text("Student Email"), text(email));
    }

    public void verifyValuesOfTableRow3(String gender) {
        tableRow3.shouldHave(text("Gender"), text(gender));
    }

    public void verifyValuesOfTableRow4(String mobileNumber) {
        tableRow4.shouldHave(text("Mobile"), text(mobileNumber));
    }

    public void verifyValuesOfTableRow5(String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        tableRow5.shouldHave(text("Date of Birth"), text(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth));
    }

    public void verifyValuesOfTableRow6(String subject) {
        tableRow6.shouldHave(text("Subjects"), text(subject));
    }

    public void verifyValuesOfTableRow7(String hobby) {
        tableRow7.shouldHave(text("Hobbies"), text(hobby));
    }

    public void verifyValuesOfTableRow8(String picture) {
        tableRow8.shouldHave(text("Picture"), text(picture));
    }

    public void verifyValuesOfTableRow9(String studentAddress) {
        tableRow9.shouldHave(text("Address"), text(studentAddress));
    }

    public void verifyValuesOfTableRow10(String state, String city) {
        tableRow10.shouldHave(text("State and City"), text(state + " " + city));
    }

    public void closeSubmittedForm() {
        closeButton.click();
    }

    public void verifySubmittedFormIsClosed() {
        submittedForm.should(disappear);
    }

}