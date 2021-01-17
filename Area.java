import java.util.Scanner;

public class Area {
	
	double area;

	Area(double length,double breadth)
       {	
		area=length*breadth;
	}
	 double returnArea() 
        {
		return this.area;
        }
	
	public static void main(String args[]) 
      {
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  length of rectangle :");
		double length = sc.nextDouble();
                System.out.println("Enter  breadth of rectangle :");
		double breadth=sc.nextDouble();
		Area ob = new Area(length,breadth);
                area=ob.returnArea();
	        System.out.println("Area of rectangle = "+(String.format("%.3f",area))+"sq units");	
	}

    }