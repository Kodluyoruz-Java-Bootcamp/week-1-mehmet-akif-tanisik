<!-- ABOUT THE PROJECT -->
## Project Description

### Question 3
- Java’nın platform bağımsızlığını nasıl sağladığını anlatınız.

### Answer

Java ile alakalı çevremizden veya araştırmalarımızdan duyduğumuz en belirgin özellik platform bağımsızlığıdır.
Hatta Java ile alakalı çok meşhur bir söz vardır ki o da WORA'nın açılımı olan "Write One Run Anywhere" dir.
Bu cümleyi biraz açacak olursak aslında bir defa yaz ve herhangi bir yerde çalıştırabilme yetisinden bahsediliyor.

Şimdi biraz daha terimsel olarak anlatmamız gerekirse; yazılımcıların günümüzde popüler olarak kullandıkları diller
yüksek seviyeli dillerdir. Aynı zamanda makinenin anladığı ve ona özgü olan dillere ise biz makine dili diyoruz.
Nasıl iki farklı dilde konuşanlar birbirlerini anlayamayacakları gibi(İngilizce-Japonca), düşük seviyeli diller
ile çalışan makineler de yüksek seviyeli dilleri anlayamazlar. Arada köprü görevi görecek ve tercümanlık yapacak
yapılara ihtiyaç duyarız ve bu dillerin birbirlerine dönüşümlerini sağlarız.

Yüksek seviyeli dillerin bazıları doğrudan makine koduna çevrilirken, bazıları bunu doğrudan yapmazlar. Şimdi Java
yüksek  seviyeli dillerden bir tanesi olduğu için kendi syntaxinin makine diline çevrilmesine ihtiyaç duyar. Java bu
işlemi doğrudan yapmaz. Java öncelikle bizim yazdığımız kodları derleyici yardımıyla orta bir katman olan byte-code lara
çevirir. Fakat yanlış anlaşılmaması için aslında bu byte-code lar makine kodları değildir fakat makine koduna yakın
kodlardır diyebiliriz. Byte-code a çevrilen java dosyalarımız Javanın sahip olduğu bir sanal makine tarafından (JVM)
gerektiğinde makine koduna çevrilerek çalıştırılır.

Şimdi hikayenin başında söylediğimiz gibi platform bağımsızlık durumu aslında JVM'in byte-code ları makine kodlarına
çevirip çalıştırmasından dolayıdır. Jvm kendi içerisinde bulunan interpreter ve Just In Time Compiler (JIT) sayesinde
byte-code'dan makine koduna çevirmeleri gerçekleştirir. Fakat bu dönüşüm işlemi java kodumuzun çalıştığı platforma
özgüdür ve hangi platformda çalıştırılmak isteniyorsa JIT ona göre byte-code ları makine koduna çevirir.

Sonuca varmamız gerekirse, bizim java dosyalarımız derleyici tarafından byte-code'lara çevrilir. Bu byte-code'lar
istenilen platformda JVM(Interpreter-JIT) yardımıyla platformun gereklilikleri doğrultusunda makine koduna çevrilir ve
çalıştırılır. Yani biz herhangi bir platform üzerinde yazdığımız Java dosyalarını byte-code'a çevirip gerektiğinde JVM
ile çalıştırdığımız ve platformlara bağımlı kalmadığımız için aslında Java'yı platform bağımsız bir dil olarak
nitelendiriyoruz.

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

