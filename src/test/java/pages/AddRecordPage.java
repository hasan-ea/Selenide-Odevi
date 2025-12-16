package pages;


import com.codeborne.selenide.SelenideElement;

import java.util.Map;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AddRecordPage {


    private SelenideElement ButtonAdd = $("#addNewRecordButton");
    private SelenideElement BoxFirstName = $("#firstName");
    private SelenideElement BoxLastName = $("#lastName");
    private SelenideElement BoxEmail = $("#userEmail");
    private SelenideElement BoxAge = $("#age");
    private SelenideElement BoxSalary = $("#salary");
    private SelenideElement BoxDepartment = $("#department");
    private SelenideElement ButtonSubmit = $("#submit");
    private SelenideElement ButtonEditRecord4 = $("span[id='edit-record-4'] svg path");


    // Add butonuna tıklar
    public void clickAddButton() {
        ButtonAdd.click();
    }

    // Yeni kayıt ekleme işlemi
    public void addNewRecord(String firstName,
                             String lastName,
                             String email,
                             String age,
                             String salary,
                             String department) {

        BoxFirstName.setValue(firstName);
        BoxLastName.setValue(lastName);
        BoxEmail.setValue(email);
        BoxAge.setValue(age);
        BoxSalary.setValue(salary);
        BoxDepartment.setValue(department);

        ButtonSubmit.click();
    }


    // Son eklenen kaydın edit butonuna tıklar
    public void clickEditRecord4() {
        ButtonEditRecord4.scrollIntoView(true).click();

    }


    // Gönderilen alanlara göre kayıt günceller
    public void editRecord(Map<Field, String> updates) {

        for (Map.Entry<Field, String> entry : updates.entrySet()) {
            Field field = entry.getKey();
            String value = entry.getValue();

            SelenideElement el = fieldMap.get(field);
            if (el == null) {
                throw new IllegalArgumentException("Desteklenmeyen alan: " + field);
            }

            el.shouldBe(visible).setValue(value);
        }

        ButtonSubmit.click();
    }


    // Field enum değerine göre ilgili input alanını döndürür
    private final Map<Field, SelenideElement> fieldMap = Map.of(
            Field.FIRST_NAME, BoxFirstName,
            Field.LAST_NAME, BoxLastName,
            Field.EMAIL, BoxEmail,
            Field.AGE, BoxAge,
            Field.SALARY, BoxSalary,
            Field.DEPARTMENT, BoxDepartment
    );


}
