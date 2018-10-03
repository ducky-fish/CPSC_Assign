
//import java.util.Scanner;
public class SHufflepuff{
	public static void main(String[] args) {
        if(args.length == 1){							//Scans terminal input for length
        		//boolean input_check = sc.hasNextInt();
        		String user_input = args[0];			    
        		boolean valid_input = isInt(user_input);
        	if(valid_input == true ){										//Scans input to see if argument is int           		
           			int user_int = Integer.parseInt(user_input);
           			if(user_int >= 0) {
           				int result = sHuff(user_int);
           				System.out.print(result + "\n");
           			}
           			
           			else {
           				System.out.println("Silly Muggle! The input integer cannot be negative.");
           			}
      			}
           		
      		else {
      			System.out.println("Silly Muggle! One integer input is required.");
      		}

        }
        else{
        	System.out.println("Silly Muggle! One integer input is required.");
        	}
    }	

public static int sHuff(int n) {
	int i = 0;
	while(i <= 3) {
		if(n==i) {
			int final_reply = 10-n;
			return final_reply;
		}
		i++;
	  }
	return 4*sHuff(n-1) - 6 * sHuff(n-2) + 4 * sHuff(n-3) - sHuff(n-4);
	
}
	
public static boolean isInt(String s) {
	try{
		Integer.parseInt(s);
		return true;
	}
	catch(NumberFormatException e) {
		return false;
	}
}	

}