public class ElementMajoritaire {

    public static int elementMajoritaire(int[] t) {
        int n = t.length;

        if (n == 0) {
            return -1;
        }

        int candidat = 0;
        int compteur = 0;

        for (int x : t) {
            if (compteur == 0) {
                candidat = x;
                compteur = 1;
            } else if (x == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }

        int occurrences = 0;
        for (int x : t) {
            if (x == candidat) {
                occurrences++;
            }
        }

        if (occurrences > n / 2) {
            return candidat;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[][] tests = {
            {3, 3, 4, 3, 5},
            {2, 2, 1, 2, 3, 2, 2},
            {1, 1, 1, 1},
            {7},
            {1, 2, 3, 4},
            {1, 2, 2, 3},
            {1, 1, 2, 2},
            {-1, -1, -1, 2, 3},
            {-2, -2, -2, -2, 1, 3}
        };

        for (int[] t : tests) {
            System.out.print("t = ");
            for (int x : t) {
                System.out.print(x + " ");
            }
            System.out.println("-> " + elementMajoritaire(t));
        }
    }
}