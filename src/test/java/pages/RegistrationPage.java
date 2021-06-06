package pages;

import com.codeborne.selenide.SelenideElement;
import components.CheckBoxComponent;
import components.DatePickerComponent;
import components.FileUploaderComponent;
import components.RadioButtonComponent;
import components.SelectorComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final SelenideElement registrationPage = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userMobileNumber = $("#userNumber"),
            subjects = $("#subjectsInput"),
            userCurrentAddress = $("#currentAddress"),
            submitButton = $("#submit");

    RadioButtonComponent radioButtonComponent = new RadioButtonComponent();
    DatePickerComponent datePickerComponent = new DatePickerComponent();
    CheckBoxComponent checkBoxComponent = new CheckBoxComponent();
    FileUploaderComponent fileUploaderComponent = new FileUploaderComponent();
    SelectorComponent selectorComponent = new SelectorComponent();

    public void openRegistrationPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public void verifyRegistrationPageIsOpen() {
        registrationPage.shouldHave(text("Student Registration Form"));
    }

    public void enterFirstName(String firstName) {
        firstNameInput.val(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.val(lastName);
    }

    public void enterUserEmail(String email) {
        userEmailInput.val(email);
    }

    public void chooseGender(String gender) {
        radioButtonComponent.chooseGender(gender);
    }

    public void enterUserMobileNumber(String mobileNumber) {
        userMobileNumber.val(mobileNumber);
    }

    public void pickDate(String dayOfWeekOfBirth, String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        datePickerComponent.setDate(dayOfWeekOfBirth, dayOfBirth,
                                    monthOfBirth, yearOfBirth);
    }

    public void enterSubject(String subject) {
        subjects.val(subject).pressEnter();
    }

    public void chooseHobby(String hobby) {
        checkBoxComponent.chooseHobby(hobby);
    }

    public void uploadFile(String file) {
        fileUploaderComponent.uploadFile(file);
    }

    public void enterCurrentAddress(String currentAddress) {
        userCurrentAddress.val(currentAddress);
    }

    public void selectState(String state) {
        selectorComponent.selectState(state);
    }

    public void selectCity(String city) {
        selectorComponent.selectCity(city);
    }

    public void submitForm() {
        submitButton.click();
    }

}