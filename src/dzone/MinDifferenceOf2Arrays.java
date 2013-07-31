package dzone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDifferenceOf2Arrays {
	private static int[] array1 = { 1, 2, 3, 4, 5, 6 };
	private static int[] array2 = { 7, 19, 22 };

	private static List<Integer> min = new ArrayList<Integer>();
	private static List<Integer> minOverall = new ArrayList<Integer>();

	public static void main(String args[]) {

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				min.add(Math.abs(array1[i] - array2[j]));
				minOverall.add(Collections.min(min));
			}
		}

		System.out.println(Collections.min(minOverall));
	}

}