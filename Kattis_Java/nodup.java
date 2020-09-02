// No Duplicates
import java.io.*;
import java.util.*;
public class nodup {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		HashSet<String> unique = new HashSet<>(Arrays.asList(s));
		
		System.out.println(unique.size() == s.length ? "yes" : "no");
	}
}
