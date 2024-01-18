
public class Driver {
	public static void main(String[] args) {
		Triangle triangle2 = new Triangle(5, 5, 5);
		System.out.println("The three sides of the legal triangle are: " + triangle2.getSideA() + " " + triangle2.getSideB() + " " + triangle2.getSideC() + " ");
		
		triangle2.setSideA(9);
		triangle2.setSideB(6);
		triangle2.setSideC(7);
		System.out.println("A was set to 9, then B to 6 and C to 7: " + triangle2.toString());
		System.out.println();
		Triangle triangle3 = new Triangle(2,2,10);
		System.out.println("The illegal triangle contained: " + triangle3.toString());
		triangle3.setSideA(7);
		System.out.println("Changed side A to 7: " + triangle3.toString());
		triangle3.setSideA(-10);
		System.out.println("Changed side B to -10: " + triangle3.toString());
		triangle3.setSideA(21);
		System.out.println("Changed side C to 21: " + triangle3.toString());
	}
}
