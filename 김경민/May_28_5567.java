package May;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class May_28_5567 {

	public static List<List<Integer>> connect = new ArrayList<>();
	public static List<Boolean> isVisit = new ArrayList<>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int N = scan.nextInt();
		int M = scan.nextInt();
		for(int i=0;i<N;i++)
		{
			connect.add(new ArrayList<>());
			isVisit.add(false);
		}
		for(int i=0;i<M;i++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			connect.get(a - 1).add(b - 1);
			connect.get(b- 1).add(a - 1);
		}
		//System.out.println(connect);
		for(int i=0;i<connect.get(0).size();i++)
		{
			set.add(connect.get(0).get(i));
			for(int j=0;j<connect.get(connect.get(0).get(i)).size();j++)
			{
				set.add(connect.get(connect.get(0).get(i)).get(j));
			}
		}
		if(set.contains(0))
			set.remove(0);
		System.out.println(set.size());
	}

}
