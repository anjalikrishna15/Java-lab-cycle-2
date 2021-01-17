import java.util.Scanner;
public class Area_rc 
{
     void Area(double l,double b)
     {
	String area=String.format("%.2f", (l*b));
	System.out.println("Area of rectange is "+area+"sq.units");
     }
	
     void Area(double r)
     {
	double pi = 3.14;
	String area= String.format("%.2f", (pi*Math.pow(r, 2)));
	System.out.println("Area of circle is "+area+"sq.units");
      }
	
      public static void main(String[] args) 
      {
	 Scanner sc = new Scanner(System.in);
	 double radius,length,breadth;
	 System.out.println("Enter radius of circle :");
         radius =sc.nextDouble();
	 Area_rc circle = new Area_rc();
	 circle.Area(radius);
        
         System.out.println("Enter  length and beadth of the rectangle :");
         length = sc.nextDouble();
	 breadth =sc.nextDouble();
	 Area_rc rectangle = new Area_rc();
	 rectangle.Area(length, breadth);
		
      }
	

}