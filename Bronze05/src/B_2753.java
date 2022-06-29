import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2753 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
//		if···else문 
//		if(N % 4 == 0) {
//			if(N % 400 == 0) System.out.println("1");
//			else if(N % 100 == 0) System.out.println("0");
//			else System.out.println("1");
//		} else {
//			System.out.println("0");
//		}
		
		// 삼항연산자 사용 방법
		System.out.println((N % 4 == 0) ? ((N % 400 == 0) ? "1" : (N % 100 == 0) ? "0" : "1") : "0");
		 
		
	}

}
