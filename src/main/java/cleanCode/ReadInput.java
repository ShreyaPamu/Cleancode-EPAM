package cleanCode;

import java.util.Scanner;

public class ReadInput {
    static Scanner sc;
    public static void readInputInterests()
    {
        sc =  new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        double principleAmount=sc.nextDouble();

        System.out.println("Enter Rate Of Interest");
        double rateOfInterest = sc.nextDouble();

        System.out.println("Enter Time Period in Years");
        int timePeriod=sc.nextInt();

        InterestCalculator calculate =new InterestCalculator(principleAmount,rateOfInterest,timePeriod);
        double simpleInterest=calculate.calculateSimpleInterest();
        double compoundInterest=calculate.calculateCompoundInterest();

        System.out.println("Simple Interest is "+simpleInterest);
        System.out.println("Compound Interest is "+compoundInterest);
    }
    public static void readInputHouseValues()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter Material Standard");
        System.out.println("Any one among these :\n Standard Materials \n Above Standard Materials \n High Standard Materials ");
        String materialStandard = sc.nextLine();
        
        System.out.println("Enter total area of the house in sqft");
        int totalHouseArea = sc.nextInt();

        CalculateHouseValue calculate = new CalculateHouseValue(materialStandard, totalHouseArea);
        int totalCost = calculate.estimateHouseCost();
        System.out.println("The Total estimated construction cost is "+totalCost);
    }
}
