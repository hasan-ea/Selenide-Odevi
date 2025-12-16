package tests;

import pages.Field;
import org.testng.annotations.Test;
import pages.AddRecordPage;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AddRecordTest {

        @Test
        public void testAddAndEditRecord() {

            // SAYFAYI AÇ
            open("https://demoqa.com/webtables");
            webdriver().driver().getWebDriver().manage().window().maximize();


            /* ================= KAYIT EKLE ================= */

            AddRecordPage page = new AddRecordPage();

            page.clickAddButton();

            page.addNewRecord(
                    "Ali",
                    "Yılmaz",
                    "ali@test.com",
                    "30",
                    "10000",
                    "IT"
            );

            /* ================= KAYIT GÜNCELLE ================= */

            page.clickEditRecord4();
            Map<Field, String> update = new HashMap<>();
            update.put(Field.FIRST_NAME, "AliCan");
            update.put(Field.AGE, "35");
            page.editRecord(update);

            /* ================= DOĞRULAMA ================= */


            $$("div.rt-tr-group")
                    .findBy(text("AliCan"))
                    .shouldHave(text("35"));
        }
    }


