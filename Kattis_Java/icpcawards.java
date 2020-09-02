import java.io.*;
import java.util.*;
public class icpcawards {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		
		// LinkedHashMap maintains insertion order as opposed to HashMap
		LinkedHashMap<String, String> teams = new LinkedHashMap<>();
		 
		for(int i = 0; i < cases; i++) {
			String[] s = br.readLine().split(" ");
			
			if(!teams.containsKey(s[0]) && teams.size() < 12) {
				teams.put(s[0], s[1]);
			}
		}
		
		// iterates the Map Entries
		for(Map.Entry<String, String> s : teams.entrySet()) {
			System.out.println(s.getKey() + " " + s.getValue());
		}
	}
}
