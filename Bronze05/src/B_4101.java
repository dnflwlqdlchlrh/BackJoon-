import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_4101 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A == 0 && B == 0) {
				break;
			}
			
			if(A > B) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
//			String result = (A > B) ? "Yes" : "NO";
//			System.out.println(result);
		}
		
	}

}
