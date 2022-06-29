import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1330 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
//		for(int i = 0; i < A; i++) {
//			if(A > B) {
//				System.out.println(">");
//				break;
//			} else if(A < B) {
//				System.out.println("<");
//				break;
//			} else {
//				System.out.println("==");
//				break;
//			}
//		}
		
		System.out.println((A>B) ? ">" : (A<B) ? "<" : "==");
		
		

	}

}
