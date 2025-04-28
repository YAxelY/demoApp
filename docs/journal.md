1. Créer un projet sur start.spring.io

Configuration :

    Project : Maven

    Language : Java

    Spring Boot : 3.2.x

    Group : com.example

    Artifact : demoApp

    Name : demoApp

    Package Name : com.example.demoApp

    Packaging : Jar

    Java : 17 ou 21 (en fonction de ton environnement)

Dependencies :

    Spring Web

    Spring Boot DevTools (optionnel pour le dev local)

    Spring Boot Actuator (utile pour health check si besoin plus tard)

➡️ Clique sur "Generate", récupère l'archive .zip et décompresse.

---
2. Créer un dépôt GitHub

    Vas sur GitHub

    Crée un nouveau repo : demoApp

    Pas besoin d'initialiser avec README, .gitignore ou licence.



    ---
    git checkout -b demo/feature
echo "public String hello() { return \"Hello DevOps!\"; }" >> src/main/java/.../Controller.java
git commit -am "Ajout endpoint hello"
git push origin demo/feature