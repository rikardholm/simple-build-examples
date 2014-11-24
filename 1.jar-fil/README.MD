Kompilera:
javac -d compiled/ -sourcepath src/java src/java/x/mypackage/*.java

För att packa ihop jar-fil:

prompt$ jar cvfm release.jar MANIFEST.MF-extra -C compiled .
tillagt manifestfil
lägger till: x/(in = 0) (ut = 0)(0% lagrat)
lägger till: x/mypackage/(in = 0) (ut = 0)(0% lagrat)
lägger till: x/mypackage/api/(in = 0) (ut = 0)(0% lagrat)
lägger till: x/mypackage/api/GreeterService.class(in = 167) (ut = 138)(17% packat)
lägger till: x/mypackage/GrumpyApp.class(in = 561) (ut = 361)(35% packat)
lägger till: x/mypackage/HappyApp.class(in = 558) (ut = 363)(34% packat)
lägger till: x/mypackage/impl/(in = 0) (ut = 0)(0% lagrat)
lägger till: x/mypackage/impl/GrumpyService.class(in = 344) (ut = 245)(28% packat)
lägger till: x/mypackage/impl/HappyService.class(in = 340) (ut = 245)(27% packat)

För att exekvera:
prompt$ java -jar release.jar
Buuuu...
prompt$ java -cp release.jar x.mypackage.HappyApp
Hello!