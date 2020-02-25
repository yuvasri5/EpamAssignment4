package cleancode;
import java.util.Scanner;
public class construction {
	public construction(){
		
	}
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double feet = sc.nextInt();
		System.out.println("If you want a home with standard materials then press 1 ");
		System.out.println("If you want a home with above standard materials then press 2 ");
		System.out.println("If you want a home with  high standard materials then press 3 ");
		System.out.println("If you want a home with high standard materials and fully automated then press 4 ");
		int op=sc.nextInt();
		materials ob2 = new materials();
		double ans;
		switch(op){
		case 1: ans= ob2.sm(feet);
			break;
		case 2: ans= ob2.ssm(feet);
			break;
		case 3: ans= ob2.hsm(feet);
			break;
		case 4: ans= ob2.hfsm(feet);
			break;
		}
	}

}
