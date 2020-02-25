package cleancode;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double p,t,r;
		System.out.println("Enter amount");
		p = sc.nextDouble();
		System.out.println("Enter time");
		t = sc.nextDouble();
		System.out.println("Enter interest");
		r = sc.nextDouble();
		interest ob = new interest();
		double si = ob.simpleInterest(p, t, r);
		double ci = ob.compoundInterest(p, t, r);
		System.out.println("simple interest is "+si);
		System.out.println("compund interest is "+ci);
	}

}
