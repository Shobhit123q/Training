package Area;

public class Main {
	public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
	}
}

/*output
 * Area of Circle: 78.53981633974483
Area of Rectangle: 24.0
*/
