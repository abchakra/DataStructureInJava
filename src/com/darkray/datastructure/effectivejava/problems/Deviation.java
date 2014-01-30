package com.darkray.datastructure.effectivejava.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Deviation {
	public static void find_deviation(Integer[] v, Integer d) {
		if (d > 0 && d <= v.length) {

			ArrayList<Integer[]> intArr = new ArrayList<Integer[]>();

			for (Integer i = 0; i < v.length - d + 1; i++) {
				Integer[] testA = new Integer[d];
				Integer k = i;
				for (Integer j = 0; j < d; j++) {
					testA[j] = v[k++];
				}
				intArr.add(testA);

			}

			System.out.println("Total size" + intArr.size());
			ArrayList<Integer> arrayOfMean = new ArrayList<Integer>();

			for (Integer[] intAr : intArr) {

				for (Integer i = 0; i < intAr.length; i++) {
					System.out.println(intAr[i]);
				}
				System.out
						.println("******************************************");

				System.out.println("Mean is :---" + median(intAr));
				arrayOfMean.add(median(intAr));

			}

			Integer deviation = 0;
			for (Integer integer : arrayOfMean) {

				if (integer > deviation) {
					deviation = integer;
				}
			}
			System.out.println("Deviation for this array is -" + deviation);
		}

	}

	public static Integer median(Integer[] numArray) {

		Arrays.sort(numArray);
		if (numArray.length == 0) {
			return 0;
		}
		return numArray[numArray.length - 1] - numArray[0];

	}

	public static void main(String args[]) {
		Integer[] v = { 6, 9, 4, 67, 45, 234, 43, 1, 5, 12, 167, 12, 465 };
		Integer d = 3;
		find_deviation(v, d);

		Integer[] v1 = { 6, 9, 4, 7, 4, 1 };

		find_deviation(v1, d);
	}
}
