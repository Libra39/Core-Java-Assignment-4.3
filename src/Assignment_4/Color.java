/**
 * 
 */
package Assignment_4;														// Package Declared
public final class Color extends Shape{										// Class Color declared which will inherit from Shape. But can't be extended further as final keyword is used.
	String Color;															// String variable declared
	public Color(String color) {											// Constructor declared
	        this.Color = color;												// this keyword is used to distinguish between class and instance variables
	        System.out.println("Colors Not avaliable in Application -"		// This will print the argument in the next line
	        		+ "  Massage displayed from Final Class\n");}
}																			// Color class closed