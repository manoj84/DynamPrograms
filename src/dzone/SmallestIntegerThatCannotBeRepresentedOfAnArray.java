package dzone;

/**
 * Given a sorted array (sorted in non-decreasing order) of positive numbers,
 * find the smallest positive integer value that cannot be represented as sum of
 * elements of any subset of given set. Expected time complexity is O(n).
 * 
 * Examples:
 * 
 * Input: arr[] = {1, 3, 6, 10, 11, 15}; Output: 2
 * 
 * Input: arr[] = {1, 1, 1, 1}; Output: 5
 * 
 * Input: arr[] = {1, 1, 3, 4}; Output: 10
 * 
 * Input: arr[] = {1, 2, 5, 10, 20, 40}; Output: 4
 * 
 * Input: arr[] = {1, 2, 3, 4, 5, 6}; Output: 22
 * 
 * @author manoj
 * 
 */

public class SmallestIntegerThatCannotBeRepresentedOfAnArray {

    public static void main(String args[]) {

        int[] test1 = { 1, 3, 6, 10, 11, 15 };
        int[] test2 = { 1, 1, 1, 1 };
        int[] test3 = { 1, 1, 3, 4 };
        int[] test4 = { 1, 2, 5, 10, 20, 40 };
        int[] test5 = { 1, 2, 3, 4, 5, 6 };

        find(test1);
        find(test2);
        find(test3);
        find(test4);
        find(test5);
    }

    private static void find(int[] test) {
        int sum = 0;
        boolean found = false;
        for (int i = 0; i < test.length; i++) {
            sum++;
            if (i == 0 && test[i] != 1) {
                System.out.println(sum + " is the smallest");
                found = true;
                break;
            }

            else {
                if (sum < test[i]) {
                    // Can be greater or lesser
                    System.out.println(test[i] - test[i - 1]
                            + " is the smallest");
                    found = true;
                    break;

                }
            }
        }

        if (!found) {
            System.out.println(sum + 1 + " is the smallest");
        }
    }
}