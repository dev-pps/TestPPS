### Example



1. ### Sprint

A persona 

#### Creare rete

- STORY: User, voglio posizionare la stazione, quindi la stazione è nella mappa
  - SCENARIO: quando posiziono la stazione volgio mettere le caratteristiche della stazione 
    - Given: dato che posiziono la stazione
    - When: quando metto le caratteristiche della stazione
    - Then: imposto quanti binari ha la stazinoe, capienza treni, nome
  - SCENARIO: il posizionamento della stazione è in un punto della mappa
    - Given: dato che posiziono la stazione
    - When: quando finisco di posizionare la stazione
    - Then: la posizione non potra più cambiare

- STORY: User, voglio collegare due/o più stazioni, quindi le rotai sono nella mappa
  - SCENARIO: si creano piu rotai tra due stazioni
    - Given: dato che ci sono due/o più stazioni nella mappa
    - When: quando clicco la statione di partenza e quella di arrivo
    - Then: si crea un binario tra le stazioni
      - SUB-SCENARIO: dato che ho creato il collegmaneto tra due stazioni
        - Given: dato che ho creato il collegamento tra due stazioni
        - When: quando clicco la seconda stazione
        - Then: posso impostare la velocità massima, lunghezza binario, nome binario e portata
      - SUB-SCENARIO: quando riclicco fuori dalla stazione o la stessa stazione ti deseleziona la stazione di partenza
        - Given: dato che ho creato ho cliccato la prima stazione
        - When: quando clicco fuori
        - And: clicco la stessa stazione
        - And: clicco un qualsiasi tasto
        - Then: deseleziono la stazione di partenza
    