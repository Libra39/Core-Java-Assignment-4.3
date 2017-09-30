/**
 * 
 */
package Assignment_4;									// Package Declared
	public class Shape {								// Class Shape declared
		public static final float pi = 3.142f; 			// As the Value of Pi is constant. It is declared as Final Variable in Shape Class
		protected float Height;							// Protected float variable height declared
		protected float Width;							// Protected float variable height declared

    public /* final */ Shape() {						// Constructor declared- Observe the Final keyword is commented, we can't create final constructor as it does not allow class to execute 
        this.Height = Height;							// this keyword is used to distinguish between class and instance variables
        this.Width = Width;}							// this keyword is used to distinguish between class and instance variables
    
    /* final */  float area() {							// Method is declared- Observe the Final keyword is commented because if we made the method as final then it can't be used in the any other class
		return 0;}										// when method is call then return value zero
}  														// Shape class closed


