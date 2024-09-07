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

public class ShapeArray {
	public static void main(String[] args) {
		// Declare an array of type Shape for later use
		Shape shapeArray[];
		
		// Create some preset sizes for radius and height, for consistency
		double testRadius = 2.0;
		double testHeight = 5.0;
		
		// Instantiate Shape subclass objects
		Sphere testSphere = new Sphere(testRadius);
		Cylinder testCylinder = new Cylinder(testRadius, testHeight);
		Cone testCone = new Cone(testRadius, testHeight);
		
		// Instantiate an array with Shape objects as members
		shapeArray = new Shape[] {testSphere, testCylinder, testCone};
		
		for(int i = 0; i < shapeArray.length; i++) {
			// Leverage the "toString()" override to print the surface area and volume
			System.out.println(shapeArray[i]);
		}
	}
}
