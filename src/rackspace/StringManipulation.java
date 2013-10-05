package rackspace;

import java.io.File;
import java.util.Scanner;

public class StringManipulation {

	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("Please call the class with following syntax : "
					+ "java StringManipulation path-to-file");
			System.exit(1);
		}
		StringManipulation stringManipulate = new StringManipulation();
		stringManipulate.compact(args[0]);
	}

	/**
	 * Takes a given String and deletes white spaces and identical consecutive
	 * chars in place. The complexity is O(n) as we compact all chars in one
	 * pass.
	 * 
	 * @param path
	 *            path to the file
	 */
	private void compact(String path) {
		StringBuilder builderString = null;
		try {
			final Scanner scanner = new Scanner(new File(path));
			builderString = new StringBuilder(scanner.nextLine());
			scanner.close();
		} catch (Exception e) {
			System.out.println("Error caught while reading the line "
					+ builderString);
			e.printStackTrace();
		}

		char current = builderString.charAt(0);
		int destination = 0;
		for (int i = 1; i < builderString.length(); i++) {
			char found = builderString.charAt(i);
			if (current == found || found == ' ') {
				// Don't do any thing here.
			} else {
				builderString.setCharAt(destination++, current);
				current = found;
			}
		}
		builderString.setCharAt(destination++, current);
		builderString.delete(destination, builderString.length());
		if (builderString.charAt(0) == ' ')
			builderString.deleteCharAt(0);
		System.out.println(builderString);
	}
}
