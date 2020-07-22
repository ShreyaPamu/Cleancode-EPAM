package cleanCode;

import java.util.Scanner;
public class CalculateHouseValue implements House
{
    String materialStandard;
    int totalHouseArea;
    int totalCost=0;

    CalculateHouseValue(String materialStandard,int totalHouseArea)
    {
        this.totalHouseArea=totalHouseArea;
        this.materialStandard=materialStandard;
    }

	public int estimateHouseCost() {
		if(materialStandard.compareToIgnoreCase("standard materials")==0)
        {
           totalCost=totalHouseArea*1200;
        }
        else if(materialStandard.compareToIgnoreCase("above standard materials")==0)
        {
            totalCost=totalHouseArea*1500;
        }
        else if(materialStandard.compareToIgnoreCase("high standard materials")==0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you need a fully automated one\nYes or No");
            String answerForAutomation =sc.next();
            if(answerForAutomation.equalsIgnoreCase("yes"))
            totalCost=totalHouseArea*2500;
            else
            totalCost=totalHouseArea*1800;
        }
        return totalCost;
	}
    
}

