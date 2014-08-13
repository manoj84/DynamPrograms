package dzone;

import java.util.LinkedList;

public class RotateMatrix90 {

    public static void main(String args[]) {

        int[][] data = new int[3][3];
        data[0][0] = 0;
        data[0][1] = 1;
        data[0][2] = 2;
        data[1][0] = 3;
        data[1][1] = 4;
        data[1][2] = 5;
        data[2][0] = 6;
        data[2][1] = 7;
        data[2][2] = 8;

        RotateMatrix90 testBy90 = new RotateMatrix90();
        System.out.print("Before Rotation");
        testBy90.print(data);
        System.out.print("\n" + "After Rotation" + "\n");
        testBy90.rotateData(data);

    }

    public void rotateData(int[][] data) {

        java.util.Queue<Integer> swap = new LinkedList<Integer>();
        for (int i = 0; i < data.length; i++) {
            swap.add(data[0][i]);
        }

        for (int i = 0; i < data.length / 2; i++) {

            // First Rotate
            for (int j = 0; j < data.length; j++) {
                int temp = data[j][data.length - 1 - i];
                data[j][data.length - 1 - i] = swap.poll();
                swap.add(temp);
            }

            // System.out.println("\n" + " Swap is " + swap + "\n");
            swap.poll();
            // Second Rotate
            for (int r = data.length - 1; r > 0; r--) {

                int temp2 = data[data.length - 1 - i][r - 1];
                data[data.length - 1 - i][r - 1] = swap.poll();
                swap.add(temp2);
            }

            // Third rotate
            for (int p = data.length - 1; p > 0; p--) {
                int temp3 = data[p - 1][i];
                data[p - 1][i] = swap.poll();
                swap.add(temp3);
            }

            // Fourth Rotate
            for (int k = 0; k < data.length - 1; k++) {
                data[k][i + 1] = swap.poll();
            }

        }

        print(data);

    }

    public void print(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < data.length; j++) {
                System.out.print(" " + data[i][j]);
            }
        }
    }
}
