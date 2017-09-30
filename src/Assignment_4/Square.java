/**
 * 
 */
package Assignment_4;										// Package Declared
	public class Square extends Shape {						// Class Square declared which will inherit from Shape 
    Square(float height, float width)						// Constructor Declared
    {super.Height = height;									// Variable Height is inherited by using word Super
     super.Width = width;}									// Variable Height is inherited by using word Super

    final float area() {									// This method cannot be overridden in it's sub classes
    	return Height * Width; }							// when Method is called it will return Height * Width
}															// Square Class closed