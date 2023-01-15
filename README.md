# PI-ProjektniZadatak

SOLID objašnjenje

Single Responsibility Principle:
Svaka klasa u ovom kodu ima jedinstvenu odgovornost. Klasa TicketPrices sadrži konstante za cijene karata, klasa EmployeePayRates drži konstante za stope 
plaća zaposlenika, klasa Vlak predstavlja vlak i sadrži njegov kapacitet i popis vozila, klasa Vozilo predstavlja vozilo i sadrži njegovu veličinu, vrstu, 
razinu goriva, i razinu baterije, klasa Zaposlenik predstavlja zaposlenika i sadrži njegovo ime i zaradu, a klasa Terminal predstavlja terminal i sadrži 
male i velike vlakove, popis zaposlenika i ukupni prihod.

Open-Closed Principle:
Klasa terminala je otvorena za proširenje, ali zatvorena za modifikaciju. Na primjer, novi tipovi vozila ili stope plaća zaposlenika mogu se dodati stvaranjem 
novih konstanti u klasama TicketPrices i EmployeePayRates, ali klasa Terminal ne mora biti modificirana za rukovanje ovim dodacima.

Liskov Substitution Principle:
Klasa Vozilo je podtip klase Vlak i može se koristiti u bilo kojem kontekstu gdje se očekuje objekt Vlak. Svi objekti vozila imaju potrebna svojstva i ponašanja 
da se koriste kao objekti vlaka.

Interface Segregation Principle:
Klasa Train ima samo metode koje su relevantne za njezine odgovornosti. Ima addVehicle i removeVehicle metode za dodavanje i uklanjanje vozila, ali nema nikakve
metode za dopunjavanje plina ili punjenje baterija, jer tim odgovornostima upravlja klasa vozila.

Dependency Inversion Principle:
Terminal ovisi o apstrakcijama (klase Train i Employee) prije nego o konkretnim implementacijama. To omogućuje promjenu implementacije klasa Train i Employee bez
utjecaja na klasu Terminal.
