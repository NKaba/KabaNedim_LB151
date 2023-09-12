# Projekt-Dokumentation --> Glücksrad Spiel

Kaba

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
|  12.01.2023	     | 0.0.1   | Projekt beschrieben, Technologie und Datenbank ausgewählt. USer Stories erstellt und zu den User Stories Testfälle erstellt. GUI-Prototypen erstellt. |
| 08.02.2023	    | 0.0.2   |  Projekt erstellt, Beanklasse erstellt und mit Programmieren begonnen                         |
|  15.02.2023     | 0.0.3   |  Funktion des Spiels funktioniert halbwegs,  Franken (Geld) wird angezeigt, anzahl Leben ist zu sehen und Random "Wort" wird generiet, welches erraten werden kann. Login für Administrationsbereich                                                         |
| 22.02.2023      | 0.0.4   |  Starseite erstellt, Design für alle Seiten gemacht                                            |
| 23.02.2023      | 0.0.5   |  LoginFilter erstellt, SessionID wird beim Ausloggen gelöscht und zu Login.xhtml geleitet.                                |
| 27.02.2023      | 1.0.0   |  Spiel verbessert, zwei Buchstaben werden angezeigt, Geldbetrag wird bei richtigem erraten nicht mehr zurückgesetzt, Name und Franken werden in der Highscoreliste ausgegeben.                                                            |

# 0 Ihr Projekt

Ich werde eine Glücksrad-Applikation erstellen, bei der der Benutzer Wörter oder Redewendungen in einem Gitter erraten muss. Bevor ich mit dem Rätseln beginne, wird mir eine Kategorie genannt. Um Geldbeträge zu erspielen, drehe der Benutzer am Glücksrad und erratet das jeweilige Wort. In der Applikation wird das Glücksrad durch eine Text-Ausgabe simuliert.

# 1 Analyse


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



| US-№ | Verbindlichkeit | Typ  | Beschreibung                       |
| ---- | --------------- | ---- | ---------------------------------- |
| 1  | Muss                | Funktional     | Als ein Administrator möchte ich mich mit Email und Passwort anmelden, damit ich Zugriff auf die Administrationsoberfläche habe.|
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
| 14   | Muss                | Funktional     | Als ein Benutzer möchte ich Vokale kaufen können, damit ich das Wort einfacher erraten kann (Vokale kann man nicht eingeben ohne sie zu kaufen) |
| 15   |   Muss              |Funktional      | Als ein Entwickler möchte ich eine Startseite erstellen, damit der Benutzer eine gute Übersicht über die Applikation hat und frei auswählen kann was er tun möchte. (Erweiterung)|


# 4.2 Testfälle

| TC-№ | Vorbereitung | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  |        Admin Startet Spiel    |  Admin gibt Benutzername und Passwort ein |  Erfolgreiche Anmeldung und Zugriff auf die Administrationsoberfläche     |
| 3.2 |   Benutzer muss Spiel starten           | Neue Kategorie wird erstellt      |   Erfolgreiche Erstellung der Kategorie                 |
| 4.3  |      Benutzer muss Spiel starten       |  Highscore Eintrag mit dem Namen "xxx" zum Entfernen       |     Erfolgreiche Entfernung des Eintrags mit dem Namen "xxx" aus der Highscore-Liste.      |
| 5.4 |       Benutzer muss Spiel starten       | Spiel starten, name eingeben          |  Spiel wird gestartet und Anzeige der Lebenspunkte  "  "      |
| 8.5  |        Benutzer muss Spiel starten     | Eine Antwort mit richtig oder falsch beantworten        |  Ergebnis von gewählter Antwort wird angezeigt, indem bei Falscher Antwort Lebenspunkt abgezogen wird und bei richtige Antwort +50 Franken dazu kommen.            |
| 6.6 |        Benutzer muss Spiel starten      | Der Benutzer hat einen Kontostand von 250      |   "Münzen: 250"            |
| 7.7  |        Benutzer muss Spiel starten    | Der Benutzer hat 3 Lebenspunkte     |   "Leben: 3"            |
| 13.8  |        Admin muss Spiel starten    | Admin meldet sich ab, nachdem er sich angemeldet hat. Admin gibt bei URL folgendes ein: http://localhost:8080/KabaNedim_LB151/faces/adminuebersicht.xhtml     |   Admin wird auf der Login Seite weitergeleitet und nicht auf der Adminuebersicht.xhtml Seite.             |
| 14.9  |        Benutzer muss Spiel starten    | Der Benutzer hat 100 Münzen und gibt ein Vokale ein     |   Vokal wird gekauft, Geldbetrag wird reduziert und Vokal ist beim Wort zu sehen.            |
| 15.10  |        Benutzer muss Spiel starten    | Der Benutzer hat Spiel gestartet    |  Startseite wird geöffnet, mit 3 Buttons (Spiel, Adminübersicht und Highscore)       |



