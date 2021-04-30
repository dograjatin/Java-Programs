////////////////////////////////////////////////////////////////////////////////////////
//////// THIS CODE FINDS HCF OF TWO NUMBER USING LONG DIVISION METHOD///////////////////
////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Source {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);		
        // Enter number 1 in the Input Console
        int num1 = scan.nextInt();
        // Enter number 2 in the Input Console
        int num2 = scan.nextInt();
    	
    	int hcf;	
        if (num1>num2){
            int rem;
           do{
               rem = num1%num2;
               hcf = num2;
               num1 = num2;
               num2 = rem;
           }while(rem>0);
        }else{
            int rem;
           do{
               rem = num2%num1;
               hcf = num1;
               num2 = num1;
               num1 = rem;
           }while(rem>0);
        }
        System.out.println(hcf); 
        
    }
}
