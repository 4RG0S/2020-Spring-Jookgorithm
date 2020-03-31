package Second_week;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class April_1_11652 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Map<Long, Integer> map = new HashMap<>();
		int N = scan.nextInt();
		for(int i=0;i<N;i++)
		{
			long input = scan.nextLong();
			if(map.containsKey(input))
			{
				map.put(input, map.get(input) + 1);
			}
			else
			{
				map.put(input, 1);
			}
		}
		List<Map.Entry<Long, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Long, Integer>>(){

			@Override
			public int compare(Map.Entry<Long, Integer> o1, Map.Entry<Long, Integer> o2) {
                int comparision = (o1.getValue() - o2.getValue()) * -1;
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
            }
			
		});
		Map<Long, Integer> sortedMap = new LinkedHashMap<>(); 
      Iterator<Map.Entry<Long, Integer>> iter = list.iterator();
      Entry<Long, Integer> entry = iter.next();
      System.out.println(entry.getKey());
	}

}
