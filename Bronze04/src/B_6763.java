import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_6763 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
//		int N = b - a;
		
		if (a >= b) {
			System.out.println("Congratulations, you are within the speed limit!"); 
		} else {
			int fine;
			if (b - a >= 1 && b - a <= 20) {
				fine = 100;
			} else if (b - a >=21 && b - a <= 30) {
				fine = 270;
			} else {
				fine = 500;
			}
			System.out.printf("You are speeding and your fine is $%d.",fine);
		}
		
//		내가 푼 로직
//		if(N <= 0) {
//			System.out.println("ongratulations, you are within the speed limit!");
//		} else if(N >= 1 && N <= 20) {
//			System.out.println("You are speeding and your fine is $100.");
//		} else if(N >= 21 && N <= 30) {
//			System.out.println("You are speeding and your fine is $270.");
//		} else if(N >= 31) {
//			System.out.println("You are speeding and your fine is $500.");
//		}
		
//		if(b >= 100) {
//			if(N < 1 && N < 20) {
//				System.out.println("You are speeding and your fine is $100");
//			} else if(N < 21 && N < 30) {
//				System.out.println("You are speeding and your fine is $270");
//			} else if(N <= 31) {
//				System.out.println("You are speeding and your fine is $500");
//			} 
//		} else {
//			System.out.println("Congratulations, you are within the speed limit!");
//		}
		
	}
}
