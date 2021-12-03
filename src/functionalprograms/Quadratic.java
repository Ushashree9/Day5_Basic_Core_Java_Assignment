package functionalprograms;

public class Quadratic {
public static void main(String[] args) {
		
		double a = 3;
		double b = 8;
		double c = 6.6;
		double root1,root2;
		double determinant = b * b - 4 * a * c ;
		
		if (determinant > 0)    
		{
			root1 = (-b+Math.sqrt(determinant))/(2*a);
			root2 = (-b-Math.sqrt(determinant))/(2*a);
			System.out.format(	"root1=%.2f ",root1);
			System.out.println("\n");
			System.out.format("root2=%.2f",root2);
		}
		else if(determinant==0) 
		{
			root1 = -b/(2*a);
			root2 = -b/(2*a);
			System.out.format("root1=%.2f",root1);
			System.out.println("\n");
			System.out.format("root2=%.2f;",root2);
		}
		else 
		{
			double real = -b/(2*a);
			double imaginary = Math.sqrt(-determinant)/(2*a);
			System.out.format("root1 = %.2f+%.2fi",real,imaginary);
			System.out.println("\n");
			System.out.format("root2 = %.2f-%.2fi",real,imaginary);
		}
	}
}

