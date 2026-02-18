package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(86,0,124);
		StdDraw.filledRectangle(.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(0.45,0.55,0.01);
		StdDraw.filledCircle(0.55,0.55,0.01);
		StdDraw.filledCircle(0.5,0.5,.02);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setPenRadius(0.005);
		StdDraw.arc(0.45,0.56,0.03,35,145);
		StdDraw.arc(0.55,0.56,0.03,35,145);
		StdDraw.text(0.5,0.35,"Minerva Grimace Land");
		//StdDraw.line(0.65,0.85,0.2,0.45);
		StdDraw.line(0.35,0.45,0.65,0.45);
		StdDraw.line(0.35,0.45,0.5,0.67);
		StdDraw.line(0.65,0.45,0.5,0.67);
	}
}