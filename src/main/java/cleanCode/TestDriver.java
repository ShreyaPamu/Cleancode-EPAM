package cleanCode;

import java.util.Scanner;

public class TestDriver {
	    public static void main( String[] args )
	    {
	        Scanner sc = new Scanner(System.in);
	        int userChoice;
	        while(true)
	        {
	            System.out.println("Enter your choice");
	            System.out.println("1 - Calculate Simple and Compound Interests");
	            System.out.println("2 - Calculate House Construction Costs Based on House Materials");
	            System.out.println("3 - Exit");
	            userChoice=sc.nextInt();

	            switch (userChoice) {
	                case 1:
	                        ReadInput.readInputInterests();
	                    break;
	                case 2:
	                        ReadInput.readInputHouseValues();
	                        break;    
	                default:
	                        System.exit(1);
	                    break;
	            }
	        }
	        
	    }
}
