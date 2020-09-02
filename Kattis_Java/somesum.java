import java.io.*;
public class somesum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// if its just one number its either
		// any odd number of consecutive integers results in odd
		// any n number of consecutive ints that are divisible by both 2 and 4 results in an even 
		if(n % 2 == 1) {
			System.out.println("Either");
		}else if(n % 2 == 0 && n % 4 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
