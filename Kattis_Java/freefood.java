import java.util.*;
public class freefood {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int events = sc.nextInt();
		
		HashSet<Integer> free = new HashSet<>();
		for(int i = 0; i < events; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			for(int j = start; j <= end; j++) {
				free.add(j);
			}
		}
		System.out.println(free.size());
	}
}
