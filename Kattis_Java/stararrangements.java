// Star Arrangements
import java.io.*;
public class stararrangements {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double s = Double.parseDouble(br.readLine());
		
		System.out.println((int)s + ":");
		
		for(int x = 2; x < Math.ceil(s / 2) + 1; x++) {
			int y = x - 1;
			
			if(s % (x + y) == x || s % (x + y) == 0) {
				System.out.println(x + "," + y);
			}
			
			if(s % x == 0) {
				System.out.println(x + "," + x);
			}
		}
	}
}
