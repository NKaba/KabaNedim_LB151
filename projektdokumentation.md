# Projekt-Dokumentation

Kaba

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
|  12.01.2023	     | 0.0.1   | Projekt beschrieben, Technologie und Datenbank ausgewählt. USer Stories erstellt und zu den User Stories Testfälle erstellt. GUI-Prototypen erstellt. |
| 08.02.2023	    | 0.0.2   |  Projekt erstellt, Beanklasse erstellt und mit Programmieren begonnen                         |
|  15.02.2023     | 0.0.3   |  Funktion des Spiels funktioniert halbwegs,  Franken (Geld) wird angezeigt, anzahl Leben ist zu sehen und Random "Wort" wird generiet, welches erraten werden kann. Login für Administrationsbereich                                                         |
| 22.02.2023      | 0.0.4   |  Starseite erstellt, Design für alle Seiten gemacht                                            |
|       | 0.0.5   |                                                              |
|       | 0.0.6   |                                                              |
|       | 1.0.0   |                                                              |

# 0 Ihr Projekt

Ich werde eine Glücksrad-Applikation erstellen, bei der der Benutzer Wörter oder Redewendungen in einem Gitter erraten muss. Bevor ich mit dem Rätseln beginne, wird mir eine Kategorie genannt. Um Geldbeträge zu erspielen, drehe der Benutzer am Glücksrad und erratet das jeweilige Wort. In der Applikation wird das Glücksrad durch eine Text-Ausgabe simuliert.

# 1 Analyse

✍️ Beschreiben Sie, auf welchem Tier Sie die dynamischen Elemente der Anwendung unterbringen möchten:

* Tier 1 (Presentation): das Glücksrad, die Rate-Wand, die Anzeige des Kontostands, die Lebenspunkte, sowie die Highscore-Liste Darstellen. 
* Tier 2 (Webserver): Erarbeitung von Anfragen und Übertragung von Daten zwischen Endgerät und Application Server.
* Tier 3 (Application Server): Erarbeitung der Anfragen des Benutzers, Abruf von Daten aus der Datenbank und Rückgabe der Ergebnisse an den Webserver.
* Tier 4 (Dataserver): Speicherung und Verwaltung der Daten der Anwendung, Bearbeitung der Anfragen des Application Servers.

# 2 Technologie

* Tier 1: HTML & CSS für die grafische Darstellung der Anwendung.
* Tier 2: JSF
* Tier 3: JSF
* Tier 4: MySQL um Daten zu speichern und zu verwalten. 

# 3 Datenbank

Verwendung der ADO.NET-Bibliothek, die in ASP.NET enthalten ist, um direkt mit der Datenbank zu interagieren und SQL-Abfragen auszuführen.

# 4.1 User Stories

✍️ Formulieren Sie klare Anforderungen in der Form von User Stories (*„als … möchte ich … damit …“*) und zu jeder Anforderung mindestens einen dazugehörigen Testfall (in Kapitel 4.2). 

✍️ Formulieren Sie weitere, eigene Anforderungen und Testfälle, wie Sie Ihre Applikation erweitern möchten. Geben Sie diesen statt einer Nummer einen Buchstaben (`A`, `B`, etc.)

| US-№ | Verbindlichkeit | Typ  | Beschreibung                       |
| ---- | --------------- | ---- | ---------------------------------- |
| 1  | Muss                | Funktional     | Als ein Administrator möchte ich mich mit Benutzername und Passwort anmelden, damit ich Zugriff auf die Administrationsoberfläche habe.|
| 2    | Kann                | Funktional     | Als ein Administrator möchte ich in der Lage sein, Phrasen und Rätselwörter hinzuzufügen, damit ich sie bearbeiten und löschen kann.|
| 3    | Muss                | Funktional     | Als ein Administrator möchte ich Kategorien erstellen und jedes Wort oder jede Frage einer Kategorie zuweisen können, damit ich die Inhalte der App strukturieren kann. |
| 4    | Muss                | Funktional     | Als ein Administrator möchte ich einzelne Einträge in der Highscore-Liste entfernen können, damit ich Übersicht habe. |
| 5    | Kann                | Funktional     | Als Benutzer möchte ich meinen Namen eingeben können, der auf der Highscore-Liste erscheint, damit ich meinen Score teilen kann. |
| 6    | Muss                | Funktional     | Als Benutzer möchte ich meinen Kontostand zu jeder Zeit sehen, damit ich weiss wieviel mein Kontostand beträgt. |
| 7    | Muss                | Funktional     | Als Benutzer möchte ich meine Lebenspunkte zu jeder Zeit sehen, damit ich immer über meinen Lebenspunkte informiert bin. |
| 8   | Muss                | Funktional     | Als Benutzer möchte ich erfahren, ob meine gewählte Antwort richtig oder falsch war, damit ich meine Leistung im Spiel einschätzen kann |
| 9    | Kann                | Funktional     |  Als Benutzer möchte ich in der Highscore-Liste den Rang, den Namen des Spielers, den Zeitpunkt des Spiels, den Geldbetrag und die Anzahl der Spielrunden sehen, damit ich eine Übersicht über das Spiel habe. |
| 10    | Kann                | Funktional     | Als Benutzer möchte ich die Highscore-Liste nach Rang, der durch die Höhe des Geldbetrags bestimmt wird, aufsteigend sortiert sehen, damit ich die besten Spieler gleich sehen kann. |
| 11    | Muss                | Qualität     | Als Entwickler möchte ich sicherstellen, dass alle Formulareingaben auf der Client- und Serverseite validiert werden, damit ich sicher sein kann, dass die Anwendung fehlerfrei funktioniert. |
| 12   | Muss                | Qualität     | Als Entwickler möchte ich Transaktionsmanagement verwenden, damit ich sicherstellen kann, dass alle Datenbankoperationen fehlerfrei ausgeführt werden und im Falle eines Fehlers rückgängig gemacht werden können. |
| 13   | Muss                | Qualität     | Als Entwickler möchte ich, dass Sicherheitsaspekte berücksichtigt werden, damit ich sicher sein kann, dass die Anwendung und die verarbeiteten Daten sicher sind. |
| 14   |                 |      | Als ein Benutzer möchte ich Vokale kaufen können, damit ich das Wort einfacher erraten kann (Vokale kann man nicht eingeben ohne sie zu kaufen) |
| 15   |                 |      | Als ein 🤷‍♂️ möchte ich 🤷‍♂️, damit 🤷‍♂️ |

