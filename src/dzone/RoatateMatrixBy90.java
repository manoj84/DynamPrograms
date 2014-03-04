package dzone;

public class RoatateMatrixBy90 {

    public static void main(String args[]) {

        int[][] data = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(data.length);

        rotate(data, data.length);

    }

    private static void rotate(int[][] data, int n) {

        for (int layer = 0; layer < n / 2; ++layer) {

            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; ++i) {
                int offset = i - first;

                // Save Top
                int top = data[first][i];

                data[first][i] = data[last - offset][first];

                data[last - offset][first] = data[last][last - offset];

                data[last][last - offset] = data[i][last];

                data[i][last] = top;

            }

        }

        System.out.println("Done");

    }

}
