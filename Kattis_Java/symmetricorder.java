import java.io.*;
public class symmetricorder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = 1;
		
		while(true) {
			int p = Integer.parseInt(br.readLine());
			
			if(p == 0) {
				break;
			}
			
			System.out.println("SET " + cases);
			
			String[] ending = new String[p / 2];
			for(int i = ending.length - 1; i >= 0; i--) {
				System.out.println(br.readLine());
				ending[i] = br.readLine();
			}
			
			if(p % 2 == 1) {
				System.out.println(br.readLine());
			}
			
			for(String s : ending) {
				System.out.println(s);
			}
			
			cases++;
		}
	}
}
