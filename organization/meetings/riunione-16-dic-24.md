# Riunione del 16 dicembre 24
**Inizio:** 17:40
**Fine:** 18:40

## Idea - Cosa ha capito Teo
Simulatore di una rete ferroviaria in cui, una volta definita l'infrastruttura (stazioni, binari, scambi, semafori e eventuali altri elementi) e i treni (definendo le loro caratteristiche come: numero vagoni, tratta che deve fare, ecc.), è possibile avviare la simulazione.

## Topic Affrontati
- punto della situaizone individuale sulle conoscenze degli strumenti (git, github, ...) e metodologie conosciute o da imparare

### Gestion git VCS
- branch principale `main` in cui pushare codcie funzionante
- branch develop
  - ogni feature ha il suo branch
  - concluso lo sviluppo viene fatto mrge su branch `main` quindi viene eliminato
  - la *doc* di una feature viene sviluppata nello stesso branch della feature
- controllare gli hooks che sbt li sposta e non rimangono tracciati
- questione quali test runnare prima del commit 
  - in CI tutti i test (di tutto l'applicativo)
  - in locale sarebbe (*da fare*) solo i test delle cose aggiunte in quel commit (esclusa l'opzione di fare tutti i test prima che venga pushato in remoto)
- ogni push sul branch `main` genera la release (eseguibile e doc nella sezione *Release* del repo github)

## Questioni aperte
- Dominio
- A cosa serve questa simulazione, a quale esigenza/e cerca di rispondere. Cosa da all'utente finale, è fine a se stessa la simulazione (:warning:**VIROLI è stato molto critico con un progetto di simulazione covid per questo**:warning:)?
- Cucumber: si/no/proviamo
- Tutto cio che riguarda scrum
- prolog eventuale cosa:
   rete con treni con scheduler definito (orari-)
   colli di bottiglia (es. da 4 binari a solo 2)
   **con prolog fai valutazioni sullo scheduling del treno**
- altro che non ricordo