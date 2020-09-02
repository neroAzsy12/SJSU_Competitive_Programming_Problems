import java.io.*;
public class basketballoneonone {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < input.length(); i += 2) {
			
			if(input.charAt(i) == 'A') {
				a += Character.getNumericValue(input.charAt(i + 1));
			}else {
				b += Character.getNumericValue(input.charAt(i + 1));
			}
			
			if(a >= 11 && a - b >= 2) {
				System.out.println("A");
				break;
			}
			
			if(b >= 11 && b - a >= 2){
				System.out.println("B");
				break;
			}
		}
	}
}
