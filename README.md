# Java Web Sunucusu

## Proje Hakkında

Bu proje, herhangi bir üçüncü taraf kütüphane kullanılmadan yalnızca Java programlama dili ile geliştirilmiş basit bir web sunucusudur.

Sunucu, istemcilerle iletişim kurmak için Java Socket programlamasını kullanır. Kullanıcı bir web tarayıcısından sunucu adresine girdiğinde, kişisel bilgilerin yer aldığı HTML sayfası görüntülenir.

Web sunucusu **1989 portu** üzerinden çalışmaktadır.

## Kullanılan Teknolojiler

- Java
- Java Socket Programlama
- HTTP Protokolü
- HTML
- CSS

## Projenin Özellikleri

- 1989 portu üzerinden çalışır.
- ServerSocket kullanarak tarayıcı bağlantılarını kabul eder.
- Socket kullanarak istemci bağlantılarını yönetir.
- Dinamik olarak HTML sayfası oluşturur.
- Öğrenci bilgilerini web sayfasında gösterir.
- CSS ile web sayfasını biçimlendirir.
- Sınıfların görevlerini ayırmak için arayüzler (interface) kullanır.
- Üçüncü taraf kütüphane kullanmaz.

## Proje Dosya Yapısı

```text
JavaWebServerHuda/
│
└── src/
    ├── Main.java
    ├── WebServer.java
    ├── ClientHandler.java
    ├── HtmlGenerator.java
    ├── AlternativeHtmlGenerator.java
    ├── HttpResponse.java
    ├── RequestHandler.java
    ├── HtmlProvider.java
    └── HttpResponseFormatter.java
```

## Sınıfların ve Arayüzlerin Görevleri

| Dosya | Görevi |
|---|---|
| Main | Programı başlatır ve gerekli nesneleri oluşturur. |
| WebServer | Sunucuyu oluşturur ve 1989 portunu dinler. |
| ClientHandler | İstemcilerden gelen istekleri yönetir. |
| HtmlGenerator | Ana HTML sayfasını oluşturur. |
| AlternativeHtmlGenerator | Alternatif bir HTML sayfası oluşturur. |
| HttpResponse | HTTP yanıtını hazırlar. |
| RequestHandler | İstemci isteklerini yönetmek için kullanılan arayüzdür. |
| HtmlProvider | HTML sayfası oluşturmak için kullanılan arayüzdür. |
| HttpResponseFormatter | HTTP yanıtını biçimlendirmek için kullanılan arayüzdür. |

## Projenin Çalıştırılması

Projeyi çalıştırmak için bilgisayarda Java JDK kurulu olmalıdır.

1. Terminal açılır.
2. Projenin `src` klasörüne gidilir:

```bash
cd src
```

3. Java dosyaları derlenir:

```bash
javac *.java
```

4. Sunucu başlatılır:

```bash
java Main
```

5. Web tarayıcısı açılır ve aşağıdaki adres ziyaret edilir:

```text
http://localhost:1989
```

Sunucu başarıyla çalıştığında öğrenci bilgilerini içeren web sayfası görüntülenir.

## SOLID Prensipleri

Projede SOLID prensiplerinden yararlanılmıştır.

- **Single Responsibility Principle (Tek Sorumluluk Prensibi):** Her sınıfın belirli bir görevi vardır. Örneğin WebServer sunucuyu yönetirken, HtmlGenerator HTML sayfasını oluşturur.

- **Open/Closed Principle (Açık/Kapalı Prensibi):** Mevcut kod değiştirilmeden yeni HTML oluşturucu sınıfları eklenebilir.

- **Liskov Substitution Principle (Liskov Yerine Geçme Prensibi):** HtmlProvider arayüzünü uygulayan farklı sınıflar birbirlerinin yerine kullanılabilir.

- **Interface Segregation Principle (Arayüz Ayırma Prensibi):** Her arayüz belirli bir göreve odaklanır. Böylece sınıflar ihtiyaç duymadıkları metotları kullanmak zorunda kalmaz.

- **Dependency Inversion Principle (Bağımlılıkların Tersine Çevrilmesi Prensibi):** Sınıflar doğrudan birbirlerine bağımlı olmak yerine arayüzler üzerinden iletişim kurar.

## Öğrenci Bilgileri

- **Ad Soyad:** Hüda Nur Sel
- **Öğrenci Numarası:** 1250505012
- **Bölüm:** Yazılım Mühendisliği

## Lisans

Bu proje eğitim ve ders ödevi amacıyla geliştirilmiştir.
