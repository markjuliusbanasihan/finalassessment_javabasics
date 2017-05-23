package Assessment_7;

/**
 * Created by MXB2320 on 5/22/2017.
 */
public class DoubleArray {
    public static void main(String[] args) {
        double[][] a = {

                {99.0, 85.0, 98.0, 0.0},
                {98.0, 57.0, 79.0, 0.0},
                {92.0, 77.0, 74.0, 0.0},
                {94.0, 62.0, 81.0, 0.0},
                {99.0, 94.0, 92.0, 0.0}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}



