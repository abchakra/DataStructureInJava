package com.darkray.datastructure.effectivejava.problems;

public class Point {
	public int x, y;

	public boolean equals(Object o) {

		if (o instanceof Point) {
			Point obj = (Point) o;

			if ((obj.x == this.x) && (obj.y == this.y))
				return true;

		}
		return false;
	}
}
