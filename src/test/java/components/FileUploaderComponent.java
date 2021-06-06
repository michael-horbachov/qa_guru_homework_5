package components;

import static com.codeborne.selenide.Selenide.$;

public class FileUploaderComponent {

    public void uploadFile(String file) {
        $("#uploadPicture").uploadFromClasspath(file);
    }

}