<!-- ABOUT THE PROJECT -->
## Project Description

### Question 4
Java’da heap ve stack kavramlarını örneklerle açıklayın.

### Answer

Her programlama dilinde olduğu gibi Java içinde hafıza yönetimi önemli bir rol oynamaktadır. Farklı dillerde olduğu
gibi Java içerisinde manuel olarak hafıza manüpülasyonları gerçekleştiremiyoruz. Java bu hafıza yönetimini bizler
için otomatik olarak gerçekleştiriyor. Java sanal makinesi hafızayı bizim için iki parçaya böler. Bu kısımları biz
'stack' ve 'heap' olarak adlandırırız. Bu iki hafıza kısmıda bizim için önemlidir ve ikiside farklı amaçlar
doğrultusunda kullanılırlar. Aslında ikisininde görevi depolamadır fakat amaçları farklıdır. Bu iki kısım arasındaki
en büyük fark, Stack memory'nin method çağırma sıralarını ve yerel değişkenleri tutması iken Heap Memory'nin görevi ise
nesnelerin depolanması ve dinamik olarak 'memory allocation' ve 'deallocation' yapmasıdır.

#### Stack Memory
Stack memory çalışma zamanında her thread görevi için tahsis edilen fiziksel bir alandır.(Ram'in içerisinde) Stack
memory herhangi bir thread oluşturulduğu zaman oluşturulur. Hafıza yönetimi LIFO(Last-In-First-Out) yani ilk giren
son çıkar ilkesine göre çalışır çünkü stack memory global olarak erişilebilirdir. Stack memory değişkenleri, nesne
referanslarını ve kısmi cevapları saklar. Stack 'e ayrılan hafıza herhangi bir dönene kadar yaşamına devam eder. JVM ,
her thread için ayrı bir Stack oluşturur. Son olarak Stack'de yer kalmadığı zaman StackOverFlowError sınıfından bir
exception fırlatılır.

#### Heap Memory
Hep memory JVM başladığı zaman oluşturulur ve uygulama çalıştığı sürece uygulama tarafından kullanılmaya devam eder.
Hep memory nesnelerimizi ve JRE kütüphanelerimizi içerisinde saklar. Biz nesne oluşturduğumuz zaman heap içerisinde bu
nesne için yer ayrılırken, bu nesnenin referansı Stack içerisinde barındırılır. Heap memory Stack gibi herhangi bir
sırayı takip etmeden çalışır. Dinamik olarak bellek bloklarını işlenir. Bu şekilde hafızayı manuel olarak işlememize
de gerek kalmamaktadır. Hafızanın otomatik olarak yönetilmesi için Java, içerisinde Çöp Toplayıcı barındırır. Bu çöp
toplayıcısı kullanılmayan nesnelerin hafızadan silinip daha iyi bir bellek kullanımını amaçlamaktadır. Heap'e ayrılan
bellek herhangi bir olay ya da program sonlanıncaya kadar devam eder. Elementlere ulaşım global olarak yapılabilir.
Tüm thread ler için paylaşılan ortak bir bellek alanıdır. Son olarak Heap'de yer kalmadığı zaman OutOfMemoryError 
sınıfından bir exception fırlatılır.

Heap aşağıdaki alanlara bölünmüştür:

- Young generation
- Survivor space
- Old generation
- Permanent generation
- Code Cache

<!-- TECHNOLOGIES -->
### Technologies

<a href="https://www.java.com/" target="_blank"><img src="../../../outputImages/logos/java.svg" alt="Java" height="80" /></a>


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.




<!-- CONTACT -->
## Contact

### Mehmet Akif Tanisik

<a href="https://github.com/mehmet-akif-tanisik" target="_blank">
<img  src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 20px;" />
</a>
<a href = "mailto:matnsk@outlook.com?subject = Feedback&body = Message">
<img src=https://img.shields.io/badge/send-email-email?&style=for-the-badge&logo=microsoftoutlook&color=CD5C5C alt=microsoftoutlook style="margin-bottom: 20px; margin-left:20px" />
</a>
<a href="https://linkedin.com/in/mehmet-akif-tanisik" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 20px; margin-left:20px" />
</a>  
<a href="https://twitter.com/makiftanisik" target="_blank">
<img src=https://img.shields.io/badge/twitter-%2300acee.svg?&style=for-the-badge&logo=twitter&logoColor=white alt=twitter style="margin-bottom: 20px; margin-left:20px" />
</a>

<!-- PROJECT-BOOTCAMP-PRACTICUM PART -->
<br />

## Java Bootcamp - Kodluyoruz & Solmaz
<div align="center">
  <a href="https://www.solmaz.com">
    <img src="../../../outputImages/logos/solmaz-logo.jpg" alt="Logo" width="220" height="200">
  </a>

<h3 align="center">Company: Solmaz Customs Consultancy/Brokerage Co.</h3>
</div>

<div align="center">
  <a href="https://kodluyoruz.org/tr/kodluyoruz/">
    <img src="../../../outputImages/logos/kodluyoruz-logo.png" alt="Logo" width="350" height="300">
  </a>
<h3 align="center">Organizer: Kodluyoruz.org</h3>
</div>

