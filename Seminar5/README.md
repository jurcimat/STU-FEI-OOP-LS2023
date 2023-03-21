# Cvičenie 5
## 5.1 Lambda funkcie
### 5.1.1 Uvod
Vytvorte ArrayList typu String, a naplňte ho minimálne 5 prvkami. Následne
vypíšte jednotlivé prvky listu pomocou funkcie forEach, do ktorej vstupom je
lambda (anonymná funkcia).
- Viac o forEach - [forEach](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html#forEach(java.util.function.Consumer))
- Viac o Lambdách - [Lambda Expressions](https://www.w3schools.com/java/java_lambda.asp)
### 5.1.2 Sort - úloha z 3. cvičenia
Vytvorte triedu s názvom Student podľa úlohy 1.1 z cvičenia 3. Vytvorte pole
a naplňte ho prvkami triedy Student. Po naplnení pola dané pole zosortujte
pomocou metódy [Arrays.sort()](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html#sort(java.lang.Object%5B%5D)), kde vstupom bude pole a lambda funkcia, pomocou ktorej sa pole má sortovať podľa atribútu meno.
## 5.2 Výnimky
### 5.2.1 Zachytenie výnimky
Definujte objekt a inicializujte jeho hodnotu na null. Pokúste sa vytvoriť funkciu
pripocitaj(int a) ktorá ku danému objektu pripočíta číslo 2 a vráti jeho referenciu. Kód zabaľte do klauzuly try-catch, aby ste zachytili výnimku typu
NullPointerException.
### 5.2.2 Inicializácia objektu pri zachytení výnimky
Upravte funkciu z predošlej úlohy ktorá pomocou zachytenia výnimky operátorom
catch, na objekte ktorý je null inicializuje hodnotu objektu na ľubovoľné číslo.
Následne, stále sa nachádzate v časti catch zavoláte funkciu pripocitaj() ktorá
by už pri druhom zavolaní mala pripočítať číslo 2 k už inicializovanému objektu
### 5.2.3 Vytvorenie vlastnej výnimky
Vytvorte vlastnú výnimku ktorú vrátite v programe, v prípade ak by náhodne
vygenerované číslo z predošlej úlohy, bolo väčšie ako číslo 50. V prípade ak je
toto číslo väčšie skončíte program s výpisom ”Císlo bolo väčšie ako 50”.
1