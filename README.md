# ALD Seminární práce
## Popis tříd
### Tile
Stará se o uchovávání informací o dlaždicích.
### TileImage
Generuje dvourozměrné pole dlaždic se správným umístěním.
### TilePanel
Vytvaří okno a vykresluje jednotlivé dlaždice.
### Constants
Uchovává konstanty pro program (počet generovaných dlaždic, velikost dlaždic,...).
### TileStorage
Načítá jednotlivé typy dlaždic a rozděluje je do listů.
## Algoritmus
Program pracuje se 13 různými typy dlaždic.
<p><img align="center" width="300" height="300" src="/res/tiles.png"></p>
Po spuštění programu se dlaždice rozdělí do čtyř různých listů, podle toho zda na horní a levé straně obsahují trubku nebo ne.
Potom program postupně vyplňuje dlaždice. Začíná vlevo nahoře a postupuje směrem doprava. Nejprve zjistí jestli dlždice nad vyplňovanou dlaždicí má na spodní straně trubku nebo ne. Podle toho se vybere příslušný list, který program postupně projíždí, dokud nenajde dlaždici se správnou pravou stranou.
<h2>Výstup</h2>
<p><img align="center" width="400" src="/res/aldScreen.png"></p>
