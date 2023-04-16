# Cvičenie 4
## 4.1 Dedenie
Vytvorte abstraktnú triedu s názvom Zivočích, ktorá bude obsahovať nasledujúce atribúty a metódy:
- pocet noh dátový typ: int
- zvuk() návratový typ: void, abstraktná metóda
Vytvorte triedu Pes, ktorá bude dediť z triedy Zivočích, a obsahovať nasledujúce metódy:
- zvuk() návratový typ: void, preťažuje funkciu z rodičovskej triedy
Vytvorte triedu Clovek, ktorá bude dediť z triedy Zivočích, a obsahovať
nasledujúce metódy:
- zvuk() návratový typ: void, preťažuje funkciu z rodičovskej triedy
Pri inicializácii Psa a človeka inicializujte spomenuté atribúty v konštruktore,
pri zavolaní metódy vypíšte zvuk charakteristicky pre daného živočícha.

## 4.2 Collections - List
### 4.2.1 Inicializácia
Vytvorte zoznam (ArrayList, alebo LinkedList) a naplňte ho prvkami typu:
- String
- int
- vlastný objekt napr. Zivočích z predchádzajúcej úlohy 
### 4.2.2 Iterácia
Vypíšte prvky naplneného zoznamu. Vyskúšajte si správanie prvkov pri iterácii
ked pracujete so zdedenými triedami - vysúšajte zavolať nejaké metódy triedy
Zivočích. 
### 4.2.3 Inicializácia z klávesnice
Vytvorte zoznam, ktorý umožníte naplniť používateľovi ľubovoľným počtom
prvkov z klávesnice.
1
### 4.2.4 Modifikácia
Vytvorte zoznam, ktorý bude obsahovať N prvých prirodzených čísel. Spravte
funkciu, ktorá z neho vymaže každé K-te číslo. N a K si zvoľte ľubovoľne. K > 1
a N > 2K.
Umožnite zadať N a K používateľovi z klávesnice.
### 4.2.5 Vnorené kolekcie
Vytvorte ekvivalent dvojrozmerného poľa pomocou zoznamov. Naplňte ho prvkami
a vypíšte.
### 4.2.6 Triedenie
Vytvorte zoznam a naplňte ho vlastnými objektami. Zotriedte zoznam pomocou 
metódy List.sort(). Vyskúšajte si obe možnosti použitia - pomocou interface-u
Comparator aj pomocou interface-u Comparable.
## 4.3 Collections - Map
Vytvorte objekt typu Map dictionary ktorý bude obsahovať preklady slov nižšie
- Ano - Yes ´
- Nie - No
- Objektovo orientované programovanie - Objected oriented programming
### 4.3.1 Pridávanie
Vytvorte funkciu pre pridanie dalšieho prekladu na základe interakcie používate  ľa
z klávesnice, používateľ napíše slovo stlačením enter sa dostane k písaniu dalšieho 
slova, predtým je však potrebné skontrolovať či už bolo dané slovo zadané v
slovníku ak áno je potrebné vypísať hlášku o tom že nie je možné pridať další 
preklad pre dané slovo. Dalším stlačením sa daný preklad pridá do slovníku. 
Používateľovi sa po pridaní slova vypíše hláška či dané slovo bolo pridané do
slovníku.
### 4.3.2 Cítanie 
Vytvorte funkciu ktorá vypíše po interakcii s používateľom preklad pre zadané
slovo z klávesnice. Používateľ zadá slovo stlačením enteru sa mu pre dané slovo
vypíše preklad alebo informácia o tom že dané slovo sa už v slovníku nachádza.
### 4.3.3 Odstraňovanie
Vytvorte funkciu ktorá vymaže konkrétny prvok z objektu dictionary na základe
interakcie používateľa. Používateľ zadá kľúč ktorý chce vymazať, v prípade ak
chce používateľ vymazať prvok ktorý sa v objekte nenachádza vypíšte vhodnú
hlášku.
2
### 4.3.4 Vyprázdnenie
Vytvorte funkciu ktorá vymaže všetky hodnoty z objektu dictionary, pričom
objekt zostane inicializovaný(nebude mať hodnotu null)
### 4.3.5 Iterácia dvojíc
Vytvorte funkciu ktorá preiteruje celým objektom dictionary a vypíše všetky
preklady ktoré sa v ňom nachádzajú.
### 4.3.6 Iterácia kľúčov
Vytvorte funkciu ktorá preiteruje cez všetky kľúče objektu dictionary a vypíše
jednotlivé kľúče do konzoly.
### 4.3.7 Iterácia hodnôt s vyhľadávaním substringov
Vytvorte funkciu ktorá preiteruje cez všetky hodnoty objektu dictionary a vypíše
jednotlivé hodnoty do konzoly ktoré začínajú písmenom y.
### 4.3.8 Kópia objektu a porovnanie
Vytvorte kópiu objektu dictionary pomenujte ju dictionary2. Následne tieto
dva objekty porovnajte s využitím metódy equals(). Výsledok zdôvodnite.
