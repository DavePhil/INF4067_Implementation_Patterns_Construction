# INF4067_Implementation_Patterns_Construction
Implémentation des modèles de constructions (Design patterns) en Java

## A savoir: 
Tous nos devoirs sont stockés sur le repository : https://github.com/DavePhil/INF4067_Implementation_Patterns_Construction.
Pour les fichiers et les branches sous la forme **_1, ils présentent la première version des implémentations et ceux 
sous la fome **_2 la seconde version. Chaque commit a une description(cliquer les 3 petits points pour 
la lire).

Dans le dossier models, on aura un fichier pdf contenant tous les modèles UML pour chaque
version d'implémentation

Chaque branche représente une version d'implémentation et un module, l'exécution se fait simplement en télechargeant 
le module sur la branche et en exécutant le main correspondant.(Les tests seront néanmoins décrits pour chaque version plus bas).

## Introduction
Dans le cadre de l'unité d'enseignement INF4067 intitulé : UML et Design Patterns, il nous a été 
demandé dans cette première partie du cours d'implémenter des modèles de construction. Travail étant fait, 
il sera question pour nous ici de présenter un résumé.

### Pattern Factory
Il s'agit d'un patron de construction qui permet de créer les objets dont le type dépend du contexte.
Il est généralement utilisable lorsque le client ne peut pas déterminer au préablable quel type d'objet il doit créer, 
il ne peut ainsi déterminer ce type qu'à l'exécution. Aussi, il est utilisé lorsque à l’exécution, il est nécessaire de déterminer
dynamiquement quel objet d’un ensemble de sous-classes doit être instancié.

Pour implémenter ce modèle deux méthodes sont possibles : 

#### L'utilisation d'une methode de fabrique(abstract factory)
Dans ce cas, nous avons une fabrique concrète qui aura une méthode de fabrication de l'objet 
à l'intérieur de laquelle on fait un switch case ou alors des if pour connaitre quel objet il faut
créer. Nous avons une classe produit abstraite qui est la classe dont les sous-classes concrètes 
seront instanciées.
L'implémentation se trouve sur la branche factory_method_1 pour la première version et 
factory_method_2 pour la seconde version. Dans la première version, nous utilisons 2 produits et dans 
la seconde, nous utilisons 3. 
#### L'utilisation d'une classe abstraite de fabrique(factory)
Dans ce cas, nous avons une fabrique abstraite qui contient les signatures de la méthode de fabrication
et des fabriques concrètes qui implémente la fabrication pour chaque type d'objets. Aussi.
Nous avons une classe produit abstraite qui est la classe dont les sous-classes produits concrets
seront instanciées.
L'implémentation se trouve sur la branche factory_1 pour la première version et
factory_2 pour la seconde version. Dans la première version, nous utilisons 2 produits et dans
la seconde, nous utilisons 3.

## Abstract factory
Elle permet de créer des objets regroupés en famille sans avoir à connaitre leurs classes concrètes.
On l'utilise lorsque le système est indépendant de la création des objets qu'il utilise ou alors 
lorsque le système est capable de créer des objets d'une même famille.

Pour l'implémenter nous avons une fabrique abstraite ayant les signatures des méthodes de fabrication.
Des fabriques concrètes chacune étant dédiée à la fabrication d'une seule famille de produits.
Des classes abstraites de produits représentant le type d'objet à créer.
Des classes concrètes représentant des familles de produits qui héritent des types de produits.

L'implémentation se trouve sur les branches abstract_factory_1 et abstract_factory_2 pour les 2 versions.
La première version concerne 2 familles de produits et la seconde 3 familles.
Pour les tests, il sera question de tout simplement télécharger chaque branche et la tester
en exécutant sa classe main.


## Singleton 
Le modèle singleton nous permet de garantir qu'une classe ne possède qu'une seule instance et
de fournir un accès global à celui-ci. On l'implémente en créant une classe contenant une méthode 
qui crée une instance uniquement s'il n'en existe pas encore. Ici, le constructeur de la classe
est privé pour s'assurer qu'une instance de la classe ne sera créée que par le contrôle de la méthode
de création qui est dans la classe.

L'implémentation se trouve sur les branches singleton_1 et singleton_2 pour les versions.
La première version représente une classe Arithmétique qui est notre singleton avec deux attributs
x, et y. Nous devions construire deux constructeurs un sans paramètre et un second avec paramètre,
aussi, écrire les méthodes getInstance fonction des constructeurs et quelque méthodes comme moyenne, etc.
Dans la deuxième version, il fallait rajouter un troisième attribut name, et un nouveau constructeur, 
cette fois-ci à 3 paramètres. Écrire les méthodes getInstance fonction des constructeurs et ajouter
des fonctions comme soustraction, etc.

Pour les tests, il suffira de télécharger le module sur sa branche et d'exécuter le main. 


