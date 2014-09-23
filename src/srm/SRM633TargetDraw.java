package srm;

/**
 * The target you need to draw consists of nested squares. The innermost square
 * is just a single '#' character. The larger squares use alternatingly the
 * character ' ' (space) and the character '#'. Here is an example in which the
 * side of the largest square is n = 5:
 * 
 * 
 * 
 * 
 * 
 * ##### # # # # # # # #####
 * 
 * @author manoj
 * 
 */

public class SRM633TargetDraw {

    public static void main(String args[]) {
        SRM633TargetDraw targetDraw = new SRM633TargetDraw();
        System.out.println(targetDraw.drawSquare(5));
        System.out.println(targetDraw.drawSquare(9));
    }

    private StringBuffer drawSquare(int n) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (i == n / 2) {
                for (int m = 0; m < n; m++) {
                    if (m % 2 == 0) {
                        buffer.append("#");
                    }

                    else {
                        buffer.append(" ");
                    }
                }
                buffer.append(",");
                buffer.append("\n");

            } else if (i % 2 == 0) {
                for (int p = 0; p < n; p++) {
                    buffer.append("#");
                }
                buffer.append(",");
                buffer.append("\n");

            } else {
                for (int r = 0; r < n; r++) {
                    if (r == 0) {
                        buffer.append("#");
                    }

                    else if (r == n - 1) {
                        buffer.append("#");
                    }

                    else {
                        buffer.append(" ");
                    }
                }
                buffer.append(",");
                buffer.append("\n");
            }
        }

        return buffer;

    }

}
