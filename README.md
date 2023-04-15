# LinkedIn Cucumber Projesi
Bu proje, [Demoqa](https://demoqa.com) üzerindeki işlemleri içeren Cucumber projesidir.

## Önkoşullar
Bu projeyi çalıştırmak için aşağıdaki önkoşulların sağlanması gerekmektedir:

- Java 8 veya daha yeni bir sürüm
- Maven
- Chrome tarayıcısı

## Kurulum
Projenin kopyalanması:
```
git clone https://github.com/MelihDemirtel/LinkedinCucumberProject.git
```


## Kullanım
Projenin kurulumundan sonra, aşağıdaki adımları izleyerek senaryoları çalıştırabilirsiniz:

1. Testleri çalıştırmak:
***src/test/resources/testNG.xml dizininden çalıştırabilirsiniz.*** Çalıştırmadan önce ***src/main/java/runners/TestRunner.java*** dizininden  
```
tags = {"@Smoke"}
```
alanına çalıştırmak istediğiniz senaryo tag'ını doğru yazdığınıza emin olun.

2. Test sonuçlarını görüntülemek için aşağıdaki dosyayı açın:
***test-output/LinkedinCucumberProject/SmokeTest.html*** "SmokeTest.html" Son kısım testNG.xml dosyasında yazdığınız ***test name ="SmokeTest"*** alanına göre değişir.

## Senaryolar

Bu projede [Demoqa-Elements](https://demoqa.com/elements) sayfasında yer alan senaryolar yer almaktadır:

## Kullanılan Teknolojiler
- Java
- Cucumber
- Selenium
- Maven

# Katkıda Bulunma
Herhangi bir hata veya öneriniz varsa, lütfen Github üzerinden issue açın veya pull request gönderin.

Teşekkürler!
