/**
 * 
 */
package Assignment_4;									// Package Declared
	public class Circle extends Shape {					// Class Circle declared which will inherit from Shape
		float Radius;									// Float Variable declared
			Circle(float radius)	{					// constructor is declare
				this.Radius = radius;}					// this keyword is used to distinguish between class and instance variables

    final float area() {                             	// This method cannot be overridden in it's sub classes
          return Shape.pi * Radius *Radius;}			// when Method is called it will return Shape.pi * Radius *Radius
}														// Circle class closed