# GwiazdkowePrezenty
Christmas project with weird Santas and the delivery of gifts. The Polish language used.

Description in Polish.
Program na podstawie danych o prezentach dopiero co nadesłanych przez elfów z fabryki w Laponii oraz o Mikołajach rozdziela te prezenty, jeden po drugim, poszczególnym Mikołajom. 

Podział odbywa się tak, że  po kolei każdy prezent jest oferowany kolejnym Mikołajom - zaczynając pierwszego po ostatnio pytanym,
aż któryś z nich weźmie ten prezent lub odpytani zostaną wszyscy Mikołajowie. 
W tym drugim przypadku prezent pozostaje w biurze Mikołajów na następną okazję. 

Prezenty charakteryzują atrybuty: wielkość, waga i cena (wszystkie całkowitoliczbowe). 
Mikołajowie są opisani jednoliterowym kodem. maksymalną liczbą prezentów, które mogą wziąć, oraz pojemnością worka na prezenty.

Mikołajowie mają różne charaktery i różną ochotę do roznoszenia prezentów (jak twierdzą złośliwi u niektórych wyraźnie mniejszą od momentu, gdy na skutek skarg od co bardziej hojnie obdarowywanych, zostali pozbawieni służbowych rózg). Oto krótki przegląd najczęściej występujących charakterów Mikołajów (w nawiasach podano kody występujące w pliku z danymi):

Potulny (P): bierze każdy oferowany prezent,
Ostrożny (O): bierze prezenty dopóki ich objętość nie przekracza połowy pojemności worka,
Schorowany (S): bierze coraz lżejsze prezenty, tzn. pierwszy oferowany zawsze, ale kolejne tylko wtedy, gdy są lżejsze od poprzedniego,
Skromny (B): bierze tylko prezenty ze złota (można je poznać po tym, że ich współczynnik cena/wielkość jest większy od 10).
Wybredny (W): bierze tylko te prezenty, które są lekkie (współczynnik wagi do wielkości jest mniejszy od 1),
...
Żaden Mikołaj nie może wziąć więcej sztuk prezentów niż opisuje to jego atrybut, nie może też przekroczyć łącznej objętości worka z prezentami.

Program zwróci zawartość worka dla każdego Mikołaja po przydziale, oraz prezenty które nie trafiły do żadnego worka i muszą poczekać na następny odbiór.
