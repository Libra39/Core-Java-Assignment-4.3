/**
 * Final Keyword is used with a Java method to mark that the method can't be overridden (for object scope) or hidden (for static). 
 * This allows the original developer to create functionality that cannot be changed by subclasses, and that is all the guarantee it provides.
   This means that if the method relies on other customizable components like non-public fields/methods the functionality of the final method may still be customizable. 
   This is good though as (with polymorphism) it allows for partial customization.
   
   There are a number of reasons to prevent something from being customizable, including:
   Performance -- Some compilers can analyse and optimise the operation, especially the one without side-effects.
   Obtain encapsulated data -- look at immutable Objects where their attributes are set at the construction time and should never be changed. Or a calculated value derived from those attributes. A good example is the Java String class.
   Reliability and Contract -- Objects are composed of primitives (int, char, double, etc.) and/or other Objects. Not all operations applicable to those components should be applicable or even logical when they are used in the bigger Object. Methods with the final modifier can be used to ensure that.
 *
 */

package Assignment_4;																												// Package Declared
/** Write a program in java to demonstrate the use of final keyword with class, with the method, with the constructor, and with a variable.
 */
public class Assignment_4_3 {																										// Class Declared
	public static void main(String[] args) {																						// Main Method started
		System.out.println("\nThe Below Program will display the use of final keyword with class, "									// This will print out the argument in the next line
				+ "with a variable, with the method and with the constructor\n");
		 Square square = new Square(5,5);																							// new instance is declared and assigned values
         Rectangle rectangle = new Rectangle(5,7);																					// new instance is declared and assigned values
         Circle circle = new Circle(2);																								// new instance is declared and assigned values
         Color color = new Color("DEFAULT");																						// new instance is declared and assigned values
         System.out.println("Area of square : " + square.area());																	// This will print the argument in the next line
         System.out.println("Area of rectangle : " + rectangle.area());																// This will print the argument in the next line
         System.out.println("Area of circle : " + circle.area());																	// This will print the argument in the next line
         System.out.println("As the Value of Pi is constant. It is declared as Final Variable in Shape Class"+						// This will print the argument in the next line
        		 			"\nAnd area() is taken as a final method in Square, Retangle and Circle Classes"+
        		             "\n\nWhen a class is inherited, the subclass inherits the methods and variables of super class but not constructors."+ 
                             "\nFor this reason, constructors are not members of class; only variables and methods are members of a class." +
                             "\nfinal is used by super class not to inherit its members by subclass as done in Square, Retangle and Circle Classes"+
                             "\nA constructor cannot be final as it is never inherited.");
      }																																// Main method closed
}																																	// Assignment_4_3 class closed