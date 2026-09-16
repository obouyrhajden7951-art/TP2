public static void afficherElementsManquants(int[] t) {
    int n = t.length;
    boolean[] vu = new boolean[n + 1]; 

    for (int x : t) {
        if (x >= 1 && x <= n) {
            vu[x] = true;
        }
    }

    boolean aucunManquant = true;
    StringBuilder resultat = new StringBuilder();

    for (int k = 1; k <= n; k++) {
        if (!vu[k]) {
            resultat.append(k).append(" ");
            aucunManquant = false;
        }
    }

    if (aucunManquant) {
        System.out.println("Aucun élément manquant");
    } else {
        System.out.println(resultat.toString().trim());
    }
}

// Test
public static void main(String[] args) {
    afficherElementsManquants(new int[]{1, 3, 3, 5}); 
    afficherElementsManquants(new int[]{1, 2, 3, 4}); 
    afficherElementsManquants(new int[]{3, 3, 3});
    afficherElementsManquants(new int[]{4, 2, 2, 1, 5});
}