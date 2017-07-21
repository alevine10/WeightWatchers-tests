import java.util.*;

class StringReverse
{
   public static void main(String args[])
   {  
	   Scanner in = new Scanner(System.in);
	   String reversed = reverseEverything(in.nextLine());
	   System.out.println(reversed);
   }
   
   private static String reverseEverything(String s) {
	    String reverse = "";
	    int length = s.length();
	    for( int i = length - 1 ; i >= 0 ; i-- ) {
	       reverse = reverse + s.charAt(i);
	    }
	    return reverse;
   }
}
