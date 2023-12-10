# HW10
Simpler REST-Service in Java + Spring Boot, um die Nutzung von Docker zu demonstrieren

## Inhalt
Das Repository nutzt **Spring Boot**, um mit minimalstem Aufwand einen primitiven REST-Service aufzusetzen, sowie
**Lombok**, um Getter- & Setter-Methoden automatisch zu generieren.

Die Anwendung stellt ein Repository von Objekten als HATEOAS-Hypermedia unter `localhost:8080` bereit: Wird diese Seite
z.B. mit Firefox aufgerufen, sollte das Ergebnis ein JSON-Baum mit Links zu anderen Orten in der Anwendung sein.

Die Objekte, die in dieser App verwaltet werden, sind `UserProfile`s. Zu finden unter `localhost:8080/users`,
sind in der Datenbank beispielhaft einige Nutzer bereits enthalten. Mit REST-Methoden können natürlich auch
Änderungen vorgenommen werden. Der Zweck dieses Codes ist es, dass der im nächsten Schritt anzulegende Docker-Container auch etwas interessantes tut.


