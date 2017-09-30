package Assignment_4;							// Package declared 
public class Rectangle extends Shape {			// Class Rectangle declared which will inherit from Shape
    Rectangle(float height, float width){		// Constructor Declared
        super.Height = height;					// Variable Height is inherited by using word Super
        super.Width = width;}					// Variable Width is inherited by using word Super

    final float area()  {						// This method cannot be overridden in it's sub classes
          return Height * Width;}				// when Method is called it will return Height * Width
}												// Rectangle class closed
