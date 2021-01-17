public class Triangle
{
   public Triangle()
  {
      double perimeter;
      double area;
      perimeter=3+4+5;
      double s = perimeter/2;    // find semi perimeter
      area=Math.sqrt(s*(s-3)*(s-4)*(s-5));   //heron's formula
      System.out.println("Perimeter Of Triangle with sides 3,4&5 = "+perimeter);
      System.out.println("Area Of Triangle with sides 3,4&5 = "+area);
		
  }
   public static void main(String[] args)
   {
	Triangle ob = new Triangle();
   }
}