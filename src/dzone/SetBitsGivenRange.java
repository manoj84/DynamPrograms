package dzone;

public class SetBitsGivenRange {

    public static void main(String args[]) {
        // set the numbers in given range.
        int i = 145;
        int end = 5;
        int start = 1;
        int set = 30;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(set));
        SetBitsGivenRange sbgs = new SetBitsGivenRange();
        sbgs.setBits(i, start, end, set);
    }

    public void setBits(int i, int start, int end, int set) {
        // Prepare the mask
        int mask1 = (1 << start) - 1;
        System.out.println(Integer.toBinaryString(mask1));

        int mask2 = 1 << (end + 1);
        mask2 = ~(mask2 - 1);
        System.out.println(Integer.toBinaryString(mask2));

        int mask = mask1 | mask2;

        System.out.println(Integer.toBinaryString(mask));

        // Clear the bit
        i = mask & i;
        System.out.println(Integer.toBinaryString(i));

        // Now adjust the set bits position

        set = set << start;

        System.out.println(Integer.toBinaryString(i | set));

    }
}
