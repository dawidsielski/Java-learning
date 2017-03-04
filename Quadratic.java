import java.util.Scanner;

public class Quadratic{
    int a_coeff, b_coeff, c_coeff, delta;

	public Quadratic(int a, int b, int c){
        a_coeff = a;
        b_coeff = b;
        c_coeff = c;
		delta = b_coeff * b_coeff - 4 * a_coeff * c_coeff;
    }

	public void printEquation(){
        System.out.println(a_coeff + "x^2 + " + b_coeff + "x + " + c_coeff + " = 0");
    }

	public int calculateDelta(){
		return b_coeff * b_coeff - 4 * a_coeff * c_coeff;
	}

	public int calculateNumberOfRoots(){
		//delta = calculateDelta()
		if (delta == 0){
			return 1;
		}
		else if (delta > 0){
			return 2;
		}
		else{
			return 0;
		}
	}

	public double calculateSingleRoot(){
		return (-1 * b_coeff) / (2 * a_coeff);
	}

	public double[] calculateTwoRoots(){
		double[] roots = new double[2];
		roots[0] = (-1 * b_coeff + Math.sqrt(delta)) / (2 * a_coeff);
		roots[1] = (-1 * b_coeff - Math.sqrt(delta)) / (2 * a_coeff);
		return roots;
	}

	public void printRoots(){
		int nRoots = calculateNumberOfRoots();
		if (nRoots == 0){
			System.out.println("There are no real solutions.");
		}
		else if (nRoots == 1){
			System.out.println("There is only one solution: " + calculateSingleRoot());
		}
		else{
			double[] roots = calculateTwoRoots();
			System.out.println("There are two solutions: " + roots[0] + " and " + roots[1]);
		}
	}

	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a coeffcient:");
        int a = in.nextInt();
        System.out.println("Enter b coeffcient:");
        int b = in.nextInt();
        System.out.println("Enter c coeffcient:");
        int c = in.nextInt();
        Quadratic equation = new Quadratic(a, b, c);
        equation.printRoots();
    }
}
