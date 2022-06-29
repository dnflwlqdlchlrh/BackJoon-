import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_14681 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		
//		내가 푼 로직
//		if(A >= 12 && B >= 5) {
//			System.out.println("1");
//		} else if(A >= -12 && B >= 5) {
//			System.out.println("2");
//		} else if(A >= -12 && B >= -5) {
//			System.out.println("3");
//		} else {
//			System.out.println("4");
//		}
		
		if(A > 0) {
			if(B > 0) {
				System.out.print(1);
			} else {
				System.out.print(4);
			}
		} 
		
		else {
			if(B > 0) {
				System.out.print(2);
			} else {
				System.out.print(3);
			}
		}
	}
}
