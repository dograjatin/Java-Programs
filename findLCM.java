import java.util.Scanner;

class _lcm{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Enter the two numbers in the input console
        int number1 = scan.nextInt();
		int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
	}
	
	// Write the LCM function here
	public static int lcm(int num1, int num2){
	    int lcm = 0;
	    
	    if(num1 == num2){
	        lcm = num1 = num2 ;
			//if both numbers are same, they are the lcm
	    }
	    else if(num1>num2){ 
			    
			
	        if(num1%num2 == 0){	            
	            lcm = num1;
				//if num1 is divisible by num2 then num1 is lcm
	        }
	        else{

				//find the multiples of num1 which is divisible by num2
	            for(int count=1;;count++){
	                if((num1*count)%num2 == 0){
	                    lcm = num1*count;
	                    break;
	                }
	            }
	        }
	    }
	    else if(num2>num1){	            
	            
            if(num2%num1 ==0){
                lcm = num2;
				//if num2 is divisible by num1 then num2 is lcm
            }
            else{

				//find the multiples of num1 which is divisible by num2
                for(int count=1;;count++){
                    if((num2*count)%num1 == 0){
                        lcm = num2*count;
                        break;
                    }
                }
            }
	    }    
	    return lcm;
	}
	 
}