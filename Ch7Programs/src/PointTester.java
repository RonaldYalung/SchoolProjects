

/**
 * Driver class used to test Point implementation for Project 1.
 *
 * @author Ray Hedgecock and Dislhad Haleem
 * @version 1.1
 */
public class PointTester {

    public static void main(String[] args) {
        
        System.out.println(" Cartesian Plane Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);  //println calls the toString of a
        System.out.println("Point 2: " + b);  //println calls the toString of b


       //creating 3rd Point object
        Point b2 = new Point(b.getX(), b.getY());  
        
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b); 
         System.out.println("Point 3: " + b2); 

         System.out.println("Number of Point objects:" + Point.getNumPoints()); 

    }
}
