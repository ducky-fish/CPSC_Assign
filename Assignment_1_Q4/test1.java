package cpsc331.A1;
public class Hufflepuff{
	public static void main(String args[]) {
		String user_input = args[0];			    	
    		boolean valid_input = Hufflepuff.isInt(user_input);
    if(valid_input == true && args.length == 1){							//Scans input to see if argument is int           		
       		int user_int = Integer.parseInt(user_input);
       		if(user_int >= 0) {
       			int result = eval(user_int);
       			System.out.print(result + "\n");
       		}
	    
       		else {
       			System.out.println("Silly Muggle! The input integer cannot be negative.");	//error message for if the input is negative
       		}
  	}
       	
  else {
  	System.out.println("Silly Muggle! One integer input is required.");					//error message for if the input is not an integer
  	}																						//or if the input is more or less than 1

 }
	
	public static int eval(int n) {
		int c = 0;
		while(c <= 3) {
			if(n==c) {
				int final_reply = 10-n;
				return final_reply;
			}
			c++;
		  }
		int i = 3;
		int hocus = 10;
		int pocus = 9;
		int abra = 8;
		int kadabra = 7;
		
		while(i<n){
			int shazam = 4 * kadabra - 6 * abra + 4 * pocus - hocus;
			hocus =pocus;
			pocus=abra;
			abra=kadabra;
			kadabra=result;
			shazam = shazam+1;
		}
		return kadabra;
	}

	private static boolean isInt(String s){
		try{
			Integer.parseInt(s);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
}
