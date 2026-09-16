# TP2 
# Exercice 1 — Sous-suite maximale croissante

<img width="449" height="81" alt="LIS" src="https://github.com/user-attachments/assets/a754ca87-82f7-44f4-b408-724ccb72e151" />

  # Partie 3 – Jeux de tests :
  
  <img width="392" height="139" alt="Capture" src="https://github.com/user-attachments/assets/35fd52f8-9c22-49e6-9433-85835c78f96a" />

  #  Questions de réflexion :
    1. Pour n ≤ 1000, n² fait 1 million d'opérations, ce qui est instantané pour un ordinateur.

    2. Oui, il existe un algorithme en O(n log n) qui utilise une recherche par dichotomie au lieu de comparer avec tous les éléments précédents.

    3. Avec <=, on cherche une sous-séquence non-décroissante au lieu de strictement croissante — les égalités deviennent autorisées. Exemple : {3,3,3,3} donnerait 4 au             lieu de 1.

    4. Pour long/double, il suffit
    de changer le type du tableau. Pour des objets, il faut fournir une méthode de comparaison (comme un Comparator) à la place de <.

# Exercice 2 — Tableau pivot

<img width="405" height="120" alt="Capture" src="https://github.com/user-attachments/assets/1edf6705-d3c1-4fd4-9ddf-fd7880c0eede" />

  # Questions de réflexion :
        1. n² = trop de comparaisons répétées ; O(n) = 3 passages simples, beaucoup plus rapide.

        2. Si le max à gauche est ≤ t[i], alors tous les éléments à gauche le sont aussi.

        3. Si le min à droite est ≥ t[i], alors tous les éléments à droite le sont aussi.

        4. Les égalités ne comptent plus, donc moins (voire aucun) pivot trouvé.

        5. Difficile, car il faut connaître la gauche ET la droite en même temps ; on peut économiser la mémoire mais pas le nombre de passages.

  # Exercice 3 — Matrice spirale :
  
<img width="1096" height="766" alt="image" src="https://github.com/user-attachments/assets/01979c8a-6b9a-4125-96fe-c79a9327e4d5" />

  # Exercice 4 — Recherche d’un rectangle de 1 dans une matrice binaire :

<img width="1017" height="270" alt="image" src="https://github.com/user-attachments/assets/1bf20359-b356-4db1-8b64-ccc64dfe976b" />

  # Exercice 5 — Permutation circulaire :

<img width="1104" height="466" alt="image" src="https://github.com/user-attachments/assets/906401c8-28db-4857-a930-ee69cb7d6af0" />

  # Questions de réflexion :

      1. Permutation = juste tous les nombres présents, pas forcément dans l'ordre circulaire.

      2. Ça donne le point de départ, plus besoin de tester plusieurs rotations.

      3. Changer la valeur de départ et le pas (+10 au lieu de +1).

      4. Oui, en vérifiant tout en même temps dans la boucle circulaire.

  # Exercice 6 — Sous-tableau de somme maximale (Kadane) :
  
  <img width="1142" height="398" alt="image" src="https://github.com/user-attachments/assets/a3d612fe-d744-4f7a-acc0-8dba0ad083d2" />
  
  # Questions de réflexion :
  
      1. Le naïf refait les calculs plusieurs fois avec des boucles imbriquées. Kadane fait tout en une seule passe.

      2. Quand currentSum devient négatif, ça vaut mieux repartir de zéro.

      3. maxSum sera le nombre le moins négatif. On initialise à t[0] sinon on pourrait rater ce cas et donner un mauvais résultat.

      4. Il faut compter la longueur de la suite actuelle et ne garder le résultat que si elle est assez longue.

# Exercice 7 — Fréquence majoritaire (majorité absolue):
  
  


  
    
