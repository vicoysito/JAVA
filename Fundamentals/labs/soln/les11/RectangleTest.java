public class RectangleTest {

  public static void main(String args[]){
	Rectangle r1 = new Rectangle();
        r1.draw();
        
        Rectangle r2 = new Rectangle(15,5);
        System.out.println("Area of r2 is: " +r2.getArea());
        r2.draw();
  }// end main
} // end class
