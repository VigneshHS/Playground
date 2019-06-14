import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
        // Get the value for n
	    int n = in.nextInt();
        // Extract last digit
	   
        // Repeatedly remove last digit until it reaches the first digit 
		while(n >= 100)
		{
		   n = n / 10;
		}
      int second_digit=n%10;
        // Add first and last digi
		System.out.print(second_digit);
	}
}