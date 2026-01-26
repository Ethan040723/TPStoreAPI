# TPStoreAPI
## Contexte
Cette API à été créer lors d'un TP durant un cours de Java. Nous devions créer une API pouvant envoyer la liste de tout les articles, renvoyer un article précis, modifier pu créer un article et supprimer un article. Également on devais mettre en place un code et un message traduit lors de l'envoyes des données. Pour finir nous avons du ajouter swagger pour une meilleur visualisation des methods.

## Architecture du projet
```
|
|----> Bo =  contient classe Article et la classe de la reponse avec code et message
|
|----> Dao = contient Article repository
|
|----> Local = contient la configuration local 
|
|----> Rest = contient le controller et le service Article
```

## Configuration avant lancement

Avant de lancer l'API vous devez créer une base de données sur mariaDB (ou mysql mais pour cela il faudra modifier quelque paramètre dans application properties). 

Par la suite il faudra modifier l'url et le name ainsi que le passeword dans application propreties pour correspondre a l'url et l'utilisateur de votre data base.

Après cela vous devez décommenter le texte commenter afin qu'il créer les tables. Après le premier lancemant il faudrat le recommenter pour ne pas supprimer toutes vos données. 

Ajouter des données a vos tables.

## Lancement de l'API 

pour lancer l'API utiliser cette commande : 

```
gradlew bootRun
```
 si vous utiliser un IDE lancer l'API depuis celui-ci 

 Vous aurez acces à L'API depuis cette url :

```
http://localhost:8080
```

Pour connaitre la struturation des méthods et leur données après avoir lancer l'API aller sur :

```
http://localhost:8080/swagger-ui/index.html
```

