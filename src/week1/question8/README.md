<!-- ABOUT THE PROJECT -->
## Project Description

### Question 8
Collection framework içerisindeki bütün yapıları önemli methodlarıyla örnekleyip açıklayınız.


### Answer

<img src="../../../outputImages/week1/question8.png" alt="question8" />

Collection Framework bir grup nesneyi depolamak ve işlemek için birleşik bir mimariyi temsil eder. Şunlara haip olabilir:

- Interface'ler ve onların implemantasyonları(Class)
- Algoritmalar

### Iterable Interface

Bu interface'i implemente eden sınıfların nesnelerinin 'For-each-loop' ile iterasyona uğrayabilirler.

#### Methodlar:
default void forEach(Consumer<? super T> action)
Iterator<T> iterator()
default Spliterator<T> spliterator()

### Collection Interface

Bu interface'i implemente edecek olan sınıfların ortak işlevsellikleri bu interface ile sağlanır. Altındaki 3 ayrı interfacede ise
daha karakteristik özellikler birbirinden ayrılıyor.

#### Methodlar:
- boolean	add(E e) -- Koleksiyona E tipinde bir nesne ekler.
- boolean	addAll(Collection<? extends E> c) -- Koleksiyona başka bir koleksiyondaki nesnelerini ekler.
- void	clear() -- Koleksiyondan tüm elementleri siler
- boolean	contains(Object o) -- herhangi bir nesnenin koleksiyonda olup olmadığını kontrol eder
- boolean	containsAll(Collection<?> c) -- Bir koleksiyondaki tüm elementlerin başka bir koleksiyonda olup olmadığını kontrol eder.
- boolean	equals(Object o) -- İki koleksiyonun eşitlik durumunu kontrol eder.
- int	hashCode() -- Koleksiyonun hashCode'unu döner
- boolean	isEmpty() -- Koleksiyonun boş olup olmama durumunu kontrol eder.
- Iterator<E>	iterator() -- Koleksiyondaki nesneler üzerinde bir iterator döndürür.
- default Stream<E>	parallelStream() -- muhtemel bir paralel akış döndürür
- boolean	remove(Object o) -- koleksiyondan belirli bir elementi siler, eğer varsa
- boolean	removeAll(Collection<?> c) -- koleksiyondaki elementlerden argümandaki koleksiyondakilerle aynı olanları siler.
- default boolean	removeIf(Predicate<? super E> filter) -- Bu koleksiyonun verilen yüklemi karşılayan tüm öğelerini kaldırır.
- boolean	retainAll(Collection<?> c) -- Bu koleksiyondaki yalnızca belirtilen koleksiyonda bulunan öğeleri tutar
- int	size() -- Bu koleksiyondaki öğelerin sayısını döndürür.
- default Spliterator<E>	spliterator() -- Bu koleksiyondaki öğeler üzerinde bir Ayırıcı oluşturur.
- default Stream<E>	stream() -- Kaynağı olarak bu koleksiyonla sıralı bir Akış döndürür.
- Object[]	toArray() -- Bu koleksiyondaki tüm öğeleri içeren bir dizi döndürür.
- <T> T[]	toArray(T[] a) -- Bu koleksiyondaki tüm öğeleri içeren bir dizi döndürür; döndürülen dizinin çalışma zamanı türü, belirtilen dizininkidir.

### List Interface

#### Methodlar:
- boolean	add(E e) -- listenin sonuna eleman ekler
- void	add(int index, E element) -- listenin belirli bir indexine eleman ekler
- E	get(int index) -- listenin index'indeki elemanı döner
- int	indexOf(Object o) -- eğer varsa elemanın ilk göründüğü indexi verir
- default void	sort(Comparator<? super E> c) -- listeyi sıralar
- List<E>	subList(int fromIndex, int toIndex) -- belirli aralıkta orjinal listenin kopyasını döndürür

### Queue Interface

#### Methodlar:
- boolean	add(E e) -- element ekler
- E	element() -- Bu kuyruğun başını alır, ancak kaldırmaz.
- boolean	offer(E e) -- Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, belirtilen öğeyi bu kuyruğa ekler.
- E	peek() -- Bu kuyruğun başını alır, ancak kaldırmaz veya bu sıra boşsa null değerini döndürür.
- E	poll() -- Bu kuyruğun başını alır ve kaldırır veya bu sıra boşsa null değerini döndürür.
- E	remove() -- Bu kuyruğun başını alır ve kaldırır.

### Set Interface

Koleksiyon interfaceindeki tüm methodlara sahiptir.

### Deque Interface:

#### Bazı Methodlar:
- E	getFirst() -- Bu deque'nin ilk öğesini alır, ancak kaldırmaz.
- E	getLast() -- Bu deque'nin son öğesini alır, ancak kaldırmaz.
- boolean	offerFirst(E e) -- Kapasite kısıtlamalarını ihlal etmedikçe belirtilen öğeyi bu deque'in önüne ekler.
- boolean	offerLast(E e) -- Kapasite kısıtlamalarını ihlal etmedikçe belirtilen öğeyi bu deque'in sonuna ekler.
- E	pop() -- Bu deque tarafından temsil edilen yığından bir öğe çıkarır.

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

