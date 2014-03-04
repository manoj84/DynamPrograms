package dzone;

public class StringCompression {

    public static void main(String args[]) {
        String test = "aabbbaaddcceebb";
        StringBuffer myString = new StringBuffer();

        int mask = 0;
        int rep = 1;

        for (int i = 0; i < test.length(); i++) {

            int subMask = 1 << test.charAt(i);

            if ((mask & subMask) == 0) {
                mask = mask | subMask;
                if (rep != 1) {
                    char c = test.charAt(i - 1);
                    myString.append(c);
                    myString.append(rep);
                    rep = 1;
                }
            }

            else {
                rep++;
            }

        }
        System.out.println(myString);
    }
}
