# Symulator SKM:
- [x] Gradle, Docker, Git 

- [x] dwie aplikacje: symulator i klient

- [x] wszystkie stacje od GDYNIA GLOWNA do GDANSK GLOWNY (powinno ich byc ok 15)

- [x] dystans miedzy stacjami uznajemy za jednakowy

- [x] bedzie naraz jezdzilo X pociagow, kazdy pociag ma miec Y przedzialow, kazdy przedzial pomiesci Z osob

- [x] X,Y,Z ladujemy z pliku konfiguracyjnego

- [ ] gdy pociag dojezdza do stacji, pojawia sie na niej losowa (2-8) ilosc osob, ktore chca sie dostac 
   na losowy przystanek na dalszej czesci tej linii.Wysiadaja z pociagu gdy dotra na miejsce

- [ ] gdy pociag dojezdza na koniec linii, robi postoj na 2 tury, po czym rusza w przeciwnym kierunku

### Symulator powinien miec:  
- [x] endpoint na przesuniecie symulacji do przodu   
- [x] pociagi sie przesuwaja o jedno pole, np: POST symulator:9000/doprzodu  
- [x] wystawic endpointy dla klienta

### Klient ma miec mozliwosc odpytania symulatora o:  
- [ ] ilosc pociagow np: GET api:8080/pociagi   
- [ ] i otrzymac w odpowiedzi JSONa z danymi pociagow: w tym przypadku tylko numer identyfikacyjny  
- [ ] stan pociagu np: GET api:8080/pociagi/1234 
- [ ] otrzymac w odpowiedzi JSONa z danymi pociagu o id 1234: numer id, procentowe zapelnienie przedzialow, ilosc osob  

### Dodatkowo:  
- [ ] kazdy czlowiek ma miec losowe imie i nazwisko, klient powinien moc dopytac symulator o informacje o przedziale i w odpowiedzi otrzymac informacje o pasazerach*