 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n);
	  System.out.println();
	  System.out.print("Enter the input number to check if it is perfect number or not:");
	  perfect(n);

	    

	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }

	public static void perfect(int num) 
	{
		for(int i=1;i<1000;i++)
		{
			int sum=0;
		 
		  
			if(i%num==0)
			{
				sum=sum+num;
				
			
		}
		 if(sum==num)
			 System.out.println(num+" perfect");
		 else
			 System.out.println("not");
	}
	  
            

		   }
	 

}
