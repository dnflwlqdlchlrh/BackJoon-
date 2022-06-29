import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2438 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
//		char[] arr1 = new char[A]; 
//		
//		for(int i = 0; i < A; i++) {
//			for(int j = 0; j < i + 1; j++) {
//				arr1[j] = '*';
//			}
//			System.out.println(arr1);
//		}
		
		for(int i = 1; i <= A; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		

	}

}
