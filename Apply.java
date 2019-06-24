package Milestone1_OOPSInheritance_PolymorphismOverriding;
/*Write a program to create a class named shape. It should contain 2 methods- draw() and
 *  erase() which should print �Drawing Shape� and �Erasing Shape� respectively.
 *  For this class we have three sub classes- Circle, Triangle and Square and each class over
 *  ride the parent class functions- draw () and erase (). 
 *  The draw() method should print �Drawing Circle�, �Drawing Triangle�, �Drawing Square� respectively.
 *  The erase() method should print �Erasing Circle�, �Erasing Triangle�, �Erasing Square� respectively.
 *  Create objects of Circle, Triangle and Square in the following way and observe the 
 *  polymorphic nature of the class by calling draw() and erase() method using each object.
 *  Shape c=new Circle();
 *  Shape t=new Triangle();
 *  Shape s=new Square();
*/
class Shape {
	void draw(){
		System.out.println("Drawing Shape");
	}
	void erase(){
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape {
	void draw(){
		System.out.println("Drawing Circle");
	}
	void erase(){
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape {
	void draw(){
		System.out.println("Drawing Triangle");
	}
	void erase(){
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape {
	void draw(){
		System.out.println("Drawing Square");
	}
	void erase(){
		System.out.println("Erasing Square");
	}
}
public class Apply{
	public static void main(String []args){
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.draw();
		t.draw();
		s.draw();	
		c.erase();
		t.erase();
		s.erase();
			
	}
}