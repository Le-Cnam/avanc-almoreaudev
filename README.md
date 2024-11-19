On vous demande de réaliser une application de **Carnet de vol** pour permettre a un pilote privé de conserver un historique de ses vols et de réaliser un suivi financier pour la location de ses avions.



Le pilote loue des avions. Chaque **Avion** est caractérisé par :

- Une immatriculation (peut contenir des lettres et des tirés, ex: F-BUBK)
- Un **coût horaire** 



Le pilote peut réaliser des **Vols comme "commandant de bord" (il pilote seul)** ou des **Vols en "double commandes" (avec instructeur)**. Ces vols sont tous les deux caractérisés par :  

- une **date**
- une **durée** (en minute) 
- un **avion **sur lequel est réalisé le vol

Un vol en **double commande** a en plus :

- Un pourcentage de majoration à appliquer sur le coût d'une location  qui est une constante de 15% et correspond à l'indemnité supplémentaire pour l'instructeur.



Dans un **Carnet de vol**, on doit pouvoir :

- Ajouter un **vol comme commandant de bord** ou un **vol en double commande**
- Afficher la liste des **vols** comme par exemple :
  - date : 10/11/2018 | durée : 30 min | Commandant de bord| F-BUBK | 50.0 €
  - date : 11/11/2018 | durée : 60 min | Double commande | F-BUBK | 115.0 €
- Afficher le temps de vol total 
  - des **vols comme commandant de bord**
  - des vols en **double commande**
- Afficher le coût total de ses vols



#### Ecrire sur ordinateur votre proposition de programme pour répondre à ces spécifications

L'exercice est à réaliser sur PC. Vous devez utiliser GIT pour récupérer un projet vide et pour envoyer votre travail final. Une sauvegarde pourra être réalisée sur clé USB.

Pour récupérer le projet et l'ouvrir correctement dans intelliJ, veuillez réaliser les opérations suivantes :

**sur intellij**

```
- Cliquer sur File > New > Project from Exiting Sources (ou *Import Project* si vous êtes sur l'écran d'accueil)
- Sélectionner le dossier du projet sur votre disque
- Sélectionner Create project from existing sources
- Conserver les informations (Nom, Location, Format)
- IntelliJ détecte que c'est un projet Java
- Aucune bibliothèque n'est integrée au projet : c'est normal
- IntelliJ créé un modules
- Choisir JDK
- Aucun Framework n'est detecté : c'est normal
- Aller dans File > Project Structure et Choisir "13" dans Project language level
```

A la fin, n'oublier pas d'envoyer votre travail grâce à **git bash** en utilisant la commande suivante qui envoie toutes les branches :

```
$ git push origin --all
```

Dans la classe **Utils**, vous trouverez des méthodes statiques qui peuvent vous aider.

Le code suivant une fois complété doit pouvoir s'exécuter : 

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Avion cessna150 = new Avion("F-BUBK", 100);
        Avion dr400 = new Avion("F-GKQA", 130);
        CarnetDeVol carnet = new CarnetDeVol();
        // Ajouter un vol de jour sur F-BUBK de 60 minutes comme Commandant de Bord
        // Ajouter un vol de jour sur F-GKQA de 180 minutes en Double commandes
        // Ajouter un vol de nuit sur F-BUBK de 30 minutes comme Commandant de Bord
  		// Afficher la liste total des vols         
        // Afficher le temps de vol total (CB et DC)       
        // Afficher le cout total des vols
    }
}
```

et afficher le résultat suivant :

```bash
date 10/11/2018 | durée : 60 min | Commandant de Bord | F-BUBK | 100.0 €
date 11/11/2018 | durée : 180 min | Double commande | F-GKQA | 448.5 €
date 12/11/2018 | durée : 30 min | Commandant de Bord | F-BUBK | 50.0 €
-------------------------------
Temps de vol comme commandant de Bord : 90 minutes
Temps de vol en double commandes : 180 minutes
Coût 598.5 €
```