import java.util.*;
public class pizza2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int totalCrust = r - c;
		
		double pizza = (Math.pow(totalCrust, 2) * Math.PI) / (Math.pow(r,  2) * Math.PI);
		System.out.println(pizza * 100);
	}
}
