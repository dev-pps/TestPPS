#### First meeting

### git scala cover

### Doc = direttamente su github pages 
- indice iniziale


### Gestione git = main -> feature/fix (tutto code+test+doc)
- pull request per il main
- (fech) git push --force-with-lease per (dire che se forzi un push ti dice se qualcuno a fatto modifiche) 
- squash/amend/rebase quando cambi la storia
- feature/fix: una volta finito eliminta

### CI
- hook: semantica giusta, 
- compile: prima del commit ti formatta il codice wartremover (adattiamo a necessità)
- test: prima del commit o nella CI (tutti i test solo CI)
- buildare gli hook a tutti
- release: quando uccidi il branch feature/fix in (main) fai la release
- 