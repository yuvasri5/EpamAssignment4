package cleancode;

public class interest {
	public interest() {
		
	}
	public double simpleInterest(double p, double t,double r){
		return (p*t*r)/100;
	}
	public double compoundInterest(double p, double t,double r){
		double ci = p*(Math.pow(1+(r/100),t));
		return ci;
	}

}
