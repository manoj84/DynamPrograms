package dzone;

public class SetColumnAndRowToZero {

    public static void main(String args[]) {

        int[][] data = { { 1, 2, 0, 4 }, { 5, 6, 7, 8 }, { 9, 0, 11, 12 },
                { 13, 14, 15, 16, 17 } };

        set(data);

    }

    private static void set(int[][] data) {
        boolean[] rows = new boolean[data.length];
        boolean[] columns = new boolean[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    // Call to make the entire column zero
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        // Once done, traverse the two arrays to setZeros
        makeZeros(rows, columns, data);

    }

    private static void makeZeros(boolean[] rows, boolean[] columns,
            int[][] data) {

        // Set all rows to zero
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == true) {
                for (int row = 0; row < data[i].length; row++) {
                    data[i][row] = 0;
                }
            }
        }

        // Set all Columns to Zero
        for (int j = 0; j < columns.length; j++) {
            if (columns[j] == true) {
                for (int column = 0; column < data.length; column++) {
                    data[column][j] = 0;
                }
            }
        }

        System.out.println("done");

    }

}
