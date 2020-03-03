
import java.util.Scanner;
public class HomeworkAssignment2_1 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Please enter all of your pennies: ");
        int numOfPennies = reader.nextInt(); 
        Solution sol = new Solution();
        System.out.println(sol.breakCash(numOfPennies));
    }
}
class Solution {
    /**
    * FUNCTION SINGATURE:
    * String breakCash(int numPennies)
    * PURPOSE: the function takes in the total of pennies from the user as input, 
    * computes its equivalent in dollars, quarters, dimes, nickels, and pennies, 
    * and outputs the result in string to the console. 
    * @param int numPennies
    * @return String output in dollars, quarters, dimes, nickels, and pennies
    */ 
    public String breakCash(int numPennies) {
        int change = 0;
	        int dollars  = 0;
	        int quarters = 0;
	        int dimes    = 0;
	        int nickels  = 0;
	        
	        dollars = numPennies/100;
	        
	        change = numPennies%100;
	        
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
	        
	       return("dollars: "+dollars+" quarters: "+quarters+" dimes: "+dimes+" nickels: "+nickels+" pennies: "+change);
	        
    }
}

