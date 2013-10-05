package rackspace;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralPrinting {

    public static void main(String args[]) {

        try {
            final BufferedReader reader = new BufferedReader(new FileReader(
                    args[0]));
            String line;
            List<List<String>> collection = new ArrayList<List<String>>();
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                List<String> rows = Arrays.asList(tokens);
                rows = new ArrayList<String>(rows);
                collection.add(rows);
            }

            while (collection.size() > 0) {
                // Print the first row
                printStraight(collection.remove(0));
                // Print the middle row
                List<String> first = prinMiddle(collection);
                // print the last row
                if (collection.size() > 0)
                    printReverse(collection.remove(collection.size() - 1));
                // Print the middle row
                printReverse(first);
            }

        } catch (Exception e) {
            // System.err.println("File input error");
            System.out.print(e.getStackTrace());
        }
    }

    private static List<String> prinMiddle(List<List<String>> collection) {
        List<String> first = new ArrayList<String>();
        if (collection.size() == 0)
            return first;
        for (List<String> pop : collection) {
            first.add(pop.remove(0));
            if (pop.size() > 0) {
                System.out.print(pop.remove(pop.size() - 1));
                System.out.print(" ");
            }
        }
        return first;
    }

    private static void printStraight(List<String> remove) {
        if (remove.size() == 0)
            return;
        for (int i = 0; i < remove.size(); i++) {
            System.out.print(remove.get(i));
            System.out.print(" ");
        }
    }

    private static void printReverse(List<String> remove) {
        if (remove.size() == 0)
            return;
        for (int i = remove.size() - 1; i >= 0; i--) {
            System.out.print(remove.get(i));
            System.out.print(" ");
        }
    }
}