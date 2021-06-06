package components;

import static com.codeborne.selenide.Selenide.$;

public class DatePickerComponent {

    public void setDate(String dayOfWeekOfBirth, String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(monthOfBirth);
        $(".react-datepicker__year-select").selectOption(yearOfBirth);
        $(String.format("[aria-label='Choose %s, %s %sst, %s']",
                        dayOfWeekOfBirth, monthOfBirth, dayOfBirth, yearOfBirth)).click();
    }

}