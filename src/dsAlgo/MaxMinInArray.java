/**
 * Created by manoj on 3/15/16.
 * <p>
 * Solved the Min and Max in an array in O(nlogn)
 */
public class MaxMinInArray {

    public static void main(String[] args) {
        int[] data = {2, 12, 3, 4, 6, 1, 10};
        MaxMinInArray maxMinInArray = new MaxMinInArray();
        System.out.println(maxMinInArray.recurse(data));
    }

    public MinMax recurse(int[] data) {
        int size = data.length;
        if (data.length == 1) {
            return new MinMax(data[0], data[0]);
        } else {
            int mid = size / 2;
            int[] left = new int[mid];
            int[] right = new int[data.length - mid];
            System.arraycopy(data, 0, left, 0, left.length);
            System.arraycopy(data, left.length, right, 0, right.length);
            MinMax leftMinMax = recurse(left);
            MinMax rightMinMax = recurse(right);

            return new MinMax(Math.min(leftMinMax.getMin(), rightMinMax.getMin()),
                    Math.max(leftMinMax.getMax(), rightMinMax.getMax()));
        }
    }

    public static class MinMax {
        int min = 0;
        int max = Integer.MAX_VALUE;

        public MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public String toString() {
            return "Min is " + min + " Max is " + max;
        }

        public int getMin() {
            return this.min;
        }

        public int getMax() {
            return this.max;
        }
    }
}
