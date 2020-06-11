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

	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  

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


	   
	      
	       public static void myTestMethod(){
	    	   int num1, num2;
	           Scanner scanner = new Scanner(System.in);
	           System.out.print("Enter first number:");
	           num1 = scanner.nextInt();
	           System.out.print("Enter second number:");
	           num2 = scanner.nextInt();
	           
	           
	           //num1 becomes 1111 = 15
	           num1 = num1 ^ num2;
	           //num2 becomes 1010 = 10
	           num2 = num1 ^ num2;
	           //num1 becomes 0101 = 5
	           num1 = num1 ^ num2;
	           scanner.close();
	           System.out.println("The First number after swapping:"+num1);
	           System.out.println("The Second number after swapping:"+num2);
	    	   

            

		   }
	 
	   

}
