public class MaxRectangle {
    static class Rectangle {
        int top, left, bottom, right, area;
    }

    public static int[][] construireHauteurs(int[][] m) {
        int R = m.length;
        int C = m[0].length;
        int[][] h = new int[R][C];

        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                if (m[i][j] == 0) {
                    h[i][j] = 0;
                } else if (i == 0) {
                    h[i][j] = 1;
                } else {
                    h[i][j] = h[i - 1][j] + 1;
                }
            }
        }
        return h;
    }

    public static Rectangle maxRectangleHistogramme(int[] hauteurs, int ligne) {
        int C = hauteurs.length;
        int[] pile = new int[C + 1];
        int sommet = -1;

        Rectangle meilleur = new Rectangle();
        meilleur.area = 0;

        for (int j = 0; j <= C; j++) {
            int hCourant = (j == C) ? 0 : hauteurs[j];

            while (sommet != -1 && hauteurs[pile[sommet]] >= hCourant) {
                int hauteurBarre = hauteurs[pile[sommet]];
                sommet--;
                int gauche = (sommet == -1) ? 0 : pile[sommet] + 1;
                int largeur = j - gauche;
                int aire = hauteurBarre * largeur;

                if (aire > meilleur.area) {
                    meilleur.area = aire;
                    meilleur.left = gauche;
                    meilleur.right = j - 1;
                    meilleur.bottom = ligne;
                    meilleur.top = ligne - hauteurBarre + 1;
                }
            }
            sommet++;
            pile[sommet] = j;
        }
        return meilleur;
    }

    public static Rectangle trouverMaxRectangle(int[][] m) {
        int[][] h = construireHauteurs(m);
        int R = h.length;

        Rectangle meilleurGlobal = new Rectangle();
        meilleurGlobal.area = 0;

        for (int i = 0; i < R; i++) {
            Rectangle candidat = maxRectangleHistogramme(h[i], i);
            if (candidat.area > meilleurGlobal.area) {
                meilleurGlobal = candidat;
            }
        }

        return meilleurGlobal;
    }

    public static void main(String[] args) {
        int[][] m = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 0, 1}
        };

        Rectangle r = trouverMaxRectangle(m);
        System.out.println("Aire maximale : " + r.area);
        System.out.println("Coordonnées : top=" + r.top + ", left=" + r.left
                + ", bottom=" + r.bottom + ", right=" + r.right);
    }
}