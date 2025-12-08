package lab6;
import java.util.*;
public class Q1 {
	public static int additionSimple(int x, int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return x-y;
	}
	public static int multiplicationSimple(int x, int y) {
		return x*y;
	}
	public static double divisionSimple(int x, int y) {
		if(y==0) {
			System.out.println("enter vali no!");
			return 0;
		}
		return (double)x/y;
	}
	public static int remainderSimple(int n, int m) {
		if(m==0) {
			System.out.println("enter vali no!");
			return 0;
		}
		return n%m;
	}
	public static double squareRootSimple(int n) {
		if(n<=0) {
			System.out.println("enter vali no!");
			return 0;
		}
		return Math.sqrt(n);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 while (true) {
		        System.out.println("----- SIMPLE CALCULATOR -----");
		        System.out.print(
		                "1. Addition\n" +
		                "2. Subtraction\n" +
		                "3. Multiplication\n" +
		                "4. Division\n" +
		                "5. Remainder\n" +
		                "6. Square Root\n" +
		                "7. Exit\n" +
		                "Choose an option: "
		        );

		        int n = sc.nextInt();

		        // Exit conditions
		        if (n == 7) {
		            System.out.println("Exiting... Thank you!");
		            break;
		        }
		        if (n < 1 || n > 7) {
		            System.out.println("Enter a valid option!");
		            continue;
		        }

		        System.out.print("Enter first number (x): ");
		        int x = sc.nextInt();

		        int y = 0; 
		        if (n != 6) {
		            System.out.print("Enter second number (y): ");
		            y = sc.nextInt();
		        }
		        switch (n) {
		            case 1:
		                System.out.println("(" + x + "+" + y + ") = " + additionSimple(x, y));
		                break;
		            case 2:
		                System.out.println("(" + x + "-" + y + ") = " + subtractionSimple(x, y));
		                break;
		            case 3:
		                System.out.println("(" + x + "*" + y + ") = " + multiplicationSimple(x, y));
		                break;
		            case 4:
		                System.out.println("(" + x + "/" + y + ") = " + divisionSimple(x, y));
		                break;
		            case 5:
		                System.out.println("(" + x + "%" + y + ") = " + remainderSimple(x, y));
		                break;
		            case 6:
		                System.out.println("root " + x + " = " + squareRootSimple(x));
		                break;
		        }

		        System.out.println();
		    }
	}
}
