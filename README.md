# TP 5 : Intégration de Spring et Hibernate


##  Description

Ce projet pratique a pour objectif d'intégrer Spring Framework avec Hibernate pour la gestion de la persistance des données tandis qu il couvre la configuration d'un projet Maven ainsi que la mise en place d'une architecture DAO (Data Access Object) et l'intégration avec une base de données MySQL.

##  Objectifs 

-  Comprendre les bases de la gestion des dépendances avec **Maven**
-  Configurer **Spring** pour gérer l'injection de dépendances et les transactions
-  Intégrer **Hibernate** pour la gestion des entités persistantes
- Créer un **DAO** pour gérer les opérations CRUD
-  Configurer une base de données **MySQL** pour l'interaction avec les entités

##  Étapes du Projet

### Étape 1 — Initialisation du projet Maven
Configuration du fichier `pom.xml` avec les dépendances nécessaires (Spring, Hibernate, MySQL Connector).

### Étape 2 — Configuration de la base de données
Création de la base de données MySQL et configuration des paramètres de connexion.

### Étape 3 — Création de l'entité Product
Développement de la classe d'entité `Product` avec les annotations JPA/Hibernate.

### Étape 4 — Création de l'interface DAO
Définition de l'interface `ProductDao` pour les opérations CRUD.

### Étape 5 — Implémentation du DAO ProductDaoImpl
Implémentation concrète du DAO avec injection de dépendances Spring.

### Étape 6 — Configuration de Spring et Hibernate
Configuration des fichiers de configuration Spring (XML ou Java Config) et Hibernate.

### Étape 7 — Vérification de la configuration
Tests de l'application pour valider le bon fonctionnement de l'intégration.

##  Prérequis

- Java JDK 11 ou supérieur
- Maven 3.6+
- MySQL 8.0+
- IntelliJ IDEA
<img width="883" height="238" alt="Screenshot 2026-03-10 155313" src="https://github.com/user-attachments/assets/7275880b-8774-452b-97a3-c36850812756" />
<img width="918" height="234" alt="Screenshot 2026-03-10 155259" src="https://github.com/user-attachments/assets/ca26946e-5d22-4168-ba71-76110b681ea8" />
<img width="1800" height="769" alt="Screenshot 2026-03-10 111935" src="https://github.com/user-attachments/assets/324db3da-55eb-45b2-88a3-ba7d447ef778" />
<img width="1750" height="703" alt="Screenshot 2026-03-10 112000" src="https://github.com/user-attachments/assets/68f2d8fb-d392-458c-9741-e10696c05095" />
