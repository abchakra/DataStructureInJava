package com.darkray.datastructure.effectivejava.problems;

import java.awt.Color;

public class ColorPoint extends Point{
	Color color;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof ColorPoint) {
			ColorPoint colorObj = (ColorPoint) obj;
			if (this.color == colorObj.color && this.x == colorObj.x) {
				return true;
			}
		}
		return super.equals(obj);
	}
}
