/* Group of 3
 * Maiah Rutledge: UCID # 30024535
 * Jared Hoshizaki: UCID # 30055963
 * David Akobundu: UCID # 30025095
 * */

package cpsc331.A1;							//Defining our package
public class SHufflepuff{
	public static void main(String[] args) {
        	String user_input = args[0];			    	
        	boolean valid_input = isInt(user_input);
        if(valid_input == true && args.length == 1){			//Scans input to see if argument is int           		
           		int user_int = Integer.parseInt(user_input);
           		if(user_int >= 0) {
           			int result = sHuffle(user_int);
           			System.out.print(result + "\n");
           		}
           		
           		else {
           			System.out.println("Silly Muggle! The input integer cannot be negative.");	//error message for if the input is negative
           		}
      		}
           	
      	else {
      		System.out.println("Silly Muggle! One integer input is required.");	//error message for if the input is not an integer
      	}										//or if the input is more or less than 1

     }
  	

//This is what will run the SHufflepuff algorithm
private static int sHuffle(int n) {
	if(n>= 0) {
                if (n == 0) {
                        return 10;
              	} 
		else if (n == 1) {
                        return 9;
                } 
		else if (n == 2) {
                        return 8;
                } 
		else if (n == 3) {
                        return 7;
                } 
		else {
			//Bound Function: n-i
			return 4*sHuffle(n - 1) - 6*sHuffle(n - 2) + 4*sHuffle(n - 3) - sHuffle(n - 4);
                }
}

//This method is running a try catch with boolean results that we can call in our main method
private static boolean isInt(String s) {
	try{
		Integer.parseInt(s);
		return true;
	}
	catch(NumberFormatException e) {
		return false;
	}
}	

}
