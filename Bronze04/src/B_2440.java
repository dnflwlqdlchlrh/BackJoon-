import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2440 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int S = Integer.parseInt(br.readLine());
		for(int i = 1; i <= S; i++) {
			for(int j = 0; j <= S - i; j++) {
				System.out.print("*");
			}
//			for(int k = 0; k < i; k++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}

	}

}
