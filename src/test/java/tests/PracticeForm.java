package tests;

import java.util.Locale;

import com.github.javafaker.Faker;
import data.Gender;
import data.Hobby;
import data.Subject;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.SubmittedForm;

public class PracticeForm extends TestBase {

    Faker faker = new Faker(new Locale("en-GB"));
    RegistrationPage registrationPage = new RegistrationPage();
    SubmittedForm submittedForm = new SubmittedForm();

    String studentFirstName = faker.name().firstName(),
            studentLastName = faker.name().lastName(),
            studentEmail = faker.internet().emailAddress(),
            gender = Gender.getRandomGender().toString(),
            studentMobileNumber = faker.phoneNumber().subscriberNumber(10),
            dayOfBirth = "1",
            dayOfWeekOfBirth = "Saturday",
            monthOfBirth = "January",
            yearOfBirth = "2000",
            subject = Subject.getRandomSubject().toString(),
            hobby = Hobby.getRandomHobby().toString(),
            picture = "john-doe.jpeg",
            studentAddress = faker.address().fullAddress(),
            state = "NCR",
            city = "Delhi";

    @Test
    void submitStudentRegistrationForm() {

        registrationPage.openRegistrationPage();
        registrationPage.verifyRegistrationPageIsOpen();

        registrationPage.enterFirstName(studentFirstName);
        registrationPage.enterLastName(studentLastName);
        registrationPage.enterUserEmail(studentEmail);
        registrationPage.chooseGender(gender);
        registrationPage.enterUserMobileNumber(studentMobileNumber);
        registrationPage.pickDate(dayOfWeekOfBirth, dayOfBirth, monthOfBirth, yearOfBirth);
        registrationPage.enterSubject(subject);
        registrationPage.chooseHobby(hobby);
        registrationPage.uploadFile(picture);
        registrationPage.enterCurrentAddress(studentAddress);
        registrationPage.selectState(state);
        registrationPage.selectCity(city);
        registrationPage.submitForm();

        submittedForm.verifySubmittedFormIsOpen();
        submittedForm.verifyValuesOfTableRow1(studentFirstName, studentLastName);
        submittedForm.verifyValuesOfTableRow2(studentEmail);
        submittedForm.verifyValuesOfTableRow3(gender);
        submittedForm.verifyValuesOfTableRow4(studentMobileNumber);
        submittedForm.verifyValuesOfTableRow5(dayOfBirth, monthOfBirth, yearOfBirth);
        submittedForm.verifyValuesOfTableRow6(subject);
        submittedForm.verifyValuesOfTableRow7(hobby);
        submittedForm.verifyValuesOfTableRow8(picture);
        submittedForm.verifyValuesOfTableRow9(studentAddress);
        submittedForm.verifyValuesOfTableRow10(state, city);

        submittedForm.closeSubmittedForm();
        submittedForm.verifySubmittedFormIsClosed();
    }

}