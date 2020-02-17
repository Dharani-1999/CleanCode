package SimpleCompoundInterest.Interest;

import java.util.Scanner;

import org.junit.Test;

public class SimpleCompound_Interest {
	@Test
	public void simpleCompound(){
		   double principleAmount,rateOfInterest,time;
		   double amount=0,rate=1;
		   double simpleInterest;
		   double compoundInterest;
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.format("%s","Enter principle amount\n");
		   principleAmount=sc.nextInt();
		   
		   System.out.format("%s","Enter rate of interest\n");
		   rateOfInterest=sc.nextInt();
		   
		   System.out.format("%s","Enter time\n");
		   time=sc.nextInt();
		   
		   simpleInterest=((principleAmount)*(rateOfInterest)*(time))/100;
		   //printing compound interest
		   System.out.format(" Simple interest : %.3f\n",simpleInterest);
		   
		   rateOfInterest=1+(rateOfInterest/100);
		   for(int i=1;i<=time;i++){
			   rate*=rateOfInterest;
		   }
		   amount=principleAmount*rate;
		   compoundInterest=amount-principleAmount;
		   
		   //printing compound interest
		   System.out.format(" Compound interest : %.3f\n",compoundInterest);
		   
	} 
}