✍️ Jede User Story hat eine ganzzahlige Nummer (1, 2, 3 etc. oder Zahl), eine Verbindlichkeit (Muss oder Kann?), und einen Typ (Funktional, Qualität, Rand). 

# 4.2 Testfälle

| TC-№ | Vorbereitung | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  |        Programm ist gestartet      |  Benutzer gibt Benutzername und Passwort ein |  Erfolgreiche Anmeldung und Zugriff auf die Administrationsoberfläche     |
| ...  |   Benutzer muss Spiel starten           | Neue Kategorie wird erstellt      |   Erfolgreiche Erstellung der Kategorie                 |
| ...  |      Benutzer muss Spiel starten       |  Highscore Eintrag mit dem Namen "xxx" zum Entfernen       |     Erfolgreiche Entfernung des Eintrags mit dem Namen "xxx" aus der Highscore-Liste.      |
| ...  |      Benutzer muss Spiel starten       | Anmeldung mit Benutzername "  " und Passwort "  "     |     Erfolgreiche Anmeldung und Anzeige des Kontostands "  "              |
| ...  |       Benutzer muss Spiel starten       | Anmeldung mit Benutzername "  " und Passwort "  "           |  Erfolgreiche Anmeldung und Anzeige der Lebenspunkte  "  "      |
| ...  |        Benutzer muss Spiel starten     | Eine Antwort mit richtig oder falsch beantworten        |  Ergebnis von gewählter Antwort wird angezeigt.             |
| ...  |        Benutzer muss Spiel starten      | Der Benutzer hat einen Kontostand von 250      |   "Münzen: 250"            |
| ...  |        Benutzer muss Spiel starten    | Der Benutzer hat 3 Lebenspunkte     |   "Leben: 3"            |
| 14  |        Benutzer muss Spiel starten    | Der Benutzer hat 100 Münzen und gibt ein Vokale ein     |   Vokal wird gekauft, Geldbetrag wird reduziert und Vokal ist beim Wort zu sehen.            |



✍️ Die Nummer hat das Format `N.m`, wobei `N` die Nummer der User Story ist, die der Testfall abdeckt, und `m` von `1` an nach oben gezählt. Beispiel: Der dritte Testfall, der die zweite User Story abdeckt, hat also die Nummer `2.3`.

# 5 Prototyp

![image](https://user-images.githubusercontent.com/69577050/212021681-5fc02cbb-a183-4856-92e9-a9ce384eb721.png)


# 6 Implementation

✍️ Halten Sie fest, wann Sie welche User Story bearbeitet haben

| User Story | Datum | Beschreibung |
| ---------- | ----- | ------------ |
| ...        |       |              |

# 7 Projektdokumentation

| US-№ | Erledigt? | Entsprechende Code-Dateien oder Erklärung |
| ---- | --------- | ----------------------------------------- |
| 1    | ja / nein |                                           |
| ...  |           |                                           |

# 8 Testprotokoll

✍️ Fügen Sie hier den Link zu dem Video ein, welches den Testdurchlauf dokumentiert.

| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1  |       |          |        |
| ...  |       |          |        |

✍️ Vergessen Sie nicht, ein Fazit hinzuzufügen, welches das Test-Ergebnis einordnet.

# 9 `README.md`

✍️ Beschreiben Sie ausführlich in einer README.md, wie Ihre Applikation gestartet und ausgeführt wird. Legen Sie eine geeignete Möglichkeit (Skript, Export, …) bei, Ihre Datenbank wiederherzustellen.

# 10 Allgemeines

- [ ] Ich habe die Rechtschreibung überprüft
- [ ] Ich habe überprüft, dass die Nummerierung von Testfällen und User Stories übereinstimmen
- [ ] Ich habe alle mit ✍️ markierten Teile ersetzt
