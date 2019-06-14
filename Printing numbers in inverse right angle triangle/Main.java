import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in  = new Scanner(System.in);
       
	    int n = in.nextInt();
      int num=n;
	    for(int curr_row = 1; curr_row <= n; ++curr_row)
	    {
          for(int curr_col = num; curr_col >=1; curr_col--)
          {
            System.out.print(curr_col);
          }
          num--;
          System.out.println();
	}
    }
}