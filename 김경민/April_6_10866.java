package Third_week;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class April_6_10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Deque<Integer> deck = new ArrayDeque<>();
		int N = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			String split[] = line.split(" ");
			if(split[0].equals("push_front"))
			{
				deck.addFirst(Integer.parseInt(split[1]));
			} else if(split[0].equals("push_back"))
			{
				deck.addLast(Integer.parseInt(split[1]));
			} else if(split[0].equals("pop_front"))
			{
				if(!deck.isEmpty())
					System.out.println(deck.removeFirst());
				else
					System.out.println(-1);
			} else if(split[0].equals("pop_back"))
			{
				if(!deck.isEmpty())
					System.out.println(deck.removeLast());
				else
					System.out.println(-1);
			} else if(split[0].equals("size"))
			{
				System.out.println(deck.size());
			} else if(split[0].equals("empty"))
			{
				int empty = deck.isEmpty() ? 1 : 0;
				System.out.println(empty);
			} else if(split[0].equals("front"))
			{
				if(!deck.isEmpty())
					System.out.println(deck.getFirst());
				else
					System.out.println(-1);
			} else if(split[0].equals("back"))
			{
				if(!deck.isEmpty())
					System.out.println(deck.getLast());
				else
					System.out.println(-1);
			}
		}
	}

}
