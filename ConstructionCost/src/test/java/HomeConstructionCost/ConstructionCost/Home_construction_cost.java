package HomeConstructionCost.ConstructionCost;

import java.util.Scanner;

import org.junit.Test;

public class Home_construction_cost {
   @Test
   public void homeConstructionCost() {
	  double areaOfHome;
	  Scanner sc=new Scanner(System.in);
	  System.out.format("%s","Enter the area of the house(in feets) : \n");
	  areaOfHome=sc.nextDouble();
	  
	  System.out.format("%s","Select the cost of standard material required for the construction of the home per square feet : \n");
	  System.out.format("%s","1 : 1200INR for standard materials \n");	
	  System.out.format("%s","2 : 1500INR for above standard materials \n");
	  System.out.format("%s","3 : 1800INR for high standard materials \n");
	  System.out.format("%s","4 : 2500INR for high above standard materials and fully automated home \n");
	  int choice=sc.nextInt();
	  if(choice>=1 && choice<5){
		   double[] home_Construction_Cost= {
		      areaOfHome*1200,
		      areaOfHome*1500,
		      areaOfHome*1800,
		      areaOfHome*2500
		      
		   };
		   //printing the cost of the home based on the choice chosen by the customers
		   System.out.format("%s : %.2fINR\n","Home construction cost : ",home_Construction_Cost[choice-1]);
	  }
	  else {
		  System.out.format("%s","Invalid choice \n");
	  }
	  
   }
}
