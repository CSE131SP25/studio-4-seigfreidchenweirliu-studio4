package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(0.02);
		StdDraw.ellipse(0.5,0.5,0.3,0.2);
		
		
		StdDraw.setPenColor(62, 25, 100);
		StdDraw.setPenRadius(0.35);
		StdDraw.point(0.5,0.5);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(0.02);
		StdDraw.ellipse(0.5,0.5,0.17,0.17);
		
	}
}