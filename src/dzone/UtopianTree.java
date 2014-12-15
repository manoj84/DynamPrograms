package dzone;

/**
 * The Utopian tree goes through 2 cycles of growth every year. The first growth
 * cycle occurs during the spring, when it doubles in height. The second growth
 * cycle occurs during the summer, when its height increases by 1 meter. Now, a
 * new Utopian tree sapling is planted at the onset of the spring. Its height is
 * 1 meter. Can you find the height of the tree after N growth cycles?
 * 
 * @author manoj
 * 
 */
public class UtopianTree {

    public static void main(String args[]) {
        UtopianTree tree = new UtopianTree();
        System.out.println(tree.calculate(0));
        System.out.println(tree.calculate(1));
    }

    public int calculate(int cycles) {
        int height = 1;

        int years = cycles % 2;

        for (int i = years; i > 0; i--) {
            height = (2 * height) + 1;
        }

        return height;
    }

}
