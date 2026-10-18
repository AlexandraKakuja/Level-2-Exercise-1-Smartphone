Smartphone

Classes i interfícies

Phone: És la classe pare que conté l'atribut brand i el mètode call() per fer trucades.

Camera: És una interfície que defineix el mètode takePhoto() per fer fotografies.

Clock: És una interfície que defineix el mètode setAlarm() per configurar alarmes.

Smartphone: És una classe que hereta de Phone mitjançant extends i implementa les interfícies Camera i Clock mitjançant implements.

Herència i interfícies

L'herència permet que Smartphone reutilitzi els atributs i mètodes de Phone.

Les interfícies defineixen els mètodes que una classe ha d'implementar. Per això, Smartphone implementa takePhoto() i setAlarm().

Prova del programa

El programa crea un objecte Smartphone i executa els mètodes call(), takePhoto() i setAlarm().