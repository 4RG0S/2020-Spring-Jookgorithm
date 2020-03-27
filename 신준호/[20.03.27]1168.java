import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {

	
   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   
	   int n, k;
	   List<Integer> l = new ArrayList<>();
	   
	   n = sc.nextInt();
	   k = sc.nextInt();
	   
	   for(int i = 1; i <= n; i++)
		   l.add(i);
	   
	   int tmp = k-1;
	   k--;
	   System.out.print("<");
	   for(int i = 1; i <= n; i++) {
		   if (i == n) {
			   System.out.print(l.remove(k));
			   break;
		   }
		   else
			   System.out.print(l.remove(k) + ", ");	
		   k = (k+tmp)%l.size();
	   }
	   System.out.print(">");
		   
   }
   
}