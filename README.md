# Selenide Web Tables Testleri

Bu proje, **Selenide** kullanılarak **DemoQA Web Tables** sayfası üzerinde
kayıt ekleme ve kayıt güncelleme senaryolarını test etmek amacıyla hazırlanmıştır.

---

## Kullanılan Teknolojiler

- Java 17
- Selenide
- TestNG
- Maven

---

## Test Senaryoları

### 1. Kayıt Ekleme (Add Record)
- Web Tables sayfası açılır
- Add butonuna tıklanır
- Form alanları doldurulur
- Kayıt ekleme işlemi tamamlanır

### 2. Kayıt Güncelleme (Edit Record)
- Mevcut bir kaydın Edit butonuna tıklanır
- Sadece istenen alanlar (örneğin isim ve yaş) güncellenir
- Güncellenen bilgiler tablo üzerinde doğrulanır

---

## Kullanılan Yapı

- Page Object Model (POM) kullanılmıştır
- Form alanları **enum + Map** yapısı ile yönetilmiştir
- Bu yapı sayesinde yalnızca gönderilen alanlar güncellenmektedir
- Doğrulamalar Selenide `Condition` yapıları ile yapılmıştır
- WebDriver yönetimi Selenide tarafından sağlanmaktadır

---

## Testlerin Çalıştırılması

### IntelliJ IDEA
- `testng.xml` dosyasına sağ tıklanarak **Run** seçeneği ile çalıştırılabilir

### Maven
```bash
mvn test -DsuiteXmlFile=testng.xml
