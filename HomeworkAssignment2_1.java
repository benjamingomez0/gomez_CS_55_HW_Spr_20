
import java.util.Scanner;

public class HomeworkAssignment2_1{
		public static void main(String[] args) {
			
			int pennies;
			int change = 0;
	        int dollars  = 0;
	        int quarters = 0;
	        int dimes    = 0;
	        int nickels  = 0;
	        
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Please Enter the amount of Pennies: ");
	        
	        pennies = in.nextInt();
	        
	        dollars = pennies/100;
	        
	        change = pennies%100;
	        
	        quarters = change/25;
	        if(quarters!=0)
	        {
	            change=change%25;
	        }
	        
	        dimes = change/10;
	        if(dimes!=0)
	        {
	            change =  change%10;
	        }
	        
	        nickels= change/5;
	        if(nickels!=0)
	        {
	            change=change%5;
	        }
	        
	        pennies = change; 
	        
	        System.out.println("dollars: "+dollars+" quarters: "+quarters+" dimes: "+dimes+" nickels: "+nickels+" pennies: "+pennies);
	}
}

