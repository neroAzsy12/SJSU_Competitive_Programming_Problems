// Heart Rate
import java.util.*;
public class heartrate {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i = 0; i < cases; i++) {
			
			int beats = sc.nextInt();
			float seconds = sc.nextFloat();
			
			float bpm = 60 * beats / seconds;
			float abpm = bpm - (60 / seconds);
			float mbpm = bpm + (60 / seconds);
			
			System.out.println(abpm + " " + bpm + " " + mbpm);
		}
		
		sc.close();
	}
}
