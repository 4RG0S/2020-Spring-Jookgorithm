package Fifth_week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class April_24_1822 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> A_B = new HashSet<>();
		
		int na = scan.nextInt();
		int nb = scan.nextInt();
		int count = 0;
		for(int i=0;i<na;i++)
		{
			int input = scan.nextInt();
			A.add(input);
		}
		for(int i=0;i<nb;i++)
		{
			int input = scan.nextInt();
			B.add(input);
		}
		Iterator iterA = A.iterator();
		while(iterA.hasNext())
		{
			int temp = (int) iterA.next();
			if(!B.contains(temp))
			{
				A_B.add(temp);
				count++;
			}	
		}
		Object[] a_b = A_B.toArray();
		Arrays.sort(a_b);
		System.out.println(count);
		if(a_b.length != 0)
		{
			for(int i=0;i<a_b.length;i++)
			{
				System.out.print(a_b[i]);
				if(i != a_b.length - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
