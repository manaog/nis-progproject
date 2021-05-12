- - - - - - - - - - - - - - - - - - - - - - - - - - - -
- - - Allgemeine Hinweise zum Programmierprojekt - - -
- - - - - - - - - - - - - - - - - - - - - - - - - - - -

- Sie d�rfen nur �nderungen im Ordner "solutions" vornehmen.
	- Ausnahme: Damit Sie Ihr Programm testen k�nnen, m�ssen Sie Ihr Token in der Klasse "Client" hinterlegen.
- Sie d�rfen zus�tzliche Dateien/Klassen anlegen, aber keine Bestehenden entfernen.

- Sie k�nnen in die "Helper" Klasse alle Methoden implementieren, die Sie f�r alle Aufgaben zur Verf�gung haben wollen.

- Die Bearbeitung Ihrer Aufgaben findet in der "run" Methode der Solution Klassen statt.

- Ihre Abgabe umfasst den kompletten "client" Ordner als .zip.


- - - - - - - - - - - - - - - - - - - - - - - - -
- - - Hinweise zur Bearbeitung der Aufgaben - - -
- - - - - - - - - - - - - - - - - - - - - - - - -

- Aufgabenparameter
Jede Aufgabe erh�lt Parameter zur Bearbeitung, welche wahlweise als int, double oder String vorliegen k�nnen.
Diese k�nnen sie in Ihren run() Methoden �ber das "TaskObject task" abrufen.

String[] task.getStringArray();
int[] task.getIntArray();
double[] task getDoubleArray();

Welche Parameter an welchen Stellen dieser Arrays liegen stehen in der Aufgabenstellung im PDF zum Programmierprojekt.


- Globale Funktionen
Alle Solution Klassen erben von der Helper Klasse.
Sollten Sie also z.B. eine Funktion "int modulo(int a, int b)" in der Helper Klasse definiert haben, k�nnen sie �berall in jeder Solution Klasse via "this.modulo(a, b);" darauf zugreifen.


- Zwischenl�sungen
Manche Aufgaben erfordern das Absenden von Zwischenl�sungen. Wann dies geschehen muss und woraus die Zwischenl�sung besteht finden Sie in der PDF zum Programmierpojekt.
Die Zwischenl�sungen werden �ber die Methode "void this.sendMoreParams(String[] params);" verschickt.
Meistens enth�lt das TaskObject task neue Parameter nach dem Senden der Zwischenl�sung.

- Schl�ssel als Vorparameter
Manche Aufgaben erfordern das Generieren und Senden eines Schl�sselpaares vor der eigentlich Aufgabenbearbeitung.
Die Generierung findet in der zu �berschreibenden Methode "String[] getKey()" statt.
BEACHTE: Die run() Methode wird erst NACH der getKey() Methode aufgerufen, und innerhalb der getKey() Methode ist "task == null"!
Jegliche Aufrufe von TaskObject Methoden in der getKey Methode wird Fehler verursachen!
