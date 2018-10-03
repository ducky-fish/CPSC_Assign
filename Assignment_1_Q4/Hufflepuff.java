package cpsc331.A1;
public class Hufflepuff{
	public static void main(String args[]) {
		SHufflepuff user = new SHufflepuff();
		String user_input = args[0];			    	
    	boolean valid_input = SHufflepuff.isInt(user_input);
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
		int h = 0;
		while(h <= 3) {
			if(n==h) {
				int final_reply = 10-n;
				return final_reply;
			}
			h++;
		  }
		
	}
	
}
	
	
