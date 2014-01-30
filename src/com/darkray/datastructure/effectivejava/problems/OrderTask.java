package com.darkray.datastructure.effectivejava.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderTask {

	public static void order_tasks(Integer[] dependencyFirst,
			Integer[] dependencySecond, Integer totalNumTasks) {

		Integer[] orderedTasks = new Integer[totalNumTasks];
		Integer[] used = new Integer[totalNumTasks];

		// new ArrayList<Integer>(Arrays.asList(array));
		while (orderedTasks[totalNumTasks - 1] == null) {

			for (int i = 0; i < totalNumTasks; i++) {
				if (used[i] == null) {
					if (orderedTasks[0] == null) {
						orderedTasks[i] = dependencyFirst[0];
						dependencyFirst[0] = -1;
						used[i] = -1;
						break;
					}
					for (int k = 0; k < dependencyFirst.length; k++) {
						if (i + 1 == dependencyFirst[k]) {
							orderedTasks[i] = dependencyFirst[k];
							dependencyFirst[k] = -1;
							used[i] = -1;
							break;
						}
					}
					for (int j = 0; j < dependencySecond.length; j++) {
						if (i + 1 == dependencySecond[j]) {
							orderedTasks[i] = dependencySecond[j];
							dependencySecond[j] = -1;
							used[i] = -1;
							break;
						}
					}

				}

			}

		}

		for (int i = 0; i < orderedTasks.length; i++) {
			System.out.println(orderedTasks[i]);
		}

	}

	public static void main(String[] args) {
		Integer[] dependencyFirst = new Integer[] { 3, 1, 2 };
		Integer[] dependencySecond = new Integer[] { 2, 2, 4 };
		Integer num_total_tasks = 6;
		// 1,2,3,4,5,6
		// 3 1 5 2 4 6
		order_tasks(dependencyFirst, dependencySecond, num_total_tasks);
	}
}
