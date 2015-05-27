package crackingCode;

public class AllUniqueChars {

    public static void main(String args[]) {
        String manojString = "Manoj";
        checkUnique(manojString);
    }

    private static void checkUnique(String manojString) {
        Boolean[] data = new Boolean[256];

        for (int i = 0; i < manojString.length(); i++) {
            int c = manojString.charAt(i);
            if (data[c] == true) {
                System.out.println("Chars repeated");
            }

            else {
                data[c] = true;
            }

        }

    }
}
