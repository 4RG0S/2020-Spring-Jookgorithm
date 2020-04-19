package Fifth_week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class April_20_1620 {
	
	public static boolean isInteger(String string) {
	    try {
	        Integer.valueOf(string);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, String> map = new HashMap<>();
		HashMap<String, Integer> mapi = new HashMap<>();
		
		String line = br.readLine();
		String split[] = line.split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);
		
		for(int i=0;i<N;i++)
		{
			String input = br.readLine();
			map.put(i + 1, input);
			mapi.put(input, i + 1);
		}
		for(int i=0;i<M;i++)
		{
			String input = br.readLine();
			if(isInteger(input))
			{
				System.out.println(map.get(Integer.parseInt(input)));
			}
			else
			{
				System.out.println(mapi.get(input));
			}
		}
	}

}
