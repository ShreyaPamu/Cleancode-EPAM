package cleanCode;

public class InterestCalculator implements Interest{
	double principleAmount,rateOfInterest;
    int timePeriod;
    InterestCalculator(double principleAmount, double rateOfInterest, int timePeriod)
    {
        this.principleAmount = principleAmount;
        this.rateOfInterest = rateOfInterest;
        this.timePeriod = timePeriod;
    }
	public double calculateSimpleInterest() {
		double simpleInterest;
        simpleInterest = (principleAmount*timePeriod*rateOfInterest)/100;
        return simpleInterest;
	}
	public double calculateCompoundInterest() {
		double compoundInterest;
        compoundInterest = (principleAmount * (Math.pow(1+(rateOfInterest/100),timePeriod)))-principleAmount;
        return compoundInterest;
	}  
}
