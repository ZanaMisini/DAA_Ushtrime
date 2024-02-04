package algoritmet_polinome_matrica;
import static algoritmet_polinome_matrica.GFG.coppersmithWinograd;

import java.util.Random;

//The code was taken from: https://www.geeksforgeeks.org/implementing-coppersmith-winograd-algorithm-in-java/
//for extra comments and explanation visit the link above

//TODO: time, space complexity, and explain the algorithm coherently


public class CoppersmithWinograd {
    public static void main(String[] zanamaemira){
        int n;
        n = 2;
        double[][] M1 = { { 1, 2 }, { 3, 4 } };
        double[][] M2 = { { 2, 0 }, { 1, 2 } };
        double[][] M3 = { { 4, 4 }, { 10, 8 } };
        if (GFG.coppersmithWinograd(M1, M2, M3, n))
            System.out.println("Resultant matrix is Matching");
        else
            System.out.println("Resultant matrix is not Matching");
    }
}
class GFG {
    public static boolean coppersmithWinograd(double[][] M1,
                                              double[][] M2,
                                              double[][] M3, int n) {
        double[][] a = new double[n][1];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i][0] = rand.nextInt() % 2;
        }

        double[][] M2a = new double[n][1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < n; k++) {
                    M2a[i][j]
                            = M2a[i][j] + M2[i][k] * a[k][j];
                }
            }
        }

        double[][] M3a = new double[n][1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < n; k++) {
                    M3a[i][j]
                            = M3a[i][j] + M3[i][k] * a[k][j];
                }
            }
        }

        double[][] M12a = new double[n][1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < n; k++) {
                    M12a[i][j]
                            = M12a[i][j] + M1[i][k] * M2a[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            M12a[i][0] -= M3a[i][0];
        }
        boolean sameResultantMatrix = true;
        for (int i = 0; i < n; i++) {
            if (M12a[i][0] == 0)
                continue;
            else
                sameResultantMatrix = false;
        }
        return sameResultantMatrix;
    }
}
