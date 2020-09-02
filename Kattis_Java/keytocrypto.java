import java.io.*;
public class keytocrypto {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ciphertext = br.readLine();
		StringBuilder key = new StringBuilder(br.readLine());
		
		StringBuilder message = new StringBuilder();
		
		for(int i = 0; i < ciphertext.length(); i++) {
			int shift = (ciphertext.charAt(i) - key.charAt(i) + 26) % 26;
			shift += 65;
			char c = (char)shift;	// c converts the ASCII val of shift to an uppercase character
			
			key.append(c);			// append c to key so it can continue deciphering the message
			message.append(c);
			
		}
		
		System.out.println(message.toString());
	}
}