# 5 Prototyp

![image](https://user-images.githubusercontent.com/69577050/212021681-5fc02cbb-a183-4856-92e9-a9ce384eb721.png)


# 6 Implementation


| User Story | Datum | Beschreibung |
| ---------- | ----- | ------------ |
| 1       |  15.02.2023     |   Login für Administration (Email und Passwort), Passwortabfrage.           |
| 3       | 15.02.2023      |   Kategorien als Admin erstellen           |
| 5       | 15.02.2023      |    Name wird eingegeben (NameEingeben.xhtml) und wird in der Highscore-Liste mit Geldbetrag ausgegeben.           |
| 6       | 15.02.2023      |   Benutzer kann beim Spielen Kontostand zu jeder Zeit sehen.            |
| 7       |  15.02.2023     |    Benutzer kann beim Spielen Lebenspunkte zu jeder Zeit sehen.           |
| 15       |22.02.2023       |    Startseite erstellen, mit 3 Buttons (Spielen, Adminübersicht und Highscoreliste).          |
| 13        | 23.02.2023      |    Admin meldet sich ab, nachdem er sich angemeldet hat, Admin wird auf der Login Seite weitergeleitet und nicht auf der Adminuebersicht.xhtml Seite, egal was er macht, er wird zuerst nach Passwort und Email befragt. (Sicherheitsaspekte)         |
| 4       |  23.02.2023     |   Admin kann Highscore Eintrag mit dem Namen "xxx" zum Entfernen      |
| 8        | 27.02.2023      |   Ergebnis von gewählter Antwort wird angezeigt, indem bei Falscher Antwort Lebenspunkt abgezogen wird und bei richtige Antwort +50 Franken dazu kommen.           |
| 14       | 27.02.2023      |  Benutzer kann für 100 Franken Vokal kaufen, Vokale können nicht eingegeben werden, ohne das sie gekauft werden.            |


# 7 Projektdokumentation

| US-№ | Erledigt? | Entsprechende Code-Dateien oder Erklärung |
| ---- | --------- | ----------------------------------------- |
| 1    | ja |    login.java & login.xhtml                                       |
| 3  |     Nein|           Nicht geschafft                                |
| 4  |     Nein|           Nicht geschafft                                |
| 5  |  ja         |       NameEingeben.xhtml & highscoreliste.xhtml                                    |
| 6  |    ja       |        Game.java & Spiel.xhtml                                   |
| 7  |     ja      |      Game.java & Spiel.xhtml                                           |
| 15  |      ja     |         Startseite.xhtml                                  |
| 13  |     ja      |        loginFilter.java & login.xhtml                                 |
| 8  |       ja    |           Game.java & Spiel.xhtml                                |
| 14  |     ja      |                  Game.java & Spiel.xhtml                           |

# 8 Testprotokoll



https://user-images.githubusercontent.com/69577050/222453662-139fc6cb-cf74-44a7-acd7-134e548c0f7f.mp4



| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1.1  |01.03.2023       |   OK       |  Nedim Kaba      |
| 3.2.2 | 01.03.2023      |  NOK        |  Nedim Kaba      |
| 4.3.3| 01.03.2023      |  NOK        |   Nedim Kaba     |
| 5.4.4  |  01.03.2023     |     OK     | Nedim Kaba       |
| 8.5.5 |   01.03.2023    |        OK  |  Nedim Kaba      |
| 6.6.6  |  01.03.2023     |         OK | Nedim Kaba       |
| 7.7.7  |  01.03.2023     |      OK    | Nedim Kaba       |
| 13.8.8 |  01.03.2023     |        OK  | Nedim Kaba       |
| 14.9.9  |  01.03.2023     |         OK | Nedim Kaba       |
| 15.10.10  | 01.03.2023      |         OK | Nedim Kaba       |

Alle Testfälle konnten erfolgreich durchgeführt werden, bis auf Nr. 3 und Nr. 4. Admin kann keine Kategorien erstellen und auch nicht den Name aus der Highscoreliste entfernen. 

# 9 `README.md`

