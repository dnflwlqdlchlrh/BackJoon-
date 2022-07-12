import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10768 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
//		내가 푼 로직
//		if(M == 2 && D == 18) {
//			System.out.println("Special");
//		} else if(M <= 2 && D < 18) {
//			System.out.println("Before");
//		} else if(M >= 2 && D > 18) {
//			System.out.println("After");
//		}
		
		if(M < 2) {
			System.out.println("Before");
		}else if(M == 2){
			if(D < 18) {
				System.out.println("Before");
			}else if(D == 18) {
				System.out.println("Special");
			}else {
				System.out.println("After");
			}
		}else {
			System.out.println("After");
		}
		

	}

}
