package view;

import model.Circle;
import model.Rectangle;
import model.Square;
import model.Triangle;

public class Main {

	public static void main(String[] args) {
		Square s1 = new Square(10);
		Rectangle r1 = new Rectangle(10, 5);
		Circle c1 = new Circle(3);
		Triangle t1 = new Triangle(2, 5);
		
		Canvas c = new Canvas();
		c.addShape(c1);
		c.addShape(r1);
		c.addShape(s1);
		c.addShape(t1);
		
		c.printShapes();
	}

}
