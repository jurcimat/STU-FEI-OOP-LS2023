# Cvičenie 7
## 7.1 Otáčanie geometrických tvarov
Vytvorte oknovú aplikáciu, obsahujúcu canvas. Vykreslite naň 5-uholník, ktorý
bude rotovať okolo svojho stredu s definovaným krokom (napr. 36 stupňov).\
Ak je úloha príliš ťažká vyskúšajte si to najprv na rotácii čiary, kde stred
otáčania bude prvá súradnica [x,y].\
POMÔCKA: potrebujete prepočítať každý vrchol 5-uholníka pomocou goniometrických funkcií napr. [TU](https://www.tutorialspoint.com/computer_graphics/2d_transformation.htm).\
Aby ste zabezpečili efekt animovaného otáčania, môžete v paint metóde volať
metódu Thread.sleep(long milliseconds), ktorá zabezpečí potrebné oneskorenie
medzi každým krokom rotácie.
## 7.2 Okno s Listenermi
Vytvorte okno o veľkosti 300x300, v ktorom zobrazíte tlačidlo s nápisom ”Close”.
Následne pridajte do programu ActionListener, ktorý na stlačenie tlačidla ”Close”
zavrie okno a vypne program.\
Pridajte pod tlačidlo ”Close” dalšie tlačidlo s nápisom ”Draw”. Pod Obe
tlačidlá umiestnite Canvas. Po Stlačení tlačidla ”Draw” a následnom kliknutí
na Canvas nakreslíte geometrický tvar podľa vašeho výberu. (kruh, štvorec,
obdĺžnik).\
Pod Canvas pridajte tlačidlo ”Click”. Po kliknutí na tlačidlo ”Click”, bude
umožnené kliknúť na hocijaké miesto v canvase. Po kliknutí na miesto v canvase
otvorte nové dialógové okno kde sa budú nachádzať súradnice vášho kliku myšou
v canvase.
## 7.3 Kreslenie polygónov
Vytvorte oknovú aplikáciu obsahujúcu canvas. Ked používateľ klikne ľavím
tlačidlom myši začne kresliť čiaru z daného bodu. Ciara sa z daného bodu
naťahuje ku aktuálnej pozícii myši. Ked používateľ opäť klikne ľavím tlačidlom,
tak sa bod zafixuje a pokračuje v kreslení čiari od nového bodu. Ked používateľ
klikne pravím tlačidlom myši, tak sa aktuálne kreslený polygón uzavrie (nakreslí
sa čiara od posledného bodu k prvému). Používateľ môže následne kresliť nový
polygón.
## 7.4 Kreslenie čiar
Vytvorte oknovú aplikáciu obsahujúcu canvas. Ked používateľ klikne a ťahá
myšou na canvase kreslí neprerušovanú čiaru nejakej hrúbky. Pokúste sa aby
čiara vyzerala čo najlepšie a neobsahovala ostré zlomy.
