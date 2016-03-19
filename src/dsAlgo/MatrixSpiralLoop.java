/**
 * Created by manoj on 3/18/16.
 */
public class MatrixSpiralLoop {

    public static void main (String args[]) {
        int[][] data = {{1,2,3,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        MatrixSpiralLoop matrixSpiralLoop = new MatrixSpiralLoop();
        matrixSpiralLoop.compute(data);
    }

    private void compute(int[][] data) {
        int depth = data.length/2;

        for(int i=0; i<depth; i++) {
            int vertical = data.length -i -1;

            //Top
            for(int top =i; top<=vertical; top++) {
                System.out.print(data[top][i]);
                System.out.print (" ");
            }

            //Right
            for(int right =i+1; right<vertical; right++) {
                System.out.print(data[vertical][right]);
                System.out.print (" ");
            }

            //Bottom
            for(int bottom = vertical; bottom > i; bottom--) {
                System.out.print(data[bottom][vertical]);
                System.out.print (" ");
            }

            //left
            for(int left = vertical; left >i; left--) {
                System.out.print(data[i][left]);
                System.out.print (" ");
            }
        }
    }
}
