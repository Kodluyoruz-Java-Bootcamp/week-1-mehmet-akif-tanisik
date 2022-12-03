<!-- ABOUT THE PROJECT -->
## Project Description

### Question 5
String class’ı nasıl immutable olmayı sağlamaktadır örnek ve çizimlerle açıklayınız.

### Answer

<img src="../../../outputImages/week1/question5.png" alt="question5" />
Nesne yönelimli programlamada immutable String ler ya da nesneler, bir defa oluşturulduktan sonra değiştirilemez
oldukları anlamına gelir. Değiştirilemezler, fakat bu nesnelerin referansları değişebilir. Nesnelerin değişmesine ya
da manüpüle edilmesine sınır getirilmiştir. Java içerisindeki String sınıfı da immutable yani değiştirilemezdir ve
bunun sebeplerini şu şekilde sıralayabiliriz: güvenlik, sekronizasyon ve uyumluluk, ön belleğe alma ve sınıf
yüklemeleri. String sınıfının değişmez olması aslında manüpüle edilebilir olmasının ya da genişletilmesinin önüne
geçmektir.

String nesneleri, String Pool (String Havuzu) içerisinde ön belleğe alınır, bu durum Stringleri değiştirilemez kılar.
Ön belleğe alınan bu String nesnelerinin değerlerine birden çok istemci tarafından erişilir. Bu yüzden, bu nesneleri
kullanan yapıların bu nesneler üzerinde değişiklik yapıldığında etkilenme şansları vardır. Örneğin elimizde bir 'mehmet'
değerinde bir String nesnesi var. Bu nesnenin değeri bu nesneyi kullanan başka bir yapı tarafından 'MEHMET' diye
değiştirilirse, diğer bu nesneyi kullanan yapılar bundan etkilenir ve onların sahip olduğu String nesnesi de 'MEHMET'
olarak değişir. Ayrıca performans nedeniyle String nesnelerinin ön belleğe alınmalarının önemi yüksek olduğu için,
String nesneleri immutable yani değiştirilemezlerdir.

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

