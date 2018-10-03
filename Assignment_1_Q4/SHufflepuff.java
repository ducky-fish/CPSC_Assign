/* Group of 3
 * Maiah Rutledge: UCID # 30024535
 * Jared : UCID #
 * David : UCID #
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
	int h = 0;
	while(h <= 3) {
		if(n==h) {
			int final_reply = 10-n;
			return final_reply;
		}
		h++;
	  }
	return 4*sHuffle(n-1) - 6 * sHuffle(n-2) + 4 * sHuffle(n-3) - sHuffle(n-4);
	
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
