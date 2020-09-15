# Java-microservices

Projekt testowy Księgarnia

Wpisując localhost:8080/katalog/userID otrzymamy listę "książek" wyporzyczonych przez usera wraz z jego oceną.
Funkcjonuje przez wykorzystanie EurekaServer i do komunikacj między mikroserwisami wykorzystuje REST.

Użytkownik komunikuje się wyłącznie z serwisem KatalogKsiążkiService wpisując swoje userID, po czym przez eureka serwer ten mikroserwis komunikuje się z serwisami Oceny_ksiazki_service i Informacje_ksiazki_service z których to otrzymuje on odpowiednio informacje  o ocenie użytkownika i o informacjach na temat tej książki (tytuł). Zwraca to wszystko z powrotem do użytkownika w postaci listy








Kolejne mikroserwisy są na osobnych gałęziach, nie jest to najbardziej poprawne ale zaoszczędzą to szukania i nadal umożliwia wersjonowanie poszczególnych miroserwisów.
