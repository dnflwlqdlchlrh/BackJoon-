import java.util.Arrays;
import java.util.Scanner;

public class B_8723 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		if(a[0] == a[2]) {
			System.out.println(2);
		} else if(a[2] * a[2] == a[0] * a[0] + a[1] * a[1]) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
			

	}

}
