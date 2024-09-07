/*
 * 
 * Module 4 CTA Option 1: Creating an Abstract Class Shape
 * Brian Gunther
 * CSC372: Programming II
 * Colorado State University Global
 * Dr. Vanessa Cooper
 * September 8, 2024
 * 
 */

public class Cone extends Shape {
	
	private double radius;
	private double height;
	
	/**
	 * Constructor for Cone class
	 * @param r sets radius of the cone
	 * @param h sets height of the cone
	 */
	public Cone(double r, double h) {
		radius = r;
		height = h;
	}
	
	/**
	 * @return the surface area of the cone
	 */
	public double surface_area() {
		double hypotenuse = Math.sqrt(Math.pow(radius, 2.0) + Math.pow(height, 2.0));
		double surfaceArea = Math.PI * radius * (radius + hypotenuse);
		
		return surfaceArea;
	}
	
	/**
	 * @return the volume of the cone
	 */
	public double volume() {
		double vol = (height * Math.PI * Math.pow(radius, 2.0)) / 3.0;
		
		return vol;
	}
	
	/**
	 * Overrides the toString() method of the Object class to return a custom string for the object.
	 * @return a custom string containing the surface area and volume
	 */
	@Override
	public String toString() {
		return String.format("Cone surface area: %.3f | Cone volume: %.3f", surface_area(), volume());
	}
}
