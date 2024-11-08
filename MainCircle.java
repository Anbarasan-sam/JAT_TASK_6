package guviTask6;

public class MainCircle {

	public static void main(String[] args) {
		 
        Circle circle1 = new Circle();
        System.out.println("Radius: " + circle1.getRadius());                 
        System.out.println("Circumference: " + circle1.getCircumference());   
        
        Circle circle2 = new Circle(5.0);
        System.out.println("Radius: " + circle2.getRadius());                 
        System.out.println("Circumference: " + circle2.getCircumference());
	}

}
