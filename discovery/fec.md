# Branch protection
to set a rule -> settings -> rules -> ruleset

for now only main branch is protected and:
-it can't be deleted
-requires pr to merge (min approval is now set to 0)
-refuse force push (i think without bypass list this is useless)

create pr from cli using gh cli

gh pr create --base <branch where to merge> --head <branch with modification to merge> --title "..." --body "..."

https://www.wartremover.org/doc/install-setup.html
https://scalameta.org/scalafmt/docs/configuration.html

how to update hooks before compiling? sbt watch sus
