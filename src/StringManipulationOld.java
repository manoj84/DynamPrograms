import java.io.File;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: manoj
 * Date: 6/27/13
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringManipulationOld {

    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("Please call the class with following syntax : " +
                    "java StringManipulation path-to-file");
            System.exit(1);
        }
        StringManipulation stringManipulateOld = new StringManipulationOld();
        stringManipulate.compact(args[0]);
        //String path = "//home//manoj//IdeaProjects//Rackspace//src//test.txt";
        //stringManipulate.compact(path);
    }

    /**
     * Takes a given String and deletes white spaces and identical consecutive chars.
     *
     * @param path path to the file
     */
    private void compact(String path) {
        String line = "";
        try {
            final Scanner scanner = new Scanner(new File(path));
            line = scanner.nextLine();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error caught while reading the line " + line);
            e.printStackTrace();
        }
        //Remove all the White Spaces.
        String noSpaceString = line.replaceAll("\\s", "");
        //Create a String Builder to do in place replace of chars.
        StringBuilder builderString = new StringBuilder(noSpaceString);
        //Iterate through each chars and delete duplicate chars.
        for (int i = 1; i < builderString.length(); i++) {
            int j = i - 1;
            int k = i;
            while (builderString.charAt(j) == builderString.charAt(k)) {
                builderString.deleteCharAt(k);
            }
        }
        System.out.println(builderString.toString());
    }

}
